/**
 * Classe que representa as informa��es de uma p�gina
 * 
 * @author Marcio
 */
public interface PageData
{
	/**
	 * Retorna o caminho completo da p�gina
	 */
	String getFullPath();
	
	/**
	 * Verifica se a p�gina cont�m um determinado atributo
	 */
	boolean hasAttribute(String name);

	/**
	 * Retorna o conte�do da p�gina
	 */
	String getContent();

	/**
	 * Altera o conte�do da p�gina
	 */
	void setContent(String content);

	/**
	 * Carrega uma nova p�gina, dado seu nome
	 */
	PageData loadAssociatedPage(String pageName); 
}