package Exceptions;

public class OrderNoBillWithThisStatusNotInDBException extends ELabException {

	public OrderNoBillWithThisStatusNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Kein Auftrag ohne erzeugte Rechnung mit diesem Status in Datenbank vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
