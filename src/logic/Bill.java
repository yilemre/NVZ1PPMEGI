package logic; 
import java.sql.Timestamp;


public class Bill {
    private int id;
    private int idPot;
    private int idOrder;
    private String name;
    private int methodOfPayment;
    private double figure;
    private int status;
    private String timestamp;
    
    public Bill(int id, int idPot, int idOrder, String name, int methodOfPayment, double figure, int status, String timestamp){
    this.id = id;
    this.idPot = idPot;
    this.idOrder = idOrder;
	this.name = name; 
	this.methodOfPayment = methodOfPayment; 
	this.figure = figure; 
	this.status = status;
	this.timestamp = timestamp;
    }
    
    public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public int getMethodOfPayment() {
		return methodOfPayment;
	}

	public void setMethodOfPayment(int methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}

	public double getFigure() {
		return figure;
	}

	public void setFigure(double figure) {
		this.figure = figure;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getIdPot() {
		return idPot;
	}

	public void setIdPot(int idPot) {
		this.idPot = idPot;
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
