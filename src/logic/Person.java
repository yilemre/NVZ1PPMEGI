package logic; 
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Person {
    
    private int id; 
    private String firstname;
    private String lastname;
    private String street;
    private int housenumber;
    private int plz;
    private String email;
    private String timestamp;
    private  String username; 
    private  String password;
    private int rights;
    private double costsForComponents ;
    public double getCostsForComponents() {
		return costsForComponents;
	}


	ArrayList<Component> shoppingCart = new ArrayList();
	
    public Person(int id,String firstname, String lastname, String street, int housenumber, int plz, String email, String timestamp, String username, String password, int rights){
	this.id = id; 
	this.firstname = firstname; 
	this.lastname = lastname; 
	this.street = street; 
	this.housenumber = housenumber; 
	this.plz = plz; 
	this.email = email; 
	this.timestamp = timestamp;
	this.username = username; 
	this.password = password; 	
	this.rights=rights;
    }
            
    public int getRights() {
		return rights;
	}

	public void setRights(int rights) {
		this.rights = rights;
	}

	public String getReadableRights(int rights) {
		switch (rights) {
			case 0:
				return "Kunde";
			case 1:
				return "Mitglied";
			case 2:
				return "Lehrstuhlmitglied";
			default:
				return "Das passiert nicht!";
		}
	}
	public Person(){    
	
    }
    

	public int getId() {
		return id;
	}

	public void setCostsForComponents(double costsForComponents) {
		this.costsForComponents = costsForComponents;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //public int getPerson_id() {
      //  return person_id;
    //}
    
	
	
}
