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
import java.awt.Toolkit;
import java.awt.Window.Type;

public class GUIRegisterCustomer implements ActionListener {

	private JFrame frmElabVerwaltungsprogramm;
	private JTextField textFieldname;
	private JTextField textFieldlastName;
	private JTextField textFieldStreet;
	private JTextField textFieldhouseNumber;
	private JTextField textFieldzipCode;
	private JTextField textFieldeMail;
	private JTextField textFielduserName;
	private JPasswordField passwordField;
	private JTextField textFieldprofessorShip;
	private JPasswordField passwordFieldrepeatPassword;

	

	/**
	 * Create the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	public GUIRegisterCustomer() {
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
		
		JLabel lblPersonenverwaltung = new JLabel("Neukundenregistierung");
		lblPersonenverwaltung.setFont(new Font("Tahoma", Font.BOLD, 13));
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
		gbl_paneladdPerson.columnWidths = new int[]{0, 0, 0};
		gbl_paneladdPerson.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_paneladdPerson.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_paneladdPerson.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		paneladdPerson.setLayout(gbl_paneladdPerson);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		paneladdPerson.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblname = new JLabel("Vorname");
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblname = new GridBagConstraints();
		gbc_lblname.anchor = GridBagConstraints.EAST;
		gbc_lblname.insets = new Insets(0, 0, 5, 5);
		gbc_lblname.gridx = 0;
		gbc_lblname.gridy = 1;
		paneladdPerson.add(lblname, gbc_lblname);
		
		textFieldname = new JTextField();
		textFieldname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldname = new GridBagConstraints();
		gbc_textFieldname.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldname.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldname.gridx = 1;
		gbc_textFieldname.gridy = 1;
		paneladdPerson.add(textFieldname, gbc_textFieldname);
		textFieldname.setColumns(10);
		
		JLabel lbllastName = new JLabel("Nachname");
		lbllastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbllastName = new GridBagConstraints();
		gbc_lbllastName.anchor = GridBagConstraints.EAST;
		gbc_lbllastName.insets = new Insets(0, 0, 5, 5);
		gbc_lbllastName.gridx = 0;
		gbc_lbllastName.gridy = 2;
		paneladdPerson.add(lbllastName, gbc_lbllastName);
		
		textFieldlastName = new JTextField();
		textFieldlastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldlastName = new GridBagConstraints();
		gbc_textFieldlastName.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldlastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldlastName.gridx = 1;
		gbc_textFieldlastName.gridy = 2;
		paneladdPerson.add(textFieldlastName, gbc_textFieldlastName);
		textFieldlastName.setColumns(10);
		
		JLabel lblStreet = new JLabel("Straße");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblStreet = new GridBagConstraints();
		gbc_lblStreet.anchor = GridBagConstraints.EAST;
		gbc_lblStreet.insets = new Insets(0, 0, 5, 5);
		gbc_lblStreet.gridx = 0;
		gbc_lblStreet.gridy = 3;
		paneladdPerson.add(lblStreet, gbc_lblStreet);
		
		textFieldStreet = new JTextField();
		textFieldStreet.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldStreet = new GridBagConstraints();
		gbc_textFieldStreet.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldStreet.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStreet.gridx = 1;
		gbc_textFieldStreet.gridy = 3;
		paneladdPerson.add(textFieldStreet, gbc_textFieldStreet);
		textFieldStreet.setColumns(10);
		
		JLabel lblhouseNumber = new JLabel("Hausnummer");
		lblhouseNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblhouseNumber = new GridBagConstraints();
		gbc_lblhouseNumber.anchor = GridBagConstraints.EAST;
		gbc_lblhouseNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblhouseNumber.gridx = 0;
		gbc_lblhouseNumber.gridy = 4;
		paneladdPerson.add(lblhouseNumber, gbc_lblhouseNumber);
		
		textFieldhouseNumber = new JTextField();
		textFieldhouseNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldhouseNumber = new GridBagConstraints();
		gbc_textFieldhouseNumber.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldhouseNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldhouseNumber.gridx = 1;
		gbc_textFieldhouseNumber.gridy = 4;
		paneladdPerson.add(textFieldhouseNumber, gbc_textFieldhouseNumber);
		textFieldhouseNumber.setColumns(10);
		
		JLabel lblzipCode = new JLabel("PLZ");
		lblzipCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblzipCode = new GridBagConstraints();
		gbc_lblzipCode.anchor = GridBagConstraints.EAST;
		gbc_lblzipCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblzipCode.gridx = 0;
		gbc_lblzipCode.gridy = 5;
		paneladdPerson.add(lblzipCode, gbc_lblzipCode);
		
		textFieldzipCode = new JTextField();
		textFieldzipCode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldzipCode = new GridBagConstraints();
		gbc_textFieldzipCode.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldzipCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldzipCode.gridx = 1;
		gbc_textFieldzipCode.gridy = 5;
		paneladdPerson.add(textFieldzipCode, gbc_textFieldzipCode);
		textFieldzipCode.setColumns(10);
		
		JLabel lbleMail = new JLabel("E-Mail Adresse");
		lbleMail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbleMail = new GridBagConstraints();
		gbc_lbleMail.anchor = GridBagConstraints.EAST;
		gbc_lbleMail.insets = new Insets(0, 0, 5, 5);
		gbc_lbleMail.gridx = 0;
		gbc_lbleMail.gridy = 6;
		paneladdPerson.add(lbleMail, gbc_lbleMail);
		
		textFieldeMail = new JTextField();
		textFieldeMail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldeMail = new GridBagConstraints();
		gbc_textFieldeMail.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldeMail.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldeMail.gridx = 1;
		gbc_textFieldeMail.gridy = 6;
		paneladdPerson.add(textFieldeMail, gbc_textFieldeMail);
		textFieldeMail.setColumns(10);
		
		JLabel lblTyp = new JLabel("Personenart");
		lblTyp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTyp = new GridBagConstraints();
		gbc_lblTyp.anchor = GridBagConstraints.EAST;
		gbc_lblTyp.insets = new Insets(0, 0, 5, 5);
		gbc_lblTyp.gridx = 0;
		gbc_lblTyp.gridy = 7;
		paneladdPerson.add(lblTyp, gbc_lblTyp);
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxType.setToolTipText("");
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Kunde", "Lehrstuhl bezogene Person"}));
		GridBagConstraints gbc_comboBoxType = new GridBagConstraints();
		gbc_comboBoxType.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxType.gridx = 1;
		gbc_comboBoxType.gridy = 7;
		paneladdPerson.add(comboBoxType, gbc_comboBoxType);
		
		JLabel lblprofessorShip = new JLabel("Lehrstuhl");
		lblprofessorShip.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblprofessorShip = new GridBagConstraints();
		gbc_lblprofessorShip.anchor = GridBagConstraints.EAST;
		gbc_lblprofessorShip.insets = new Insets(0, 0, 5, 5);
		gbc_lblprofessorShip.gridx = 0;
		gbc_lblprofessorShip.gridy = 8;
		paneladdPerson.add(lblprofessorShip, gbc_lblprofessorShip);
		
		textFieldprofessorShip = new JTextField();
		textFieldprofessorShip.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldprofessorShip = new GridBagConstraints();
		gbc_textFieldprofessorShip.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldprofessorShip.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldprofessorShip.gridx = 1;
		gbc_textFieldprofessorShip.gridy = 8;
		paneladdPerson.add(textFieldprofessorShip, gbc_textFieldprofessorShip);
		textFieldprofessorShip.setColumns(10);
		
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
		
		JButton btnaddPerson = new JButton("Registrieren");
		btnaddPerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnaddPerson.addActionListener(this);
		
		
		JLabel lblPasswordRepeat = new JLabel("Passwort wiederholen");
		lblPasswordRepeat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPasswordRepeat = new GridBagConstraints();
		gbc_lblPasswordRepeat.anchor = GridBagConstraints.EAST;
		gbc_lblPasswordRepeat.insets = new Insets(0, 0, 5, 5);
		gbc_lblPasswordRepeat.gridx = 0;
		gbc_lblPasswordRepeat.gridy = 11;
		paneladdPerson.add(lblPasswordRepeat, gbc_lblPasswordRepeat);
		
		passwordFieldrepeatPassword = new JPasswordField();
		passwordFieldrepeatPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_passwordFieldrepeatPassword = new GridBagConstraints();
		gbc_passwordFieldrepeatPassword.insets = new Insets(0, 0, 5, 0);
		gbc_passwordFieldrepeatPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordFieldrepeatPassword.gridx = 1;
		gbc_passwordFieldrepeatPassword.gridy = 11;
		paneladdPerson.add(passwordFieldrepeatPassword, gbc_passwordFieldrepeatPassword);
		GridBagConstraints gbc_btnaddPerson = new GridBagConstraints();
		gbc_btnaddPerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddPerson.insets = new Insets(0, 0, 5, 0);
		gbc_btnaddPerson.gridx = 1;
		gbc_btnaddPerson.gridy = 12;
		paneladdPerson.add(btnaddPerson, gbc_btnaddPerson);
		
		JButton btndeleteallInputs = new JButton("Eingaben löschen");
		btndeleteallInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btndeleteallInputs = new GridBagConstraints();
		gbc_btndeleteallInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputs.gridx = 1;
		gbc_btndeleteallInputs.gridy = 13;
		paneladdPerson.add(btndeleteallInputs, gbc_btndeleteallInputs);
		
		JLabel lbleLabpicture = new JLabel("");
		lbleLabpicture.setIcon(new ImageIcon("C:\\Users\\Nils\\git\\ProPraElab\\ProPraElab\\pictures\\elab.png"));
		GridBagConstraints gbc_lbleLabpicture = new GridBagConstraints();
		gbc_lbleLabpicture.gridwidth = 2;
		gbc_lbleLabpicture.gridx = 0;
		gbc_lbleLabpicture.gridy = 14;
		paneladdPerson.add(lbleLabpicture, gbc_lbleLabpicture);
		
		JMenuBar menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);
		
		JMenu mnNewMenuOptions = new JMenu("Menü");
		mnNewMenuOptions.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuOptions);
		
		JMenuItem mntmNewMenuItemabortRegister = new JMenuItem("Registrierung abbrechen");
		mntmNewMenuItemabortRegister.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mntmNewMenuItemabortRegister.addActionListener(this);
		mntmNewMenuItemabortRegister.setBorderPainted(true);
		mnNewMenuOptions.add(mntmNewMenuItemabortRegister);
		mntmNewMenuItemabortRegister.setToolTipText("Sie kehren zum Login zurück");
		JMenu mnNewMenuhelpWindow = new JMenu("?");
		mnNewMenuhelpWindow.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuhelpWindow);
		
		JMenuItem mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mntmNewMenuItemshowManual.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);
		frmElabVerwaltungsprogramm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if (command == "Registrieren") {
			
			
		}

		if (command == "Eingaben löschen") {
			
			
		}
		

		if (command == "Registrierung abbrechen") {
		
		GuiLogin abortReg= new GuiLogin();
		frmElabVerwaltungsprogramm.dispose();
			
		}

		if (command == "Anleitung anzeigen") {
			
			
		}
		
		
		
	}
}
