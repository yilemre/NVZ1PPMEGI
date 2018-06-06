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
import Exceptions.ELabException;

public class FinancialManagement {

	public void createBill(int idOrder, int idPot, int idRegister, String name, int payKind, double amount) throws SQLException {
		SQLManager.getInstance().addBilltoDB(idOrder, idPot, idRegister, name, payKind, amount);
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
	
	public void modifyBill(int id, int idOrder, int idPot, int idRegister, String name, int payKind, double amount) throws SQLException {
		SQLManager.getInstance().modifyBill(id, idOrder, idPot, idRegister, name, payKind, amount);
	}
	
	public static List<Bill> getBills() throws SQLException {
		return SQLManager.getInstance().getBills(); 
	}
	
	public static List<Bill> getBillByName(String searchValue) throws SQLException {
		List<Bill> result = SQLManager.getInstance().getBillByName(searchValue);
		return result;
	}
	
	public static List<Bill> getBillsByStatus(String searchValues) throws SQLException {
		switch(searchValues){
		case "Nicht bezahlt":
			return SQLManager.getInstance().getBillsByStatus(0);
		case "Bezahlt":
			return SQLManager.getInstance().getBillsByStatus(1);
		default:
			return null;
		}
	}
	
	public static List<Bill> getBillsByDate(String searchValues) throws SQLException {
		List<Bill> result = SQLManager.getInstance().getBillsByDate(searchValues);
		return result;
	}
	
	public void exportBillPDF() {
		//dummy
	}
	
	
	public static int addPot(String name, double actualAmount, double debitAmount, int idRegister) throws SQLException {
		return SQLManager.getInstance().addPottoDB(debitAmount, debitAmount, name, idRegister);	
	}
	
	public void modifyPot(double debitAmount, double actualAmount, String name, int idRegister) throws SQLException {
		SQLManager.getInstance().modifyPot(debitAmount, actualAmount, name, idRegister);
	}
	
	public static void deletePot(int id) throws SQLException {
		SQLManager.getInstance().deletePotFromDB(id);
	}
	
	public static List<Pot> getPotArray() throws SQLException {
		List<Pot> result = SQLManager.getInstance().getPotArray();
		return result;
	  }
	
	public static int addRegister(String name, double actualAmount, double debitAmount, int type) throws SQLException {
		return SQLManager.getInstance().addRegistertoDB(debitAmount, debitAmount, name, type);
	}
	
	public void modifyRegister(double debitAmount, double actualAmount, String name, int type) throws SQLException {
		SQLManager.getInstance().modifyRegister(debitAmount, actualAmount, name, type);
	}
	
	public static void deleteCashRegister(int id) throws SQLException {
		SQLManager.getInstance().deleteCashRegisterFromDB(id);
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
    
	public static List<Order> getOrders() throws SQLException {
		return SQLManager.getInstance().getOrders(); 
	}
	
}
