package Exceptions;

public class costCentreNumberException extends ELabException {
	
	public costCentreNumberException() {
		
	}
	
	@Override
	public String getMessage(){
		return "Kostenstellennummern haben entweder 6 oder 16 Stellen. Bitte überprüfen Sie Ihre Eingabe!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
