package Exceptions;

public class CategoryNotInDBException extends ELabException {
	
	public CategoryNotInDBException() {
		
	}
	
	@Override
	public String getMessage(){
		return "Keine Kategorie mit diesem Namen vorhanden";
	}

	@Override
	public String toString(){
		return getMessage();
	}


}
