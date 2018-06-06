package logic; 
import java.sql.Timestamp;


public class Bill {
    private int id;
    private String name;
    private int status;
    private int payKind;
    private double amount;
    
    public Bill(int id, int idOrder, int idPot, String name, int payKind, double amount, int status){
    this.id = id;
	this.name = name; 
	this.status = status; 
	this.payKind = payKind; 
	this.amount = amount; 
	this.status = status;
    }
    
    public Bill(){
    	
    }
    
    public int getBillId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPayKind() {
        return payKind;
    }

    public void setPayKind(int payKind) {
        this.payKind = payKind;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
