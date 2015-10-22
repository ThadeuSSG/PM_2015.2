
/**
 * Segunda implementação do gerador de páginas HTML passíveis de teste
 * 
 * @author marcio.barros
 */
public class GenerateTestableHtmlV2 
{
	private static final String TEST_ATTRIBUTE_NAME = "Test";
	private static final String SUITE_SETUP_NAME = "SuiteSetup";
	private static final String TEST_SETUP_NAME = "TestSetup";
	private static final String TEST_TEARDOWN_NAME = "SuiteTeardown";
	private static final String SUITE_TEARDOWN_NAME = "TestTeardown";

	/**
	 * Gera a versão preparada para testes de uma página HTML
	 */
	public PageData testableHtml(PageData pageData) throws Exception 
	{
		StringBuffer buffer = new StringBuffer();
		boolean isTestable = pageData.hasAttribute(TEST_ATTRIBUTE_NAME);
	
		if (isTestable) 
		{
			includeTestPage(pageData, SUITE_SETUP_NAME, "setup", buffer);
			includeTestPage(pageData, TEST_SETUP_NAME, "setup", buffer); 
		}
		
		buffer.append(pageData.getContent());
		
		if (isTestable) 
		{
			includeTestPage(pageData, TEST_TEARDOWN_NAME, "teardown", buffer);
			includeTestPage(pageData, SUITE_TEARDOWN_NAME, "teardown", buffer); 
		}

		pageData.setContent(buffer.toString());
		return pageData;
	}

	/**
	 * Inclui uma parte do script de testes na página HTML
	 */
	private void includeTestPage(PageData pageData, String pageType, String operationType, StringBuffer buffer) 
	{
		PageData testPage = pageData.loadAssociatedPage(pageType);
		
		if (testPage != null) 
		{
			String pagePathName = testPage.getFullPath();
			buffer.append("!include -").append(operationType).append(" .").append(pagePathName).append("\n");
		}
	}
}