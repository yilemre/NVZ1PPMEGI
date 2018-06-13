//Emre
package logic;


import java.sql.SQLException;
import java.util.List;

import DataAccess.SQLManager;
import Exceptions.*;

public class ComponentManagement {
    
    public static void addCategory(String name, String note) throws SQLException {
	SQLManager.getInstance().addCategoryToDB(name, note); 
		}
    public static void deleteCategory(int id) throws SQLException{
        SQLManager.getInstance().deleteCategoryFromDB(id); 
    }
    public static void modifyCategory(int id, String newName, String newNote) throws SQLException {
	SQLManager.getInstance().modifyCategory(id, newName, newNote);    
    }
    
    public static Category[] getCategoryArray() throws SQLException {
	return SQLManager.getInstance().getCategoryArray(); 
    }
    
    public static List<Category> getCategories() throws SQLException, ELabException {
   	return SQLManager.getInstance().getCategories(); 
       }
    
		
    public static void addPart(String articlenumber, String productlink, String name, double price, int storing, int plannedAmount, int orderedAmount, String storageLocation, int idCategory) throws SQLException {
	SQLManager.getInstance().addPartIntoDB(articlenumber, productlink, name, price, storing, plannedAmount, orderedAmount, storageLocation, idCategory);
    }
    public static List<Component> getComponents() throws SQLException {
	return SQLManager.getInstance().getComponents(); 
    }
    public static List<Component> getComponentByArticlenumber(String articlenumber) throws SQLException, ELabException {
	return SQLManager.getInstance().getComponentsByArticlenumber(articlenumber); 
    }
    public static List<Component> getComponentByName(String name) throws SQLException, ELabException {
	return SQLManager.getInstance().getComponentsByName(name); 
    }
    public static void deletePart(int id) throws SQLException {
	SQLManager.getInstance().deletePartFromDB(id); 
    }
    public static void modifyPart(int id, String articlenumber, String productlink, String name, double price, int storing, 
	    int plannedAmount, int orderedAmount, String storageLocation, int idCategory) throws SQLException {
		SQLManager.getInstance().modifyPart(id, articlenumber, productlink, name, price, storing, plannedAmount, orderedAmount, storageLocation, idCategory);
    }
    
    public static void addPartToShoppingCard(int idPart, int idPerson, int amount) throws SQLException, noMorePartsLeftException{
    	if(!SQLManager.getInstance().checkIfEnoughPartsAreAvailable(idPart, amount)) {
    		throw new noMorePartsLeftException();
    	}
    	else {
        	SQLManager.getInstance().addPartToShoppingCard(idPart, idPerson, amount);
    	}
    }
		
	public static List<ShoppingObject> getPartsByShoppingCard(int id) throws SQLException{
		return SQLManager.getInstance().getPartsByShoppingCard(id);
	}
	
	public static void updatePartQuantityAfterShoppingMinus(int idPart, int minusValue) throws SQLException {
		SQLManager.getInstance().updatePartQuantityAfterShoppingMinus(idPart, minusValue);
	}
	
	public static void updateShoppingCardPartMinus(int idPart, int idPerson, int minusValue) throws SQLException {
		SQLManager.getInstance().updateShoppingCardPartMinus(idPart, idPerson, minusValue);
	}
	
	public static void updatePartQuantityAfterShoppingPlus(int idPart, int plusValue) throws SQLException {
		SQLManager.getInstance().updatePartQuantityAfterShoppingPlus(idPart, plusValue);
	}
	
	public static void payPartFromShoppingCard(int idPart, int idPerson) throws SQLException {
		SQLManager.getInstance().payPartFromShoppingCard(idPart, idPerson);
	}
}
