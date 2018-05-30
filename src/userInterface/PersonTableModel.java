package userInterface;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import logic.*;


public class PersonTableModel extends AbstractTableModel {
	
	private List<Person> list = new ArrayList<Person>();
	private String[] columns = {"ID", "Vorname", "Nachname", "Straße", "Hausnummer", "PLZ", "E-Mail", "Benutzername", "Passwort", "Mitgliedschaft"};

	public PersonTableModel(List<Person> list) {
		this.list=list;
	}
	
	
	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public int getColumnCount() {
		return 10;
	}

	@Override
	public String getColumnName(int column) {
		return columns[column];
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch(columnIndex) {
			case 0:
				return Integer.class;
			case 1:
				return String.class;
			case 2:
				return String.class;
			case 3:
				return String.class;
			case 4:
				return String.class;
			case 5:
				return Integer.class;
			case 6:
				return String.class;
			case 7:
				return String.class;
			case 8:
				return String.class;
			case 9:
				return String.class;
			default:
				return null; //should not happen
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0:
			return list.get(rowIndex).getId();
		case 1:
			return list.get(rowIndex).getFirstname();
		case 2:
			return list.get(rowIndex).getLastname();
		case 3:
			return list.get(rowIndex).getStreet();
		case 4:
			return list.get(rowIndex).getHousenumber();
		case 5:
			return list.get(rowIndex).getHousenumber();
		case 6:
			return list.get(rowIndex).getEmail();
		case 7:
			return list.get(rowIndex).getUsername();
		case 8:
			return list.get(rowIndex).getPassword();
		case 9:
			return list.get(rowIndex).getReadableRights(list.get(rowIndex).getRights());	
		default: 
			return null; //can not happen
		}
	}
	
	public Person getPerson(int rowID) {
		return list.get(rowID);
	}

}
