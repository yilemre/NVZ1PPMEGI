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


public class PersonManagement {
    
    public static void addPerson(String firstname, String surname, String street, int housenumber, int zipcode, String email, String username, String password, int rights) throws SQLException  {
	//Marius start
	String dateTimeString = null;
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	Calendar cal = Calendar.getInstance();
	Date     time = cal.getTime();
	dateTimeString = df.format(time);
	//Marius end 
    	SQLManager.getInstance().insertPersonIntoDB(firstname, surname, street, housenumber, zipcode, email, dateTimeString, username, password, rights);
    }

    public static void deletePerson(int ID) throws SQLException {
	SQLManager.getInstance().deletePersonFromDB(ID); 
    }

    public static void modifyPerson(int id, String firstname, String surname, String street, int housenumber,
	int zipcode,String email, String username, String password, int rights) throws SQLException {
    String dateTimeString = null;
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    Calendar cal = Calendar.getInstance();
    Date     time = cal.getTime();
    dateTimeString = df.format(time); 
	SQLManager.getInstance().modifyPerson(id, firstname, surname,street,housenumber,zipcode,email,dateTimeString,username,password, rights);
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

	public static List<Person> getPersonsByName(String searchValue) throws SQLException{
		return SQLManager.getInstance().getPersonsByFirstname(searchValue);
	}

	public static List<Person> getPersonsByLastname(String searchValue) throws SQLException {
		return SQLManager.getInstance().getPersonsByLastname(searchValue);
	}

	public static List<Person> getPersonsByRights(String searchValue) throws SQLException{
		switch(searchValue.toLowerCase()){
			case "kunde":
				return SQLManager.getInstance().getPersonsByRights(0);
			case "mitglied":
				return SQLManager.getInstance().getPersonsByRights(1);
			case "lehrstuhlmitglied":
				return SQLManager.getInstance().getPersonsByRights(2);
			default:
				return null;
		}
	}	
}
