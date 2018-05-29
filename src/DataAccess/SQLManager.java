package DataAccess;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import logic.*;
import Exceptions.*;
import logic.Person;


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
	public void modifyPerson1(int id, String firstname, String surname, String street, String housenumber,
			String zipcode,String email, Timestamp t, String username, String password, int rights) throws SQLException {
		Statement stmt = c.createStatement(); 
		String sql = "UPDATE Persons "
				+ "SET firstname='"+firstname+"',surname='"+surname+"',street ='"+street+"', housenumber="+housenumber+", zipcode="+zipcode+", email='"+email+"',timestamp='"+t+"', username='"+username+"', password='"+password+"', rights="+rights+""
				+ " WHERE idPerson="+id+";";
		stmt.executeUpdate(sql); 
		stmt.close();

	}		
	//Emre end
	
	public ResultSet getPersons1() throws SQLException {
	    Statement stmt = c.createStatement(); 
	    String sql = "SELECT * FROM Persons"; 
	    ResultSet rs = stmt.executeQuery(sql); 
	    
	    return rs; 
	}

	public List<Person> getPersons() throws SQLException {
		List<Person> result = new ArrayList<Person>();

		Statement stmt = c.createStatement();
		String sql = "SELECT * FROM Persons";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Person temp = new Person (rs.getInt("idPerson"),rs.getString("firstname"),rs.getString("surname"),rs.getString("street"),rs.getInt("housenumber"),rs.getInt("zipcode"),rs.getString("email"),rs.getDate("timestamp"),rs.getString("username"),rs.getString("password"));

			result.add(temp);			
		}

		return result;
	}

	//If you call this method you can give it a AttributeTypes.xxxx attribute to say which attribute should be changed

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

	public void modifyCategory(int id, AttributeTypesCategory attribute, String newValue) throws SQLException {
		Statement stmt = c.createStatement();
		switch(attribute) {
		case name:
			String sql ="ALTER Categorys SET name="+newValue+"WHERE idCategory="+id+";";
			stmt.executeUpdate(sql);
			stmt.close();
			break;
		case note:
			String sql1 ="ALTER Categorys SET name="+newValue+"WHERE idCategory="+id+";";
			stmt.executeUpdate(sql1);
			stmt.close();
			break;
		}
	}

	public int addPartIntoDB(String articlenumber, String productlink, String name, double price, int storing, int plannedAmount, int orderedAmount, String storageLocation, int category, int rights) throws SQLException {
		int result=0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Parts (articlenumber, productlink, name, price, storing, plannedAmount, orderedAmount, storageLocation, category, rights) VALUES ('"+articlenumber+"','"+productlink+"','"+name+"',"+price+","+storing+","+plannedAmount+","+orderedAmount+",'"+storageLocation+"',(SELECT idCategory FROM Categorys WHERE idCategory="+category+"'), "+rights+");";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Person");
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

	public void modifyPart(int id, AttributeTypesPart attribute, String newValue) throws SQLException {
		Statement stmt = c.createStatement();
		switch(attribute) {
		case articlenumber: 
			String sql ="ALTER Parts SET articlenumber="+newValue+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql);
			stmt.close();
			break;
		case productlink:
			String sql1 ="ALTER Parts SET productlink="+newValue+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql1);
			stmt.close();
			break;
		case name:
			String sql2 ="ALTER Parts SET name="+newValue+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql2);
			stmt.close();
			break;
		case price:
			String sql3 ="ALTER Parts SET articlenumber="+Double.parseDouble(newValue)+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql3);
			stmt.close();
			break;
		case storing:
			String sql4 ="ALTER Parts SET storing="+Integer.parseInt(newValue)+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql4);
			stmt.close();
			break;
		case plannedAmount:
			String sql5 ="ALTER Parts SET plannedAmount="+Integer.parseInt(newValue)+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql5);
			stmt.close();
			break;
		case orderedAmount:
			String sql6 ="ALTER Parts SET orderedAmount="+Integer.parseInt(newValue)+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql6);
			stmt.close();
			break;
		case storageLocation:
			String sql7 ="ALTER Parts SET storageLocation="+newValue+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql7);
			stmt.close();
			break;
		case category:
			String sql8 ="ALTER Parts SET category="+Integer.parseInt(newValue)+"WHERE idPart="+id+";";
			stmt.executeUpdate(sql8);
			stmt.close();
			break;
		}

	}
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



//Nico begin	

	public int insertOrderIntoDB () throws SQLException{
		int result=0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Orders () VALUES ();";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Orders");
		rs.next();
		result = rs.getInt(1);
		rs.close();
		stmt.close();	
		return result;
	}

	public int deleteOrderFromDB(int id) throws SQLException{
		Statement stmt = c.createStatement();
		String sql ="DELETE FROM Orders WHERE idOrder="+id+"";
		stmt.executeUpdate(sql);
		stmt.close();	
		return id;
	}
	
	public void modifyOrder1(int id, String title, String type, int idAdvisor, int idSecondaryAdvisor, String notes, double forecastedCosts, double realCosts, String fileLocation) throws SQLException {
		Statement stmt = c.createStatement(); 
		String sql = "UPDATE Orders "
				+ "SET title='"+title+"', type='"+type+"', idAdvisor='"+idAdvisor+"' , idSecondaryAdvisor='"+idSecondaryAdvisor+"' , notes='"+notes+"' , forecastedCosts='"+forecastedCosts+"' ,realCosts ='"+realCosts+"', fileLocation="+fileLocation+
				" WHERE idOrder="+id+";";
		stmt.executeUpdate(sql); 
		stmt.close();
	}
	
	public void modifyOrder(int id, AttributeTypesOrder attribute, String newValue) throws SQLException{
		Statement stmt = c.createStatement();
		switch(attribute) {
		case title: 
			String sql ="ALTER Orders SET title="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql);
			stmt.close();
			break;
		case type:
			String sql1 ="ALTER Orders SET type="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql1);
			stmt.close();
			break;
		case idAdvisor:
			String sql2 ="ALTER Orders SET idAdvisor="+Integer.parseInt(newValue)+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql2);
			stmt.close();
			break;
		case idSecondaryAdvisor:
			String sql3 ="ALTER Orders SET idSecondaryAdvisor="+Integer.parseInt(newValue)+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql3);
			stmt.close();
			break;
		case notes:
			String sql4 ="ALTER Orders SET notes="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql4);
			stmt.close();
			break;
		case forecastedCosts:
			String sql5 ="ALTER Orders SET forecastedCosts="+Double.parseDouble(newValue)+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql5);
			stmt.close();
			break;
		case realCosts:
			String sql6 ="ALTER Orders SET realCosts="+Double.parseDouble(newValue)+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql6);
			stmt.close();
			break;
		case fileLocation:
			String sql7 ="ALTER Orders SET fileLocation="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql7);
			stmt.close();
			break;
			}
		}
		
		public void modifyOrderStatus(int id, AttributeTypesOrderStatus attribute, int newValue ) throws SQLException {
		Statement stmt = c.createStatement();
		switch(attribute) {
		case accepted: 
			String sql ="ALTER OrderStatus SET status="+newValue+"WHERE idOrder="+id+";";
			stmt.executeUpdate(sql);
			stmt.close();
			break;
		case finished:
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
		}
	
// Nico End
}
































