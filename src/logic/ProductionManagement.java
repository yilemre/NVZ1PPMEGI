//Author: Nico

package logic;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.ResultSet;

import DataAccess.SQLManager;
import Exceptions.ELabException;

public class ProductionManagement {
	

	public static void addOrder(String title, int type, String notes, String fileLocation, double forecastedCosts, double realCosts, int idAdvisor, int SecondaryAdvisor) throws SQLException {
		SQLManager.getInstance().insertOrderIntoDB();
	}

	public static void deleteOrder(int ID) throws SQLException {
		SQLManager.getInstance().deleteOrderFromDB(ID);
	}

	public static void modifyOrder(int id, String title, int type, int idAdvisor, int idSecondaryAdvisor, String notes, double forecastedCosts, double realCosts, String fileLocation) throws SQLException {
		Timestamp t = new Timestamp(System.currentTimeMillis());  
		SQLManager.getInstance().modifyOrder1(id, title, type, idAdvisor, idSecondaryAdvisor, notes, forecastedCosts, realCosts, fileLocation);
	}

	// Order Modifier
	public static void modifyOrderTitle(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyOrder(id, AttributeTypesOrder.title, newValue);
	}

	public static void modifyOrderType(int id, int newValue) throws SQLException {
		SQLManager.getInstance().modifyOrderType(id, AttributeTypesOrder.type, newValue);
	}

	public static void modifyOrderForecastedCosts(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyOrder(id, AttributeTypesOrder.forecastedCosts, newValue);
	}

	public static void modifyOrderRealCosts(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyOrder(id, AttributeTypesOrder.realCosts, newValue);
	}


	public static void modifyOrderNotes(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyOrder(id, AttributeTypesOrder.notes, newValue);
	}
	
	
	public static void modifyOrderFileLocation(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyOrder(id, AttributeTypesOrder.fileLocation, newValue);
	}
	
	
	//OrderStatus Modifier
	public static void modifyOrderStatusAccepted(int id, int newValue) throws SQLException {
		SQLManager.getInstance().modifyOrderStatus(id, AttributeTypesOrderStatus.accepted, newValue);
	}
	
	public static void modifyOrderStatusFinished(int id, int newValue) throws SQLException {
		SQLManager.getInstance().modifyOrderStatus(id, AttributeTypesOrderStatus.finished, newValue);
	}
	
	public static void modifyOrderStatusCostsCalculated(int id, int newValue) throws SQLException {
		SQLManager.getInstance().modifyOrderStatus(id, AttributeTypesOrderStatus.costsCalculated, newValue);
	}
	
	public static void modifyOrderStatusPickedUp(int id, int newValue) throws SQLException {
		SQLManager.getInstance().modifyOrderStatus(id, AttributeTypesOrderStatus.pickedUp, newValue);
	}
	
	public static void modifyOrderStatusBilled(int id, int newValue) throws SQLException {
		SQLManager.getInstance().modifyOrderStatus(id, AttributeTypesOrderStatus.billed, newValue);
	}
	
	public static void modifyOrderStatusWaitingForMaterial(int id, int newValue) throws SQLException {
		SQLManager.getInstance().modifyOrderStatus(id, AttributeTypesOrderStatus.waitingForMaterial, newValue);
	}
	
	public static void modifyOrderStatusProductionInterrupted(int id, int newValue) throws SQLException {
		SQLManager.getInstance().modifyOrderStatus(id, AttributeTypesOrderStatus.productionInterrupted, newValue);
	}
	
	public static void modifyOrderStatusBillGenerated(int id, int newValue) throws SQLException {
		SQLManager.getInstance().modifyOrderStatus(id, AttributeTypesOrderStatus.billGenerated, newValue);
	}
	
	//search methods - Work in Progress
	
	public /* List<Order>*/ String searchForTitle(String title) throws SQLException, ELabException {
		/* List<Order>*/ String result = SQLManager.getInstance().getOrdersByTitle(title);
		return result;
	}
	
	public /* List<Order>*/ String searchForType(String type) throws SQLException, ELabException {
		/* List<Order>*/ String result = SQLManager.getInstance().getOrdersByType(type);
		return result;
	}
	
	public /* List<Order>*/ String searchForStatus(int status) throws SQLException, ELabException {
		/* List<Order>*/ String result = SQLManager.getInstance().getOrdersByStatus(status);
		return result;
	}
}
