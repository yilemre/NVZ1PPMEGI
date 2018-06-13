package logic;

public class ShoppingObject {
    private final int idPart; 
    private String articlenumber;
    private String name; 
    private int amount; 
    private double price; 
    private double sumPrice; 
    
    public ShoppingObject(int idPart, String articlenumber, String name, int amount, double price) {
	
	this.idPart = idPart;
	this.articlenumber = articlenumber;
	this.name = name;
	this.amount = amount;
	this.price = price;
	this.sumPrice = amount *price; 
    }

    public String getArticlenumber() {
        return articlenumber;
    }

    public void setArticlenumber(String articlenumber) {
        this.articlenumber = articlenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public int getIdPart() {
        return idPart;
    }
    
    
    

}

    
