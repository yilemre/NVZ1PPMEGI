package logic;

import java.sql.SQLException;

import DataAccess.SQLManager;
import Exceptions.UsernameNotInDBException;
import Exceptions.WrongPasswordException;

public class LoginManagement {

		public static boolean checkLoginCredentials(String username, String password) throws UsernameNotInDBException, SQLException, WrongPasswordException {
			boolean login=false;
			Person person  = SQLManager.getInstance().getPersonByUsername(username);
			if(person.getPassword().equals(password)) {
				login=true;
			}
			else {
				throw new WrongPasswordException();
			}
			return login;
		}

		//fancy modulo shit
		public static boolean checkRights(String username) throws UsernameNotInDBException, SQLException {
			Person person  = SQLManager.getInstance().getPersonByUsername(username);
			if(person.getRights()%2!=1) {
				return false;
			}
			else return true;
		}
}

