package Exceptions;

public class IDNotInDBException extends ELabException {

	public IDNotInDBException() {

	}

	@Override
	public String getMessage(){
		return "ID not in database!";
	}

	@Override
	public String toString(){
		return getMessage();
	}
}

