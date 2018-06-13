package Exceptions;

public class PotIsReferencedException extends ELabException {

	public PotIsReferencedException(){

	}

	@Override
	public String getMessage(){
		return "In diesem Topf liegen Rechnungen! Bitte verschieben Sie die Rechnungen in einen anderen Topf um den Top löschen zu können!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
