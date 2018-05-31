//Author: Emre
package userInterface;
import logic.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;



public class ComponentTableModel extends AbstractTableModel {
    
    private List<Component> list = new ArrayList<Component>(); 
    private String[] columns = {"ID", "Artikel-Nr.", "Name","Link","Preis","Menge","geplante Menge","bestellte Menge","Lagerort","KategorieID"}; 
    public ComponentTableModel(List<Component> list) {
	this.list = list; 
    }

    @Override
    public int getColumnCount() {
	// TODO Auto-generated method stub
	return 10;
    }

    @Override
    public int getRowCount() {
	// TODO Auto-generated method stub
	return list.size();
    }
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
				return Integer.class;
			default:
				return null; //should not happen
		}
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
	switch(columnIndex) {
	case 0: 
	    return list.get(rowIndex).getComponent_id();
	case 1:
	    return list.get(rowIndex).getArticlenumber(); 
	case 2:
	    return list.get(rowIndex).getName();
	case 3:
	    return list.get(rowIndex).getProductLink();
	case 4:
	    return list.get(rowIndex).getPrice();
	case 5:
	    return list.get(rowIndex).getStoring();
	case 6:
	    return list.get(rowIndex).getPlannedAmount();
	case 7:
	    return list.get(rowIndex).getOrderedAmount();
	case 8:
	    return list.get(rowIndex).getStorageLocation();
	case 9:
	    return list.get(rowIndex).getIdCategory(); 	
	default: 
	    return null; //can not happen
	}
	
	
    }

}
