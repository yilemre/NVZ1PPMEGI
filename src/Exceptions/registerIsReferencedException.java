package Exceptions;

public class registerIsReferencedException extends ELabException {

	public registerIsReferencedException(){

	}

	@Override
	public String getMessage(){
		return "Diese Kasse enthält Töpfe, löschen Sie zuerst alle Töpfe, bevor Sie die Kasse löschen!";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
