package logic; 
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

public class Person {
    final int person_id = 1;
    private String firstname;
    private String lastname;
    private String street;
    private int housenumber;
    private int plz;
    private String email;
    private Timestamp timestamp;
    private String username;
    private String password;
    private double costsForComponents;
    ArrayList<Component> shoppingCart = new ArrayList();
	
    Person(String firstname, String lastname, String street, int housenumber, int plz, String email,String username, String password){
	this.firstname = firstname; 
	this.lastname = lastname; 
	this.street = street; 
	this.housenumber = housenumber; 
	this.plz = plz; 
	this.email = email; 
	this.timestamp = new Timestamp(System.currentTimeMillis()); 
	this.username = username; 
	this.password = password; 	    
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(int housenumber) {
        this.housenumber = housenumber;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPerson_id() {
        return person_id;
    }
    
	
	
}
