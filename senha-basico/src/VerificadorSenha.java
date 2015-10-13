/**
 * Classe que verifica se uma senha é forte ou fraca
 * 
 * @author bsiccet
 */
public class VerificadorSenha
{
	/**
	 * Verifica se uma senha é forte
	 */
	public boolean verificaSenhaForte(String senha) 
	{
		// Verificar se a senha tem 8 ou mais caracteres
		if (senha.length() < 8)
			return false;
		
		// Verificar se a senha tem um caractere numérico
		if (!verificaCaractereNumerico(senha))
			return false;
		
		// Verificar se a senha tem um caractere minúsculo
		if (!verificaCaractereMinusculo(senha))
			return false;
		
		// Verificar se a senha tem um caractere maiúsculo
		if (!verificaCaractereMaiusculo(senha))
			return false;
		
		// Verificar se a senha tem um caractere de pontuação
		if (!verificaCaracterePontuacao(senha))
			return false;
		
		// Verificar se a senha é uma data
		if (!verificaData(senha))
			return false;
		
		// Verificar se a senha está no dicionário
		if (!verificaDicionario(senha))
			return false;
		
		return true;
	}

	/**
	 * Verifica se uma senha está em um dicionário de senhas comuns
	 */
	private boolean verificaDicionario(String senha) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Verifica se uma senha é uma data
	 */
	private boolean verificaData(String senha) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Verifica se uma senha tem um caractere de pontuação
	 */
	private boolean verificaCaracterePontuacao(String senha) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Verifica se uma senha tem um caractere maiúsculo
	 */
	private boolean verificaCaractereMaiusculo(String senha) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Verifica se uma senha tem um caractere minúsculo
	 */
	private boolean verificaCaractereMinusculo(String senha) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Verifica se uma senha tem um caractere numérico
	 */
	private boolean verificaCaractereNumerico(String senha) 
	{
		// TODO Auto-generated method stub
		return false;
	}
}