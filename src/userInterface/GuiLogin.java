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
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import Exceptions.UsernameNotInDBException;
import Exceptions.WrongPasswordException;
import logic.LoginManagement;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GuiLogin {

	private JFrame frmElabVerwaltungsprogramm;
	private JTextField textFielduserName;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private JButton btnregister;
	private JMenuBar menuBar;
	private JMenu mnNewMenuMenü;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItemcloseApplication;
	private JMenuItem mntmNewMenuItemMinimize;
	private JMenuItem mntmNewMenuItemshowManual;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	public GuiLogin() {
		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setUndecorated(true);
		frmElabVerwaltungsprogramm.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmElabVerwaltungsprogramm.setTitle("Elab Verwaltungsprogramm");
		frmElabVerwaltungsprogramm.setBounds(100, 100, 836, 649);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		frmElabVerwaltungsprogramm.getContentPane().setLayout(gridBagLayout);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.anchor = GridBagConstraints.WEST;
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblUsername, gbc_lblUsername);
		
		textFielduserName = new JTextField();
		textFielduserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFielduserName = new GridBagConstraints();
		gbc_textFielduserName.insets = new Insets(0, 0, 5, 0);
		gbc_textFielduserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFielduserName.gridx = 1;
		gbc_textFielduserName.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(textFielduserName, gbc_textFielduserName);
		textFielduserName.setColumns(10);
		
		lblPassword = new JLabel("Passwort");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.anchor = GridBagConstraints.WEST;
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(lblPassword, gbc_lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(passwordField, gbc_passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener((e)-> {
			try {
				LoginManagement.checkLoginCredentials(textFielduserName.getText(), new String(passwordField.getPassword()));
				if(LoginManagement.checkRights(textFielduserName.getText())) {
					GuiMenue menue = new GuiMenue();
					frmElabVerwaltungsprogramm.dispose();
				}
				else {
					GUIComponentUserInterface cmpui = new GUIComponentUserInterface();
					frmElabVerwaltungsprogramm.dispose();
				}
			} catch (UsernameNotInDBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (WrongPasswordException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnLogin.insets = new Insets(0, 0, 5, 0);
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 2;
		frmElabVerwaltungsprogramm.getContentPane().add(btnLogin, gbc_btnLogin);
		
		btnregister = new JButton("Registrieren");
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIRegisterCustomer regcu= new GUIRegisterCustomer();
				frmElabVerwaltungsprogramm.dispose();
			}
		});
		btnregister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btnregister.setToolTipText("Als neuer Kunde hier registrieren");
		GridBagConstraints gbc_btnregister = new GridBagConstraints();
		gbc_btnregister.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnregister.insets = new Insets(0, 0, 5, 0);
		gbc_btnregister.gridx = 1;
		gbc_btnregister.gridy = 3;
		frmElabVerwaltungsprogramm.getContentPane().add(btnregister, gbc_btnregister);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nils\\git\\ProPraElab\\ProPraElab\\pictures\\elab.png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 4;
		frmElabVerwaltungsprogramm.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);
		
		mnNewMenuMenü = new JMenu("Menü");
		
		mnNewMenuMenü.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuMenü);
		
		mntmNewMenuItemMinimize = new JMenuItem("Minimieren");
		mntmNewMenuItemMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			frmElabVerwaltungsprogramm.setState(JFrame.ICONIFIED);
			
			}
		});
		mntmNewMenuItemMinimize.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuMenü.add(mntmNewMenuItemMinimize);
		
		mntmNewMenuItemcloseApplication = new JMenuItem("Anwendung verlassen");
		mntmNewMenuItemcloseApplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				System.exit(0);
			
			}
		});
		mntmNewMenuItemcloseApplication.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuMenü.add(mntmNewMenuItemcloseApplication);
		
		mnNewMenu_1 = new JMenu("?");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mntmNewMenuItemshowManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			
			}
		});
		mntmNewMenuItemshowManual.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenu_1.add(mntmNewMenuItemshowManual);
	frmElabVerwaltungsprogramm.setVisible(true);
	}

	
}
