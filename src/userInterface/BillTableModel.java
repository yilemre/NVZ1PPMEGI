package userInterface;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import logic.*;

public class BillTableModel extends AbstractTableModel{
	
	private List<Bill> list = new ArrayList<Bill>();
	private String[] columns = {"ID", "ID Auftrag", "idPot", "idKunde", "idVerantwortlicher", "idKasse", "Name", "Bezahlmethode", "Betrag", "Status", "Timestamp"};

	public BillTableModel(List<Bill> list) {
		this.list=list;
	}
	
	
	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public int getColumnCount() {
		return 11;
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
				return Integer.class;
			case 2:
				return Integer.class;
			case 3:
				return Integer.class;
			case 4:
				return Integer.class;
			case 5:
				return Integer.class;	
			case 6:
				return String.class;
			case 7:
				return Integer.class;
			case 8:
				return Double.class;
			case 9:
				return String.class;
			case 10:
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
			return list.get(rowIndex).getIdOrder();
		case 2:
			return list.get(rowIndex).getIdPot();
		case 3:
			return list.get(rowIndex).getIdCustomer();
		case 4:
			return list.get(rowIndex).getIdAdvisor();
		case 5:
			return list.get(rowIndex).getIdRegister();
		case 6:
			return list.get(rowIndex).getName();
		case 7:
			return list.get(rowIndex).getMethodOfPayment();
		case 8:
			return list.get(rowIndex).getFigure();
		case 9:
			return list.get(rowIndex).getReadableStatus(list.get(rowIndex).getStatus());
		case 10:
			return list.get(rowIndex).getTimestamp();
		default: 
			return null; //can not happen
		}
	}
	
	public Bill getBill(int rowID) {
		return list.get(rowID);
	}


}
