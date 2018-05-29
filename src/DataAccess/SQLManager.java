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
	
	public int insertPersonIntoDB (String firstname, String surname, String street, int housenumber, int zipcode, String email, Date timestamp, String username, String password) throws SQLException{
		int result=0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Persons (firstname, surname, street, housenumber, zipcode, email, timestamp, username, password) VALUES ('"+firstname+"','"+surname+"','"+street+"',"+housenumber+","+zipcode+",'"+email+"','"+timestamp+"','"+username+"','"+password+"');";
		stmt.executeUpdate(sql);
		ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid() FROM Person");
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
	
	public int addPartIntoDB(String articlenumber, String productlink, String name, double price, int storing, int plannedAmount, int orderedAmount, String storageLocation, int category) throws SQLException {
		int result=0;
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Parts (articlenumber, productlink, name, price, storing, plannedAmount, orderedAmount, storageLocation, category) VALUES ('"+articlenumber+"','"+productlink+"','"+name+"',"+price+","+storing+","+plannedAmount+","+orderedAmount+",'"+storageLocation+"',(SELECT idCategory FROM Categorys WHERE idCategory="+category+"'));";
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
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	