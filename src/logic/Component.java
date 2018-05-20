package logic; 
public class Component {
    private int articlenumber;
    private String name;
    private String productLink;    
    private double price;
    private int stock;
    private int plannedAmount;
    private int orderedAmount;
    private String storageLocation;
    
    public Component(int no, String name, String link, double price, int stock, int plannendAmount, int orderedAmount,String location){
	this.articlenumber = no; 
	this.name = name; 
	this.productLink = link;
	this.price = price; 
	this.stock = stock; 
	this.plannedAmount = plannendAmount; 
	this.orderedAmount = orderedAmount; 
	this.storageLocation = location; 
    }

    public int getArticlenumber() {
        return articlenumber;
    }

    public void setArticlenumber(int articlenumber) {
        this.articlenumber = articlenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductLink() {
        return productLink;
    }

    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPlannedAmount() {
        return plannedAmount;
    }

    public void setPlannedAmount(int plannedAmount) {
        this.plannedAmount = plannedAmount;
    }

    public int getOrderedAmount() {
        return orderedAmount;
    }

    public void setOrderedAmount(int orderedAmount) {
        this.orderedAmount = orderedAmount;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }
    
    
}
