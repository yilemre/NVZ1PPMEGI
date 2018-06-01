package userInterface;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import logic.Category;

public class CategoryTableModel extends AbstractTableModel {
    private List<Category> list = new ArrayList<Category>(); 
    private String[] columns = {"ID", "Name", "Notiz"}; 
    public CategoryTableModel(List<Category> list) {
	this.list = list; 
    }
    
    
    @Override
    public int getColumnCount() {
	// TODO Auto-generated method stub
	return 3;
    }

    @Override
    public int getRowCount() {
	// TODO Auto-generated method stub
	return list.size();
    }
    public String getColumnName(int column) {
	return columns[column];
    }
    public Class<?> getColumnClass(int columnIndex){
	switch(columnIndex) {
	case 0:
	    return Integer.class; 
	case 1: 
	    return String.class; 
	case 2: 
	    return String.class;
	default: 
	    return null; 
	}
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
	switch (columnIndex) {
	case 0: 
	    return list.get(rowIndex).getId(); 
	case 1: 
	    return list.get(rowIndex).getName(); 
	case 2: 
	    return list.get(rowIndex).getNote(); 
	}
	// TODO Auto-generated method stub
	return null;
    }
    
    

}
