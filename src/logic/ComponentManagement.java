package logic;


import java.sql.SQLException;

import DataAccess.SQLManager;

public class ComponentManagement {
    		//Emre begin
		public static void addCategory(String name, String note) throws SQLException {
		    SQLManager.getInstance().addCategoryToDB(name, note); 
		}
		//Emre end
		
		public void deleteCategory() {
			//dummy
		}
		
		public void renameCategory() {
			//dummy
		}
		
		public void createPart() {
			//dummy
		}
		
		public void modifyPart() {
			//dummy
		}
		
		public void deletePart() {
			//dummy
		}
		
		public void addPart() {
			//dummy
		}
		
		public void removePart() {
			//dummy
		}
}
