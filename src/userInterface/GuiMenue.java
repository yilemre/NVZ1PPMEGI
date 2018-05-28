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
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class GuiMenue implements ActionListener {

	private JFrame frmElabVerwaltungsprogramm;
	private JButton btnfinanceManagement;
	private JButton btnorderManagement;
	private JButton btnpersonalManagement;
	private JLabel lblguiMenue;
	private JMenuBar menuBar;
	private JMenu mnNewMenuOptions;
	private JMenuItem mntmNewMenuItemlogOut;
	private JMenuItem mntmNewMenuItemcloseApplication;
	private JMenu mnNewMenuhelpWindow;
	private JMenuItem mntmNewMenuItemshowManual;
	private JButton btncomponentManagement;

	
	
	
	
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	public GuiMenue() {

		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setTitle("Elab Verwaltungsprogramm");
		frmElabVerwaltungsprogramm.setBounds(100, 100, 691, 543);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		frmElabVerwaltungsprogramm.getContentPane().setLayout(gridBagLayout);

		lblguiMenue = new JLabel("Men\u00FC");
		lblguiMenue.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblguiMenue = new GridBagConstraints();
		gbc_lblguiMenue.insets = new Insets(0, 0, 5, 0);
		gbc_lblguiMenue.gridx = 0;
		gbc_lblguiMenue.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblguiMenue, gbc_lblguiMenue);

		btnpersonalManagement = new JButton("Personenverwaltung");
		btnpersonalManagement.addActionListener(this);

		GridBagConstraints gbc_btnpersonalManagement = new GridBagConstraints();
		gbc_btnpersonalManagement.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnpersonalManagement.insets = new Insets(0, 0, 5, 0);
		gbc_btnpersonalManagement.gridx = 0;
		gbc_btnpersonalManagement.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(btnpersonalManagement, gbc_btnpersonalManagement);

		btnfinanceManagement = new JButton("Finanzverwaltung");
		btnfinanceManagement.addActionListener(this);

		GridBagConstraints gbc_btnfinanceManagement = new GridBagConstraints();
		gbc_btnfinanceManagement.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnfinanceManagement.insets = new Insets(0, 0, 5, 0);
		gbc_btnfinanceManagement.gridx = 0;
		gbc_btnfinanceManagement.gridy = 2;
		frmElabVerwaltungsprogramm.getContentPane().add(btnfinanceManagement, gbc_btnfinanceManagement);

		btnorderManagement = new JButton("Auftragsverwaltung");
		btnorderManagement.addActionListener(this);
		GridBagConstraints gbc_btnorderManagement = new GridBagConstraints();
		gbc_btnorderManagement.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnorderManagement.insets = new Insets(0, 0, 5, 0);
		gbc_btnorderManagement.gridx = 0;
		gbc_btnorderManagement.gridy = 3;
		frmElabVerwaltungsprogramm.getContentPane().add(btnorderManagement, gbc_btnorderManagement);

		btncomponentManagement = new JButton("Bauteileverwaltung");
		btncomponentManagement.addActionListener(this);
		GridBagConstraints gbc_btncomponentManagement = new GridBagConstraints();
		gbc_btncomponentManagement.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncomponentManagement.gridx = 0;
		gbc_btncomponentManagement.gridy = 4;
		frmElabVerwaltungsprogramm.getContentPane().add(btncomponentManagement, gbc_btncomponentManagement);

		menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);

		mnNewMenuOptions = new JMenu("Menü");
		menuBar.add(mnNewMenuOptions);

		mntmNewMenuItemlogOut = new JMenuItem("Ausloggen");
		mntmNewMenuItemlogOut.addActionListener(this);
		mnNewMenuOptions.add(mntmNewMenuItemlogOut);

		mntmNewMenuItemcloseApplication = new JMenuItem("Anwendung verlassen");
		mntmNewMenuItemcloseApplication.addActionListener(this);
		mnNewMenuOptions.add(mntmNewMenuItemcloseApplication);

		mnNewMenuhelpWindow = new JMenu("?");
		mnNewMenuhelpWindow.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuhelpWindow);

		mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mntmNewMenuItemshowManual.addActionListener(this);

		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);
		frmElabVerwaltungsprogramm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String command = e.getActionCommand();

		if (command == "Personenverwaltung") {

			GUIPersonalmanagement perMan = new GUIPersonalmanagement();
			frmElabVerwaltungsprogramm.dispose();
		}
		if (command == "Finanzverwaltung") {

			GUIFinanceManagement finMan = new GUIFinanceManagement();
			frmElabVerwaltungsprogramm.dispose();
		}

		if (command == "Auftragsverwaltung") {

			GUIFabricationmanagement fabMan = new GUIFabricationmanagement();
			frmElabVerwaltungsprogramm.dispose();

		}

		if (command == "Bauteileverwaltung") {

			GUIComponentmanagement comMan = new GUIComponentmanagement();
			frmElabVerwaltungsprogramm.dispose();

		}
		if (command == "Ausloggen") {

			GuiLogin logout = new GuiLogin();
			frmElabVerwaltungsprogramm.dispose();
		}
		if (command == "Anwendung verlassen") {

			System.exit(0);

		}
		if (command == "Anleitung anzeigen") {

		}

	}

}
