//Author: Nico

package logic;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.ResultSet;

import DataAccess.SQLManager;

public class ProductionManagement {

	public static void addAssignment(String title,String type, double forecastedCosts, double realCosts,int assignmentStatus,String notes) throws SQLException {
		SQLManager.getInstance().insertAssignmentIntoDB(title, type, forecastedCosts, realCosts, assignmentStatus, notes);
	}

	/*public static void addPCBAssignment(String title,String type, double forecastedCosts, double realCosts,int assignmentStatus,String notes) throws SQLException {
		SQLManager.getInstance().insertAssignmentIntoDB();
	}*/

	/*public static void addOtherAssignment(String title,String type, double forecastedCosts, double realCosts,int assignmentStatus,String notes) throws SQLException {
		SQLManager.getInstance().insertAssignmentIntoDB();
	}*/

	public static void deleteAssignment(int ID) throws SQLException {
		SQLManager.getInstance().deleteAssignmentFromDB(ID);
	}

	public static void modifyAssignment() throws SQLException {
		Timestamp t = new Timestamp(System.currentTimeMillis());  
		SQLManager.getInstance().modifyAssignment1(title, type, forecastedCosts, realCosts, assignmentStatus, notes);
	}

	public static void modifyAssignmentTitle(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyAssignment(id, AttributeTypesAssignment.title, newValue);
	}

	public static void modifyAssignmentType(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyAssignment(id, AttributeTypesAssignment.type, newValue);
	}

	public static void modifyAssignmentForecastedCosts(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyAssignment(id, AttributeTypesAssignment.forecastedCosts, newValue);
	}

	public static void modifyAssignmentRealCosts(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyAssignment(id, AttributeTypesAssignment.realCosts, newValue);
	}

	public static void modifyAssignmentStatus(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyAssignment(id, AttributeTypesAssignment.assignmentStatus, newValue);
	}

	public static void modifyAssignmentNotes(int id, String newValue) throws SQLException {
		SQLManager.getInstance().modifyAssignment(id, AttributeTypesAssignment.notes, newValue);
	}
}
