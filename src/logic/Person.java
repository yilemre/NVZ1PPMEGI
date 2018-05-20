package logic; 
import java.util.ArrayList;

public class Person {
	
	final int person_id = 1;
	private String firstname;
	private String lastname;
	private String street;
	private int housenumber;
	private int plz;
	private String email;
	private String timestamp;
	private String username;
	private String password;
	private double costsForComponents;
	ArrayList<Component> shoppingCart = new ArrayList();
	
	Person(String firstname, String lastname, String street, int housenumber, int plz, String email){
	    this.firstname = firstname; 
	    this.lastname = lastname; 
	    this.street = street; 
	    this.housenumber = housenumber; 
	    this.plz = plz; 
	    this.email = email; 
	    
	}
}
