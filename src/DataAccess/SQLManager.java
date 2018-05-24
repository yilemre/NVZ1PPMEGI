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
	
	public void modifyPerson(int id, AttributeTypes attribute, String newValue) throws SQLException{
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
		
	public int addCategoryToDB(int id, String name, String note) throws SQLException {
		Statement stmt = c.createStatement();
		String sql ="INSERT INTO Categorys (name, note) VALUES ('"+name+"','"+note+"');";
		stmt.executeUpdate(sql);
		stmt.close();	
		return id;
	}
		
		
		
		
		
	}
