//Mainly done by Nico

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


public class FinancialManagement {

	/**
	 * @param idOrder
	 * @param idPot
	 * @param name
	 * @param payKind
	 * @param amount
	 * @return
	 * @throws SQLException
	 */
	public static int addBill(int idOrder, int idPot, int idRegister, int idCustomer, int idAdvisor, String name, int payKind, double amount) throws SQLException {
		return SQLManager.getInstance().addBilltoDB(idOrder, idPot, idRegister, idCustomer, idAdvisor, name, payKind, amount);
	}
	
	public static void addBillStatus(int idBill, int status) throws SQLException {
		String dateTimeString = null;
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		Date     time = cal.getTime();
		dateTimeString = df.format(time);
		SQLManager.getInstance().addBillStatustoDB(idBill, status, dateTimeString);
	}
	
	public static void deleteBill(int id) throws SQLException {
		SQLManager.getInstance().deleteBillFromDB(id);
	}
	
	public static void modifyBill(int id, int idOrder, int idPot, int idRegister, String name, int payKind, double amount) throws SQLException {
		SQLManager.getInstance().modifyBill(id, idOrder, idPot, idRegister, name, payKind, amount);
	}
	
	public static void changeBillStatus(int id, int status) throws SQLException{
		SQLManager.getInstance().changeBillStatus(id, status);
	}
	
	public static List<Bill> getBills() throws SQLException {
		return SQLManager.getInstance().getBills(); 
	}
	
	public static List<Bill> getBillByName(String searchValue) throws SQLException, ELabException {
		List<Bill> result = SQLManager.getInstance().getBillByName(searchValue);
		return result;
	}
	
	public static List<Bill> getBillsByStatus(String searchValues) throws SQLException, ELabException {
		switch(searchValues.toLowerCase()){
		case "nicht bezahlt":
			return SQLManager.getInstance().getBillsByStatus(0);
		case "bezahlt":
			return SQLManager.getInstance().getBillsByStatus(1);
		default:
			throw new BillStatusNotInDBException();
		}
	}
	
	public static List<Bill> getBillsByDate(String searchValues) throws SQLException, ELabException {
		List<Bill> result = SQLManager.getInstance().getBillsByDate(searchValues);
		return result;
	}
	
	public void exportBillPDF() {
		//dummy
	}
	
	
	public static int addPot(String name, double actualAmount, double debitAmount, int idRegister) throws SQLException {
		return SQLManager.getInstance().addPottoDB(actualAmount, debitAmount, name, idRegister);	
	}
	
	public static void modifyPot(int id, double actualAmount, double debitAmount, String name, int idRegister) throws SQLException {
		SQLManager.getInstance().modifyPot(id, actualAmount, debitAmount, name, idRegister);
	}
	
	public static void deletePot(int id) throws SQLException, PotIsReferencedException {
		if(!SQLManager.getInstance().isPotReferenced(id)) {
			SQLManager.getInstance().deletePotFromDB(id);
		}
		else{
			throw new PotIsReferencedException();
		}
	}
	
	public static void deletePotByCashRegister(int id) throws SQLException {
	    SQLManager.getInstance().deletePotByChashRegisterID(id);	    
	}
	
	public static List<Pot> getPotArray() throws SQLException {
		List<Pot> result = SQLManager.getInstance().getPotArray();
		return result;
	  }
	
	public static int addRegister(String name, double actualAmount, double debitAmount, int type) throws SQLException {
		return SQLManager.getInstance().addRegistertoDB(actualAmount, debitAmount, name, type);
	}
	
	public static void modifyRegister(int id, double actualAmount, double debitAmount, String name, int type) throws SQLException {
		SQLManager.getInstance().modifyRegister(id, actualAmount, debitAmount, name, type);
	}
	
	public static void deleteCashRegister(int id) throws SQLException, registerIsReferencedException {
		if(!SQLManager.getInstance().isRegisterReferenced(id)) {
			SQLManager.getInstance().deleteCashRegisterFromDB(id);
		}
		else {
			throw new registerIsReferencedException();
		}
	}
	
	public static List<CashRegister> getRegisterArray() throws SQLException {
		List<CashRegister> result = SQLManager.getInstance().getRegisterArray();
		return result;
	  }
	
    public static List<Person> getCustomerArray() throws SQLException {
	List<Person> result = SQLManager.getInstance().getCustomerArray();
	return result;
    }
    
    public static List<Person> getAdvisorArray() throws SQLException {
    List<Person> result = SQLManager.getInstance().getAdvisorArray();
    return result;
    }
    
	public static List<Order> getOrdersWhereBillIsNotCreatedYet() throws SQLException {
		return SQLManager.getInstance().getOrdersWhereBillisNotCreatedYet(); 
	}
    
	public static List<Order> getOrders() throws SQLException {
		return SQLManager.getInstance().getOrders(); 
	}
	
	public static void setActualAmountPot(int idPot, double newActualAmount) throws SQLException {
		SQLManager.getInstance().setActualAmountPot(idPot, newActualAmount);
	}
	
	public static void setTargetAmountPot(int idPot, double newTargetAmount) throws SQLException {
		SQLManager.getInstance().setTargetAmountPot(idPot, newTargetAmount);
	}
	
	public static Order getOrderByID(int id) throws SQLException, OrderNotInDBException {
	    return SQLManager.getInstance().getOrderByID(id); 
	}
	public static Person getPersonByID(int id) throws SQLException, PersonWithSpecifiedIDNotInDBException {
	    return SQLManager.getInstance().getPersonByID(id); 
	}
	
	public static List<Pot> getPotArrayByRegisterID(int id) throws SQLException {
	    return SQLManager.getInstance().getPotArrayByCashRegisterID(id); 
	}
	
	
}
