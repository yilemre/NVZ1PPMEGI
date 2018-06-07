//Mainly everything by Marius
package DataAccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import logic.*;
import Exceptions.*;


public class SQLManager {

	private static SQLManager instance;
	private Connection c;

	public static SQLManager getInstance(){
		if (instance==null) instance = new SQLManager();
		return instance;
	}

	private SQLManager (){

		try{
			Class.forName("org.sqlite.JDBC");
			c= DriverManager.getConnection("jdbc:sqlite:ELab.db");
		}

		catch (Exception e){
			e.printStackTrace();
		}
	}

	//rights: 0 is a customer, 1 a member and 2 a "Lehrstuhl bez. Person" so 0 and 2 should only see ComponentManagement and 1 everything
	public int insertPersonIntoDB (String firstname, String surname, String street, int housenumber, int zipcode, String email, String datetime, String username, String password, int rights) throws SQLException{
		int result=0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Persons (firstname, surname, street, housenumber, zipcode, email, timestamp, username, password, rights) VALUES ('"+firstname+"','"+surname+"','"+street+"',"+housenumber+","+zipcode+",'"+email+"','"+datetime+"','"+username+"','"+password+"',"+rights+");";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Persons");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();	
		return result;
	}

	public int deletePersonFromDB(int id) throws SQLException{
		Statement stmt = c.createStatement();
		String sql ="DELETE FROM Persons WHERE idPerson="+id+"";
		stmt.executeUpdate(sql);
		stmt.close();	
		return id;
	}

	//Emre begin 
	public void modifyPerson(int id, String firstname, String surname, String street, int housenumber,
			int zipcode,String email, String t, String username, String password, int rights) throws SQLException {
		Statement stmt = c.createStatement(); 
		String sql = "UPDATE Persons SET firstname='"+firstname+"',surname='"+surname+"',street ='"+street+"', housenumber="+housenumber+", zipcode="+zipcode+", email='"+email+"',timestamp='"+t+"', username='"+username+"', password='"+password+"', rights="+rights+" WHERE idPerson="+id+";";
		stmt.executeUpdate(sql); 
		stmt.close();

	}		
	//Emre end

	public List<Person> getPersons() throws SQLException {
		List<Person> result = new ArrayList<Person>();

		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Persons";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Person temp = new Person (rs.getInt("idPerson"),rs.getString("firstname"),rs.getString("surname"),rs.getString("street"),rs.getInt("housenumber"),rs.getInt("zipcode"),rs.getString("email"),rs.getString("timestamp"),rs.getString("username"),rs.getString("password"),rs.getInt("rights"));

			result.add(temp);			
		}

		return result;
	}
	
	public List<Person> getPersonsByFirstname(String firstname) throws SQLException {
		List<Person> result = new ArrayList<Person>();
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Persons WHERE firstname LIKE'"+firstname+"'";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Person temp = new Person (rs.getInt("idPerson"),rs.getString("firstname"),rs.getString("surname"),rs.getString("street"),rs.getInt("housenumber"),rs.getInt("zipcode"),rs.getString("email"),rs.getString("timestamp"),rs.getString("username"),rs.getString("password"),rs.getInt("rights"));

			result.add(temp);			
		}

		return result;
	}
	
	public List<Person> getPersonsByLastname(String surname) throws SQLException {
		List<Person> result = new ArrayList<Person>();

		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Persons WHERE surname LIKE'"+surname+"'";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Person temp = new Person (rs.getInt("idPerson"),rs.getString("firstname"),rs.getString("surname"),rs.getString("street"),rs.getInt("housenumber"),rs.getInt("zipcode"),rs.getString("email"),rs.getString("timestamp"),rs.getString("username"),rs.getString("password"),rs.getInt("rights"));

			result.add(temp);			
		}

		return result;
	}
	
	public List<Person> getPersonsByRights(int rights) throws SQLException {
		List<Person> result = new ArrayList<Person>();
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Persons WHERE rights="+rights+"";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Person temp = new Person (rs.getInt("idPerson"),rs.getString("firstname"),rs.getString("surname"),rs.getString("street"),rs.getInt("housenumber"),rs.getInt("zipcode"),rs.getString("email"),rs.getString("timestamp"),rs.getString("username"),rs.getString("password"),rs.getInt("rights"));

			result.add(temp);			
		}

		return result;
	}

	public int addCategoryToDB(String name, String note) throws SQLException {
		int result=0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Categorys (name, note) VALUES ('"+name+"','"+note+"');";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Categorys");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();	
		return result;
	}

	public int deleteCategoryFromDB(int id) throws SQLException {
		Statement stmt = c.createStatement();
		String sql ="DELETE FROM Categorys WHERE idCategory="+id+";";
		stmt.executeUpdate(sql);
		stmt.close();	
		return id;
	}
	//Emre begin 
	public void modifyCategory(int id, String newName, String newNote) throws SQLException {
	    Statement stmt = c.createStatement(); 
	    stmt.executeUpdate("UPDATE Categorys SET name='"+ newName+"' , note='"+ newNote+"' WHERE idCategory ="+id+";");
	    stmt.close();
		}
	
	public List<Category> getCategories () throws SQLException {
	    List<Category> category = new ArrayList<Category>();
	    Statement stmt = c.createStatement(); 
	    ResultSet rs = stmt.executeQuery("SELECT * FROM Categorys;"); 
	    //stmt.close();
	    while(rs.next()) {
		Category temp = new Category(rs.getInt("idCategory"), rs.getString("name"), rs.getString("note")); 
		category.add(temp);
	    }
	    stmt.close();
	    return category; 
	    
	}
	
	public Category[] getCategoryArray () throws SQLException {
	    int count=0; 
	    Statement stmt = c.createStatement(); 
	    ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM Categorys"); 
	    rs.next(); 
	    count = rs.getInt(1); 
	    stmt.close();
	    Category[] c = new Category[count]; 
	    rs = stmt.executeQuery("SELECT * FROM Categorys"); 
	    int x = 0;
	    while(rs.next()) {
		Category a = new Category(rs.getInt("idCategory"), rs.getString("name"), rs.getString("note")); 
		c[x] = a; 
		x+=1; 
	    }
	    return c;
	    
	}
	//Emre end 

	public int addPartIntoDB(String articlenumber, String productlink, String name, double price, int storing, int plannedAmount, int orderedAmount, String storageLocation, int category) throws SQLException {
		int result=0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Parts (articlenumber, productlink, name, price, storing, plannedAmount, orderedAmount, storageLocation, idCategory) VALUES ('"+articlenumber+"','"+productlink+"','"+name+"',"+price+","+storing+","+plannedAmount+","+orderedAmount+",'"+storageLocation+"',"+ category+")";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Parts");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();	
		return result;
	}

	public int deletePartFromDB(int id) throws SQLException{
		Statement stmt = c.createStatement();
		String sql ="DELETE FROM Parts WHERE idPart="+id+";";
		stmt.executeUpdate(sql);
		stmt.close();	
		return id;
	}
	//Emre begin 
	public void modifyPart (int id, String articlenumber, String productlink, String name, double price, int storing, 
		int plannedAmount, int orderedAmount, String storageLocation, int idCategory) throws SQLException {
	    	Statement stmt = c.createStatement(); 
	    	stmt.executeUpdate("UPDATE Parts SET articlenumber = '"+ articlenumber+"', productlink='"+productlink+"',name='"+name+"', price="+
	    	price+", storing="+ storing+", plannedAmount="+ plannedAmount+", orderedAmount="+ orderedAmount+",storageLocation='"+storageLocation+"',idCategory="+idCategory+" WHERE idPart= "+ id);
    		stmt.close();
		    
	} 
	
	public List<Component> getComponents() throws SQLException {
	    List<Component> result = new ArrayList<Component>(); 
	    Statement stmt = c.createStatement(); 
	    ResultSet rs = stmt.executeQuery("SELECT * FROM Parts");
	    
	    while (rs.next()) {
		Component c = new Component(rs.getInt("idPart"),rs.getString("articlenumber"), rs.getString("name"), rs.getString("productlink"), rs.getDouble("price"), rs.getInt("storing"), rs.getInt("plannedAmount"), rs.getInt("orderedAmount"), rs.getString("storageLocation"),rs.getInt("idCategory"));
		result.add(c); 
	    }
	    return result; 
	}
	
	public List<Component> getComponentsByArticlenumber(String articlenumber) throws SQLException {
	    List<Component> result = new ArrayList<Component>(); 
	    Statement stmt = c.createStatement(); 
	    ResultSet rs = stmt.executeQuery("SELECT * FROM Parts WHERE articlenumber LIKE '" + articlenumber + "';"); 
	    
	    while (rs.next()) {
		Component c = new Component(rs.getInt("idPart"),rs.getString("articlenumber"), rs.getString("name"), rs.getString("productlink"), rs.getDouble("price"), rs.getInt("storing"), rs.getInt("plannedAmount"), rs.getInt("orderedAmount"), rs.getString("storageLocation"),rs.getInt("idCategory"));
		result.add(c); 
	    }
	    return result; 
	}
	
	public List<Component> getComponentsByName(String name) throws SQLException {
	    List<Component> result = new ArrayList<Component>(); 
	    Statement stmt = c.createStatement(); 
	    ResultSet rs = stmt.executeQuery("SELECT * FROM Parts WHERE name LIKE '" + name+ "';"); 
	    
	    while (rs.next()) {
		Component c = new Component(rs.getInt("idPart"),rs.getString("articlenumber"), rs.getString("name"), rs.getString("productlink"), rs.getDouble("price"), rs.getInt("storing"), rs.getInt("plannedAmount"), rs.getInt("orderedAmount"), rs.getString("storageLocation"),rs.getInt("idCategory"));
		result.add(c); 
	    }
	    return result; 
	}
	
	//Emre end
	
	
	//You need to check whether or not there are already parts with ID x for Person Y in Card! If so: Increase amount and don't add new row!
	public void addPartToShoppingCard(int idPart, int idPerson, int amount) throws SQLException {
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO ShoppingCardParts (idPerson, idPart, amount) VALUES((SELECT idPerson FROM Persons WHERE idPerson="+idPerson+"), (SELECT idPart FROM Parts WHERE idPart="+idPart+"),"+amount+");";
		stmt.executeUpdate(sql);
		stmt.close();
	}

	public void deletePartFromShoppingCard(int idPart, int idPerson) throws SQLException{
		Statement stmt = c.createStatement();
		String sql="DELETE FROM ShoppingCardParts WHERE idPart="+idPart+" AND idPerson="+idPerson+";";
		stmt.executeUpdate(sql);
		stmt.close();
	}



//Nico begin reworked by Marius

	//Nico begin	

	/*type: 0 for "3D-Prints", 1 for "circuit board", 2 for "other"
	every order is going to be inserted with the status 0 which is "accepted"!
	Values for all the other status:
		0 accepted
		1 made
		2 costs calculated
		3 picked up
		4 billed
		5 waiting for material
		6 production interrupted
		7 bill generated
	*/
	public int insertOrderIntoDB (String title, int type, double projectedCosts, double realCosts, int idCustomer, int idAdvisor, int idSecondaryAdvisor, String fileName, String fileLocation, String note) throws SQLException{
		int result=0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Orders (titel, type, projectedCosts, realCosts, idCustomer, idAdvisor, idSecondaryAdvisor, fileName, fileLocation, note) VALUES ('"+title+"', "+type+", "+projectedCosts+","+realCosts+",(SELECT idPerson FROM Persons WHERE idPerson="+idCustomer+"), (SELECT idPerson FROM Persons WHERE idPerson="+idAdvisor+"), (SELECT idPerson FROM Persons WHERE idPerson="+idSecondaryAdvisor+"), '"+fileName+"','"+fileLocation+"', '"+note+"');";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Orders");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();
		return result;
	}
	
	public int insertOrderStatusIntoDB(int idOrder, int status, String datetime) throws SQLException {
		int result = 0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO OrderStatus (idOrder, status, timestamp) VALUES ("+idOrder+ ", "+status+", '"+datetime+"');";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM OrderStatus");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();	
		return result;
	}

	public int deleteOrderFromDB(int id) throws SQLException{
		Statement stmt = c.createStatement();
		String sql ="DELETE FROM Orders, OrderStatus WHERE Orders.idOrder = OrderStatus.idOrder AND idOrder ="+id;
		stmt.executeUpdate(sql);
		stmt.close();
		return id;
	}

	public void modifyOrder(int id, String title, int type, double projectedCosts, double realCosts, int idCustomer, int idAdvisor, int idSecondaryAdvisor, String fileName, String fileLocation, String note) throws SQLException {
		Statement stmt = c.createStatement();
		String sql ="UPDATE Orders SET titel='"+title+"',type='"+type+"',projectedCosts='"+projectedCosts+"' ,realCosts='"+realCosts+"' ,idCustomer='"+idCustomer+"' ,idAdvisor='"+idAdvisor+"' ,idSecondaryAdvisor ='"+idSecondaryAdvisor+"',fileName="+fileName+",fileLocation='"+fileLocation+"',note='"+note+"' WHERE idOrder="+id+";";
		stmt.executeUpdate(sql);
		stmt.close();
	}
		
	public void changeOrderStatus(int id, int status) throws SQLException{
		Statement stmt = c.createStatement(); 
		String sql = "UPDATE OrderStatus SET status='"+status+"' WHERE idOrder="+id;
		stmt.executeUpdate(sql); 
		stmt.close();
	}
	

	// search methods
	public List<Order> getOrdersByTitle(String title) throws SQLException {
		List<Order> result = new ArrayList<Order>();
		Statement stmt = c.createStatement();
		String sql = "SELECT idOrder, titel, type, projectedCosts, realCosts, idCustomer, idAdvisor, idSecondaryAdvisor, fileName, fileLocation, note, MAX(status) as status, timestamp FROM Orders NATURAL JOIN OrderStatus GROUP BY idOrder HAVING title='"+title+"';";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Order temp = new Order (rs.getInt("idOrder"),rs.getString("titel"),rs.getInt("type"),rs.getDouble("projectedCosts"),rs.getDouble("realCosts"),rs.getInt("idCustomer"),rs.getInt("idAdvisor"),rs.getInt("idSecondaryAdvisor"),rs.getString("fileName"),rs.getString("fileLocation"),rs.getString("note"),rs.getInt("status"), rs.getString("timestamp"));
			result.add(temp);			
		}

		rs.close();
		stmt.close();

		return result;
	}

	public List<Order> getOrdersByType(int type) throws SQLException {
		List<Order> result = new ArrayList<Order>();
		Statement stmt = c.createStatement();
		String sql = "SELECT idOrder, titel, type, projectedCosts, realCosts, idCustomer, idAdvisor, idSecondaryAdvisor, fileName, fileLocation, note, MAX(status) as status, timestamp FROM Orders NATURAL JOIN OrderStatus GROUP BY idOrder HAVING type="+type+";";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Order temp = new Order (rs.getInt("idOrder"),rs.getString("titel"),rs.getInt("type"),rs.getDouble("projectedCosts"),rs.getDouble("realCosts"),rs.getInt("idCustomer"),rs.getInt("idAdvisor"),rs.getInt("idSecondaryAdvisor"),rs.getString("fileName"),rs.getString("fileLocation"),rs.getString("note"),rs.getInt("status"), rs.getString("timestamp"));
			result.add(temp);
		}

		rs.close();
		stmt.close();

		return result;
	}
	
	public List<Order> getOrders() throws SQLException {
		List<Order> result = new ArrayList<Order>();
		Statement stmt = c.createStatement();
		String sql = "SELECT idOrder, titel, type, projectedCosts, realCosts, idCustomer, idAdvisor, idSecondaryAdvisor, fileName, fileLocation, note, MAX(status) as status, timestamp FROM Orders NATURAL JOIN OrderStatus GROUP BY idOrder";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Order temp = new Order (rs.getInt("idOrder"),rs.getString("titel"),rs.getInt("type"),rs.getDouble("projectedCosts"),rs.getDouble("realCosts"),rs.getInt("idCustomer"),rs.getInt("idAdvisor"),rs.getInt("idSecondaryAdvisor"),rs.getString("fileName"),rs.getString("fileLocation"),rs.getString("note"), rs.getInt("status"), rs.getString("timestamp"));

			result.add(temp);			
		}

		return result;
	}
	
	//
	public List<Order> getOrdersByStatus(int status) throws SQLException {
		List<Order> result = new ArrayList<Order>();
		Statement stmt = c.createStatement();
		String sql = "SELECT idOrder, titel, type, projectedCosts, realCosts, idCustomer, idAdvisor, idSecondaryAdvisor, fileName, fileLocation, note, MAX(status) as status, timestamp FROM Orders NATURAL JOIN OrderStatus GROUP BY idOrder HAVING status="+status+";";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Order temp = new Order (rs.getInt("idOrder"),rs.getString("titel"),rs.getInt("type"),rs.getDouble("projectedCosts"),rs.getDouble("realCosts"),rs.getInt("idCustomer"),rs.getInt("idAdvisor"),rs.getInt("idSecondaryAdvisor"),rs.getString("fileName"),rs.getString("fileLocation"),rs.getString("note"), rs.getInt("status"), rs.getString("timestamp"));
			result.add(temp);			
		}
		
		rs.close();
		stmt.close();
		
		return result;
	}
	
	public List<Person> getCustomerArray () throws SQLException {
	   List<Person> result = new ArrayList<Person>();
	   Statement stmt = c.createStatement();
	   String sql = "SELECT * FROM Persons WHERE rights !="+1+";";
	   ResultSet rs = stmt.executeQuery(sql);
	   while(rs.next()){
		   	Person temp = new Person(rs.getInt("idPerson"),rs.getString("firstname"),rs.getString("surname"),rs.getString("street"),rs.getInt("housenumber"),rs.getInt("zipcode"),rs.getString("email"),rs.getString("timestamp"),rs.getString("username"),rs.getString("password"),rs.getInt("rights"));
			result.add(temp);	   
	   }
	   return result; 
	}
	
	public List<Person> getAdvisorArray () throws SQLException {
		List<Person> result = new ArrayList<Person>();
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Persons WHERE rights="+1+";";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Person temp = new Person(rs.getInt("idPerson"),rs.getString("firstname"),rs.getString("surname"),rs.getString("street"),rs.getInt("housenumber"),rs.getInt("zipcode"),rs.getString("email"),rs.getString("timestamp"),rs.getString("username"),rs.getString("password"),rs.getInt("rights"));
			result.add(temp);
		}
		return result;
	}
	
	public List<Person> getSecondaryAdvisorArray () throws SQLException {
	    List<Person> result = new ArrayList<Person>();
	    Statement stmt = c.createStatement();
	    String sql = "SELECT * FROM Persons WHERE rights="+1+";";
	    ResultSet rs = stmt.executeQuery(sql);
	    while (rs.next()){
	    	Person temp = new Person(rs.getInt("idPerson"),rs.getString("firstname"),rs.getString("surname"),rs.getString("street"),rs.getInt("housenumber"),rs.getInt("zipcode"),rs.getString("email"),rs.getString("timestamp"),rs.getString("username"),rs.getString("password"),rs.getInt("rights"));
	    	result.add(temp);
	    }
	    return result;
	}
	
	//Financial SQL by Nico
	
	public int addRegistertoDB(double actualAmount, double debitAmount, String name, int type) throws SQLException{
		int result = 0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Registers (debitAmount, actualAmount, name, type) VALUES ('"+debitAmount+"','"+actualAmount+"','"+name+"','"+type+"')";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Registers");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();
		return result;
	}
		
	public void modifyRegister(int id, double actualAmount, double debitAmount, String name, int type) throws SQLException{
		Statement stmt = c.createStatement();
		stmt.executeUpdate("UPDATE Registers SET debitAmount = '"+debitAmount+"', actualAmount = '"+actualAmount+"', name ='"+name+"', type ='"+type+"' WHERE idRegister='"+id);
		stmt.close();
	}
	
	public List<CashRegister> getRegisterArray () throws SQLException {
		   List<CashRegister> result = new ArrayList<CashRegister>();
		   Statement stmt = c.createStatement();
		   String sql = "SELECT * FROM Registers";
		   ResultSet rs = stmt.executeQuery(sql);
		   while(rs.next()){
			   	CashRegister temp = new CashRegister(rs.getInt("idRegister"), rs.getDouble("debitAmount"), rs.getDouble("actualAmount"), rs.getString("name"), rs.getInt("type"));
				result.add(temp);	   
		   }
		   return result; 
		}
	
	public int deleteCashRegisterFromDB(int id) throws SQLException{
		Statement stmt = c.createStatement();
		String sql ="DELETE FROM Register WHERE idRegister="+id;
		stmt.executeUpdate(sql);
		stmt.close();
		return id;
	}
	
	public int addPottoDB(double actualAmount, double debitAmount, String name, int idRegister) throws SQLException{
		int result = 0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Pots (debitAmount, actualAmount, name, idRegister) VALUES ('"+debitAmount+"','"+actualAmount+"','"+name+"','"+idRegister+"')";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Registers");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();
		return result;
	}
		
	public void modifyPot(int id, double actualAmount, double debitAmount, String name, int idRegister) throws SQLException{
		Statement stmt = c.createStatement();
		stmt.executeUpdate("UPDATE Pots SET debitAmount = '"+debitAmount+"', actualAmount = '"+actualAmount+"', name ='"+name+"', idRegister ='"+idRegister+"' WHERE idPots='"+id);
		stmt.close();
	}
	
	public List<Pot> getPotArray () throws SQLException {
		   List<Pot> result = new ArrayList<Pot>();
		   Statement stmt = c.createStatement();
		   String sql = "SELECT * FROM Pots";
		   ResultSet rs = stmt.executeQuery(sql);
		   while(rs.next()){
			   	Pot temp = new Pot(rs.getInt("idPot"), rs.getString("name"), rs.getDouble("debitAmount"), rs.getDouble("actualAmount"), rs.getInt("idRegister"));
				result.add(temp);	   
		   }
		   return result; 
		}
	
	public int deletePotFromDB(int id) throws SQLException{
		Statement stmt = c.createStatement();
		String sql ="DELETE FROM Pots WHERE idPot="+id;
		stmt.executeUpdate(sql);
		stmt.close();
		return id;
	}
	
	public int addBilltoDB(int idOrder, int idPot, int idRegister, int CustomerId, int AdvisorId, String name, int payKind, double amount) throws SQLException {
		int result=0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Bills (idOrder, idPot, idRegister, idCustomer, idAdvisor, name, methodOfPayment, figure) VALUES ('"+idOrder+"', '"+idPot+"', '"+idRegister+"' , '"+CustomerId+"', '"+AdvisorId+"', '"+name+"', '"+payKind+"', '"+amount+"');";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Bills");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();	
		return result;
	}
	
	public int addBillStatustoDB(int idBill, int status, String datetime) throws SQLException {
		int result = 0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO BillStatus (idOrder, status, timestamp) VALUES ("+idBill+ ", "+status+", '"+datetime+"');";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM BillStatus");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();	
		return result;
	}
	
	public int deleteBillFromDB(int id) throws SQLException{
		Statement stmt = c.createStatement();
		String sql ="DELETE FROM Bills, BillStatus WHERE Bills.idBill = BillStatus.idBill AND idBill ="+id;
		stmt.executeUpdate(sql);
		stmt.close();
		return id;
	}
	
	public void modifyBill(int id, int idOrder, int idPot, int idRegister, String name, int payKind, double amount) throws SQLException {
		Statement stmt = c.createStatement();
		String sql = "UPDATE Bills SET idOrder='"+idOrder+"', idPot='"+idPot+"', idRegister='"+idRegister+"', name='"+name+"' , methodOfPayment='"+payKind+"' , figure='"+amount+"' WHERE idOrder="+id+";";
		stmt.executeUpdate(sql);
		stmt.close();
	}
	
	public void changeBillStatus(int id, int status) throws SQLException{
		Statement stmt = c.createStatement(); 
		String sql = "UPDATE BillStatus SET status='"+status+"' WHERE idBill="+id;
		stmt.executeUpdate(sql); 
		stmt.close();
	}
	
	public List<Bill> getBills() throws SQLException {
		List<Bill> result = new ArrayList<Bill>();
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Bills, BillStatus WHERE Bills.idBill = BillStatus.idBill";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Bill temp = new Bill (rs.getInt("idBill"),rs.getInt("idOrder"),rs.getInt("idPot"), rs.getInt("idRegiser"), rs.getString("name"),rs.getInt("methodOfPayment"),rs.getDouble("figure"), rs.getInt("status"));
			result.add(temp);			
		}

		return result;
	}
	
	public List<Bill> getBillByName(String name) throws SQLException {
		List<Bill> result = new ArrayList<Bill>();
		Statement stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Bills, BillStatus WHERE Bill.idBill = BillStatus.idBill AND titel LIKE '"+name+"'");
		while (rs.next()){
			Bill temp = new Bill (rs.getInt("idBill"),rs.getInt("idOrder"),rs.getInt("idPot"), rs.getInt("idRegister") ,rs.getString("name"),rs.getInt("methodOfPayment"),rs.getDouble("figure"), rs.getInt("status"));
			result.add(temp);			
		}

		rs.close();
		stmt.close();

		return result;
	}
	
	public List<Bill> getBillsByStatus(int status) throws SQLException {
		List<Bill> result = new ArrayList<Bill>();
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Bills, BillStatus WHERE Bills.idBill = BillStatus.idBill AND status='"+status+"'";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Bill temp = new Bill (rs.getInt("idBill"),rs.getInt("idOrder"),rs.getInt("idPot"), rs.getInt("idRegister") ,rs.getString("name"),rs.getInt("methodOfPayment"),rs.getDouble("figure"), rs.getInt("status"));
			result.add(temp);			
		}
		
		rs.close();
		stmt.close();
		return result;
	}
	
	public List<Bill> getBillsByDate(String date) throws SQLException {
		List<Bill> result = new ArrayList<Bill>();
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Bills, BillStatus WHERE Bills.idBill = BillStatus.idBill AND timestamp='"+date+"'";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Bill temp = new Bill (rs.getInt("idBill"),rs.getInt("idOrder"),rs.getInt("idPot"), rs.getInt("idRegister") ,rs.getString("name"),rs.getInt("methodOfPayment"),rs.getDouble("figure"), rs.getInt("status"));
			result.add(temp);			
		}
		
		rs.close();
		stmt.close();
		return result;
	}
	// Nico End*/
}