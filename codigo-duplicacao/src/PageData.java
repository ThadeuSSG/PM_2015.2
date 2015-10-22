/**
 * Classe que representa as informações de uma página
 * 
 * @author Marcio
 */
public interface PageData
{
	/**
	 * Retorna o caminho completo da página
	 */
	String getFullPath();
	
	/**
	 * Verifica se a página contém um determinado atributo
	 */
	boolean hasAttribute(String name);

	/**
	 * Retorna o conteúdo da página
	 */
	String getContent();

	/**
	 * Altera o conteúdo da página
	 */
	void setContent(String content);

	/**
	 * Carrega uma nova página, dado seu nome
	 */
	PageData loadAssociatedPage(String pageName); 
}