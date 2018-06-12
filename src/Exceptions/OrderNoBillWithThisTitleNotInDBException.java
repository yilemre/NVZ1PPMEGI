package Exceptions;

public class OrderNoBillWithThisTitleNotInDBException extends ELabException {

	public OrderNoBillWithThisTitleNotInDBException(){

	}

	@Override
	public String getMessage(){
		return "Kein Auftrag ohne erzeugte Rechnung mit diesem Titel in Datenbank vorhanden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
