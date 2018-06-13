package userInterface;

//GUI author: Nils
//author who fills the functions: Emre 

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPasswordField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import DataAccess.SQLManager;
import Exceptions.ELabException;
import Exceptions.NotEnoughParts;
import Exceptions.WrongRepeatedPassword;
import logic.ComponentManagement;
import sun.rmi.log.LogOutputStream;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JSplitPane;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.io.IOException;
import java.sql.SQLException;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;

public class GUIComponentUserInterface {

	private JFrame frmElabVerwaltungsprogramm;
	private JTextField textFieldpartSearch;
	private JTextField textFieldUsername;
	private JPasswordField passwordFieldnewPassword;
	private JPasswordField passwordFieldnewPasswordRepeat;
	private JTable tableAllParts;
	private JTable tableShoppingCard;
	
	private JComboBox comboBoxcategoryPartSearch;
	String username; 
	
	//int idPart; 

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	
	/**
	 * Initialize the contents of the frame.
	 */
	public GUIComponentUserInterface(String username) {
	    	this.username = username; 
		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setUndecorated(true);
		frmElabVerwaltungsprogramm.setTitle("Elab Verwaltungsprogramm");
		frmElabVerwaltungsprogramm.setBounds(100, 100, 1036, 727);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		frmElabVerwaltungsprogramm.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblcomponentUserinterface = new JLabel("Bauteilshop");
		lblcomponentUserinterface.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_lblcomponentUserinterface = new GridBagConstraints();
		gbc_lblcomponentUserinterface.insets = new Insets(0, 0, 5, 0);
		gbc_lblcomponentUserinterface.gridx = 1;
		gbc_lblcomponentUserinterface.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblcomponentUserinterface, gbc_lblcomponentUserinterface);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridwidth = 2;
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(tabbedPane, gbc_tabbedPane);
		
		JPanel panelshoppingCart = new JPanel();
		tabbedPane.addTab("Bauteil kaufen", null, panelshoppingCart, null);
		GridBagLayout gbl_panelshoppingCart = new GridBagLayout();
		gbl_panelshoppingCart.columnWidths = new int[]{268, 570, 0, 570, 0};
		gbl_panelshoppingCart.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelshoppingCart.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelshoppingCart.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelshoppingCart.setLayout(gbl_panelshoppingCart);
		
		JScrollPane scrollPaneallParts = new JScrollPane();
		scrollPaneallParts.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneallParts.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPaneallParts = new GridBagConstraints();
		gbc_scrollPaneallParts.gridwidth = 4;
		gbc_scrollPaneallParts.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPaneallParts.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneallParts.gridx = 0;
		gbc_scrollPaneallParts.gridy = 0;
		panelshoppingCart.add(scrollPaneallParts, gbc_scrollPaneallParts);
		
		tableAllParts = new JTable();
		tableAllParts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPaneallParts.setViewportView(tableAllParts);
		
		//Emre+
		
		try {
		    tableAllParts.setModel(new ComponentTableModel(ComponentManagement.getComponents()));
		} catch (SQLException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
		tableAllParts.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableAllParts.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent arg0) {
			// TODO Auto-generated method stub
		    }
		});
		
		//Emre- 
		
		JScrollPane scrollPaneshoppingCart = new JScrollPane();
		scrollPaneshoppingCart.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneshoppingCart.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPaneshoppingCart = new GridBagConstraints();
		gbc_scrollPaneshoppingCart.gridwidth = 4;
		gbc_scrollPaneshoppingCart.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPaneshoppingCart.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneshoppingCart.gridx = 0;
		gbc_scrollPaneshoppingCart.gridy = 1;
		panelshoppingCart.add(scrollPaneshoppingCart, gbc_scrollPaneshoppingCart);
		
		tableShoppingCard = new JTable();
		tableShoppingCard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPaneshoppingCart.setViewportView(tableShoppingCard);
		//Emre+
		try {
		    tableShoppingCard.setModel(new ShoppingCardTableModel(SQLManager.getInstance().getPartsByShoppingCard(SQLManager.getInstance().getPersonIDByUsername(username))));
		} catch (SQLException e2) {
		    // TODO Auto-generated catch block
		    e2.printStackTrace();
		}
		
		tableShoppingCard.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableShoppingCard.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
		    @Override
		    public void valueChanged(ListSelectionEvent arg0) {
			// TODO Auto-generated method stub
		    }
		});
		//Emre -
		
		
		
		comboBoxcategoryPartSearch = new JComboBox();
		comboBoxcategoryPartSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxcategoryPartSearch.setToolTipText("Suchkategorie auswählen");
		comboBoxcategoryPartSearch.setModel(new DefaultComboBoxModel(new String[] {"Name", "Artikelnummer"}));
		GridBagConstraints gbc_comboBoxcategoryPartSearch = new GridBagConstraints();
		gbc_comboBoxcategoryPartSearch.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxcategoryPartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxcategoryPartSearch.gridx = 0;
		gbc_comboBoxcategoryPartSearch.gridy = 2;
		panelshoppingCart.add(comboBoxcategoryPartSearch, gbc_comboBoxcategoryPartSearch);
		
		textFieldpartSearch = new JTextField();
		textFieldpartSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldpartSearch = new GridBagConstraints();
		gbc_textFieldpartSearch.gridwidth = 3;
		gbc_textFieldpartSearch.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartSearch.gridx = 1;
		gbc_textFieldpartSearch.gridy = 2;
		panelshoppingCart.add(textFieldpartSearch, gbc_textFieldpartSearch);
		textFieldpartSearch.setColumns(10);
		
		JButton btnpartSearch = new JButton("Nach Bauteil suchen");
		btnpartSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    //Emre+
			    switch(comboBoxcategoryPartSearch.getSelectedIndex()) {
			    case 0: 
				try {
				    tableAllParts.setModel(new ComponentTableModel(ComponentManagement.getComponentByName(textFieldpartSearch.getText())));
				} catch (SQLException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				} catch (ELabException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				}
				break; 
			    case 1: 
				try {
				    tableAllParts.setModel(new ComponentTableModel(ComponentManagement.getComponentByArticlenumber(textFieldpartSearch.getText())));
				} catch (SQLException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				} catch (ELabException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				}
				break; 
			    }//Emre -
			}
		});
		btnpartSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GridBagConstraints gbc_btnpartSearch = new GridBagConstraints();
		gbc_btnpartSearch.gridwidth = 3;
		gbc_btnpartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnpartSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnpartSearch.gridx = 1;
		gbc_btnpartSearch.gridy = 3;
		panelshoppingCart.add(btnpartSearch, gbc_btnpartSearch);
		
		JButton btnResetSearch = new JButton("Suche aufheben");
		btnResetSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    //Emre+
			    try {
				tableAllParts.setModel(new ComponentTableModel(ComponentManagement.getComponents()));
			    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }
			    textFieldpartSearch.setText("");
			}//Emre -
		});
		btnResetSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnResetSearch = new GridBagConstraints();
		gbc_btnResetSearch.gridwidth = 3;
		gbc_btnResetSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnResetSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnResetSearch.gridx = 1;
		gbc_btnResetSearch.gridy = 4;
		panelshoppingCart.add(btnResetSearch, gbc_btnResetSearch);
		
		JLabel lblpartQuantity = new JLabel("Anzahl");
		lblpartQuantity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpartQuantity = new GridBagConstraints();
		gbc_lblpartQuantity.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartQuantity.anchor = GridBagConstraints.EAST;
		gbc_lblpartQuantity.gridx = 0;
		gbc_lblpartQuantity.gridy = 5;
		panelshoppingCart.add(lblpartQuantity, gbc_lblpartQuantity);
		
		JTextField spinnerdekrementParts = new JTextField();
		spinnerdekrementParts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//spinnerdekrementParts.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinnerdekrementParts = new GridBagConstraints();
		gbc_spinnerdekrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerdekrementParts.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerdekrementParts.gridx = 1;
		gbc_spinnerdekrementParts.gridy = 5;
		panelshoppingCart.add(spinnerdekrementParts, gbc_spinnerdekrementParts);
		
		JTextField spinnerincrementParts = new JTextField();
		spinnerincrementParts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//spinnerincrementParts.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinnerincrementParts = new GridBagConstraints();
		gbc_spinnerincrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerincrementParts.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerincrementParts.gridx = 3;
		gbc_spinnerincrementParts.gridy = 5;
		panelshoppingCart.add(spinnerincrementParts, gbc_spinnerincrementParts);
		
		JButton btndekrementParts = new JButton("Dem Warenkorb hinzufügen");
		btndekrementParts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    if(tableAllParts.getSelectedRow() > -1) {
				
				int n = JOptionPane.showConfirmDialog(null, "Wollen Sie den Artikel "+ tableAllParts.getValueAt(tableAllParts.getSelectedRow(), 2).toString()+ " zu Ihrem Warenkorb hinzufügen?"); 
				if(n == JOptionPane.YES_OPTION ) { 
				    try {
					if(Integer.parseInt(tableAllParts.getValueAt(tableAllParts.getSelectedRow(), 5).toString())>=  Integer.parseInt(spinnerdekrementParts.getText())) {
					    SQLManager.getInstance().addPartToShoppingCard(Integer.parseInt(tableAllParts.getValueAt(tableAllParts.getSelectedRow(), 0).toString()), SQLManager.getInstance().getPersonIDByUsername(textFieldUsername.getText()), Integer.parseInt(spinnerdekrementParts.getText()));
					    SQLManager.getInstance().updatePartQuantityAfterShoppingMinus(Integer.parseInt(tableAllParts.getValueAt(tableAllParts.getSelectedRow(), 0).toString()), Integer.parseInt(spinnerdekrementParts.getText()));
					    spinnerdekrementParts.setBackground(Color.WHITE);
					} else
					    try { 
						throw new NotEnoughParts();
					    } catch (NotEnoughParts e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null,e1.getMessage());
					    }  
					
				    } catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					spinnerdekrementParts.setBackground(Color.red);
				    
				    } catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				    }
				}
			    } else {
				JOptionPane.showMessageDialog(null,"Wählen Sie eine Artikelzeile aus!");
			    }
			    spinnerdekrementParts.setText("");
			    refreshShoppingCardTable(); 
			    refreshPartTable(); 
			

			}

			private void refreshShoppingCardTable() {
			    // TODO Auto-generated method stub
			    try {
				    tableShoppingCard.setModel(new ShoppingCardTableModel(SQLManager.getInstance().getPartsByShoppingCard(SQLManager.getInstance().getPersonIDByUsername(username))));
				} catch (SQLException e2) {
				    // TODO Auto-generated catch block
				    e2.printStackTrace();
				}
			    
			}	
		});
		btndekrementParts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		//btndekrementParts.setToolTipText("Das entnommene Bauteil wird ihrer Rechnung hinzugefügt");
		GridBagConstraints gbc_btndekrementParts = new GridBagConstraints();
		gbc_btndekrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndekrementParts.insets = new Insets(0, 0, 5, 5);
		gbc_btndekrementParts.gridx = 1;
		gbc_btndekrementParts.gridy = 6;
		panelshoppingCart.add(btndekrementParts, gbc_btndekrementParts);
		
		JButton btnincrementParts = new JButton("Aus Warenkorb entfernen");
		btnincrementParts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try {
				if(tableShoppingCard.getSelectedRow()>-1) {
				    if(Integer.parseInt(tableShoppingCard.getValueAt(tableShoppingCard.getSelectedRow(), 3).toString()) >= Integer.parseInt(spinnerincrementParts.getText())) {
    			    			try {
    			    			    SQLManager.getInstance().updateShoppingCardPartMinus(Integer.parseInt(tableShoppingCard.getValueAt(tableShoppingCard.getSelectedRow(), 0).toString()), SQLManager.getInstance().getPersonIDByUsername(username), Integer.parseInt(spinnerincrementParts.getText()));    				
    			    			    SQLManager.getInstance().updatePartQuantityAfterShoppingPlus((Integer.parseInt(tableShoppingCard.getValueAt(tableShoppingCard.getSelectedRow(), 0).toString())),  (Integer.parseInt(spinnerincrementParts.getText())));
    			    			    spinnerincrementParts.setBackground(Color.WHITE);
    			    			} catch (NumberFormatException e1) {
    			    			    // TODO Auto-generated catch block
    			    			    //e1.printStackTrace();
    			    			    spinnerincrementParts.setBackground(Color.red);
    				
    			    			} catch (SQLException e1) {
    			    			    // TODO Auto-generated catch block
    			    			    e1.printStackTrace();
    			    			}
				    } else {
					JOptionPane.showMessageDialog(null,"In Ihrem Warenkorb befinden sich nicht so viele Exemplare von diesem Artikel" + "\n"+"Korrigieren Sie Ihre Eingaben!");
				    }
				} else { 
				    JOptionPane.showMessageDialog(null,"Wählen Sie einen Artikel aus Ihrem Warenkorb aus!");
				}
			    } catch (NumberFormatException e2) {
		    		    spinnerincrementParts.setBackground(Color.red);
			    }
			    spinnerincrementParts.setText("");
			    refreshShoppingCardTable2();
			    refreshPartTable();
			    
			}
		});
		btnincrementParts.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		btnincrementParts.setToolTipText("Das Bauteil wird in der angegebenen Menge \r\naus ihrem Warenkorb entfernt.");
		GridBagConstraints gbc_btnincrementParts = new GridBagConstraints();
		gbc_btnincrementParts.insets = new Insets(0, 0, 5, 0);
		gbc_btnincrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnincrementParts.gridx = 3;
		gbc_btnincrementParts.gridy = 6;
		panelshoppingCart.add(btnincrementParts, gbc_btnincrementParts);
		
		JButton btnpayShoppingCart = new JButton("Warenkorb bezahlen");
		btnpayShoppingCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    JOptionPane.showMessageDialog(null, "Das System beruht auf Vertrauen-Bitte das Geld in die Kasse legen!");
			    try {
				SQLManager.getInstance().payPartFromShoppingCard(Integer.parseInt(tableShoppingCard.getValueAt(tableShoppingCard.getSelectedRow(), 0).toString()), SQLManager.getInstance().getPersonIDByUsername(username));
			    } catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			    } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			    }
			    refreshShoppingCardTable2(); 
			
				
			}
		});
		btnpayShoppingCart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnpayShoppingCart = new GridBagConstraints();
		gbc_btnpayShoppingCart.gridwidth = 3;
		gbc_btnpayShoppingCart.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnpayShoppingCart.insets = new Insets(0, 0, 0, 5);
		gbc_btnpayShoppingCart.gridx = 1;
		gbc_btnpayShoppingCart.gridy = 7;
		panelshoppingCart.add(btnpayShoppingCart, gbc_btnpayShoppingCart);
		
		JPanel panelChangePassword = new JPanel();
		tabbedPane.addTab("Passwort ändern", null, panelChangePassword, null);
		GridBagLayout gbl_panelChangePassword = new GridBagLayout();
		gbl_panelChangePassword.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelChangePassword.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelChangePassword.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelChangePassword.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelChangePassword.setLayout(gbl_panelChangePassword);
		
		JLabel lbluserName = new JLabel("Username");
		lbluserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbluserName = new GridBagConstraints();
		gbc_lbluserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbluserName.insets = new Insets(0, 0, 5, 5);
		gbc_lbluserName.gridx = 0;
		gbc_lbluserName.gridy = 0;
		panelChangePassword.add(lbluserName, gbc_lbluserName);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setText(username);
		textFieldUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldUsername.setEditable(false);
		GridBagConstraints gbc_textFieldUsername = new GridBagConstraints();
		gbc_textFieldUsername.gridwidth = 4;
		gbc_textFieldUsername.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldUsername.gridx = 1;
		gbc_textFieldUsername.gridy = 0;
		panelChangePassword.add(textFieldUsername, gbc_textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblnewPassword = new JLabel("Neues Passwort");
		lblnewPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblnewPassword = new GridBagConstraints();
		gbc_lblnewPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblnewPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblnewPassword.gridx = 0;
		gbc_lblnewPassword.gridy = 1;
		panelChangePassword.add(lblnewPassword, gbc_lblnewPassword);
		
		passwordFieldnewPassword = new JPasswordField();
		passwordFieldnewPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_passwordFieldnewPassword = new GridBagConstraints();
		gbc_passwordFieldnewPassword.gridwidth = 4;
		gbc_passwordFieldnewPassword.insets = new Insets(0, 0, 5, 0);
		gbc_passwordFieldnewPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordFieldnewPassword.gridx = 1;
		gbc_passwordFieldnewPassword.gridy = 1;
		panelChangePassword.add(passwordFieldnewPassword, gbc_passwordFieldnewPassword);
		
		JLabel lblnewPasswordRepeat = new JLabel("Neues Passwort wiederholen");
		lblnewPasswordRepeat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblnewPasswordRepeat = new GridBagConstraints();
		gbc_lblnewPasswordRepeat.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblnewPasswordRepeat.insets = new Insets(0, 0, 5, 5);
		gbc_lblnewPasswordRepeat.gridx = 0;
		gbc_lblnewPasswordRepeat.gridy = 2;
		panelChangePassword.add(lblnewPasswordRepeat, gbc_lblnewPasswordRepeat);
		
		passwordFieldnewPasswordRepeat = new JPasswordField();
		passwordFieldnewPasswordRepeat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_passwordFieldnewPasswordRepeat = new GridBagConstraints();
		gbc_passwordFieldnewPasswordRepeat.gridwidth = 4;
		gbc_passwordFieldnewPasswordRepeat.insets = new Insets(0, 0, 5, 0);
		gbc_passwordFieldnewPasswordRepeat.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordFieldnewPasswordRepeat.gridx = 1;
		gbc_passwordFieldnewPasswordRepeat.gridy = 2;
		panelChangePassword.add(passwordFieldnewPasswordRepeat, gbc_passwordFieldnewPasswordRepeat);
		
		JButton btnclearAllInputs = new JButton("Eingaben löschen");
		btnclearAllInputs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			passwordFieldnewPassword.setText("");
			passwordFieldnewPasswordRepeat.setText("");
			
			
			}
		});
		btnclearAllInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GridBagConstraints gbc_btnclearAllInputs = new GridBagConstraints();
		gbc_btnclearAllInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnclearAllInputs.gridwidth = 4;
		gbc_btnclearAllInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btnclearAllInputs.gridx = 1;
		gbc_btnclearAllInputs.gridy = 3;
		panelChangePassword.add(btnclearAllInputs, gbc_btnclearAllInputs);
		
		JButton btnsaveChange = new JButton("Änderung speichern");
		btnsaveChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    //Emre+
			    if(passwordFieldnewPassword.getText().equals(passwordFieldnewPasswordRepeat.getText())) {
				try {
				    SQLManager.getInstance().changePassword(textFieldUsername.getText(), passwordFieldnewPassword.getText());
				} catch (SQLException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				}
			    } else  
				try {
				    throw new WrongRepeatedPassword();
				} catch (WrongRepeatedPassword e1) {
				    // TODO Auto-generated catch block 
				    JOptionPane.showMessageDialog(null,e1.getMessage());
				} 
			    
			}//Emre- 
		});
		btnsaveChange.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GridBagConstraints gbc_btnsaveChange = new GridBagConstraints();
		gbc_btnsaveChange.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsaveChange.gridwidth = 4;
		gbc_btnsaveChange.gridx = 1;
		gbc_btnsaveChange.gridy = 4;
		panelChangePassword.add(btnsaveChange, gbc_btnsaveChange);
		
		JMenuBar menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);
		
		JMenu mnNewMenuOptions = new JMenu("Menü");
		mnNewMenuOptions.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuOptions);
		
		JMenuItem mntmNewMenuItemlogOut = new JMenuItem("Ausloggen");
		mntmNewMenuItemlogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				GuiLogin logout= new GuiLogin();
				frmElabVerwaltungsprogramm.dispose();
				
			}
		});
		
		JMenuItem mntmNewMenuItemMinimize = new JMenuItem("Minimieren");
		mntmNewMenuItemMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			frmElabVerwaltungsprogramm.setState(JFrame.ICONIFIED);
			
			}
		});
		mntmNewMenuItemMinimize.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuOptions.add(mntmNewMenuItemMinimize);
		mntmNewMenuItemlogOut.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuOptions.add(mntmNewMenuItemlogOut);
		
		
		JMenu mnNewMenuhelpWindow = new JMenu("?");
		mnNewMenuhelpWindow.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuhelpWindow);
		
		JMenuItem mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mntmNewMenuItemshowManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				try {
					Runtime.getRuntime().exec("cmd /c Start ./Anleitungen/Anleitung_für_Kunden_und_Lehrstuhlbezogene_Personen.pdf");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			
			}
		});
		mntmNewMenuItemshowManual.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);
		
		
		
		frmElabVerwaltungsprogramm.setVisible(true);
		
		
	}

	protected void refreshShoppingCardTable2() {
	    // TODO Auto-generated method stub
	    try {
		    tableShoppingCard.setModel(new ShoppingCardTableModel(SQLManager.getInstance().getPartsByShoppingCard(SQLManager.getInstance().getPersonIDByUsername(username))));
		} catch (SQLException e2) {
		    // TODO Auto-generated catch block
		    e2.printStackTrace();
		}
	}

	protected void refreshPartTable() {
	    // TODO Auto-generated method stub
	    try {
		    tableAllParts.setModel(new ComponentTableModel(ComponentManagement.getComponents()));
		} catch (SQLException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
	    
	}
}
