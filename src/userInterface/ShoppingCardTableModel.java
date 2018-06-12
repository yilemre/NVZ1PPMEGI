package userInterface;

import java.util.ArrayList;
import java.util.List;

import logic.*; 

import javax.swing.table.AbstractTableModel;

public class ShoppingCardTableModel extends AbstractTableModel {
    private List<ShoppingObjects> list = new ArrayList<ShoppingObjects>(); 
    private String[] columns = {"ID", "Artikelnummer", "Name", "Menge", "Preis", "Betrag"}; 
    
    public ShoppingCardTableModel(List<ShoppingObjects> list) {
	this.list =list; 
    }

    @Override
    public int getColumnCount() {
	// TODO Auto-generated method stub
	return 6;
    }

    @Override
    public int getRowCount() {
	// TODO Auto-generated method stub
	return list.size();
    }
    public String getColumnName(int column) {
	
	return columns[column]; 
    }
    
    public Class<?> getColumnClass (int columnIndex){
	switch(columnIndex) {
	case 0: 
	    return Integer.class; 
	case 1: 
	    return String.class; 
	case 2: 
	    return String.class; 
	case 3: 
	    return Integer.class; 
	case 4: 
	    return Double.class; 
	case 5: 
	    return Double.class; 
	default:
	    return null; 
	    
	}
    }
    @Override
    public Object getValueAt(int row, int column) {
	switch(column) {
	case 0: 
	    return list.get(row).getIdPart(); 
	case 1: 
	    return list.get(row).getArticlenumber(); 
	case 2: 
	    return list.get(row).getName(); 
	case 3: 
	    return list.get(row).getAmount(); 
	case 4: 
	    return list.get(row).getPrice(); 
	case 5: 
	    return list.get(row).getSumPrice(); 
	default: 
		return null; 
	}
	
    }

}
