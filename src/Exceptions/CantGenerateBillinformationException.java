package Exceptions;

public class CantGenerateBillinformationException extends ELabException {

	public CantGenerateBillinformationException(){

	}

	@Override
	public String getMessage(){
		return "Rechnungsinformationen für diese Rechnung konnten nicht erstellt werden!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
