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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import logic.PersonManagement;

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
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;

public class GUIPersonalmanagement{

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
	private JTextField textFieldsearchModifyPerson;
	private JTextField textFieldsearchDeletePerson;
	private JTextField textFieldID;
	private JTextField textFieldIDModify;
	private JComboBox comboBoxType = new JComboBox();
	private JComboBox comboBoxTypeModify;
	private JTable table;
	private List<String> comboBoxEntries;
	private JTable TableDeletePerson;
	private GridBagConstraints gbc_btndeleteSearch;


	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public GUIPersonalmanagement() {
		comboBoxEntries= new ArrayList<String>();
		comboBoxEntries.add("Kunde");
		comboBoxEntries.add("Mitglied");
		comboBoxEntries.add("Lehrstuhlmitglied");
		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setExtendedState(Frame.MAXIMIZED_BOTH);
	
		frmElabVerwaltungsprogramm.setTitle("Elab Verwaltungsprogramm");
		frmElabVerwaltungsprogramm.setBounds(100, 100, 1036, 727);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		frmElabVerwaltungsprogramm.getContentPane().setLayout(gridBagLayout);
		
		
		
		
		JLabel lblPersonenverwaltung = new JLabel("Personenverwaltung");
		lblPersonenverwaltung.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblPersonenverwaltung = new GridBagConstraints();
		gbc_lblPersonenverwaltung.insets = new Insets(0, 0, 5, 0);
		gbc_lblPersonenverwaltung.gridx = 0;
		gbc_lblPersonenverwaltung.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblPersonenverwaltung, gbc_lblPersonenverwaltung);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(tabbedPane, gbc_tabbedPane);

		JPanel paneladdPerson = new JPanel();
		tabbedPane.addTab("Person hinzufügen", null, paneladdPerson, null);
		GridBagLayout gbl_paneladdPerson = new GridBagLayout();
		gbl_paneladdPerson.columnWidths = new int[]{179, 0, 0};
		gbl_paneladdPerson.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_paneladdPerson.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_paneladdPerson.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		paneladdPerson.setLayout(gbl_paneladdPerson);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		paneladdPerson.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblID = new JLabel("ID");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblID = new GridBagConstraints();
		gbc_lblID.anchor = GridBagConstraints.EAST;
		gbc_lblID.insets = new Insets(0, 0, 5, 5);
		gbc_lblID.gridx = 0;
		gbc_lblID.gridy = 1;
		paneladdPerson.add(lblID, gbc_lblID);

		textFieldID = new JTextField();
		textFieldID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldID.setEditable(false);
		GridBagConstraints gbc_textFieldID = new GridBagConstraints();
		gbc_textFieldID.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldID.gridx = 1;
		gbc_textFieldID.gridy = 1;
		paneladdPerson.add(textFieldID, gbc_textFieldID);
		textFieldID.setColumns(10);

		JLabel lblname = new JLabel("Vorname");
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblname = new GridBagConstraints();
		gbc_lblname.anchor = GridBagConstraints.EAST;
		gbc_lblname.insets = new Insets(0, 0, 5, 5);
		gbc_lblname.gridx = 0;
		gbc_lblname.gridy = 2;
		paneladdPerson.add(lblname, gbc_lblname);

		textFieldname = new JTextField();
		textFieldname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldname = new GridBagConstraints();
		gbc_textFieldname.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldname.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldname.gridx = 1;
		gbc_textFieldname.gridy = 2;
		paneladdPerson.add(textFieldname, gbc_textFieldname);
		textFieldname.setColumns(10);

		JLabel lbllastName = new JLabel("Nachname");
		lbllastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbllastName = new GridBagConstraints();
		gbc_lbllastName.anchor = GridBagConstraints.EAST;
		gbc_lbllastName.insets = new Insets(0, 0, 5, 5);
		gbc_lbllastName.gridx = 0;
		gbc_lbllastName.gridy = 3;
		paneladdPerson.add(lbllastName, gbc_lbllastName);

		textFieldlastName = new JTextField();
		textFieldlastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldlastName = new GridBagConstraints();
		gbc_textFieldlastName.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldlastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldlastName.gridx = 1;
		gbc_textFieldlastName.gridy = 3;
		paneladdPerson.add(textFieldlastName, gbc_textFieldlastName);
		textFieldlastName.setColumns(10);

		JLabel lblStreet = new JLabel("Straße");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblStreet = new GridBagConstraints();
		gbc_lblStreet.anchor = GridBagConstraints.EAST;
		gbc_lblStreet.insets = new Insets(0, 0, 5, 5);
		gbc_lblStreet.gridx = 0;
		gbc_lblStreet.gridy = 4;
		paneladdPerson.add(lblStreet, gbc_lblStreet);

		textFieldStreet = new JTextField();
		textFieldStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldStreet = new GridBagConstraints();
		gbc_textFieldStreet.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldStreet.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStreet.gridx = 1;
		gbc_textFieldStreet.gridy = 4;
		paneladdPerson.add(textFieldStreet, gbc_textFieldStreet);
		textFieldStreet.setColumns(10);

		JLabel lblhouseNumber = new JLabel("Hausnummer");
		lblhouseNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblhouseNumber = new GridBagConstraints();
		gbc_lblhouseNumber.anchor = GridBagConstraints.EAST;
		gbc_lblhouseNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblhouseNumber.gridx = 0;
		gbc_lblhouseNumber.gridy = 5;
		paneladdPerson.add(lblhouseNumber, gbc_lblhouseNumber);

		textFieldhouseNumber = new JTextField();
		textFieldhouseNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldhouseNumber = new GridBagConstraints();
		gbc_textFieldhouseNumber.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldhouseNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldhouseNumber.gridx = 1;
		gbc_textFieldhouseNumber.gridy = 5;
		paneladdPerson.add(textFieldhouseNumber, gbc_textFieldhouseNumber);
		textFieldhouseNumber.setColumns(10);

		JLabel lblzipCode = new JLabel("PLZ");
		lblzipCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblzipCode = new GridBagConstraints();
		gbc_lblzipCode.anchor = GridBagConstraints.EAST;
		gbc_lblzipCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblzipCode.gridx = 0;
		gbc_lblzipCode.gridy = 6;
		paneladdPerson.add(lblzipCode, gbc_lblzipCode);

		textFieldzipCode = new JTextField();
		textFieldzipCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldzipCode = new GridBagConstraints();
		gbc_textFieldzipCode.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldzipCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldzipCode.gridx = 1;
		gbc_textFieldzipCode.gridy = 6;
		paneladdPerson.add(textFieldzipCode, gbc_textFieldzipCode);
		textFieldzipCode.setColumns(10);

		JLabel lbleMail = new JLabel("E-Mail Adresse");
		lbleMail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbleMail = new GridBagConstraints();
		gbc_lbleMail.anchor = GridBagConstraints.EAST;
		gbc_lbleMail.insets = new Insets(0, 0, 5, 5);
		gbc_lbleMail.gridx = 0;
		gbc_lbleMail.gridy = 7;
		paneladdPerson.add(lbleMail, gbc_lbleMail);

		textFieldeMail = new JTextField();
		GridBagConstraints gbc_textFieldeMail = new GridBagConstraints();
		gbc_textFieldeMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldeMail.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldeMail.gridx = 1;
		gbc_textFieldeMail.gridy = 7;
		paneladdPerson.add(textFieldeMail, gbc_textFieldeMail);
		textFieldeMail.setColumns(10);

		JLabel lblTyp = new JLabel("Personenart");
		lblTyp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTyp = new GridBagConstraints();
		gbc_lblTyp.anchor = GridBagConstraints.EAST;
		gbc_lblTyp.insets = new Insets(0, 0, 5, 5);
		gbc_lblTyp.gridx = 0;
		gbc_lblTyp.gridy = 8;
		paneladdPerson.add(lblTyp, gbc_lblTyp);
		comboBoxType.setFont(new Font("Tahoma", Font.PLAIN, 15));

		comboBoxType.setModel(new DefaultComboBoxModel(comboBoxEntries.toArray()));
		GridBagConstraints gbc_comboBoxType = new GridBagConstraints();
		gbc_comboBoxType.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxType.gridx = 1;
		gbc_comboBoxType.gridy = 8;
		paneladdPerson.add(comboBoxType, gbc_comboBoxType);

		JLabel lbluserName = new JLabel("Username");
		lbluserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbluserName = new GridBagConstraints();
		gbc_lbluserName.anchor = GridBagConstraints.EAST;
		gbc_lbluserName.insets = new Insets(0, 0, 5, 5);
		gbc_lbluserName.gridx = 0;
		gbc_lbluserName.gridy = 9;
		paneladdPerson.add(lbluserName, gbc_lbluserName);

		textFielduserName = new JTextField();
		textFielduserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFielduserName = new GridBagConstraints();
		gbc_textFielduserName.insets = new Insets(0, 0, 5, 0);
		gbc_textFielduserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFielduserName.gridx = 1;
		gbc_textFielduserName.gridy = 9;
		paneladdPerson.add(textFielduserName, gbc_textFielduserName);
		textFielduserName.setColumns(10);

		JLabel lblPassword = new JLabel("Passwort");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 10;
		paneladdPerson.add(lblPassword, gbc_lblPassword);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 10;
		paneladdPerson.add(passwordField, gbc_passwordField);

		JButton btnaddPerson = new JButton("Person hinzufügen");
		btnaddPerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnaddPerson.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					PersonManagement.addPerson(textFieldname.getText(), textFieldlastName.getText(), textFieldStreet.getText(), Integer.parseInt(textFieldhouseNumber.getText()),
							Integer.parseInt(textFieldzipCode.getText()),textFieldeMail.getText(), textFielduserName.getText(), String.valueOf(passwordField.getPassword()), comboBoxType.getSelectedIndex());
					refreshTable();
					refreshTableDeletePerson();
				} 
				catch (Exception a) {
					a.printStackTrace();

				}
			}
		});

		GridBagConstraints gbc_btnaddPerson = new GridBagConstraints();
		gbc_btnaddPerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddPerson.insets = new Insets(0, 0, 5, 0);
		gbc_btnaddPerson.gridx = 1;
		gbc_btnaddPerson.gridy = 11;
		paneladdPerson.add(btnaddPerson, gbc_btnaddPerson);

		JButton btndeleteallInputs = new JButton("Eingaben löschen");
		btndeleteallInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btndeleteallInputs = new GridBagConstraints();
		btndeleteallInputs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldname.setText("");
				textFieldlastName.setText("");
				textFieldStreet.setText("");
				textFieldhouseNumber.setText("");
				textFieldzipCode.setText("");
				textFieldeMail.setText("");
				comboBoxType.setSelectedIndex(0);
				textFielduserName.setText("");
				passwordField.setText("");
			}
		});
		gbc_btndeleteallInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputs.gridx = 1;
		gbc_btndeleteallInputs.gridy = 12;
		paneladdPerson.add(btndeleteallInputs, gbc_btndeleteallInputs);

		JLabel lbleLabpicture = new JLabel("");
		lbleLabpicture.setIcon(new ImageIcon("C:\\Users\\Nils\\git\\ProPraElab\\ProPraElab\\pictures\\elab.png"));
		GridBagConstraints gbc_lbleLabpicture = new GridBagConstraints();
		gbc_lbleLabpicture.gridwidth = 2;
		gbc_lbleLabpicture.gridx = 0;
		gbc_lbleLabpicture.gridy = 13;
		paneladdPerson.add(lbleLabpicture, gbc_lbleLabpicture);

		JPanel panelmodifyPerson = new JPanel();
		tabbedPane.addTab("Person bearbeiten", null, panelmodifyPerson, null);
		GridBagLayout gbl_panelmodifyPerson = new GridBagLayout();
		gbl_panelmodifyPerson.columnWidths = new int[]{164, 0, 0};
		gbl_panelmodifyPerson.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 152, 0, 0, 0, 0};
		gbl_panelmodifyPerson.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panelmodifyPerson.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelmodifyPerson.setLayout(gbl_panelmodifyPerson);

		JLabel lblIDModify = new JLabel("ID");
		lblIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblIDModify = new GridBagConstraints();
		gbc_lblIDModify.anchor = GridBagConstraints.EAST;
		gbc_lblIDModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblIDModify.gridx = 0;
		gbc_lblIDModify.gridy = 0;
		panelmodifyPerson.add(lblIDModify, gbc_lblIDModify);

		textFieldIDModify = new JTextField();
		textFieldIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldIDModify.setEditable(false);
		textFieldIDModify.setText("");
		GridBagConstraints gbc_textFieldIDModify = new GridBagConstraints();
		gbc_textFieldIDModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldIDModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldIDModify.gridx = 1;
		gbc_textFieldIDModify.gridy = 0;
		panelmodifyPerson.add(textFieldIDModify, gbc_textFieldIDModify);
		textFieldIDModify.setColumns(10);

		JLabel lblnameModify = new JLabel("Vorname");
		lblnameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblnameModify = new GridBagConstraints();
		gbc_lblnameModify.anchor = GridBagConstraints.EAST;
		gbc_lblnameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblnameModify.gridx = 0;
		gbc_lblnameModify.gridy = 1;
		panelmodifyPerson.add(lblnameModify, gbc_lblnameModify);

		textFieldnameModify = new JTextField();
		textFieldnameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldnameModify = new GridBagConstraints();
		gbc_textFieldnameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldnameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldnameModify.gridx = 1;
		gbc_textFieldnameModify.gridy = 1;
		panelmodifyPerson.add(textFieldnameModify, gbc_textFieldnameModify);
		textFieldnameModify.setColumns(10);

		JLabel lbllastNameModify = new JLabel("Nachname");
		lbllastNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbllastNameModify = new GridBagConstraints();
		gbc_lbllastNameModify.anchor = GridBagConstraints.EAST;
		gbc_lbllastNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbllastNameModify.gridx = 0;
		gbc_lbllastNameModify.gridy = 2;
		panelmodifyPerson.add(lbllastNameModify, gbc_lbllastNameModify);

		textFieldlastNameModify = new JTextField();
		textFieldlastNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldlastNameModify = new GridBagConstraints();
		gbc_textFieldlastNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldlastNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldlastNameModify.gridx = 1;
		gbc_textFieldlastNameModify.gridy = 2;
		panelmodifyPerson.add(textFieldlastNameModify, gbc_textFieldlastNameModify);
		textFieldlastNameModify.setColumns(10);

		JLabel lblstreetModify = new JLabel("Straße");
		lblstreetModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblstreetModify = new GridBagConstraints();
		gbc_lblstreetModify.anchor = GridBagConstraints.EAST;
		gbc_lblstreetModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblstreetModify.gridx = 0;
		gbc_lblstreetModify.gridy = 3;
		panelmodifyPerson.add(lblstreetModify, gbc_lblstreetModify);

		textFieldstreetModify = new JTextField();
		textFieldstreetModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldstreetModify = new GridBagConstraints();
		gbc_textFieldstreetModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldstreetModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldstreetModify.gridx = 1;
		gbc_textFieldstreetModify.gridy = 3;
		panelmodifyPerson.add(textFieldstreetModify, gbc_textFieldstreetModify);
		textFieldstreetModify.setColumns(10);

		JLabel lblhouseNumberModify = new JLabel("Hausnummer");
		lblhouseNumberModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblhouseNumberModify = new GridBagConstraints();
		gbc_lblhouseNumberModify.anchor = GridBagConstraints.EAST;
		gbc_lblhouseNumberModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblhouseNumberModify.gridx = 0;
		gbc_lblhouseNumberModify.gridy = 4;
		panelmodifyPerson.add(lblhouseNumberModify, gbc_lblhouseNumberModify);

		textFieldhouseNumberModify = new JTextField();
		textFieldhouseNumberModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldhouseNumberModify = new GridBagConstraints();
		gbc_textFieldhouseNumberModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldhouseNumberModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldhouseNumberModify.gridx = 1;
		gbc_textFieldhouseNumberModify.gridy = 4;
		panelmodifyPerson.add(textFieldhouseNumberModify, gbc_textFieldhouseNumberModify);
		textFieldhouseNumberModify.setColumns(10);

		JLabel lblzipCodeModify = new JLabel("PLZ");
		lblzipCodeModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblzipCodeModify = new GridBagConstraints();
		gbc_lblzipCodeModify.anchor = GridBagConstraints.EAST;
		gbc_lblzipCodeModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblzipCodeModify.gridx = 0;
		gbc_lblzipCodeModify.gridy = 5;
		panelmodifyPerson.add(lblzipCodeModify, gbc_lblzipCodeModify);

		textFieldzipCodeModify = new JTextField();
		textFieldzipCodeModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldzipCodeModify = new GridBagConstraints();
		gbc_textFieldzipCodeModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldzipCodeModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldzipCodeModify.gridx = 1;
		gbc_textFieldzipCodeModify.gridy = 5;
		panelmodifyPerson.add(textFieldzipCodeModify, gbc_textFieldzipCodeModify);
		textFieldzipCodeModify.setColumns(10);

		JLabel lbleMailModify = new JLabel("E-Mail Adresse");
		lbleMailModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbleMailModify = new GridBagConstraints();
		gbc_lbleMailModify.anchor = GridBagConstraints.EAST;
		gbc_lbleMailModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbleMailModify.gridx = 0;
		gbc_lbleMailModify.gridy = 6;
		panelmodifyPerson.add(lbleMailModify, gbc_lbleMailModify);

		textFieldeMailModify = new JTextField();
		textFieldeMailModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldeMailModify = new GridBagConstraints();
		gbc_textFieldeMailModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldeMailModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldeMailModify.gridx = 1;
		gbc_textFieldeMailModify.gridy = 6;
		panelmodifyPerson.add(textFieldeMailModify, gbc_textFieldeMailModify);
		textFieldeMailModify.setColumns(10);

		JLabel lbltypModify = new JLabel("Personenart");
		lbltypModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbltypModify = new GridBagConstraints();
		gbc_lbltypModify.anchor = GridBagConstraints.EAST;
		gbc_lbltypModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbltypModify.gridx = 0;
		gbc_lbltypModify.gridy = 7;
		panelmodifyPerson.add(lbltypModify, gbc_lbltypModify);

		comboBoxTypeModify = new JComboBox();
		comboBoxTypeModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxTypeModify.setModel(new DefaultComboBoxModel(comboBoxEntries.toArray()));
		GridBagConstraints gbc_comboBoxTypeModify = new GridBagConstraints();
		gbc_comboBoxTypeModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxTypeModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTypeModify.gridx = 1;
		gbc_comboBoxTypeModify.gridy = 7;
		panelmodifyPerson.add(comboBoxTypeModify, gbc_comboBoxTypeModify);

		JLabel lbluserNameModify = new JLabel("Username");
		lbluserNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbluserNameModify = new GridBagConstraints();
		gbc_lbluserNameModify.anchor = GridBagConstraints.EAST;
		gbc_lbluserNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbluserNameModify.gridx = 0;
		gbc_lbluserNameModify.gridy = 8;
		panelmodifyPerson.add(lbluserNameModify, gbc_lbluserNameModify);

		textFielduserNameModify = new JTextField();
		textFielduserNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFielduserNameModify = new GridBagConstraints();
		gbc_textFielduserNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFielduserNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFielduserNameModify.gridx = 1;
		gbc_textFielduserNameModify.gridy = 8;
		panelmodifyPerson.add(textFielduserNameModify, gbc_textFielduserNameModify);
		textFielduserNameModify.setColumns(10);

		JLabel lblpasswordModify = new JLabel("Passwort");
		lblpasswordModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpasswordModify = new GridBagConstraints();
		gbc_lblpasswordModify.anchor = GridBagConstraints.EAST;
		gbc_lblpasswordModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblpasswordModify.gridx = 0;
		gbc_lblpasswordModify.gridy = 9;
		panelmodifyPerson.add(lblpasswordModify, gbc_lblpasswordModify);

		passwordFieldModify = new JPasswordField();
		passwordFieldModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_passwordFieldModify = new GridBagConstraints();
		gbc_passwordFieldModify.insets = new Insets(0, 0, 5, 0);
		gbc_passwordFieldModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordFieldModify.gridx = 1;
		gbc_passwordFieldModify.gridy = 9;
		panelmodifyPerson.add(passwordFieldModify, gbc_passwordFieldModify);

		JButton btnsaveModifiedValues = new JButton("Änderungen speichern");
		btnsaveModifiedValues.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnsaveModifiedValues.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					PersonManagement.modifyPerson(Integer.parseInt(textFieldIDModify.getText()), textFieldnameModify.getText(), textFieldlastNameModify.getText(), textFieldstreetModify.getText(), Integer.parseInt(textFieldhouseNumberModify.getText()), Integer.parseInt(textFieldzipCodeModify.getText()), textFieldeMailModify.getText(), textFielduserNameModify.getText(), new String(passwordFieldModify.getPassword()), comboBoxTypeModify.getSelectedIndex());
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refreshTable();
				refreshTableDeletePerson();
			}
		});

		GridBagConstraints gbc_btnsaveModifiedValues = new GridBagConstraints();
		gbc_btnsaveModifiedValues.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsaveModifiedValues.insets = new Insets(0, 0, 5, 0);
		gbc_btnsaveModifiedValues.gridx = 1;
		gbc_btnsaveModifiedValues.gridy = 10;
		panelmodifyPerson.add(btnsaveModifiedValues, gbc_btnsaveModifiedValues);

		JScrollPane scrollPanemodifyPerson = new JScrollPane();
		scrollPanemodifyPerson.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanemodifyPerson.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanemodifyPerson = new GridBagConstraints();
		gbc_scrollPanemodifyPerson.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanemodifyPerson.gridwidth = 2;
		gbc_scrollPanemodifyPerson.fill = GridBagConstraints.BOTH;
		gbc_scrollPanemodifyPerson.gridx = 0;
		gbc_scrollPanemodifyPerson.gridy = 11;
		panelmodifyPerson.add(scrollPanemodifyPerson, gbc_scrollPanemodifyPerson);

		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		try {
			table.setModel(new PersonTableModel(PersonManagement.getPersons()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPanemodifyPerson.setViewportView(table);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				handleEditPersonSelectionEvent(e);

			}
		});
		table.clearSelection();
		//scrollPanemodifyPerson.add(table);


		JComboBox comboBoxsearchModifyPerson = new JComboBox();
		comboBoxsearchModifyPerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxsearchModifyPerson.setModel(new DefaultComboBoxModel(new String[] {"Vorname", "Nachname", "Mitgliedschaft"}));
		GridBagConstraints gbc_comboBoxsearchModifyPerson = new GridBagConstraints();
		gbc_comboBoxsearchModifyPerson.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxsearchModifyPerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxsearchModifyPerson.gridx = 0;
		gbc_comboBoxsearchModifyPerson.gridy = 12;
		panelmodifyPerson.add(comboBoxsearchModifyPerson, gbc_comboBoxsearchModifyPerson);

		textFieldsearchModifyPerson = new JTextField();
		textFieldsearchModifyPerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldsearchModifyPerson = new GridBagConstraints();
		gbc_textFieldsearchModifyPerson.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldsearchModifyPerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldsearchModifyPerson.gridx = 1;
		gbc_textFieldsearchModifyPerson.gridy = 12;
		panelmodifyPerson.add(textFieldsearchModifyPerson, gbc_textFieldsearchModifyPerson);
		textFieldsearchModifyPerson.setColumns(10);

		JButton btnsearchModifyPerson = new JButton("Suchen");
		btnsearchModifyPerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnsearchModifyPerson = new GridBagConstraints();
		btnsearchModifyPerson.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String searchValue = textFieldsearchModifyPerson.getText();
				switch(comboBoxsearchModifyPerson.getSelectedIndex()) {
				case 0:
					try {
						table.setModel(new PersonTableModel(PersonManagement.getPersonsByName(searchValue)));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 1:
					try {
						table.setModel(new PersonTableModel(PersonManagement.getPersonsByLastname(searchValue)));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 2:
					try {
						table.setModel(new PersonTableModel(PersonManagement.getPersonsByRights(searchValue)));
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				}
			}
		});
		gbc_btnsearchModifyPerson.insets = new Insets(0, 0, 5, 0);
		gbc_btnsearchModifyPerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsearchModifyPerson.gridx = 1;
		gbc_btnsearchModifyPerson.gridy = 13;
		panelmodifyPerson.add(btnsearchModifyPerson, gbc_btnsearchModifyPerson);

		JButton btnSearchRemove = new JButton("Suche aufheben");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		btnSearchRemove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					table.setModel(new PersonTableModel(PersonManagement.getPersons()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 14;
		panelmodifyPerson.add(btnSearchRemove, gbc_btnNewButton);

		JPanel paneldeletePerson = new JPanel();
		tabbedPane.addTab("Personen löschen", null, paneldeletePerson, null);
		GridBagLayout gbl_paneldeletePerson = new GridBagLayout();
		gbl_paneldeletePerson.columnWidths = new int[]{168, 0, 0};
		gbl_paneldeletePerson.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_paneldeletePerson.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_paneldeletePerson.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		paneldeletePerson.setLayout(gbl_paneldeletePerson);

		JScrollPane scrollPanedeletePerson = new JScrollPane();
		scrollPanedeletePerson.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanedeletePerson.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanedeletePerson = new GridBagConstraints();
		gbc_scrollPanedeletePerson.gridwidth = 2;
		gbc_scrollPanedeletePerson.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanedeletePerson.fill = GridBagConstraints.BOTH;
		gbc_scrollPanedeletePerson.gridx = 0;
		gbc_scrollPanedeletePerson.gridy = 0;
		paneldeletePerson.add(scrollPanedeletePerson, gbc_scrollPanedeletePerson);

		TableDeletePerson = new JTable();
		scrollPanedeletePerson.setColumnHeaderView(TableDeletePerson);
		try {
			TableDeletePerson.setModel(new PersonTableModel(PersonManagement.getPersons()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		TableDeletePerson.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPanedeletePerson.setViewportView(TableDeletePerson);
		TableDeletePerson.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				handleEditPersonSelectionEvent(e);

			}
		});
		TableDeletePerson.clearSelection();

		JComboBox comboBoxsearchDeletePerson = new JComboBox();
		comboBoxsearchDeletePerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxsearchDeletePerson.setModel(new DefaultComboBoxModel(new String[] {"Vorname", "Nachname"}));
		GridBagConstraints gbc_comboBoxsearchDeletePerson = new GridBagConstraints();
		gbc_comboBoxsearchDeletePerson.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxsearchDeletePerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxsearchDeletePerson.gridx = 0;
		gbc_comboBoxsearchDeletePerson.gridy = 1;
		paneldeletePerson.add(comboBoxsearchDeletePerson, gbc_comboBoxsearchDeletePerson);

		textFieldsearchDeletePerson = new JTextField();
		textFieldsearchDeletePerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldsearchDeletePerson = new GridBagConstraints();
		gbc_textFieldsearchDeletePerson.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldsearchDeletePerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldsearchDeletePerson.gridx = 1;
		gbc_textFieldsearchDeletePerson.gridy = 1;
		paneldeletePerson.add(textFieldsearchDeletePerson, gbc_textFieldsearchDeletePerson);
		textFieldsearchDeletePerson.setColumns(10);

		JButton btnsearchDeletePerson = new JButton("Person Suchen");
		btnsearchDeletePerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnsearchDeletePerson = new GridBagConstraints();
		gbc_btnsearchDeletePerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsearchDeletePerson.insets = new Insets(0, 0, 5, 0);
		gbc_btnsearchDeletePerson.gridx = 1;
		gbc_btnsearchDeletePerson.gridy = 2;
		paneldeletePerson.add(btnsearchDeletePerson, gbc_btnsearchDeletePerson);

		JButton btndeletePerson = new JButton("Person löschen");
		btndeletePerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btndeletePerson = new GridBagConstraints();
		btndeletePerson.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					PersonManagement.deletePerson(Integer.parseInt(TableDeletePerson.getValueAt(TableDeletePerson.getSelectedRow(), 0).toString()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refreshTableDeletePerson();
				refreshTable();
			}
		});
		
		JButton btndeleteSearch = new JButton("Suche löschen");
		btndeleteSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnNewButton;
		gbc_btndeleteSearch = new GridBagConstraints();
		gbc_btndeleteSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteSearch.gridx = 1;
		gbc_btndeleteSearch.gridy = 3;
		paneldeletePerson.add(btndeleteSearch, gbc_btndeleteSearch);
		gbc_btndeletePerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeletePerson.gridx = 1;
		gbc_btndeletePerson.gridy = 4;
		paneldeletePerson.add(btndeletePerson, gbc_btndeletePerson);

		JMenuBar menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);

		JMenu mnNewMenuOptions = new JMenu("Menü");
		mnNewMenuOptions.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuOptions);

		JMenuItem mntmNewMenuItembacktoMain = new JMenuItem("Hauptmenü");
		mntmNewMenuItembacktoMain.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuOptions.add(mntmNewMenuItembacktoMain);
		mntmNewMenuItembacktoMain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GuiMenue gui = new GuiMenue();
				frmElabVerwaltungsprogramm.dispose();
			}
		});

		JMenuItem mntmNewMenuItemlogOut = new JMenuItem("Ausloggen");
		mntmNewMenuItemlogOut.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuOptions.add(mntmNewMenuItemlogOut);
		mntmNewMenuItemlogOut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				GuiLogin gui = new GuiLogin();	
				frmElabVerwaltungsprogramm.dispose();
			}
		});

		JMenuItem mntmNewMenuItemcloseapplication = new JMenuItem("Anwendung verlassen");
		mntmNewMenuItemcloseapplication.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuOptions.add(mntmNewMenuItemcloseapplication);
		mntmNewMenuItemcloseapplication.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		JMenu mnNewMenuhelpWindow = new JMenu("?");
		mnNewMenuhelpWindow.setFont(new Font("Segoe UI", Font.BOLD, 15));

		menuBar.add(mnNewMenuhelpWindow);

		JMenuItem mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mntmNewMenuItemshowManual.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmNewMenuItemshowManual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//ToDo
			}
		});
		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);


		frmElabVerwaltungsprogramm.setVisible(true);
	}

	protected void handleEditPersonSelectionEvent(ListSelectionEvent e) {
		if(table.getSelectedRow()>-1) {
			textFieldIDModify.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
			textFieldnameModify.setText((String)table.getValueAt(table.getSelectedRow(), 1));
			textFieldlastNameModify.setText((String)table.getValueAt(table.getSelectedRow(), 2));
			textFieldstreetModify.setText((String)table.getValueAt(table.getSelectedRow(), 3));
			textFieldhouseNumberModify.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
			textFieldzipCodeModify.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
			textFieldeMailModify.setText((String)table.getValueAt(table.getSelectedRow(), 6));
			comboBoxTypeModify.setSelectedIndex(comboBoxEntries.indexOf((String)table.getValueAt(table.getSelectedRow(), 9)));
			textFielduserNameModify.setText((String)table.getValueAt(table.getSelectedRow(), 7));
			passwordFieldModify.setText((String)table.getValueAt(table.getSelectedRow(), 8));
		}
	}

	protected void refreshTable() {
		try {
			table.setModel(new PersonTableModel(PersonManagement.getPersons()));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		table.clearSelection();
	}


	protected void refreshTableDeletePerson() {
		try {
			TableDeletePerson.setModel(new PersonTableModel(PersonManagement.getPersons()));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		TableDeletePerson.clearSelection();
	}

}
