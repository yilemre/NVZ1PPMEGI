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
import Exceptions.*;


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

	public static List<Order> getOrdersWhereBillIsNotCreatedYetByTitle(String title) throws SQLException, OrderNoBillWithThisTitleNotInDBException {
		return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByTitle(title); 
	}
	
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
	
	public static List<Order> getOrdersWhereBillIsNotCreatedYetByStatus(String type) throws SQLException, OrderNoBillWithThisStatusNotInDBException {
		switch(type.toLowerCase()){
		case "angenommen":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByStatus(0);
		case "gefertigt":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByStatus(1);
		case "kosten kalkuliert":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByStatus(2);
		case "abgeholt":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByStatus(3);
		case "abgerechnet":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByStatus(4);
		case "warten auf material":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByStatus(5);
		case "fertigung unterbrochen/defekt":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByStatus(6);
		case "rechnung erzeugt":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByStatus(7);
		default:
			throw new OrderNoBillWithThisStatusNotInDBException();
		} 
	}
	
	public static List<Order> getOrdersWhereBillIsNotCreatedYetByType(String status) throws SQLException, OrderNoBillWithThisTypeNotInDBException {
		switch(status.toLowerCase()){
		case "3d-druck":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByType(0);
		case "leiterplatte":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByType(1);
		case "sonstiges":
			return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYetByType(2);
		default:
			throw new OrderNoBillWithThisTypeNotInDBException();
		}
	}
	
    public static List<Person> getCustomerArray() throws SQLException {
		return SQLManager.getInstance().getCustomerArray();
	
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

	public static List<Order> getOrderByTitle(String searchValue) throws SQLException, ELabException {
		List<Order> result = SQLManager.getInstance().getOrdersByTitle(searchValue);
		return result;
	}
	
	public static Order getOrderByID(int id) throws SQLException, OrderNotInDBException {
		return SQLManager.getInstance().getOrderByID(id);
	}

	public static List<Order> getOrdersByType(String searchValue) throws SQLException, ELabException{
		switch(searchValue.toLowerCase()){
		case "3d-druck":
			return SQLManager.getInstance().getOrdersByType(0);
		case "leiterplatte":
			return SQLManager.getInstance().getOrdersByType(1);
		case "sonstiges":
			return SQLManager.getInstance().getOrdersByType(2);
		default:
			throw new OrderTypeNotInDBException();
		}
	}

	public static List<Order> getOrdersByStatus(String searchValues) throws SQLException, ELabException {
		switch(searchValues.toLowerCase()){
		case "angenommen":
			return SQLManager.getInstance().getOrdersByStatus(0);
		case "gefertigt":
			return SQLManager.getInstance().getOrdersByStatus(1);
		case "kosten kalkuliert":
			return SQLManager.getInstance().getOrdersByStatus(2);
		case "abgeholt":
			return SQLManager.getInstance().getOrdersByStatus(3);
		case "abgerechnet":
			return SQLManager.getInstance().getOrdersByStatus(4);
		case "warten auf material":
			return SQLManager.getInstance().getOrdersByStatus(5);
		case "fertigung unterbrochen/defekt":
			return SQLManager.getInstance().getOrdersByStatus(6);
		case "rechnung erzeugt":
			return SQLManager.getInstance().getOrdersByStatus(7);
		default:
			throw new OrderStatusNotInDBException();
		}
	}
	
	public static Billinformation getBillinformations(int idBill) throws CantGenerateBillinformationException, SQLException {
		return SQLManager.getInstance().getBillinformationByID(idBill);
	}
}
