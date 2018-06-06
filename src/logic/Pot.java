package logic; 
public class Pot {
    
	private int id;
    private String name;
    private double debitAmount;
    private double actualAmount;
    private int idRegister;
    
    public Pot(int id, String name, double debitAmount, double actualAmount, int idRegister) {
		this.id = id;
		this.name = name;
		this.debitAmount = debitAmount;
		this.actualAmount = actualAmount;
		this.idRegister = idRegister;
	}

    public Pot(){
    	
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

	public int getIdRegister() {
		return idRegister;
	}

	public void setIdRegister(int idRegister) {
		this.idRegister = idRegister;
	}
    
    public String toString() {
    	return "ID: " + id + ", Name: " +name; 
        }
}
