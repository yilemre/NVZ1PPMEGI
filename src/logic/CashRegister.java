package logic; 

public class CashRegister {
	private int id;
    private String name;
    private double debitAmount;
    private double actualAmount;
    private int type;
    
    
    public CashRegister(int id, double debitAmount, double actualAmount, String name, int type) {
		this.id = id;
		this.debitAmount = debitAmount;
		this.actualAmount = actualAmount;
		this.name = name;
		this.type = type;
	}
    
    public CashRegister() {
    	
    }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getDebitAmount() {
		return debitAmount;
	}


	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}


	public double getActualAmount() {
		return actualAmount;
	}


	public void setActualAmount(double actualAmount) {
		this.actualAmount = actualAmount;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}

    public String toString() {
    	return "ID: " + id + ", Name: " +name; 
        }
}
