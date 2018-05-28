package Exceptions;

public class ArticlenumberNotInDBException extends ELabException {

	public ArticlenumberNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "No Component with specified name in database!";
	}

	@Override
	public String toString(){
		return getMessage();
	}

}
