package logic; 
import java.sql.Timestamp;


public class Bill {
    private int id;
    private String name;
    private int status;
    private int payKind;
    private double amount;
    private int idOrder;
    private int idPot;
    private int idRegister;
    
    public Bill(int id, int idOrder, int idPot, int idRegister, String name, int payKind, double amount, int status){
    this.id = id;
	this.name = name; 
	this.status = status; 
	this.payKind = payKind; 
	this.amount = amount; 
	this.status = status;
    }
    
    public Bill(){
    	
    }
    
    public int getId() {
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

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public int getIdPot() {
		return idPot;
	}

	public void setIdPot(int idPot) {
		this.idPot = idPot;
	}

	public int getIdRegister() {
		return idRegister;
	}

	public void setIdRegister(int idRegister) {
		this.idRegister = idRegister;
	}
   
	public String getReadableStatus(int status) {
		switch (status) {
		case 0:
			return "Nicht bezahlt";
		case 1:
			return "Bezahlt";
		default:
			return "Das passiert nicht!";
		}
	}
}
