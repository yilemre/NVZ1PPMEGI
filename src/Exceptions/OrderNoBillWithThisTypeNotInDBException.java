package Exceptions;

public class OrderNoBillWithThisTypeNotInDBException extends ELabException {

	public OrderNoBillWithThisTypeNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Kein Auftrag ohne erzeugte Rechnung mit diesem Typ in Datenbank vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
