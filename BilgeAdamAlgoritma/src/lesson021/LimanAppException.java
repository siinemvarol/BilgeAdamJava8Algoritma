package lesson021;

public class LimanAppException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private EErrorType eErrorType;
	
	public LimanAppException(EErrorType eErrorType) {
		super(eErrorType.getMessage());
		this.eErrorType = eErrorType;
	}
	
	public LimanAppException(EErrorType eErrorType, String message) {
		super(message);
		this.eErrorType = eErrorType;
	}

	public EErrorType geteErrorType() {
		return eErrorType;
	}
}
