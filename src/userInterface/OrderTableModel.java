package userInterface;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import logic.*;


public class OrderTableModel extends AbstractTableModel {
	
	private List<Order> list = new ArrayList<Order>();
	private String[] columns = {"ID", "Titel", "Typ", "Prognostizierte Kosten", "Reelle Kosten", "Kundennummer", "Verantwortlicher", "Vertreter", "Dateiname", "Dateipfad", "Notiz", "Status"};

	public OrderTableModel(List<Order> list) {
		this.list=list;
	}
	
	
	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public int getColumnCount() {
		return 12;
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
				return Integer.class;
			case 3:
				return Double.class;
			case 4:
				return Double.class;
			case 5:
				return Integer.class;
			case 6:
				return Integer.class;
			case 7:
				return Integer.class;
			case 8:
				return String.class;
			case 9:
				return String.class;
			case 10:
				return String.class;
			case 11:
				return String.class;
			default:
				return null; //should not happen
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0:
			return list.get(rowIndex).getOrderId();
		case 1:
			return list.get(rowIndex).getTitle();
		case 2:
			return list.get(rowIndex).getType();
		case 3:
			return list.get(rowIndex).getForecastedCosts();
		case 4:
			return list.get(rowIndex).getRealCosts();
		case 5:
			return list.get(rowIndex).getIdCustomer();
		case 6:
			return list.get(rowIndex).getIdAdvisor();
		case 7:
			return list.get(rowIndex).getIdSecondaryAdvisor();
		case 8:
			return list.get(rowIndex).getFileName();
		case 9:
			return list.get(rowIndex).getFileLocation();
		case 10:
			return list.get(rowIndex).getNotes();
		case 11:
			return list.get(rowIndex).getStatus();
		default: 
			return null; //can not happen
		}
	}
	
	public Order getOrder(int rowID) {
		return list.get(rowID);
	}

}
