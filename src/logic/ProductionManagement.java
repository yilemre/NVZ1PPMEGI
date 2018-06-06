//Author: Nico

package logic;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import DataAccess.SQLManager;
import Exceptions.ELabException;

public class ProductionManagement {


	public static int addOrder(String title, int type, double projectedCosts, double realCosts, int idCustomer, int idAdvisor, int idSecondaryAdvisor, String fileName, String fileLocation, String note) throws SQLException {
		return SQLManager.getInstance().insertOrderIntoDB(title, type, projectedCosts, realCosts, idCustomer, idAdvisor, idSecondaryAdvisor, fileName ,fileLocation, note);
	}
	
	public static void addOrderStatus(int idOrder, int status) throws SQLException {
		String dateTimeString = null;
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date     time = cal.getTime();
		dateTimeString = df.format(time);
		SQLManager.getInstance().insertOrderStatusIntoDB(idOrder, status, dateTimeString);
	}
	
	public static void deleteOrder(int ID) throws SQLException {
		SQLManager.getInstance().deleteOrderFromDB(ID);
	}

	public static void modifyOrder(int id, String title, int type, double projectedCosts, double realCosts, int idCustomer, int idAdvisor, int idSecondaryAdvisor, String fileName, String fileLocation, String note) throws SQLException {
		SQLManager.getInstance().modifyOrder(id, title, type, projectedCosts, realCosts, idCustomer, idAdvisor, idSecondaryAdvisor, fileName, fileLocation, note);
	}
	
	public static void changeOrderStatus(int id, int status) throws SQLException{
		SQLManager.getInstance().changeOrderStatus(id, status);
	}

	public static List<Order> getOrders() throws SQLException {
		return SQLManager.getInstance().getOrders(); 
	}

    public static List<Person> getCustomerArray() throws SQLException {
	List<Person> result = SQLManager.getInstance().getCustomerArray();
	return result;
    }
    
    public static List<Person> getAdvisorArray() throws SQLException {
    List<Person> result = SQLManager.getInstance().getAdvisorArray();
    return result;
    }
    
    public static List<Person> getSecondaryAdvisorArray() throws SQLException {
	List<Person> result = SQLManager.getInstance().getSecondaryAdvisorArray();
	return result;
    }
    
    
	//search methods

	public static List<Order> getOrderByTitle(String searchValue) throws SQLException {
		List<Order> result = SQLManager.getInstance().getOrdersByTitle(searchValue);
		return result;
	}

	public static List<Order> getOrdersByType(String searchValue) throws SQLException{
		switch(searchValue){
		case "3D-Druck":
			return SQLManager.getInstance().getOrdersByType(0);
		case "Leiterplatte":
			return SQLManager.getInstance().getOrdersByType(1);
		case "Sonstiges":
			return SQLManager.getInstance().getOrdersByType(2);
		default:
			return null;
		}
	}

	public static List<Order> getOrdersByStatus(String searchValues) throws SQLException {
		switch(searchValues){
		case "Angenommen":
			return SQLManager.getInstance().getOrdersByStatus(0);
		case "Gefertigt":
			return SQLManager.getInstance().getOrdersByStatus(1);
		case "Kosten kalkuliert":
			return SQLManager.getInstance().getOrdersByStatus(2);
		case "Abgeholt":
			return SQLManager.getInstance().getOrdersByStatus(3);
		case "Abgerechnet":
			return SQLManager.getInstance().getOrdersByStatus(4);
		case "Warten auf Material":
			return SQLManager.getInstance().getOrdersByStatus(5);
		case "Fertigung unterbrochen/defekt":
			return SQLManager.getInstance().getOrdersByStatus(6);
		case "Rechnung erzeugt":
			return SQLManager.getInstance().getOrdersByStatus(7);
		default:
			return null;
		}
	}
}
