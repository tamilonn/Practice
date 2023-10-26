package code.test.tamil.exceptions;

public class MyOwnException extends Exception {
	
	private int errorCode =0;
	private String errorMessage = "";
	
	public MyOwnException(int code, String msg) {
		this.errorCode = code;
		this.errorMessage = msg;
	}
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
