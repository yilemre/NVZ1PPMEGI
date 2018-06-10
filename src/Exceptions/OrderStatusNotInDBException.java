package Exceptions;

public class OrderStatusNotInDBException extends ELabException {

	public OrderStatusNotInDBException() {

	}

	@Override
	public String getMessage(){
		return "Kein Auftrag mit diesem Status vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}
}

