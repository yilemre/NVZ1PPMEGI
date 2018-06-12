package logic;

	public class Billinformation {
	    private int id;
	    private int idOrder;
	    private int idPot;
	    private int idRegister;
	    private int idCustomer;
	    private int idAdvisor;
	    private String name;
	    private int methodOfPayment;
	    private double figure;
	    private String firstname;
	    private String surname;
	    private String street;
	    private int housenumber;
	    private int zipcode;
	    private String email;
	    private int status;
	    private String timestamp;
	    
    /**
     * @param id
     * @param idOrder
     * @param idPot
     * @param idCustomer
     * @param idAdvisor
     * @param idRegister
     * @param name
     * @param methodOfPayment
     * @param figure
     * @param status
     * @param timestamp
     * @param firstname
     * @param surname
     * @param street
     * @param housenumber
     * @param zipcode
     * @param email
     */
    public Billinformation (int id, int idOrder, int idPot, int idCustomer, int idAdvisor, int idRegister, String name, int methodOfPayment, double figure, int status, String timestamp, String firstname, String surname, String street, int housenumber, int zipcode, String email){
	    this.id = id;
	    this.idPot = idPot;
	    this.idOrder = idOrder;
	    this.idCustomer = idCustomer;
	    this.idAdvisor = idAdvisor;
	    this.idRegister = idRegister;
		this.name = name; 
		this.methodOfPayment = methodOfPayment; 
		this.figure = figure; 
		this.status = status;
		this.timestamp = timestamp;
		this.firstname = firstname;
		this.surname = surname;
		this.street = street;
		this.housenumber = housenumber;
		this.zipcode = zipcode;
		this.email = email;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}

	public int getIdAdvisor() {
		return idAdvisor;
	}

	public void setIdAdvisor(int idAdvisor) {
		this.idAdvisor = idAdvisor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
