package userInterface;



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

public class GUIFinanceManagement implements ActionListener {

	private JFrame frmElabVerwaltungsprogramm;
	private JTextField textFieldname;
	private JTextField textFieldlastName;
	private JTextField textFieldStreet;
	private JTextField textFieldhouseNumber;
	private JTextField textFieldzipCode;
	private JTextField textFieldeMail;
	private JTextField textFielduserName;
	private JPasswordField passwordField;
	private JTextField textFieldnameModify;
	private JTextField textFieldlastNameModify;
	private JTextField textFieldstreetModify;
	private JTextField textFieldhouseNumberModify;
	private JTextField textFieldzipCodeModify;
	private JTextField textFieldeMailModify;
	private JTextField textFielduserNameModify;
	private JPasswordField passwordFieldModify;
	private JTextField textFielddeleteBillSearch;
	private JTextField textFieldsearchBillModify;
	private JTextField textFieldjarName;
	private JTextField textFieldjarActualStock;
	private JTextField textFieldjarEstimatedStock;
	private JTextField textFieldjarNameModify;
	private JTextField textFieldjarActualStockModify;
	private JTextField textFieldjarEstimatedStockModify;
	private JTextField textFieldcashRegisterName;
	private JTextField textFieldCashRegisterNameModify;
	private JTextField textFieldcashRegisterActualStock;
	private JTextField textFieldcashRegisterActualStockModify;
	private JTextField textFieldcashRegisterEstimatedStock;
	private JTextField textFieldcashRegisterEstimatedStockModify;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */


	/**
	 * Initialize the contents of the frame.
	 */
	public GUIFinanceManagement() {
		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setTitle("Elab Verwaltungsprogramm");
		frmElabVerwaltungsprogramm.setBounds(100, 100, 1036, 727);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		frmElabVerwaltungsprogramm.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblFinanceManagement = new JLabel("Finanzverwaltung");
		lblFinanceManagement.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblFinanceManagement = new GridBagConstraints();
		gbc_lblFinanceManagement.insets = new Insets(0, 0, 5, 0);
		gbc_lblFinanceManagement.gridx = 0;
		gbc_lblFinanceManagement.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblFinanceManagement, gbc_lblFinanceManagement);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(tabbedPane, gbc_tabbedPane);
		
		JPanel panelcreateBill = new JPanel();
		tabbedPane.addTab("Rechnung erstellen", null, panelcreateBill, null);
		GridBagLayout gbl_panelcreateBill = new GridBagLayout();
		gbl_panelcreateBill.columnWidths = new int[]{0, 0, 0};
		gbl_panelcreateBill.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelcreateBill.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelcreateBill.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelcreateBill.setLayout(gbl_panelcreateBill);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panelcreateBill.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblname = new JLabel("Vorname");
		GridBagConstraints gbc_lblname = new GridBagConstraints();
		gbc_lblname.anchor = GridBagConstraints.EAST;
		gbc_lblname.insets = new Insets(0, 0, 5, 5);
		gbc_lblname.gridx = 0;
		gbc_lblname.gridy = 1;
		panelcreateBill.add(lblname, gbc_lblname);
		
		textFieldname = new JTextField();
		GridBagConstraints gbc_textFieldname = new GridBagConstraints();
		gbc_textFieldname.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldname.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldname.gridx = 1;
		gbc_textFieldname.gridy = 1;
		panelcreateBill.add(textFieldname, gbc_textFieldname);
		textFieldname.setColumns(10);
		
		JLabel lbllastName = new JLabel("Nachname");
		GridBagConstraints gbc_lbllastName = new GridBagConstraints();
		gbc_lbllastName.anchor = GridBagConstraints.EAST;
		gbc_lbllastName.insets = new Insets(0, 0, 5, 5);
		gbc_lbllastName.gridx = 0;
		gbc_lbllastName.gridy = 2;
		panelcreateBill.add(lbllastName, gbc_lbllastName);
		
		textFieldlastName = new JTextField();
		GridBagConstraints gbc_textFieldlastName = new GridBagConstraints();
		gbc_textFieldlastName.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldlastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldlastName.gridx = 1;
		gbc_textFieldlastName.gridy = 2;
		panelcreateBill.add(textFieldlastName, gbc_textFieldlastName);
		textFieldlastName.setColumns(10);
		
		JLabel lblStreet = new JLabel("Stra\u00DFe");
		GridBagConstraints gbc_lblStreet = new GridBagConstraints();
		gbc_lblStreet.anchor = GridBagConstraints.EAST;
		gbc_lblStreet.insets = new Insets(0, 0, 5, 5);
		gbc_lblStreet.gridx = 0;
		gbc_lblStreet.gridy = 3;
		panelcreateBill.add(lblStreet, gbc_lblStreet);
		
		textFieldStreet = new JTextField();
		GridBagConstraints gbc_textFieldStreet = new GridBagConstraints();
		gbc_textFieldStreet.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldStreet.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStreet.gridx = 1;
		gbc_textFieldStreet.gridy = 3;
		panelcreateBill.add(textFieldStreet, gbc_textFieldStreet);
		textFieldStreet.setColumns(10);
		
		JLabel lblhouseNumber = new JLabel("Hausnummer");
		GridBagConstraints gbc_lblhouseNumber = new GridBagConstraints();
		gbc_lblhouseNumber.anchor = GridBagConstraints.EAST;
		gbc_lblhouseNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblhouseNumber.gridx = 0;
		gbc_lblhouseNumber.gridy = 4;
		panelcreateBill.add(lblhouseNumber, gbc_lblhouseNumber);
		
		textFieldhouseNumber = new JTextField();
		GridBagConstraints gbc_textFieldhouseNumber = new GridBagConstraints();
		gbc_textFieldhouseNumber.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldhouseNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldhouseNumber.gridx = 1;
		gbc_textFieldhouseNumber.gridy = 4;
		panelcreateBill.add(textFieldhouseNumber, gbc_textFieldhouseNumber);
		textFieldhouseNumber.setColumns(10);
		
		JLabel lblzipCode = new JLabel("PLZ");
		GridBagConstraints gbc_lblzipCode = new GridBagConstraints();
		gbc_lblzipCode.anchor = GridBagConstraints.EAST;
		gbc_lblzipCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblzipCode.gridx = 0;
		gbc_lblzipCode.gridy = 5;
		panelcreateBill.add(lblzipCode, gbc_lblzipCode);
		
		textFieldzipCode = new JTextField();
		GridBagConstraints gbc_textFieldzipCode = new GridBagConstraints();
		gbc_textFieldzipCode.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldzipCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldzipCode.gridx = 1;
		gbc_textFieldzipCode.gridy = 5;
		panelcreateBill.add(textFieldzipCode, gbc_textFieldzipCode);
		textFieldzipCode.setColumns(10);
		
		JLabel lbleMail = new JLabel("E-Mail Adresse");
		GridBagConstraints gbc_lbleMail = new GridBagConstraints();
		gbc_lbleMail.anchor = GridBagConstraints.EAST;
		gbc_lbleMail.insets = new Insets(0, 0, 5, 5);
		gbc_lbleMail.gridx = 0;
		gbc_lbleMail.gridy = 6;
		panelcreateBill.add(lbleMail, gbc_lbleMail);
		
		textFieldeMail = new JTextField();
		GridBagConstraints gbc_textFieldeMail = new GridBagConstraints();
		gbc_textFieldeMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldeMail.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldeMail.gridx = 1;
		gbc_textFieldeMail.gridy = 6;
		panelcreateBill.add(textFieldeMail, gbc_textFieldeMail);
		textFieldeMail.setColumns(10);
		
		JLabel lblTyp = new JLabel("Personenart");
		GridBagConstraints gbc_lblTyp = new GridBagConstraints();
		gbc_lblTyp.anchor = GridBagConstraints.EAST;
		gbc_lblTyp.insets = new Insets(0, 0, 5, 5);
		gbc_lblTyp.gridx = 0;
		gbc_lblTyp.gridy = 7;
		panelcreateBill.add(lblTyp, gbc_lblTyp);
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Kunde", "Mitglieder", "Lehrstuhl bezogene Personen"}));
		GridBagConstraints gbc_comboBoxType = new GridBagConstraints();
		gbc_comboBoxType.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxType.gridx = 1;
		gbc_comboBoxType.gridy = 7;
		panelcreateBill.add(comboBoxType, gbc_comboBoxType);
		
		JLabel lbluserName = new JLabel("Username");
		GridBagConstraints gbc_lbluserName = new GridBagConstraints();
		gbc_lbluserName.anchor = GridBagConstraints.EAST;
		gbc_lbluserName.insets = new Insets(0, 0, 5, 5);
		gbc_lbluserName.gridx = 0;
		gbc_lbluserName.gridy = 8;
		panelcreateBill.add(lbluserName, gbc_lbluserName);
		
		textFielduserName = new JTextField();
		GridBagConstraints gbc_textFielduserName = new GridBagConstraints();
		gbc_textFielduserName.insets = new Insets(0, 0, 5, 0);
		gbc_textFielduserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFielduserName.gridx = 1;
		gbc_textFielduserName.gridy = 8;
		panelcreateBill.add(textFielduserName, gbc_textFielduserName);
		textFielduserName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Passwort");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 9;
		panelcreateBill.add(lblPassword, gbc_lblPassword);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 9;
		panelcreateBill.add(passwordField, gbc_passwordField);
		
		JButton btnaddPerson = new JButton("Person hinzuf\u00FCgen");
		GridBagConstraints gbc_btnaddPerson = new GridBagConstraints();
		gbc_btnaddPerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddPerson.insets = new Insets(0, 0, 5, 0);
		gbc_btnaddPerson.gridx = 1;
		gbc_btnaddPerson.gridy = 10;
		panelcreateBill.add(btnaddPerson, gbc_btnaddPerson);
		
		JButton btndeleteallInputs = new JButton("Eingaben l\u00F6schen");
		GridBagConstraints gbc_btndeleteallInputs = new GridBagConstraints();
		gbc_btndeleteallInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputs.gridx = 1;
		gbc_btndeleteallInputs.gridy = 11;
		panelcreateBill.add(btndeleteallInputs, gbc_btndeleteallInputs);
		
		JLabel lbleLabpicture = new JLabel("");
		GridBagConstraints gbc_lbleLabpicture = new GridBagConstraints();
		gbc_lbleLabpicture.gridwidth = 2;
		gbc_lbleLabpicture.gridx = 0;
		gbc_lbleLabpicture.gridy = 12;
		panelcreateBill.add(lbleLabpicture, gbc_lbleLabpicture);
		
		JPanel panelmodifyBill = new JPanel();
		tabbedPane.addTab("Rechnung bearbeiten", null, panelmodifyBill, null);
		GridBagLayout gbl_panelmodifyBill = new GridBagLayout();
		gbl_panelmodifyBill.columnWidths = new int[]{148, 0, 0};
		gbl_panelmodifyBill.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelmodifyBill.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelmodifyBill.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panelmodifyBill.setLayout(gbl_panelmodifyBill);
		
		JLabel lblnameModify = new JLabel("Vorname");
		GridBagConstraints gbc_lblnameModify = new GridBagConstraints();
		gbc_lblnameModify.anchor = GridBagConstraints.EAST;
		gbc_lblnameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblnameModify.gridx = 0;
		gbc_lblnameModify.gridy = 0;
		panelmodifyBill.add(lblnameModify, gbc_lblnameModify);
		
		textFieldnameModify = new JTextField();
		GridBagConstraints gbc_textFieldnameModify = new GridBagConstraints();
		gbc_textFieldnameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldnameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldnameModify.gridx = 1;
		gbc_textFieldnameModify.gridy = 0;
		panelmodifyBill.add(textFieldnameModify, gbc_textFieldnameModify);
		textFieldnameModify.setColumns(10);
		
		JLabel lbllastNameModify = new JLabel("Nachname");
		GridBagConstraints gbc_lbllastNameModify = new GridBagConstraints();
		gbc_lbllastNameModify.anchor = GridBagConstraints.EAST;
		gbc_lbllastNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbllastNameModify.gridx = 0;
		gbc_lbllastNameModify.gridy = 1;
		panelmodifyBill.add(lbllastNameModify, gbc_lbllastNameModify);
		
		textFieldlastNameModify = new JTextField();
		GridBagConstraints gbc_textFieldlastNameModify = new GridBagConstraints();
		gbc_textFieldlastNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldlastNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldlastNameModify.gridx = 1;
		gbc_textFieldlastNameModify.gridy = 1;
		panelmodifyBill.add(textFieldlastNameModify, gbc_textFieldlastNameModify);
		textFieldlastNameModify.setColumns(10);
		
		JLabel lblstreetModify = new JLabel("Stra\u00DFe");
		GridBagConstraints gbc_lblstreetModify = new GridBagConstraints();
		gbc_lblstreetModify.anchor = GridBagConstraints.EAST;
		gbc_lblstreetModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblstreetModify.gridx = 0;
		gbc_lblstreetModify.gridy = 2;
		panelmodifyBill.add(lblstreetModify, gbc_lblstreetModify);
		
		textFieldstreetModify = new JTextField();
		GridBagConstraints gbc_textFieldstreetModify = new GridBagConstraints();
		gbc_textFieldstreetModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldstreetModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldstreetModify.gridx = 1;
		gbc_textFieldstreetModify.gridy = 2;
		panelmodifyBill.add(textFieldstreetModify, gbc_textFieldstreetModify);
		textFieldstreetModify.setColumns(10);
		
		JLabel lblhouseNumberModify = new JLabel("Hausnummer");
		GridBagConstraints gbc_lblhouseNumberModify = new GridBagConstraints();
		gbc_lblhouseNumberModify.anchor = GridBagConstraints.EAST;
		gbc_lblhouseNumberModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblhouseNumberModify.gridx = 0;
		gbc_lblhouseNumberModify.gridy = 3;
		panelmodifyBill.add(lblhouseNumberModify, gbc_lblhouseNumberModify);
		
		textFieldhouseNumberModify = new JTextField();
		GridBagConstraints gbc_textFieldhouseNumberModify = new GridBagConstraints();
		gbc_textFieldhouseNumberModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldhouseNumberModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldhouseNumberModify.gridx = 1;
		gbc_textFieldhouseNumberModify.gridy = 3;
		panelmodifyBill.add(textFieldhouseNumberModify, gbc_textFieldhouseNumberModify);
		textFieldhouseNumberModify.setColumns(10);
		
		JLabel lblzipCodeModify = new JLabel("PLZ");
		GridBagConstraints gbc_lblzipCodeModify = new GridBagConstraints();
		gbc_lblzipCodeModify.anchor = GridBagConstraints.EAST;
		gbc_lblzipCodeModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblzipCodeModify.gridx = 0;
		gbc_lblzipCodeModify.gridy = 4;
		panelmodifyBill.add(lblzipCodeModify, gbc_lblzipCodeModify);
		
		textFieldzipCodeModify = new JTextField();
		GridBagConstraints gbc_textFieldzipCodeModify = new GridBagConstraints();
		gbc_textFieldzipCodeModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldzipCodeModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldzipCodeModify.gridx = 1;
		gbc_textFieldzipCodeModify.gridy = 4;
		panelmodifyBill.add(textFieldzipCodeModify, gbc_textFieldzipCodeModify);
		textFieldzipCodeModify.setColumns(10);
		
		JLabel lbleMailModify = new JLabel("E-Mail Adresse");
		GridBagConstraints gbc_lbleMailModify = new GridBagConstraints();
		gbc_lbleMailModify.anchor = GridBagConstraints.EAST;
		gbc_lbleMailModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbleMailModify.gridx = 0;
		gbc_lbleMailModify.gridy = 5;
		panelmodifyBill.add(lbleMailModify, gbc_lbleMailModify);
		
		textFieldeMailModify = new JTextField();
		GridBagConstraints gbc_textFieldeMailModify = new GridBagConstraints();
		gbc_textFieldeMailModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldeMailModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldeMailModify.gridx = 1;
		gbc_textFieldeMailModify.gridy = 5;
		panelmodifyBill.add(textFieldeMailModify, gbc_textFieldeMailModify);
		textFieldeMailModify.setColumns(10);
		
		JLabel lbltypModify = new JLabel("Personenart");
		GridBagConstraints gbc_lbltypModify = new GridBagConstraints();
		gbc_lbltypModify.anchor = GridBagConstraints.EAST;
		gbc_lbltypModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbltypModify.gridx = 0;
		gbc_lbltypModify.gridy = 6;
		panelmodifyBill.add(lbltypModify, gbc_lbltypModify);
		
		JComboBox comboBoxTypeModify = new JComboBox();
		comboBoxTypeModify.setModel(new DefaultComboBoxModel(new String[] {"Kunde", "Mitglieder", "Lehrstuhl bezogene Personen"}));
		GridBagConstraints gbc_comboBoxTypeModify = new GridBagConstraints();
		gbc_comboBoxTypeModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxTypeModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTypeModify.gridx = 1;
		gbc_comboBoxTypeModify.gridy = 6;
		panelmodifyBill.add(comboBoxTypeModify, gbc_comboBoxTypeModify);
		
		JLabel lbluserNameModify = new JLabel("Username");
		GridBagConstraints gbc_lbluserNameModify = new GridBagConstraints();
		gbc_lbluserNameModify.anchor = GridBagConstraints.EAST;
		gbc_lbluserNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbluserNameModify.gridx = 0;
		gbc_lbluserNameModify.gridy = 7;
		panelmodifyBill.add(lbluserNameModify, gbc_lbluserNameModify);
		
		textFielduserNameModify = new JTextField();
		GridBagConstraints gbc_textFielduserNameModify = new GridBagConstraints();
		gbc_textFielduserNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFielduserNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFielduserNameModify.gridx = 1;
		gbc_textFielduserNameModify.gridy = 7;
		panelmodifyBill.add(textFielduserNameModify, gbc_textFielduserNameModify);
		textFielduserNameModify.setColumns(10);
		
		JLabel lblpasswordModify = new JLabel("Passwort");
		GridBagConstraints gbc_lblpasswordModify = new GridBagConstraints();
		gbc_lblpasswordModify.anchor = GridBagConstraints.EAST;
		gbc_lblpasswordModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblpasswordModify.gridx = 0;
		gbc_lblpasswordModify.gridy = 8;
		panelmodifyBill.add(lblpasswordModify, gbc_lblpasswordModify);
		
		passwordFieldModify = new JPasswordField();
		GridBagConstraints gbc_passwordFieldModify = new GridBagConstraints();
		gbc_passwordFieldModify.insets = new Insets(0, 0, 5, 0);
		gbc_passwordFieldModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordFieldModify.gridx = 1;
		gbc_passwordFieldModify.gridy = 8;
		panelmodifyBill.add(passwordFieldModify, gbc_passwordFieldModify);
		
		JButton btnsaveModifiedValues = new JButton("\u00C4nderungen speichern");
		GridBagConstraints gbc_btnsaveModifiedValues = new GridBagConstraints();
		gbc_btnsaveModifiedValues.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsaveModifiedValues.insets = new Insets(0, 0, 5, 0);
		gbc_btnsaveModifiedValues.gridx = 1;
		gbc_btnsaveModifiedValues.gridy = 9;
		panelmodifyBill.add(btnsaveModifiedValues, gbc_btnsaveModifiedValues);
		
		JScrollPane scrollPanemodifyPerson = new JScrollPane();
		scrollPanemodifyPerson.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanemodifyPerson.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanemodifyPerson = new GridBagConstraints();
		gbc_scrollPanemodifyPerson.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanemodifyPerson.gridwidth = 2;
		gbc_scrollPanemodifyPerson.fill = GridBagConstraints.BOTH;
		gbc_scrollPanemodifyPerson.gridx = 0;
		gbc_scrollPanemodifyPerson.gridy = 10;
		panelmodifyBill.add(scrollPanemodifyPerson, gbc_scrollPanemodifyPerson);
		
		JList listPerson = new JList();
		listPerson.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPanemodifyPerson.setViewportView(listPerson);
		
		JComboBox comboBoxsearchBillModify = new JComboBox();
		GridBagConstraints gbc_comboBoxsearchBillModify = new GridBagConstraints();
		gbc_comboBoxsearchBillModify.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxsearchBillModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxsearchBillModify.gridx = 0;
		gbc_comboBoxsearchBillModify.gridy = 11;
		panelmodifyBill.add(comboBoxsearchBillModify, gbc_comboBoxsearchBillModify);
		
		textFieldsearchBillModify = new JTextField();
		GridBagConstraints gbc_textFieldsearchBillModify = new GridBagConstraints();
		gbc_textFieldsearchBillModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldsearchBillModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldsearchBillModify.gridx = 1;
		gbc_textFieldsearchBillModify.gridy = 11;
		panelmodifyBill.add(textFieldsearchBillModify, gbc_textFieldsearchBillModify);
		textFieldsearchBillModify.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 12;
		panelmodifyBill.add(btnNewButton, gbc_btnNewButton);
		
		JPanel paneldeleteBill = new JPanel();
		tabbedPane.addTab("Rechnungen löschen", null, paneldeleteBill, null);
		GridBagLayout gbl_paneldeleteBill = new GridBagLayout();
		gbl_paneldeleteBill.columnWidths = new int[]{0, 0, 0, 0};
		gbl_paneldeleteBill.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_paneldeleteBill.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_paneldeleteBill.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		paneldeleteBill.setLayout(gbl_paneldeleteBill);
		
		JScrollPane scrollPanedeletePerson = new JScrollPane();
		scrollPanedeletePerson.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanedeletePerson.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanedeletePerson = new GridBagConstraints();
		gbc_scrollPanedeletePerson.gridwidth = 3;
		gbc_scrollPanedeletePerson.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanedeletePerson.fill = GridBagConstraints.BOTH;
		gbc_scrollPanedeletePerson.gridx = 0;
		gbc_scrollPanedeletePerson.gridy = 0;
		paneldeleteBill.add(scrollPanedeletePerson, gbc_scrollPanedeletePerson);
		
		JList listdeletePerson = new JList();
		scrollPanedeletePerson.setViewportView(listdeletePerson);
		
		JComboBox comboBoxdeleteBillSearch = new JComboBox();
		comboBoxdeleteBillSearch.setModel(new DefaultComboBoxModel(new String[] {"Name", "Datum", "Status"}));
		GridBagConstraints gbc_comboBoxdeleteBillSearch = new GridBagConstraints();
		gbc_comboBoxdeleteBillSearch.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxdeleteBillSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxdeleteBillSearch.gridx = 0;
		gbc_comboBoxdeleteBillSearch.gridy = 1;
		paneldeleteBill.add(comboBoxdeleteBillSearch, gbc_comboBoxdeleteBillSearch);
		
		textFielddeleteBillSearch = new JTextField();
		GridBagConstraints gbc_textFielddeleteBillSearch = new GridBagConstraints();
		gbc_textFielddeleteBillSearch.gridwidth = 2;
		gbc_textFielddeleteBillSearch.insets = new Insets(0, 0, 5, 0);
		gbc_textFielddeleteBillSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFielddeleteBillSearch.gridx = 1;
		gbc_textFielddeleteBillSearch.gridy = 1;
		paneldeleteBill.add(textFielddeleteBillSearch, gbc_textFielddeleteBillSearch);
		textFielddeleteBillSearch.setColumns(10);
		
		JButton btndeleteBillSearch = new JButton("Suchen");
		GridBagConstraints gbc_btndeleteBillSearch = new GridBagConstraints();
		gbc_btndeleteBillSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteBillSearch.gridwidth = 2;
		gbc_btndeleteBillSearch.insets = new Insets(0, 0, 5, 5);
		gbc_btndeleteBillSearch.gridx = 1;
		gbc_btndeleteBillSearch.gridy = 2;
		paneldeleteBill.add(btndeleteBillSearch, gbc_btndeleteBillSearch);
		
		JButton btndeleteBill = new JButton("Rechnung/en löschen");
		GridBagConstraints gbc_btndeleteBill = new GridBagConstraints();
		gbc_btndeleteBill.gridwidth = 2;
		gbc_btndeleteBill.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteBill.gridx = 1;
		gbc_btndeleteBill.gridy = 3;
		paneldeleteBill.add(btndeleteBill, gbc_btndeleteBill);
		
		JPanel panelcashRegister_JarManagement = new JPanel();
		tabbedPane.addTab("Topf und Kassen Verwaltung", null, panelcashRegister_JarManagement, null);
		GridBagLayout gbl_panelcashRegister_JarManagement = new GridBagLayout();
		gbl_panelcashRegister_JarManagement.columnWidths = new int[]{0, 0};
		gbl_panelcashRegister_JarManagement.rowHeights = new int[]{0, 0};
		gbl_panelcashRegister_JarManagement.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panelcashRegister_JarManagement.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panelcashRegister_JarManagement.setLayout(gbl_panelcashRegister_JarManagement);
		
		JTabbedPane tabbedPanecashRegister_JarManagement = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPanecashRegister_JarManagement = new GridBagConstraints();
		gbc_tabbedPanecashRegister_JarManagement.fill = GridBagConstraints.BOTH;
		gbc_tabbedPanecashRegister_JarManagement.gridx = 0;
		gbc_tabbedPanecashRegister_JarManagement.gridy = 0;
		panelcashRegister_JarManagement.add(tabbedPanecashRegister_JarManagement, gbc_tabbedPanecashRegister_JarManagement);
		
		JPanel panelJarManagement = new JPanel();
		tabbedPanecashRegister_JarManagement.addTab("Topf verwalten", null, panelJarManagement, null);
		GridBagLayout gbl_panelJarManagement = new GridBagLayout();
		gbl_panelJarManagement.columnWidths = new int[]{0, 0, 0, 87, 0, 0, 0};
		gbl_panelJarManagement.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelJarManagement.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelJarManagement.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelJarManagement.setLayout(gbl_panelJarManagement);
		
		JLabel lbljarName = new JLabel("Topfname");
		GridBagConstraints gbc_lbljarName = new GridBagConstraints();
		gbc_lbljarName.gridwidth = 2;
		gbc_lbljarName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbljarName.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarName.gridx = 0;
		gbc_lbljarName.gridy = 0;
		panelJarManagement.add(lbljarName, gbc_lbljarName);
		
		textFieldjarName = new JTextField();
		GridBagConstraints gbc_textFieldjarName = new GridBagConstraints();
		gbc_textFieldjarName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldjarName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarName.gridx = 2;
		gbc_textFieldjarName.gridy = 0;
		panelJarManagement.add(textFieldjarName, gbc_textFieldjarName);
		textFieldjarName.setColumns(10);
		
		JLabel lbljarNameModify = new JLabel("Topfname");
		GridBagConstraints gbc_lbljarNameModify = new GridBagConstraints();
		gbc_lbljarNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarNameModify.gridx = 3;
		gbc_lbljarNameModify.gridy = 0;
		panelJarManagement.add(lbljarNameModify, gbc_lbljarNameModify);
		
		textFieldjarNameModify = new JTextField();
		GridBagConstraints gbc_textFieldjarNameModify = new GridBagConstraints();
		gbc_textFieldjarNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldjarNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarNameModify.gridx = 5;
		gbc_textFieldjarNameModify.gridy = 0;
		panelJarManagement.add(textFieldjarNameModify, gbc_textFieldjarNameModify);
		textFieldjarNameModify.setColumns(10);
		
		JLabel lbljarActualStock = new JLabel("Ist-Bestand");
		GridBagConstraints gbc_lbljarActualStock = new GridBagConstraints();
		gbc_lbljarActualStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbljarActualStock.gridwidth = 2;
		gbc_lbljarActualStock.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarActualStock.gridx = 0;
		gbc_lbljarActualStock.gridy = 1;
		panelJarManagement.add(lbljarActualStock, gbc_lbljarActualStock);
		
		textFieldjarActualStock = new JTextField();
		GridBagConstraints gbc_textFieldjarActualStock = new GridBagConstraints();
		gbc_textFieldjarActualStock.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldjarActualStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarActualStock.gridx = 2;
		gbc_textFieldjarActualStock.gridy = 1;
		panelJarManagement.add(textFieldjarActualStock, gbc_textFieldjarActualStock);
		textFieldjarActualStock.setColumns(10);
		
		JLabel lbljarActualStockModify = new JLabel("Ist-Bestand");
		GridBagConstraints gbc_lbljarActualStockModify = new GridBagConstraints();
		gbc_lbljarActualStockModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarActualStockModify.gridx = 3;
		gbc_lbljarActualStockModify.gridy = 1;
		panelJarManagement.add(lbljarActualStockModify, gbc_lbljarActualStockModify);
		
		textFieldjarActualStockModify = new JTextField();
		GridBagConstraints gbc_textFieldjarActualStockModify = new GridBagConstraints();
		gbc_textFieldjarActualStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldjarActualStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarActualStockModify.gridx = 5;
		gbc_textFieldjarActualStockModify.gridy = 1;
		panelJarManagement.add(textFieldjarActualStockModify, gbc_textFieldjarActualStockModify);
		textFieldjarActualStockModify.setColumns(10);
		
		JLabel lbljarEstimatedStock = new JLabel("Soll-Bestand");
		GridBagConstraints gbc_lbljarEstimatedStock = new GridBagConstraints();
		gbc_lbljarEstimatedStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbljarEstimatedStock.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarEstimatedStock.gridx = 0;
		gbc_lbljarEstimatedStock.gridy = 2;
		panelJarManagement.add(lbljarEstimatedStock, gbc_lbljarEstimatedStock);
		
		textFieldjarEstimatedStock = new JTextField();
		GridBagConstraints gbc_textFieldjarEstimatedStock = new GridBagConstraints();
		gbc_textFieldjarEstimatedStock.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldjarEstimatedStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarEstimatedStock.gridx = 2;
		gbc_textFieldjarEstimatedStock.gridy = 2;
		panelJarManagement.add(textFieldjarEstimatedStock, gbc_textFieldjarEstimatedStock);
		textFieldjarEstimatedStock.setColumns(10);
		
		JLabel lbljarEstimatedStockModify = new JLabel("Soll-Bestand");
		GridBagConstraints gbc_lbljarEstimatedStockModify = new GridBagConstraints();
		gbc_lbljarEstimatedStockModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarEstimatedStockModify.gridx = 3;
		gbc_lbljarEstimatedStockModify.gridy = 2;
		panelJarManagement.add(lbljarEstimatedStockModify, gbc_lbljarEstimatedStockModify);
		
		textFieldjarEstimatedStockModify = new JTextField();
		GridBagConstraints gbc_textFieldjarEstimatedStockModify = new GridBagConstraints();
		gbc_textFieldjarEstimatedStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldjarEstimatedStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarEstimatedStockModify.gridx = 5;
		gbc_textFieldjarEstimatedStockModify.gridy = 2;
		panelJarManagement.add(textFieldjarEstimatedStockModify, gbc_textFieldjarEstimatedStockModify);
		textFieldjarEstimatedStockModify.setColumns(10);
		
		JButton btnaddJar = new JButton("Topf hinzufügen");
		GridBagConstraints gbc_btnaddJar = new GridBagConstraints();
		gbc_btnaddJar.insets = new Insets(0, 0, 5, 5);
		gbc_btnaddJar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddJar.gridx = 2;
		gbc_btnaddJar.gridy = 3;
		panelJarManagement.add(btnaddJar, gbc_btnaddJar);
		
		JButton btnjarSaveChanges = new JButton("Änderungen speichern");
		GridBagConstraints gbc_btnjarSaveChanges = new GridBagConstraints();
		gbc_btnjarSaveChanges.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnjarSaveChanges.insets = new Insets(0, 0, 5, 0);
		gbc_btnjarSaveChanges.gridx = 5;
		gbc_btnjarSaveChanges.gridy = 3;
		panelJarManagement.add(btnjarSaveChanges, gbc_btnjarSaveChanges);
		
		JButton btnjarClearInputs = new JButton("Eingaben löschen");
		GridBagConstraints gbc_btnjarClearInputs = new GridBagConstraints();
		gbc_btnjarClearInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnjarClearInputs.insets = new Insets(0, 0, 5, 5);
		gbc_btnjarClearInputs.gridx = 2;
		gbc_btnjarClearInputs.gridy = 4;
		panelJarManagement.add(btnjarClearInputs, gbc_btnjarClearInputs);
		
		JScrollPane scrollPanejar = new JScrollPane();
		scrollPanejar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanejar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanejar = new GridBagConstraints();
		gbc_scrollPanejar.gridwidth = 6;
		gbc_scrollPanejar.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanejar.fill = GridBagConstraints.BOTH;
		gbc_scrollPanejar.gridx = 0;
		gbc_scrollPanejar.gridy = 6;
		panelJarManagement.add(scrollPanejar, gbc_scrollPanejar);
		
		JList listjar = new JList();
		scrollPanejar.setViewportView(listjar);
		
		JButton btnjarDelete = new JButton("Topf löschen");
		GridBagConstraints gbc_btnjarDelete = new GridBagConstraints();
		gbc_btnjarDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnjarDelete.gridwidth = 6;
		gbc_btnjarDelete.gridx = 0;
		gbc_btnjarDelete.gridy = 7;
		panelJarManagement.add(btnjarDelete, gbc_btnjarDelete);
		
		JPanel panelcashRegisterManagement = new JPanel();
		tabbedPanecashRegister_JarManagement.addTab("Kassen verwalten", null, panelcashRegisterManagement, null);
		GridBagLayout gbl_panelcashRegisterManagement = new GridBagLayout();
		gbl_panelcashRegisterManagement.columnWidths = new int[]{0, 0, 0, 87, 0, 0, 0};
		gbl_panelcashRegisterManagement.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelcashRegisterManagement.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelcashRegisterManagement.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelcashRegisterManagement.setLayout(gbl_panelcashRegisterManagement);
		
		JLabel lblcashRegisterName = new JLabel("Kassenname");
		GridBagConstraints gbc_lblcashRegisterName = new GridBagConstraints();
		gbc_lblcashRegisterName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblcashRegisterName.gridwidth = 2;
		gbc_lblcashRegisterName.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterName.gridx = 0;
		gbc_lblcashRegisterName.gridy = 0;
		panelcashRegisterManagement.add(lblcashRegisterName, gbc_lblcashRegisterName);
		
		textFieldcashRegisterName = new JTextField();
		textFieldcashRegisterName.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterName = new GridBagConstraints();
		gbc_textFieldcashRegisterName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldcashRegisterName.gridx = 2;
		gbc_textFieldcashRegisterName.gridy = 0;
		panelcashRegisterManagement.add(textFieldcashRegisterName, gbc_textFieldcashRegisterName);
		
		JLabel lblcashRegisterNameModify = new JLabel("Kassenname");
		GridBagConstraints gbc_lblcashRegisterNameModify = new GridBagConstraints();
		gbc_lblcashRegisterNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterNameModify.gridx = 3;
		gbc_lblcashRegisterNameModify.gridy = 0;
		panelcashRegisterManagement.add(lblcashRegisterNameModify, gbc_lblcashRegisterNameModify);
		
		textFieldCashRegisterNameModify = new JTextField();
		textFieldCashRegisterNameModify.setEditable(false);
		textFieldCashRegisterNameModify.setColumns(10);
		GridBagConstraints gbc_textFieldCashRegisterNameModify = new GridBagConstraints();
		gbc_textFieldCashRegisterNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCashRegisterNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCashRegisterNameModify.gridx = 5;
		gbc_textFieldCashRegisterNameModify.gridy = 0;
		panelcashRegisterManagement.add(textFieldCashRegisterNameModify, gbc_textFieldCashRegisterNameModify);
		
		JLabel lblcashRegisterTyp = new JLabel("Typ");
		GridBagConstraints gbc_lblcashRegisterTyp = new GridBagConstraints();
		gbc_lblcashRegisterTyp.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterTyp.gridx = 0;
		gbc_lblcashRegisterTyp.gridy = 1;
		panelcashRegisterManagement.add(lblcashRegisterTyp, gbc_lblcashRegisterTyp);
		
		JComboBox comboBoxcashRegisterTyp = new JComboBox();
		comboBoxcashRegisterTyp.setModel(new DefaultComboBoxModel(new String[] {"Barkasse", "Konto", "Kostenstelle"}));
		GridBagConstraints gbc_comboBoxcashRegisterTyp = new GridBagConstraints();
		gbc_comboBoxcashRegisterTyp.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxcashRegisterTyp.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxcashRegisterTyp.gridx = 2;
		gbc_comboBoxcashRegisterTyp.gridy = 1;
		panelcashRegisterManagement.add(comboBoxcashRegisterTyp, gbc_comboBoxcashRegisterTyp);
		
		JLabel lblcashRegisterTypModify = new JLabel("Typ");
		GridBagConstraints gbc_lblcashRegisterTypModify = new GridBagConstraints();
		gbc_lblcashRegisterTypModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterTypModify.gridx = 3;
		gbc_lblcashRegisterTypModify.gridy = 1;
		panelcashRegisterManagement.add(lblcashRegisterTypModify, gbc_lblcashRegisterTypModify);
		
		JComboBox comboBoxcashRegisterTypModify = new JComboBox();
		GridBagConstraints gbc_comboBoxcashRegisterTypModify = new GridBagConstraints();
		gbc_comboBoxcashRegisterTypModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxcashRegisterTypModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxcashRegisterTypModify.gridx = 5;
		gbc_comboBoxcashRegisterTypModify.gridy = 1;
		panelcashRegisterManagement.add(comboBoxcashRegisterTypModify, gbc_comboBoxcashRegisterTypModify);
		
		JLabel lblcashRegisterActualStock = new JLabel("Ist-Bestand");
		GridBagConstraints gbc_lblcashRegisterActualStock = new GridBagConstraints();
		gbc_lblcashRegisterActualStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblcashRegisterActualStock.gridwidth = 2;
		gbc_lblcashRegisterActualStock.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterActualStock.gridx = 0;
		gbc_lblcashRegisterActualStock.gridy = 2;
		panelcashRegisterManagement.add(lblcashRegisterActualStock, gbc_lblcashRegisterActualStock);
		
		textFieldcashRegisterActualStock = new JTextField();
		textFieldcashRegisterActualStock.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterActualStock = new GridBagConstraints();
		gbc_textFieldcashRegisterActualStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterActualStock.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldcashRegisterActualStock.gridx = 2;
		gbc_textFieldcashRegisterActualStock.gridy = 2;
		panelcashRegisterManagement.add(textFieldcashRegisterActualStock, gbc_textFieldcashRegisterActualStock);
		
		JLabel lblcashRegisterActualStockModify = new JLabel("Ist-Bestand");
		GridBagConstraints gbc_lblcashRegisterActualStockModify = new GridBagConstraints();
		gbc_lblcashRegisterActualStockModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterActualStockModify.gridx = 3;
		gbc_lblcashRegisterActualStockModify.gridy = 2;
		panelcashRegisterManagement.add(lblcashRegisterActualStockModify, gbc_lblcashRegisterActualStockModify);
		
		textFieldcashRegisterActualStockModify = new JTextField();
		textFieldcashRegisterActualStockModify.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterActualStockModify = new GridBagConstraints();
		gbc_textFieldcashRegisterActualStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterActualStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldcashRegisterActualStockModify.gridx = 5;
		gbc_textFieldcashRegisterActualStockModify.gridy = 2;
		panelcashRegisterManagement.add(textFieldcashRegisterActualStockModify, gbc_textFieldcashRegisterActualStockModify);
		
		JLabel lblcashRegisterEstimatedStock = new JLabel("Soll-Bestand");
		GridBagConstraints gbc_lblcashRegisterEstimatedStock = new GridBagConstraints();
		gbc_lblcashRegisterEstimatedStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblcashRegisterEstimatedStock.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterEstimatedStock.gridx = 0;
		gbc_lblcashRegisterEstimatedStock.gridy = 3;
		panelcashRegisterManagement.add(lblcashRegisterEstimatedStock, gbc_lblcashRegisterEstimatedStock);
		
		textFieldcashRegisterEstimatedStock = new JTextField();
		textFieldcashRegisterEstimatedStock.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterEstimatedStock = new GridBagConstraints();
		gbc_textFieldcashRegisterEstimatedStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterEstimatedStock.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldcashRegisterEstimatedStock.gridx = 2;
		gbc_textFieldcashRegisterEstimatedStock.gridy = 3;
		panelcashRegisterManagement.add(textFieldcashRegisterEstimatedStock, gbc_textFieldcashRegisterEstimatedStock);
		
		JLabel lblcashRegisterEstimatedStockModify = new JLabel("Soll-Bestand");
		GridBagConstraints gbc_lblcashRegisterEstimatedStockModify = new GridBagConstraints();
		gbc_lblcashRegisterEstimatedStockModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterEstimatedStockModify.gridx = 3;
		gbc_lblcashRegisterEstimatedStockModify.gridy = 3;
		panelcashRegisterManagement.add(lblcashRegisterEstimatedStockModify, gbc_lblcashRegisterEstimatedStockModify);
		
		textFieldcashRegisterEstimatedStockModify = new JTextField();
		textFieldcashRegisterEstimatedStockModify.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterEstimatedStockModify = new GridBagConstraints();
		gbc_textFieldcashRegisterEstimatedStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterEstimatedStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldcashRegisterEstimatedStockModify.gridx = 5;
		gbc_textFieldcashRegisterEstimatedStockModify.gridy = 3;
		panelcashRegisterManagement.add(textFieldcashRegisterEstimatedStockModify, gbc_textFieldcashRegisterEstimatedStockModify);
		
		JButton btnaddcashRegister = new JButton("Kasse hinzufügen");
		GridBagConstraints gbc_btnaddcashRegister = new GridBagConstraints();
		gbc_btnaddcashRegister.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddcashRegister.insets = new Insets(0, 0, 5, 5);
		gbc_btnaddcashRegister.gridx = 2;
		gbc_btnaddcashRegister.gridy = 4;
		panelcashRegisterManagement.add(btnaddcashRegister, gbc_btnaddcashRegister);
		
		JButton btncashRegisterSaveChanges = new JButton("Änderungen speichern");
		GridBagConstraints gbc_btncashRegisterSaveChanges = new GridBagConstraints();
		gbc_btncashRegisterSaveChanges.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncashRegisterSaveChanges.insets = new Insets(0, 0, 5, 0);
		gbc_btncashRegisterSaveChanges.gridx = 5;
		gbc_btncashRegisterSaveChanges.gridy = 4;
		panelcashRegisterManagement.add(btncashRegisterSaveChanges, gbc_btncashRegisterSaveChanges);
		
		JButton btncashRegisterClearInputs = new JButton("Eingaben löschen");
		GridBagConstraints gbc_btncashRegisterClearInputs = new GridBagConstraints();
		gbc_btncashRegisterClearInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncashRegisterClearInputs.insets = new Insets(0, 0, 5, 5);
		gbc_btncashRegisterClearInputs.gridx = 2;
		gbc_btncashRegisterClearInputs.gridy = 5;
		panelcashRegisterManagement.add(btncashRegisterClearInputs, gbc_btncashRegisterClearInputs);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 6;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 7;
		panelcashRegisterManagement.add(scrollPane, gbc_scrollPane);
		
		JLabel lblcashRegisterTypSearch = new JLabel("Typ");
		GridBagConstraints gbc_lblcashRegisterTypSearch = new GridBagConstraints();
		gbc_lblcashRegisterTypSearch.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterTypSearch.gridx = 0;
		gbc_lblcashRegisterTypSearch.gridy = 8;
		panelcashRegisterManagement.add(lblcashRegisterTypSearch, gbc_lblcashRegisterTypSearch);
		
		JComboBox comboBoxcashRegisterTypSearch = new JComboBox();
		comboBoxcashRegisterTypSearch.setModel(new DefaultComboBoxModel(new String[] {"Barkasse", "Konto", "Kostenstelle"}));
		GridBagConstraints gbc_comboBoxcashRegisterTypSearch = new GridBagConstraints();
		gbc_comboBoxcashRegisterTypSearch.gridwidth = 4;
		gbc_comboBoxcashRegisterTypSearch.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxcashRegisterTypSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxcashRegisterTypSearch.gridx = 2;
		gbc_comboBoxcashRegisterTypSearch.gridy = 8;
		panelcashRegisterManagement.add(comboBoxcashRegisterTypSearch, gbc_comboBoxcashRegisterTypSearch);
		
		JButton btncashRegisterDeleteSearch = new JButton("Suchen");
		GridBagConstraints gbc_btncashRegisterDeleteSearch = new GridBagConstraints();
		gbc_btncashRegisterDeleteSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncashRegisterDeleteSearch.gridwidth = 4;
		gbc_btncashRegisterDeleteSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btncashRegisterDeleteSearch.gridx = 2;
		gbc_btncashRegisterDeleteSearch.gridy = 9;
		panelcashRegisterManagement.add(btncashRegisterDeleteSearch, gbc_btncashRegisterDeleteSearch);
		
		JButton btncashRegisterDelete = new JButton("Kasse löschen");
		GridBagConstraints gbc_btncashRegisterDelete = new GridBagConstraints();
		gbc_btncashRegisterDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncashRegisterDelete.gridwidth = 6;
		gbc_btncashRegisterDelete.gridx = 0;
		gbc_btncashRegisterDelete.gridy = 10;
		panelcashRegisterManagement.add(btncashRegisterDelete, gbc_btncashRegisterDelete);
		
		JMenuBar menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);
		
		JMenu mnNewMenuOptions = new JMenu("Datei");
		menuBar.add(mnNewMenuOptions);
		
		JMenuItem mntmNewMenuItembacktoMain = new JMenuItem("Hauptmen\u00FC");
		mnNewMenuOptions.add(mntmNewMenuItembacktoMain);
		mntmNewMenuItembacktoMain.addActionListener(this);
		
		JMenuItem mntmNewMenuItemlogOut = new JMenuItem("Ausloggen");
		mnNewMenuOptions.add(mntmNewMenuItemlogOut);
		mntmNewMenuItemlogOut.addActionListener(this);
		
		JMenuItem mntmNewMenuItemcloseapplication = new JMenuItem("Anwendung verlassen");
		mnNewMenuOptions.add(mntmNewMenuItemcloseapplication);
		mntmNewMenuItembacktoMain.addActionListener(this);
		
		JMenu mnNewMenuhelpWindow = new JMenu("?");
		menuBar.add(mnNewMenuhelpWindow);
		
		JMenuItem mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);
		mntmNewMenuItemshowManual.addActionListener(this);
		frmElabVerwaltungsprogramm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		String command = e.getActionCommand();
		
		// Restliche Funktionen einbinden
		
		if (command == "Hauptmen\u00FC") {
			
		GuiMenue mainMenu= new GuiMenue();
		frmElabVerwaltungsprogramm.dispose();
		
		}
		
		if (command=="Ausloggen") {
		
		GuiLogin login = new GuiLogin();
		frmElabVerwaltungsprogramm.dispose();
			
			
		}
		
		if (command =="Anwendung verlassen") {
		
			System.exit(0);
			
		}
		
		if (command == "Anleitung anzeigen") {
			
			
		}
		
	}
}
