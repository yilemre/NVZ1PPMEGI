//Author: Emre 
package logic;

public class Category {
    private int id; 
    private String name; 
    private String note;
    
    public Category(int id, String name, String note) {
	this.id = id; 
	this.name = name; 
	this.note = note; 
    }
    
    public String toString() {
	return "ID: " + id + ", Name: " + name; 
    } 
 
    public int getId() {
        return id;
    } 
    

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
    

}
