package Exceptions;

public class OrderTitleNotInDBException extends ELabException {

	public OrderTitleNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Kein Auftrag mit diesem Namen vorhaden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}

}
