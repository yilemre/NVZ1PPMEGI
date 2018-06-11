package Exceptions;

public class WrongRepeatedPassword extends ELabException {
    public WrongRepeatedPassword() {
	
    }
    public String getMessage() {
	return "Die Passwörter stimmen nicht überein! Wiederholen Sie diesen Vorgang!"; 	
    }
    public String toString () {
	return getMessage(); 
    }

}
