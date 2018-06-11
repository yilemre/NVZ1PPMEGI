package userInterface;

//author Nils 

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
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import DataAccess.SQLManager;
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
import javax.swing.ListSelectionModel;
import javax.swing.JSplitPane;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.sql.SQLException;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Frame;

public class GUIComponentUserInterface implements ActionListener {

	private JFrame frmElabVerwaltungsprogramm;
	private JTextField textFieldpartSearch;
	private JTextField textFieldUsername;
	private JPasswordField passwordFieldnewPassword;
	private JPasswordField passwordFieldnewPasswordRepeat;
	private JTable tableAllParts;
	private JTable tableShoppingCard;
   
	
	
	
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
		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setExtendedState(Frame.MAXIMIZED_BOTH);
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
		gbl_panelshoppingCart.columnWidths = new int[]{268, 570, 570, 0};
		gbl_panelshoppingCart.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelshoppingCart.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelshoppingCart.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelshoppingCart.setLayout(gbl_panelshoppingCart);
		
		JScrollPane scrollPaneallParts = new JScrollPane();
		scrollPaneallParts.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneallParts.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPaneallParts = new GridBagConstraints();
		gbc_scrollPaneallParts.gridwidth = 3;
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
		//Emre- 
		
		JScrollPane scrollPaneshoppingCart = new JScrollPane();
		scrollPaneshoppingCart.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneshoppingCart.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPaneshoppingCart = new GridBagConstraints();
		gbc_scrollPaneshoppingCart.gridwidth = 3;
		gbc_scrollPaneshoppingCart.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPaneshoppingCart.fill = GridBagConstraints.BOTH;
		gbc_scrollPaneshoppingCart.gridx = 0;
		gbc_scrollPaneshoppingCart.gridy = 1;
		panelshoppingCart.add(scrollPaneshoppingCart, gbc_scrollPaneshoppingCart);
		
		tableShoppingCard = new JTable();
		scrollPaneshoppingCart.setViewportView(tableShoppingCard);
		
		JComboBox comboBoxcategoryPartSearch = new JComboBox();
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
		gbc_textFieldpartSearch.gridwidth = 2;
		gbc_textFieldpartSearch.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartSearch.gridx = 1;
		gbc_textFieldpartSearch.gridy = 2;
		panelshoppingCart.add(textFieldpartSearch, gbc_textFieldpartSearch);
		textFieldpartSearch.setColumns(10);
		
		JButton btnpartSearch = new JButton("Nach Bauteil suchen");
		btnpartSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnpartSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GridBagConstraints gbc_btnpartSearch = new GridBagConstraints();
		gbc_btnpartSearch.gridwidth = 2;
		gbc_btnpartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnpartSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnpartSearch.gridx = 1;
		gbc_btnpartSearch.gridy = 3;
		panelshoppingCart.add(btnpartSearch, gbc_btnpartSearch);
		
		JLabel lblpartQuantity = new JLabel("Anzahl");
		lblpartQuantity.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpartQuantity = new GridBagConstraints();
		gbc_lblpartQuantity.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartQuantity.anchor = GridBagConstraints.EAST;
		gbc_lblpartQuantity.gridx = 0;
		gbc_lblpartQuantity.gridy = 4;
		panelshoppingCart.add(lblpartQuantity, gbc_lblpartQuantity);
		
		JSpinner spinnerdekrementParts = new JSpinner();
		spinnerdekrementParts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerdekrementParts.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinnerdekrementParts = new GridBagConstraints();
		gbc_spinnerdekrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerdekrementParts.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerdekrementParts.gridx = 1;
		gbc_spinnerdekrementParts.gridy = 4;
		panelshoppingCart.add(spinnerdekrementParts, gbc_spinnerdekrementParts);
		
		JSpinner spinnerincrementParts = new JSpinner();
		spinnerincrementParts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinnerincrementParts.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinnerincrementParts = new GridBagConstraints();
		gbc_spinnerincrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerincrementParts.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerincrementParts.gridx = 2;
		gbc_spinnerincrementParts.gridy = 4;
		panelshoppingCart.add(spinnerincrementParts, gbc_spinnerincrementParts);
		
		JButton btndekrementParts = new JButton("Dem Warenkorb hinzufügen");
		btndekrementParts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndekrementParts.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btndekrementParts.setToolTipText("Das entnommene Bauteil wird ihrer Rechnung hinzugefügt");
		GridBagConstraints gbc_btndekrementParts = new GridBagConstraints();
		gbc_btndekrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndekrementParts.insets = new Insets(0, 0, 0, 5);
		gbc_btndekrementParts.gridx = 1;
		gbc_btndekrementParts.gridy = 5;
		panelshoppingCart.add(btndekrementParts, gbc_btndekrementParts);
		
		JButton btnincrementParts = new JButton("Aus Warenkorb entfernen");
		btnincrementParts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnincrementParts.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		btnincrementParts.setToolTipText("Das Bauteil wird in der angegebenen Menge \r\naus ihrem Warenkorb entfernt.");
		GridBagConstraints gbc_btnincrementParts = new GridBagConstraints();
		gbc_btnincrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnincrementParts.gridx = 2;
		gbc_btnincrementParts.gridy = 5;
		panelshoppingCart.add(btnincrementParts, gbc_btnincrementParts);
		
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
				    e1.printStackTrace();
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
			}
		});
		mntmNewMenuItemshowManual.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);
		
		
		
		frmElabVerwaltungsprogramm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		
		if (command=="Nach Bauteil suchen") {
			
			
		}
		

		if (command=="Dem Warenkorb hinzufügen") {
			
			
		}
		

		if (command=="Aus Warenkorb entfernen") {
			
			
		}
		

		if (command=="Eingaben löschen") {
			passwordFieldnewPassword.setText("");	
			passwordFieldnewPasswordRepeat.setText("");
			
		}

		if (command=="�nderung speichern") {
			
			
		}
		if (command=="Ausloggen") {
			
		GuiLogin logout = new GuiLogin();
		frmElabVerwaltungsprogramm.dispose();
			
			
		}
		if (command=="Anleitung anzeigen") {
			
			
		}
	
	}
}
