package Exceptions;

public class OrderNotInDBException extends ELabException {

	public OrderNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Auftrag nicht in Datenbank vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
