package aula_exceptions;

public class DriveException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DriveException() { }
	
	public DriveException(String mensagem) { 
		super(mensagem);
	}	

}
