//Author: Emre
package logic;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import DataAccess.SQLManager;
import Exceptions.*;


public class PersonManagement {
    
    public static void addPerson(String firstname, String surname, String street, int housenumber, int zipcode, String email, String username, String password, int rights) throws SQLException, UsernameNotAvailableException  {
	String dateTimeString = null;
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	Calendar cal = Calendar.getInstance();
	Date     time = cal.getTime();
	dateTimeString = df.format(time);
	if(!SQLManager.getInstance().isUsernameAvailable(username)) {
		throw new UsernameNotAvailableException();
	}
	else {
    	SQLManager.getInstance().insertPersonIntoDB(firstname, surname, street, housenumber, zipcode, email, dateTimeString, username, password, rights);
	}
    }

    public static void deletePerson(int ID) throws SQLException, BillIDNotInDBException {
    	for(int i:SQLManager.getInstance().getBillIDsByCustomerID(ID)) {
    		FinancialManagement.deleteBill(i);
    		//throw new personRelatedToOrderOrBillException();
    	}
    	for(int i:SQLManager.getInstance().getOrderIDsByCustomerID(ID)) {
    		ProductionManagement.deleteOrder(i);
    		//throw new personRelatedToOrderOrBillException();
    	}
    	for(int i:SQLManager.getInstance().getOrderIDsAdvisorID(ID)) {
    		ProductionManagement.deleteOrder(i);
    		//throw new personRelatedToOrderOrBillException();
    	}
    	for(int i:SQLManager.getInstance().getBillIDsByAdvisorID(ID)) {
    		FinancialManagement.deleteBill(i);
    		//throw new personRelatedToOrderOrBillException();
    	}
    	for(int i:SQLManager.getInstance().getOrderIDsSecondaryAdvisorID(ID)) {
    		ProductionManagement.deleteOrder(i);
    		//throw new personRelatedToOrderOrBillException();
    	}
	SQLManager.getInstance().deletePersonFromDB(ID); 
    }
    
    public static boolean personIsRelatedToSomething(int ID) throws SQLException {
    	boolean result = false;
    	if(!SQLManager.getInstance().getBillIDsByCustomerID(ID).isEmpty()) {
    		result = true;
    	}
		if(!SQLManager.getInstance().getOrderIDsByCustomerID(ID).isEmpty()) {
			
		}
		if(!SQLManager.getInstance().getOrderIDsAdvisorID(ID).isEmpty()) {
			result = true;
		}
		if(!SQLManager.getInstance().getBillIDsByAdvisorID(ID).isEmpty()) {
			result = true;
		}
		if(!SQLManager.getInstance().getOrderIDsSecondaryAdvisorID(ID).isEmpty()) {
			result = true;
		}
    	return result;
    }

    public static void modifyPerson(int id, String firstname, String surname, String street, int housenumber, int zipcode,String email, String username, String password, int rights) throws SQLException, UsernameNotAvailableException, PersonWithSpecifiedIDNotInDBException {
    	
    	Person temp = SQLManager.getInstance().getPersonByID(id);
    	
	    String dateTimeString = null;
	    DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	    Calendar cal = Calendar.getInstance();
	    Date     time = cal.getTime();
	    dateTimeString = df.format(time); 
	    
	    if(temp.getUsername().equals(username)) {
	    	SQLManager.getInstance().modifyPerson(id, firstname, surname,street,housenumber,zipcode,email,dateTimeString,username,password, rights);
	    }
	    else {
		    if(!SQLManager.getInstance().isUsernameAvailable(username)) {
		    	throw new UsernameNotAvailableException();
		    }
		    else {
		    	SQLManager.getInstance().modifyPerson(id, firstname, surname,street,housenumber,zipcode,email,dateTimeString,username,password, rights);
		    }
	    }

    }
    
    public static List<Person> getPersons() throws SQLException {
    	return SQLManager.getInstance().getPersons(); 
    }
    /*
    public static void modifyPersonsFirstname(int id, String newValue) throws SQLException {
	SQLManager.getInstance().modifyPerson(id, AttributeTypesPerson.firstname, newValue);
    }
    public static void modifyPersonsSurname(int id, String newValue) throws SQLException {
	SQLManager.getInstance().modifyPerson(id, AttributeTypesPerson.surname, newValue);
    }
    public static void modifyPersonsStreet(int id, String newValue) throws SQLException {
	SQLManager.getInstance().modifyPerson(id, AttributeTypesPerson.street, newValue);
    }
    public static void modifyPersonsHousenumber(int id, String newValue) throws SQLException {
	SQLManager.getInstance().modifyPerson(id, AttributeTypesPerson.housenumber, newValue);
    }
    public static void modifyPersonsZipcode(int id, String newValue) throws SQLException {
	SQLManager.getInstance().modifyPerson(id, AttributeTypesPerson.zipcode, newValue);
    }
    public static void modifyPersonsEmail(int id, String newValue) throws SQLException {
	SQLManager.getInstance().modifyPerson(id, AttributeTypesPerson.email, newValue);
    }
    public static void modifyPersonsTimestamp(int id, String newValue) throws SQLException {
	SQLManager.getInstance().modifyPerson(id, AttributeTypesPerson.timestamp, newValue);
    }
    public static void modifyPersonsUsername(int id, String newValue) throws SQLException {
	SQLManager.getInstance().modifyPerson(id, AttributeTypesPerson.username, newValue);
    }
    public static void modifyPersonsPassword(int id, String newValue) throws SQLException {
	SQLManager.getInstance().modifyPerson(id, AttributeTypesPerson.password, newValue);
    }*/

	public static List<Person> getPersonsByName(String searchValue) throws SQLException, ELabException {
		return SQLManager.getInstance().getPersonsByFirstname(searchValue);
	}
	
	public static Person getPersonsByID(int id) throws SQLException, PersonWithSpecifiedIDNotInDBException {
		return SQLManager.getInstance().getPersonByID(id);
	}

	public static List<Person> getPersonsByLastname(String searchValue) throws SQLException, ELabException {
		return SQLManager.getInstance().getPersonsByLastname(searchValue);
	}

	public static List<Person> getPersonsByRights(String searchValue) throws SQLException, ELabException {
		switch(searchValue.toLowerCase()){
			case "kunde":
				return SQLManager.getInstance().getPersonsByRights(0);
			case "mitglied":
				return SQLManager.getInstance().getPersonsByRights(1);
			case "lehrstuhlmitglied":
				return SQLManager.getInstance().getPersonsByRights(2);
			default:
				throw new PersonStatusNotInDBException();
		}
	}
	
	public static int getPersonIDByUsername(String username) throws SQLException{
		return SQLManager.getInstance().getPersonIDByUsername(username);
	}
	
	public static void changePassword(String username, String password) throws SQLException {
		SQLManager.getInstance().changePassword(username, password);
	}
}
