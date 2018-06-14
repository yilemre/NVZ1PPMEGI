package userInterface;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import logic.*;

public class CashRegisterTableModel extends AbstractTableModel{
	
	private List<CashRegister> list = new ArrayList<CashRegister>();
	private String[] columns = {"ID", "Name", "Soll", "Ist" , "Typ", "Kostenstellennummer"};

	public CashRegisterTableModel(List<CashRegister> list) {
		this.list=list;
	}
	
	
	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public int getColumnCount() {
		return 6;
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
				return Double.class;
			case 3:
				return Double.class;
			case 4:
				return Integer.class;
			case 5:
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
			return list.get(rowIndex).getName();
		case 2:
			return list.get(rowIndex).getDebitAmount();
		case 3:
			return list.get(rowIndex).getActualAmount();
		case 4:
			return list.get(rowIndex).getReadableType(list.get(rowIndex).getType());
		case 5:
			return list.get(rowIndex).getCostCentreNumber();
		default: 
			return null; //can not happen
		}
	}
	
	public CashRegister getCashRegister(int rowID) {
		return list.get(rowID);
	}


}
