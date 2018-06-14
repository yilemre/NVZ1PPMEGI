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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.awt.Frame;

public class GuiMenue {

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
	private JMenuItem mntmNewMenuItemMinimize;
	private JLabel lblelabPicture;

	/**
	 * Initialize the contents of the frame.
	 */
	public GuiMenue() {

		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmElabVerwaltungsprogramm.setUndecorated(true);

		frmElabVerwaltungsprogramm.setTitle("Elab Verwaltungsprogramm");
		frmElabVerwaltungsprogramm.setBounds(100, 100, 691, 543);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		frmElabVerwaltungsprogramm.getContentPane().setLayout(gridBagLayout);

		lblguiMenue = new JLabel("Men\u00FC");
		lblguiMenue.setFont(new Font("Segoe UI", Font.BOLD, 15));
		GridBagConstraints gbc_lblguiMenue = new GridBagConstraints();
		gbc_lblguiMenue.insets = new Insets(0, 0, 5, 0);
		gbc_lblguiMenue.gridx = 0;
		gbc_lblguiMenue.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblguiMenue, gbc_lblguiMenue);

		btnpersonalManagement = new JButton("Personenverwaltung");
		btnpersonalManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GUIPersonalmanagement perMan = new GUIPersonalmanagement();
				frmElabVerwaltungsprogramm.dispose();

			}
		});
		btnpersonalManagement.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		GridBagConstraints gbc_btnpersonalManagement = new GridBagConstraints();
		gbc_btnpersonalManagement.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnpersonalManagement.insets = new Insets(0, 0, 5, 0);
		gbc_btnpersonalManagement.gridx = 0;
		gbc_btnpersonalManagement.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(btnpersonalManagement, gbc_btnpersonalManagement);

		btnfinanceManagement = new JButton("Finanzverwaltung");
		btnfinanceManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GUIFinanceManagement finMan = new GUIFinanceManagement();
				frmElabVerwaltungsprogramm.dispose();

			}
		});
		btnfinanceManagement.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		btnorderManagement = new JButton("Auftragsverwaltung");
		btnorderManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GUIFabricationmanagement fabMan = new GUIFabricationmanagement();
				frmElabVerwaltungsprogramm.dispose();

			}
		});
		btnorderManagement.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		GridBagConstraints gbc_btnorderManagement = new GridBagConstraints();
		gbc_btnorderManagement.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnorderManagement.insets = new Insets(0, 0, 5, 0);
		gbc_btnorderManagement.gridx = 0;
		gbc_btnorderManagement.gridy = 2;
		frmElabVerwaltungsprogramm.getContentPane().add(btnorderManagement, gbc_btnorderManagement);

		GridBagConstraints gbc_btnfinanceManagement = new GridBagConstraints();
		gbc_btnfinanceManagement.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnfinanceManagement.insets = new Insets(0, 0, 5, 0);
		gbc_btnfinanceManagement.gridx = 0;
		gbc_btnfinanceManagement.gridy = 3;
		frmElabVerwaltungsprogramm.getContentPane().add(btnfinanceManagement, gbc_btnfinanceManagement);

		btncomponentManagement = new JButton("Bauteileverwaltung");
		btncomponentManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GUIComponentmanagement comMan = new GUIComponentmanagement();
				frmElabVerwaltungsprogramm.dispose();

			}
		});
		btncomponentManagement.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		GridBagConstraints gbc_btncomponentManagement = new GridBagConstraints();
		gbc_btncomponentManagement.insets = new Insets(0, 0, 5, 0);
		gbc_btncomponentManagement.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncomponentManagement.gridx = 0;
		gbc_btncomponentManagement.gridy = 4;
		frmElabVerwaltungsprogramm.getContentPane().add(btncomponentManagement, gbc_btncomponentManagement);

		lblelabPicture = new JLabel("");
		lblelabPicture.setIcon(new ImageIcon("./pictures/elab.png"));
		GridBagConstraints gbc_lblelabPicture = new GridBagConstraints();
		gbc_lblelabPicture.gridx = 0;
		gbc_lblelabPicture.gridy = 5;
		frmElabVerwaltungsprogramm.getContentPane().add(lblelabPicture, gbc_lblelabPicture);

		menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);

		mnNewMenuOptions = new JMenu("Menü");
		mnNewMenuOptions.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuOptions);

		mntmNewMenuItemlogOut = new JMenuItem("Ausloggen");
		mntmNewMenuItemlogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GuiLogin logout = new GuiLogin();
				frmElabVerwaltungsprogramm.dispose();

			}
		});
		mntmNewMenuItemlogOut.setToolTipText("Rückkehr zum Login Fenster");
		mntmNewMenuItemlogOut.setFont(new Font("Segoe UI", Font.BOLD, 15));

		mntmNewMenuItemMinimize = new JMenuItem("Minimieren");
		mntmNewMenuItemMinimize.setToolTipText("Das Fenster wird minimiert");
		mntmNewMenuItemMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmElabVerwaltungsprogramm.setState(JFrame.ICONIFIED);

			}
		});
		mntmNewMenuItemMinimize.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuOptions.add(mntmNewMenuItemMinimize);
		mnNewMenuOptions.add(mntmNewMenuItemlogOut);

		mntmNewMenuItemcloseApplication = new JMenuItem("Anwendung verlassen");
		mntmNewMenuItemcloseApplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.exit(0);
			}
		});
		mntmNewMenuItemcloseApplication.setToolTipText("Die Anwendung wird geschlossen");
		mntmNewMenuItemcloseApplication.setFont(new Font("Segoe UI", Font.BOLD, 15));

		mnNewMenuOptions.add(mntmNewMenuItemcloseApplication);

		mnNewMenuhelpWindow = new JMenu("?");
		mnNewMenuhelpWindow.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuhelpWindow);

		mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mntmNewMenuItemshowManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Runtime.getRuntime().exec("cmd /c Start ./Anleitungen/Anleitung_für_das_Hauptmenü.pdf");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		mntmNewMenuItemshowManual.setToolTipText("Die Anleitung als PDF wird geöffnet");
		mntmNewMenuItemshowManual.setFont(new Font("Segoe UI", Font.BOLD, 15));

		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);
		frmElabVerwaltungsprogramm.setVisible(true);
	}

}
