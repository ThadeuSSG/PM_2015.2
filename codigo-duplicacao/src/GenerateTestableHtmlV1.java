/**
 * Primeira implementação do gerador de páginas HTML passíveis de teste
 * 
 * @author marcio.barros
 */
public class GenerateTestableHtmlV1 
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
	
		if (pageData.hasAttribute(TEST_ATTRIBUTE_NAME)) 
		{
			PageData suiteSetupPage = pageData.loadAssociatedPage(SUITE_SETUP_NAME);
			
			if (suiteSetupPage != null) 
			{
				String pagePathName = suiteSetupPage.getFullPath();
				buffer.append("!include -setup .").append(pagePathName).append("\n");
			}
			
			PageData testSetupPage = pageData.loadAssociatedPage(TEST_SETUP_NAME);
			
			if (testSetupPage != null) 
			{
				String setupPathName = testSetupPage.getFullPath();
				buffer.append("!include -setup .").append(setupPathName).append("\n");
			}
		}
		
		buffer.append(pageData.getContent());
		
		if (pageData.hasAttribute(TEST_ATTRIBUTE_NAME)) 
		{
			PageData testTeardownPage = pageData.loadAssociatedPage(TEST_TEARDOWN_NAME);
			
			if (testTeardownPage != null) 
			{
				String tearDownPathName = testTeardownPage.getFullPath();
				buffer.append("\n").append("!include -teardown .").append(tearDownPathName).append("\n");
			}
			
			PageData suiteTeardown = pageData.loadAssociatedPage(SUITE_TEARDOWN_NAME);
			
			if (suiteTeardown != null) 
			{
				String pagePathName = suiteTeardown.getFullPath();
				buffer.append("!include -teardown .").append(pagePathName).append("\n");
			}
		}

		pageData.setContent(buffer.toString());
		return pageData;
	}
}