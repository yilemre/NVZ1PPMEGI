package Exceptions;

public class noMorePartsLeftException extends ELabException {

	public noMorePartsLeftException(){

	}

	@Override
	public String getMessage(){
		return "Keine ausreichende Menge lagernd!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
