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


	public static void addOrder(String title, int type, double projectedCosts, double realCosts, int idCustomer, int idAdvisor, int idSecondaryAdvisor, String fileName, String fileLocation, String note) throws SQLException {
		String dateTimeString = null;
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date     time = cal.getTime();
		dateTimeString = df.format(time);
		SQLManager.getInstance().insertOrderIntoDB(title, type, projectedCosts, realCosts, idCustomer, idAdvisor, idSecondaryAdvisor, fileName ,fileLocation, note, dateTimeString);
	}

	public static void deleteOrder(int ID) throws SQLException {
		SQLManager.getInstance().deleteOrderFromDB(ID);
	}

	public static void modifyOrder(int id, String title, int type, double projectedCosts, double realCosts, int idCustomer, int idAdvisor, int idSecondaryAdvisor, String fileName, String fileLocation, String note) throws SQLException {
		SQLManager.getInstance().modifyOrder(id, title, type, projectedCosts, realCosts, idCustomer, idAdvisor, idSecondaryAdvisor, fileName, fileLocation, note);
	}

	public static List<Order> getOrders() throws SQLException {
		return SQLManager.getInstance().getOrders(); 
	}


	//search methods - Work in Progress

	public static List<Order> getOrderByTitle(String searchValue) throws SQLException {
		List<Order> result = SQLManager.getInstance().getOrdersByTitle(searchValue);
		return result;
	}

	public static List<Order> getOrdersByType(String searchValue) throws SQLException{
		switch(searchValue){
		case "Leiterplatte":
			return SQLManager.getInstance().getOrdersByType(0);
		case "3D-Druck":
			return SQLManager.getInstance().getOrdersByType(1);
		case "Sonstiges":
			return SQLManager.getInstance().getOrdersByType(2);
		default:
			return null;
		}
	}

	public static List<Order> getOrderByStatus(int status) throws SQLException {
		List<Order> result = SQLManager.getInstance().getOrdersByStatus(status);
		return result;
	}
}
