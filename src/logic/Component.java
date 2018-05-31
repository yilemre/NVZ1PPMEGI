package logic; 
public class Component {
    
    private int component_id;
    private String articlenumber; 
    private String name;
    private String productLink;    
    private double price;
    private int storing;
    private int plannedAmount;
    private int orderedAmount;
    private String storageLocation;
    private int idCategory; 
    
    public Component(int id, String name, String link, double price, int storing, int plannendAmount, int orderedAmount,String location,int idCategory){
	this.component_id = id; 
	this.name = name; 
	this.productLink = link;
	this.price = price; 
	this.storing = storing; 
	this.plannedAmount = plannendAmount; 
	this.orderedAmount = orderedAmount; 
	this.storageLocation = location; 
	this.idCategory = idCategory; 
    }

    public int getComponent_id() {
        return component_id;
    }

    public void setComponent_id(int component_id) {
        this.component_id = component_id;
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

    public int getStoring() {
        return storing;
    }

    public void setStoring(int storing) {
        this.storing = storing;
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
    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }
    
}    
    