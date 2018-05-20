package logic; 
public class Component {
    private final int component_id;
    private static int count_id =0; 
    private String name;
    private String productLink;    
    private double price;
    private int stock;
    private int plannedAmount;
    private int orderedAmount;
    private String storageLocation;
    
    public Component(String name, String link, double price, int stock, int plannendAmount, int orderedAmount,String location){
	this.component_id = count_id; 
	count_id++; 
	this.name = name; 
	this.productLink = link;
	this.price = price; 
	this.stock = stock; 
	this.plannedAmount = plannendAmount; 
	this.orderedAmount = orderedAmount; 
	this.storageLocation = location; 
    }
    public int getComponentID() {
	return component_id; 
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
