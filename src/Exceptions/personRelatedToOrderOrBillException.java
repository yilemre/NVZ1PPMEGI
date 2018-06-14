package Exceptions;

public class personRelatedToOrderOrBillException extends ELabException {

	public personRelatedToOrderOrBillException(){

	}

	@Override
	public String getMessage(){
		return "Diese Person stand in Verbindung zu Rechnungen/Aufträgen! Zugeordnete Rechnungen/Aufträge wurden gelöscht!";
	}

	@Override
	public String toString(){
		return getMessage();
	}



}
