//Author: Emre
package logic;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import DataAccess.SQLManager;


public class PersonManagement {
    
    public static void addPerson(String firstname, String surname, String street, int housenumber, int zipcode, String email, String username, String password, int rights) throws SQLException  {
	
	String dateTimeString = null;
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	LocalDate date = LocalDate.now();
	dateTimeString = df.format(date);
	
	System.out.println(dateTimeString+"!");
    	SQLManager.getInstance().insertPersonIntoDB(firstname, surname, street, housenumber, zipcode, email, dateTimeString, username, password, rights);
    }

    public static void deletePerson(int ID) throws SQLException {
	SQLManager.getInstance().deletePersonFromDB(ID); 
    }

    public static void modifyPerson(int id, String firstname, String surname, String street, String housenumber,
	String zipcode,String email, String username, String password, int rights) throws SQLException {
	Timestamp t = new Timestamp(System.currentTimeMillis());  
	SQLManager.getInstance().modifyPerson1(id, firstname, surname,street,housenumber,zipcode,email,t,username,password, rights);
    }
    //public static ArrayList<String> getAllPerson() throws SQLException {
	//return SQLManager.getInstance().getAllPersons(); 
	
    //}
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
    }	
}
