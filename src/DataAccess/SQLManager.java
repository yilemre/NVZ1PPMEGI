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

	//If you call this method you can give it a AttributeTypes.xxxx attribute to say which attribute should be changed
/*
	public void modifyPerson(int id, AttributeTypesPerson attribute, String newValue) throws SQLException{
		Statement stmt = c.createStatement();
		switch(attribute) {
		case firstname: 
			String sql ="ALTER Persons SET firstname="+newValue+"WHERE idPerson="+id+";";
			stmt.executeUpdate(sql);
			stmt.close();
			break;
		case surname:
			String sql1 ="ALTER Persons SET surname="+newValue+"WHERE idPerson="+id+";";
			stmt.executeUpdate(sql1);
			stmt.close();
			break;
		case street:
			String sql2 ="ALTER Persons SET street="+newValue+"WHERE idPerson="+id+";";
			stmt.executeUpdate(sql2);
			stmt.close();
			break;
		case housenumber:
			String sql3 ="ALTER Persons SET housenumber="+Integer.parseInt(newValue)+"WHERE idPerson="+id+";";
			stmt.executeUpdate(sql3);
			stmt.close();
			break;
		case zipcode:
			String sql4 ="ALTER Persons SET zipcode="+Integer.parseInt(newValue)+"WHERE idPerson="+id+";";
			stmt.executeUpdate(sql4);
			stmt.close();
			break;
		case email:
			String sql5 ="ALTER Persons SET email="+newValue+"WHERE idPerson="+id+";";
			stmt.executeUpdate(sql5);
			stmt.close();
			break;
		case timestamp:
			String sql6 ="ALTER Persons SET timestamp="+newValue+"WHERE idPerson="+id+";";
			stmt.executeUpdate(sql6);
			stmt.close();
			break;
		case username:
			String sql7 ="ALTER Persons SET timestamp="+newValue+"WHERE idPerson="+id+";";
			stmt.executeUpdate(sql7);
			stmt.close();
			break;
		case password:
			String sql8 ="ALTER Persons SET timestamp="+newValue+"WHERE idPerson="+id+";";
			stmt.executeUpdate(sql8);
			stmt.close();
			break;
		case rights:
			String sql9 ="ALTER Parts SET rights="+Integer.parseInt(newValue)+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql9);
			stmt.close();
			break;
		}
	}
*/
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
	
	public int insertOrderStatusIntoDB(int status, String datetime) throws SQLException {
		int result = 0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO OrderStatus (status, timestamp) VALUES ('"+status+"', '"+datetime+"');";
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
		String sql ="DELETE FROM Orders WHERE idOrder="+id;
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
	
	/*Method not needed
	public void setOrderType(int id, AttributeTypesOrder attribute, int newValue) throws SQLException{
		Statement stmt = c.createStatement();
		String sql ="ALTER Orders SET type="+newValue+"WHERE idOrder="+id+";";
		stmt.executeUpdate(sql); 
		stmt.close();
	}*/
	
	/*public void modifyOrder1(int id, AttributeTypesOrder attribute, String newValue) throws SQLException{
		Statement stmt = c.createStatement();
		switch(attribute) {
		case title: 
			String sql ="ALTER Orders SET titel="+newValue+"WHERE idOrder="+id;
			stmt.executeUpdate(sql);
			stmt.close();
			break;
		case idAdvisor:
			String sql2 ="ALTER Orders SET idAdvisor="+Integer.parseInt(newValue)+"WHERE idOrder="+id;
			stmt.executeUpdate(sql2);
			stmt.close();
			break;
		case idSecondaryAdvisor:
			String sql3 ="ALTER Orders SET idSecondaryAdvisor="+Integer.parseInt(newValue)+"WHERE idOrder="+id;
			stmt.executeUpdate(sql3);
			stmt.close();
			break;
		case notes:
			String sql4 ="ALTER Orders SET notes="+newValue+"WHERE idOrder="+id;
			stmt.executeUpdate(sql4);
			stmt.close();
			break;
		case forecastedCosts:
			String sql5 ="ALTER Orders SET forecastedCosts="+Double.parseDouble(newValue)+"WHERE idOrder="+id;
			stmt.executeUpdate(sql5);
			stmt.close();
			break;
		case realCosts:
			String sql6 ="ALTER Orders SET realCosts="+Double.parseDouble(newValue)+"WHERE idOrder="+id;
			stmt.executeUpdate(sql6);
			stmt.close();
			break;
		case fileLocation:
			String sql7 ="ALTER Orders SET fileLocation="+newValue+"WHERE idOrder="+id;
			stmt.executeUpdate(sql7);
			stmt.close();
			break;
		}
	}*/

	/*We want to have a new row for every change in orderStatus this method would overwrite it!!!
	public void modifyOrderStatus(int id, AttributeTypesOrderStatus attribute, int newValue ) throws SQLException {
		Statement stmt = c.createStatement();
		switch(attribute) {
		case accepted: 
			String sql ="ALTER OrderStatus SET status="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql);
			stmt.close();
			break;
		case made:
			String sql1 ="ALTER OrderStatus SET status="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql1);
			stmt.close();
			break;
		case costsCalculated:
			String sql2 ="ALTER OrderStatus SET status="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql2);
			stmt.close();
			break;
		case pickedUp:
			String sql3 ="ALTER OrderStatus SET status="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql3);
			stmt.close();
			break;
		case billed:
			String sql4 ="ALTER OrderStatus SET status="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql4);
			stmt.close();
			break;
		case waitingForMaterial:
			String sql5 ="ALTER OrderStatus SET status="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql5);
			stmt.close();
			break;
		case productionInterrupted:
			String sql6 ="ALTER OrderStatus SET status="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql6);
			stmt.close();
			break;
		case billGenerated:
			String sql7 ="ALTER OrderStatus SET status="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql7);
			stmt.close();
			break;
		}
	}*/
	
	public void changeOrderStatus(int id, int status) throws SQLException{
		Statement stmt = c.createStatement(); 
		String sql = "UPDATE OrderStatus SET status='"+status+"' WHERE idOrder="+id;
		stmt.executeUpdate(sql); 
		stmt.close();
	}
	

	// search methods - Work in Progress
	public List<Order> getOrdersByTitle(String title) throws SQLException {
		List<Order> result = new ArrayList<Order>();
		Statement stmt = c.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Orders, OrderStatus WHERE Orders.idOrder = OrderStatus.idOrder AND titel LIKE '"+title+"'");
		while (rs.next()){
			Order temp = new Order (rs.getInt("idOrder"),rs.getString("titel"),rs.getInt("type"),rs.getDouble("projectedCosts"),rs.getDouble("realCosts"),rs.getInt("idCustomer"),rs.getInt("idAdvisor"),rs.getInt("idSecondaryAdvisor"),rs.getString("fileName"),rs.getString("fileLocation"),rs.getString("note"),rs.getInt("status"));
			result.add(temp);			
		}

		rs.close();
		stmt.close();

		return result;
	}

	public List<Order> getOrdersByType(int type) throws SQLException {
		List<Order> result = new ArrayList<Order>();
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Orders, OrderStatus WHERE Orders.idOrder = OrderStatus.idOrder AND type='"+type+"'";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Order temp = new Order (rs.getInt("idOrder"),rs.getString("titel"),rs.getInt("type"),rs.getDouble("projectedCosts"),rs.getDouble("realCosts"),rs.getInt("idCustomer"),rs.getInt("idAdvisor"),rs.getInt("idSecondaryAdvisor"),rs.getString("fileName"),rs.getString("fileLocation"),rs.getString("note"),rs.getInt("status"));
			result.add(temp);
		}

		rs.close();
		stmt.close();

		return result;
	}
	
	public List<Order> getOrders() throws SQLException {
		List<Order> result = new ArrayList<Order>();
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Orders, OrderStatus WHERE Orders.idOrder = OrderStatus.idOrder";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Order temp = new Order (rs.getInt("idOrder"),rs.getString("titel"),rs.getInt("type"),rs.getDouble("projectedCosts"),rs.getDouble("realCosts"),rs.getInt("idCustomer"),rs.getInt("idAdvisor"),rs.getInt("idSecondaryAdvisor"),rs.getString("fileName"),rs.getString("fileLocation"),rs.getString("note"), rs.getInt("status"));

			result.add(temp);			
		}

		return result;
	}
	
	//
	public List<Order> getOrdersByStatus(int status) throws SQLException {
		List<Order> result = new ArrayList<Order>();
		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Orders, OrderStatus WHERE Orders.idOrder = OrderStatus.idOrder AND status='"+status+"'";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Order temp = new Order (rs.getInt("idOrder"),rs.getString("titel"),rs.getInt("type"),rs.getDouble("projectedCosts"),rs.getDouble("realCosts"),rs.getInt("idCustomer"),rs.getInt("idAdvisor"),rs.getInt("idSecondaryAdvisor"),rs.getString("fileName"),rs.getString("fileLocation"),rs.getString("note"), rs.getInt("status"));
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
	// Nico End*/
}