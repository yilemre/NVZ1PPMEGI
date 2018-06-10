package Exceptions;

public class OrderTypeNotInDBException extends ELabException {

	public OrderTypeNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Kein Auftrag dieser Art vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
