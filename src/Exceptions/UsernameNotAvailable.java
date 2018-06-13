package Exceptions;

public class UsernameNotAvailable extends ELabException {
	
	public UsernameNotAvailable() {
		
	}
	
	@Override
	public String getMessage(){
		return "Dieser Username ist bereits vergeben!";
	}

	@Override
	public String toString(){
		return getMessage();
	}
}
