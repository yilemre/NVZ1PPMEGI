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
import javax.swing.ListSelectionModel;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;

public class GUIFinanceManagement {

	private JFrame frmElabVerwaltungsprogramm;
	private JTextField textFieldbillName;
	private JTextField textFieldrelatedOrder;
	private JTextField textFieldhouseNumber;
	private JTextField textFieldcustomerID;
	private JTextField textresponsiblePerson;
	private JTextField textFielddeleteBillSearch;
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
	private JTextField textField;
	private JTextField textFieldrelatedJar;
	private JTextField textFieldbillNameModify;
	private JTextField textFieldrelatedOrderModify;
	private JTextField textFieldsumBillModify;
	private JTextField textFieldcustomerIDModify;
	private JTextField textFieldrelatedPersonModify;
	private JTextField textFieldrelatedJarModify;
	private JTextField textField_7;
	private JTable tablecashRegister;
	private JTable tablebillModify;
	private JTable tablebillNew;
	private JTable tabledeleteBill;
	private JTable tablejar;

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
		lblFinanceManagement.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblFinanceManagement = new GridBagConstraints();
		gbc_lblFinanceManagement.insets = new Insets(0, 0, 5, 0);
		gbc_lblFinanceManagement.gridx = 0;
		gbc_lblFinanceManagement.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblFinanceManagement, gbc_lblFinanceManagement);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(tabbedPane, gbc_tabbedPane);
		
		JPanel panelcreateBill = new JPanel();
		tabbedPane.addTab("Rechnung erstellen", null, panelcreateBill, null);
		GridBagLayout gbl_panelcreateBill = new GridBagLayout();
		gbl_panelcreateBill.columnWidths = new int[]{0, 0, 0};
		gbl_panelcreateBill.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelcreateBill.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelcreateBill.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panelcreateBill.setLayout(gbl_panelcreateBill);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		panelcreateBill.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblbillName = new JLabel("Rechnungsname");
		lblbillName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblbillName = new GridBagConstraints();
		gbc_lblbillName.anchor = GridBagConstraints.EAST;
		gbc_lblbillName.insets = new Insets(0, 0, 5, 5);
		gbc_lblbillName.gridx = 0;
		gbc_lblbillName.gridy = 1;
		panelcreateBill.add(lblbillName, gbc_lblbillName);
		
		textFieldbillName = new JTextField();
		textFieldbillName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldbillName = new GridBagConstraints();
		gbc_textFieldbillName.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldbillName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldbillName.gridx = 1;
		gbc_textFieldbillName.gridy = 1;
		panelcreateBill.add(textFieldbillName, gbc_textFieldbillName);
		textFieldbillName.setColumns(10);
		
		JLabel lblrelatedOrder = new JLabel("dazugehöriger Auftrag");
		lblrelatedOrder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedOrder = new GridBagConstraints();
		gbc_lblrelatedOrder.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedOrder.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedOrder.gridx = 0;
		gbc_lblrelatedOrder.gridy = 2;
		panelcreateBill.add(lblrelatedOrder, gbc_lblrelatedOrder);
		
		textFieldrelatedOrder = new JTextField();
		textFieldrelatedOrder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldrelatedOrder = new GridBagConstraints();
		gbc_textFieldrelatedOrder.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldrelatedOrder.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldrelatedOrder.gridx = 1;
		gbc_textFieldrelatedOrder.gridy = 2;
		panelcreateBill.add(textFieldrelatedOrder, gbc_textFieldrelatedOrder);
		textFieldrelatedOrder.setColumns(10);
		
		JLabel lblpaymentTyp = new JLabel("Bezahlart");
		lblpaymentTyp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpaymentTyp = new GridBagConstraints();
		gbc_lblpaymentTyp.anchor = GridBagConstraints.EAST;
		gbc_lblpaymentTyp.insets = new Insets(0, 0, 5, 5);
		gbc_lblpaymentTyp.gridx = 0;
		gbc_lblpaymentTyp.gridy = 3;
		panelcreateBill.add(lblpaymentTyp, gbc_lblpaymentTyp);
		
		JComboBox comboBoxpaymentTyp = new JComboBox();
		comboBoxpaymentTyp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxpaymentTyp = new GridBagConstraints();
		gbc_comboBoxpaymentTyp.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxpaymentTyp.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxpaymentTyp.gridx = 1;
		gbc_comboBoxpaymentTyp.gridy = 3;
		panelcreateBill.add(comboBoxpaymentTyp, gbc_comboBoxpaymentTyp);
		
		JLabel lblsumBill = new JLabel("Endbetrag");
		lblsumBill.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblsumBill = new GridBagConstraints();
		gbc_lblsumBill.anchor = GridBagConstraints.EAST;
		gbc_lblsumBill.insets = new Insets(0, 0, 5, 5);
		gbc_lblsumBill.gridx = 0;
		gbc_lblsumBill.gridy = 4;
		panelcreateBill.add(lblsumBill, gbc_lblsumBill);
		
		textFieldhouseNumber = new JTextField();
		textFieldhouseNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldhouseNumber = new GridBagConstraints();
		gbc_textFieldhouseNumber.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldhouseNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldhouseNumber.gridx = 1;
		gbc_textFieldhouseNumber.gridy = 4;
		panelcreateBill.add(textFieldhouseNumber, gbc_textFieldhouseNumber);
		textFieldhouseNumber.setColumns(10);
		
		JLabel lblcustomerID = new JLabel("Kundennummer");
		lblcustomerID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcustomerID = new GridBagConstraints();
		gbc_lblcustomerID.anchor = GridBagConstraints.EAST;
		gbc_lblcustomerID.insets = new Insets(0, 0, 5, 5);
		gbc_lblcustomerID.gridx = 0;
		gbc_lblcustomerID.gridy = 5;
		panelcreateBill.add(lblcustomerID, gbc_lblcustomerID);
		
		textFieldcustomerID = new JTextField();
		textFieldcustomerID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcustomerID.setEditable(false);
		GridBagConstraints gbc_textFieldcustomerID = new GridBagConstraints();
		gbc_textFieldcustomerID.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldcustomerID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcustomerID.gridx = 1;
		gbc_textFieldcustomerID.gridy = 5;
		panelcreateBill.add(textFieldcustomerID, gbc_textFieldcustomerID);
		textFieldcustomerID.setColumns(10);
		
		JLabel lblresponsiblePerson = new JLabel("Verantwortlicher");
		lblresponsiblePerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblresponsiblePerson = new GridBagConstraints();
		gbc_lblresponsiblePerson.anchor = GridBagConstraints.EAST;
		gbc_lblresponsiblePerson.insets = new Insets(0, 0, 5, 5);
		gbc_lblresponsiblePerson.gridx = 0;
		gbc_lblresponsiblePerson.gridy = 6;
		panelcreateBill.add(lblresponsiblePerson, gbc_lblresponsiblePerson);
		
		textresponsiblePerson = new JTextField();
		textresponsiblePerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textresponsiblePerson = new GridBagConstraints();
		gbc_textresponsiblePerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_textresponsiblePerson.insets = new Insets(0, 0, 5, 0);
		gbc_textresponsiblePerson.gridx = 1;
		gbc_textresponsiblePerson.gridy = 6;
		panelcreateBill.add(textresponsiblePerson, gbc_textresponsiblePerson);
		textresponsiblePerson.setColumns(10);
		
		JLabel lblTyp = new JLabel("Personenart");
		lblTyp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTyp = new GridBagConstraints();
		gbc_lblTyp.anchor = GridBagConstraints.EAST;
		gbc_lblTyp.insets = new Insets(0, 0, 5, 5);
		gbc_lblTyp.gridx = 0;
		gbc_lblTyp.gridy = 7;
		panelcreateBill.add(lblTyp, gbc_lblTyp);
		
		JComboBox comboBoxType = new JComboBox();
		comboBoxType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Kunde", "Mitglieder", "Lehrstuhl bezogene Personen"}));
		GridBagConstraints gbc_comboBoxType = new GridBagConstraints();
		gbc_comboBoxType.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxType.gridx = 1;
		gbc_comboBoxType.gridy = 7;
		panelcreateBill.add(comboBoxType, gbc_comboBoxType);
		
		JLabel lblrelatedJar = new JLabel("zugehöriger Topf");
		lblrelatedJar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedJar = new GridBagConstraints();
		gbc_lblrelatedJar.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedJar.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedJar.gridx = 0;
		gbc_lblrelatedJar.gridy = 8;
		panelcreateBill.add(lblrelatedJar, gbc_lblrelatedJar);
		
		textFieldrelatedJar = new JTextField();
		textFieldrelatedJar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldrelatedJar = new GridBagConstraints();
		gbc_textFieldrelatedJar.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldrelatedJar.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldrelatedJar.gridx = 1;
		gbc_textFieldrelatedJar.gridy = 8;
		panelcreateBill.add(textFieldrelatedJar, gbc_textFieldrelatedJar);
		textFieldrelatedJar.setColumns(10);
		
		JButton btnaddBill = new JButton("Rechnung hinzufügen");
		btnaddBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnaddBill.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnaddBill = new GridBagConstraints();
		gbc_btnaddBill.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddBill.insets = new Insets(0, 0, 5, 0);
		gbc_btnaddBill.gridx = 1;
		gbc_btnaddBill.gridy = 9;
		panelcreateBill.add(btnaddBill, gbc_btnaddBill);
		
		JButton btndeleteallInputs = new JButton("Eingaben löschen");
		btndeleteallInputs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndeleteallInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btndeleteallInputs = new GridBagConstraints();
		gbc_btndeleteallInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputs.gridx = 1;
		gbc_btndeleteallInputs.gridy = 10;
		panelcreateBill.add(btndeleteallInputs, gbc_btndeleteallInputs);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 11;
		panelcreateBill.add(scrollPane_1, gbc_scrollPane_1);
		
		tablebillNew = new JTable();
		scrollPane_1.setViewportView(tablebillNew);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 12;
		panelcreateBill.add(comboBox, gbc_comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 12;
		panelcreateBill.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnnewbillOrderSearch = new JButton("Auftrag suchen");
		btnnewbillOrderSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnnewbillOrderSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnnewbillOrderSearch = new GridBagConstraints();
		gbc_btnnewbillOrderSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnnewbillOrderSearch.gridx = 1;
		gbc_btnnewbillOrderSearch.gridy = 13;
		panelcreateBill.add(btnnewbillOrderSearch, gbc_btnnewbillOrderSearch);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Rechnung ändern", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JLabel lblbillNameModify = new JLabel("Rechnungsname");
		lblbillNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblbillNameModify = new GridBagConstraints();
		gbc_lblbillNameModify.anchor = GridBagConstraints.EAST;
		gbc_lblbillNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblbillNameModify.gridx = 0;
		gbc_lblbillNameModify.gridy = 1;
		panel.add(lblbillNameModify, gbc_lblbillNameModify);
		
		textFieldbillNameModify = new JTextField();
		textFieldbillNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldbillNameModify.setColumns(10);
		GridBagConstraints gbc_textFieldbillNameModify = new GridBagConstraints();
		gbc_textFieldbillNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldbillNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldbillNameModify.gridx = 1;
		gbc_textFieldbillNameModify.gridy = 1;
		panel.add(textFieldbillNameModify, gbc_textFieldbillNameModify);
		
		JLabel lblrelatedOrderModify = new JLabel("dazugehöriger Auftrag");
		lblrelatedOrderModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedOrderModify = new GridBagConstraints();
		gbc_lblrelatedOrderModify.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedOrderModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedOrderModify.gridx = 0;
		gbc_lblrelatedOrderModify.gridy = 2;
		panel.add(lblrelatedOrderModify, gbc_lblrelatedOrderModify);
		
		textFieldrelatedOrderModify = new JTextField();
		textFieldrelatedOrderModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldrelatedOrderModify.setColumns(10);
		GridBagConstraints gbc_textFieldrelatedOrderModify = new GridBagConstraints();
		gbc_textFieldrelatedOrderModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldrelatedOrderModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldrelatedOrderModify.gridx = 1;
		gbc_textFieldrelatedOrderModify.gridy = 2;
		panel.add(textFieldrelatedOrderModify, gbc_textFieldrelatedOrderModify);
		
		JLabel lblpaymentTypModify = new JLabel("Bezahlart");
		lblpaymentTypModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpaymentTypModify = new GridBagConstraints();
		gbc_lblpaymentTypModify.anchor = GridBagConstraints.EAST;
		gbc_lblpaymentTypModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblpaymentTypModify.gridx = 0;
		gbc_lblpaymentTypModify.gridy = 3;
		panel.add(lblpaymentTypModify, gbc_lblpaymentTypModify);
		
		JComboBox comboBoxpaymentTypModify = new JComboBox();
		comboBoxpaymentTypModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxpaymentTypModify = new GridBagConstraints();
		gbc_comboBoxpaymentTypModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxpaymentTypModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxpaymentTypModify.gridx = 1;
		gbc_comboBoxpaymentTypModify.gridy = 3;
		panel.add(comboBoxpaymentTypModify, gbc_comboBoxpaymentTypModify);
		
		JLabel lblsumBillModify = new JLabel("Endbetrag");
		lblsumBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblsumBillModify = new GridBagConstraints();
		gbc_lblsumBillModify.anchor = GridBagConstraints.EAST;
		gbc_lblsumBillModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblsumBillModify.gridx = 0;
		gbc_lblsumBillModify.gridy = 4;
		panel.add(lblsumBillModify, gbc_lblsumBillModify);
		
		textFieldsumBillModify = new JTextField();
		textFieldsumBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldsumBillModify.setColumns(10);
		GridBagConstraints gbc_textFieldsumBillModify = new GridBagConstraints();
		gbc_textFieldsumBillModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldsumBillModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldsumBillModify.gridx = 1;
		gbc_textFieldsumBillModify.gridy = 4;
		panel.add(textFieldsumBillModify, gbc_textFieldsumBillModify);
		
		JLabel lblcustomerIDModify = new JLabel("Kundennummer");
		lblcustomerIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcustomerIDModify = new GridBagConstraints();
		gbc_lblcustomerIDModify.anchor = GridBagConstraints.EAST;
		gbc_lblcustomerIDModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcustomerIDModify.gridx = 0;
		gbc_lblcustomerIDModify.gridy = 5;
		panel.add(lblcustomerIDModify, gbc_lblcustomerIDModify);
		
		textFieldcustomerIDModify = new JTextField();
		textFieldcustomerIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcustomerIDModify.setEditable(false);
		textFieldcustomerIDModify.setColumns(10);
		GridBagConstraints gbc_textFieldcustomerIDModify = new GridBagConstraints();
		gbc_textFieldcustomerIDModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcustomerIDModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldcustomerIDModify.gridx = 1;
		gbc_textFieldcustomerIDModify.gridy = 5;
		panel.add(textFieldcustomerIDModify, gbc_textFieldcustomerIDModify);
		
		JLabel lblrelatedPersonModify = new JLabel("Verantwortlicher");
		lblrelatedPersonModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedPersonModify = new GridBagConstraints();
		gbc_lblrelatedPersonModify.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedPersonModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedPersonModify.gridx = 0;
		gbc_lblrelatedPersonModify.gridy = 6;
		panel.add(lblrelatedPersonModify, gbc_lblrelatedPersonModify);
		
		textFieldrelatedPersonModify = new JTextField();
		textFieldrelatedPersonModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldrelatedPersonModify.setColumns(10);
		GridBagConstraints gbc_textFieldrelatedPersonModify = new GridBagConstraints();
		gbc_textFieldrelatedPersonModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldrelatedPersonModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldrelatedPersonModify.gridx = 1;
		gbc_textFieldrelatedPersonModify.gridy = 6;
		panel.add(textFieldrelatedPersonModify, gbc_textFieldrelatedPersonModify);
		
		JLabel lblTypModify = new JLabel("Personenart");
		lblTypModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTypModify = new GridBagConstraints();
		gbc_lblTypModify.anchor = GridBagConstraints.EAST;
		gbc_lblTypModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblTypModify.gridx = 0;
		gbc_lblTypModify.gridy = 7;
		panel.add(lblTypModify, gbc_lblTypModify);
		
		JComboBox comboBoxTypModify = new JComboBox();
		comboBoxTypModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxTypModify = new GridBagConstraints();
		gbc_comboBoxTypModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxTypModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxTypModify.gridx = 1;
		gbc_comboBoxTypModify.gridy = 7;
		panel.add(comboBoxTypModify, gbc_comboBoxTypModify);
		
		JLabel lblrelatedJarModify = new JLabel("zugehöriger Topf");
		lblrelatedJarModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedJarModify = new GridBagConstraints();
		gbc_lblrelatedJarModify.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedJarModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedJarModify.gridx = 0;
		gbc_lblrelatedJarModify.gridy = 8;
		panel.add(lblrelatedJarModify, gbc_lblrelatedJarModify);
		
		textFieldrelatedJarModify = new JTextField();
		textFieldrelatedJarModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldrelatedJarModify.setColumns(10);
		GridBagConstraints gbc_textFieldrelatedJarModify = new GridBagConstraints();
		gbc_textFieldrelatedJarModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldrelatedJarModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldrelatedJarModify.gridx = 1;
		gbc_textFieldrelatedJarModify.gridy = 8;
		panel.add(textFieldrelatedJarModify, gbc_textFieldrelatedJarModify);
		
		JButton btnsaveBillModify = new JButton("Rechnung ändern");
		btnsaveBillModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnsaveBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnsaveBillModify = new GridBagConstraints();
		gbc_btnsaveBillModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsaveBillModify.insets = new Insets(0, 0, 5, 0);
		gbc_btnsaveBillModify.gridx = 1;
		gbc_btnsaveBillModify.gridy = 9;
		panel.add(btnsaveBillModify, gbc_btnsaveBillModify);
		
		JButton btndeleteallInputsModify = new JButton("Felder leeren");
		btndeleteallInputsModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndeleteallInputsModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btndeleteallInputsModify = new GridBagConstraints();
		gbc_btndeleteallInputsModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputsModify.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputsModify.gridx = 1;
		gbc_btndeleteallInputsModify.gridy = 10;
		panel.add(btndeleteallInputsModify, gbc_btndeleteallInputsModify);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridwidth = 2;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 11;
		panel.add(scrollPane_2, gbc_scrollPane_2);
		
		tablebillModify = new JTable();
		scrollPane_2.setViewportView(tablebillModify);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.gridx = 0;
		gbc_comboBox_3.gridy = 12;
		panel.add(comboBox_3, gbc_comboBox_3);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 12;
		panel.add(textField_7, gbc_textField_7);
		
		JButton btnSearchBillModify = new JButton("Rechnung suchen");
		btnSearchBillModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnSearchBillModify = new GridBagConstraints();
		gbc_btnSearchBillModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSearchBillModify.gridx = 1;
		gbc_btnSearchBillModify.gridy = 13;
		panel.add(btnSearchBillModify, gbc_btnSearchBillModify);
		
		JPanel paneldeleteBill = new JPanel();
		tabbedPane.addTab("Rechnung löschen", null, paneldeleteBill, null);
		GridBagLayout gbl_paneldeleteBill = new GridBagLayout();
		gbl_paneldeleteBill.columnWidths = new int[]{0, 0, 0, 0};
		gbl_paneldeleteBill.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_paneldeleteBill.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_paneldeleteBill.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		paneldeleteBill.setLayout(gbl_paneldeleteBill);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_3 = new GridBagConstraints();
		gbc_scrollPane_3.gridwidth = 3;
		gbc_scrollPane_3.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_3.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_3.gridx = 0;
		gbc_scrollPane_3.gridy = 0;
		paneldeleteBill.add(scrollPane_3, gbc_scrollPane_3);
		
		tabledeleteBill = new JTable();
		scrollPane_3.setViewportView(tabledeleteBill);
		
		JComboBox comboBoxdeleteBillSearch = new JComboBox();
		comboBoxdeleteBillSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxdeleteBillSearch.setModel(new DefaultComboBoxModel(new String[] {"Name", "Datum", "Status"}));
		GridBagConstraints gbc_comboBoxdeleteBillSearch = new GridBagConstraints();
		gbc_comboBoxdeleteBillSearch.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxdeleteBillSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxdeleteBillSearch.gridx = 0;
		gbc_comboBoxdeleteBillSearch.gridy = 1;
		paneldeleteBill.add(comboBoxdeleteBillSearch, gbc_comboBoxdeleteBillSearch);
		
		textFielddeleteBillSearch = new JTextField();
		textFielddeleteBillSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFielddeleteBillSearch = new GridBagConstraints();
		gbc_textFielddeleteBillSearch.gridwidth = 2;
		gbc_textFielddeleteBillSearch.insets = new Insets(0, 0, 5, 0);
		gbc_textFielddeleteBillSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFielddeleteBillSearch.gridx = 1;
		gbc_textFielddeleteBillSearch.gridy = 1;
		paneldeleteBill.add(textFielddeleteBillSearch, gbc_textFielddeleteBillSearch);
		textFielddeleteBillSearch.setColumns(10);
		
		JButton btndeleteBillSearch = new JButton("Suchen");
		btndeleteBillSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndeleteBillSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btndeleteBillSearch = new GridBagConstraints();
		gbc_btndeleteBillSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteBillSearch.gridwidth = 2;
		gbc_btndeleteBillSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteBillSearch.gridx = 1;
		gbc_btndeleteBillSearch.gridy = 2;
		paneldeleteBill.add(btndeleteBillSearch, gbc_btndeleteBillSearch);
		
		JButton btndeleteBill = new JButton("Rechnung löschen");
		btndeleteBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btndeleteBill.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		tabbedPanecashRegister_JarManagement.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		lbljarName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbljarName = new GridBagConstraints();
		gbc_lbljarName.gridwidth = 2;
		gbc_lbljarName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbljarName.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarName.gridx = 0;
		gbc_lbljarName.gridy = 0;
		panelJarManagement.add(lbljarName, gbc_lbljarName);
		
		textFieldjarName = new JTextField();
		textFieldjarName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldjarName = new GridBagConstraints();
		gbc_textFieldjarName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldjarName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarName.gridx = 2;
		gbc_textFieldjarName.gridy = 0;
		panelJarManagement.add(textFieldjarName, gbc_textFieldjarName);
		textFieldjarName.setColumns(10);
		
		JLabel lbljarNameModify = new JLabel("Topfname");
		lbljarNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbljarNameModify = new GridBagConstraints();
		gbc_lbljarNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarNameModify.gridx = 3;
		gbc_lbljarNameModify.gridy = 0;
		panelJarManagement.add(lbljarNameModify, gbc_lbljarNameModify);
		
		textFieldjarNameModify = new JTextField();
		textFieldjarNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldjarNameModify = new GridBagConstraints();
		gbc_textFieldjarNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldjarNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarNameModify.gridx = 5;
		gbc_textFieldjarNameModify.gridy = 0;
		panelJarManagement.add(textFieldjarNameModify, gbc_textFieldjarNameModify);
		textFieldjarNameModify.setColumns(10);
		
		JLabel lbljarActualStock = new JLabel("Ist-Bestand");
		lbljarActualStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbljarActualStock = new GridBagConstraints();
		gbc_lbljarActualStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbljarActualStock.gridwidth = 2;
		gbc_lbljarActualStock.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarActualStock.gridx = 0;
		gbc_lbljarActualStock.gridy = 1;
		panelJarManagement.add(lbljarActualStock, gbc_lbljarActualStock);
		
		textFieldjarActualStock = new JTextField();
		textFieldjarActualStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldjarActualStock = new GridBagConstraints();
		gbc_textFieldjarActualStock.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldjarActualStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarActualStock.gridx = 2;
		gbc_textFieldjarActualStock.gridy = 1;
		panelJarManagement.add(textFieldjarActualStock, gbc_textFieldjarActualStock);
		textFieldjarActualStock.setColumns(10);
		
		JLabel lbljarActualStockModify = new JLabel("Ist-Bestand");
		lbljarActualStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbljarActualStockModify = new GridBagConstraints();
		gbc_lbljarActualStockModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarActualStockModify.gridx = 3;
		gbc_lbljarActualStockModify.gridy = 1;
		panelJarManagement.add(lbljarActualStockModify, gbc_lbljarActualStockModify);
		
		textFieldjarActualStockModify = new JTextField();
		textFieldjarActualStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldjarActualStockModify = new GridBagConstraints();
		gbc_textFieldjarActualStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldjarActualStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarActualStockModify.gridx = 5;
		gbc_textFieldjarActualStockModify.gridy = 1;
		panelJarManagement.add(textFieldjarActualStockModify, gbc_textFieldjarActualStockModify);
		textFieldjarActualStockModify.setColumns(10);
		
		JLabel lbljarEstimatedStock = new JLabel("Soll-Bestand");
		lbljarEstimatedStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbljarEstimatedStock = new GridBagConstraints();
		gbc_lbljarEstimatedStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbljarEstimatedStock.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarEstimatedStock.gridx = 0;
		gbc_lbljarEstimatedStock.gridy = 2;
		panelJarManagement.add(lbljarEstimatedStock, gbc_lbljarEstimatedStock);
		
		textFieldjarEstimatedStock = new JTextField();
		textFieldjarEstimatedStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldjarEstimatedStock = new GridBagConstraints();
		gbc_textFieldjarEstimatedStock.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldjarEstimatedStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarEstimatedStock.gridx = 2;
		gbc_textFieldjarEstimatedStock.gridy = 2;
		panelJarManagement.add(textFieldjarEstimatedStock, gbc_textFieldjarEstimatedStock);
		textFieldjarEstimatedStock.setColumns(10);
		
		JLabel lbljarEstimatedStockModify = new JLabel("Soll-Bestand");
		lbljarEstimatedStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbljarEstimatedStockModify = new GridBagConstraints();
		gbc_lbljarEstimatedStockModify.insets = new Insets(0, 0, 5, 5);
		gbc_lbljarEstimatedStockModify.gridx = 3;
		gbc_lbljarEstimatedStockModify.gridy = 2;
		panelJarManagement.add(lbljarEstimatedStockModify, gbc_lbljarEstimatedStockModify);
		
		textFieldjarEstimatedStockModify = new JTextField();
		textFieldjarEstimatedStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldjarEstimatedStockModify = new GridBagConstraints();
		gbc_textFieldjarEstimatedStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldjarEstimatedStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarEstimatedStockModify.gridx = 5;
		gbc_textFieldjarEstimatedStockModify.gridy = 2;
		panelJarManagement.add(textFieldjarEstimatedStockModify, gbc_textFieldjarEstimatedStockModify);
		textFieldjarEstimatedStockModify.setColumns(10);
		
		JButton btnaddJar = new JButton("Topf hinzufügen");
		btnaddJar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnaddJar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnaddJar = new GridBagConstraints();
		gbc_btnaddJar.insets = new Insets(0, 0, 5, 5);
		gbc_btnaddJar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddJar.gridx = 2;
		gbc_btnaddJar.gridy = 3;
		panelJarManagement.add(btnaddJar, gbc_btnaddJar);
		
		JButton btnjarSaveChanges = new JButton("Änderungen speichern");
		btnjarSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnjarSaveChanges.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnjarSaveChanges = new GridBagConstraints();
		gbc_btnjarSaveChanges.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnjarSaveChanges.insets = new Insets(0, 0, 5, 0);
		gbc_btnjarSaveChanges.gridx = 5;
		gbc_btnjarSaveChanges.gridy = 3;
		panelJarManagement.add(btnjarSaveChanges, gbc_btnjarSaveChanges);
		
		JButton btnjarClearInputs = new JButton("Eingabe löschen");
		btnjarClearInputs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			textFieldjarName.setText("");
			textFieldjarActualStock.setText("");
			textFieldjarEstimatedStock.setText("");
			}
		});
		btnjarClearInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		
		tablejar = new JTable();
		scrollPanejar.setViewportView(tablejar);
		
		JButton btnjarDelete = new JButton("Topf löschen");
		btnjarDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnjarDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
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
		gbl_panelcashRegisterManagement.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelcashRegisterManagement.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelcashRegisterManagement.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panelcashRegisterManagement.setLayout(gbl_panelcashRegisterManagement);
		
		JLabel lblcashRegisterName = new JLabel("Kassenname");
		lblcashRegisterName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterName = new GridBagConstraints();
		gbc_lblcashRegisterName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblcashRegisterName.gridwidth = 2;
		gbc_lblcashRegisterName.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterName.gridx = 0;
		gbc_lblcashRegisterName.gridy = 0;
		panelcashRegisterManagement.add(lblcashRegisterName, gbc_lblcashRegisterName);
		
		textFieldcashRegisterName = new JTextField();
		textFieldcashRegisterName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcashRegisterName.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterName = new GridBagConstraints();
		gbc_textFieldcashRegisterName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldcashRegisterName.gridx = 2;
		gbc_textFieldcashRegisterName.gridy = 0;
		panelcashRegisterManagement.add(textFieldcashRegisterName, gbc_textFieldcashRegisterName);
		
		JLabel lblcashRegisterNameModify = new JLabel("Kassenname");
		lblcashRegisterNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterNameModify = new GridBagConstraints();
		gbc_lblcashRegisterNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterNameModify.gridx = 3;
		gbc_lblcashRegisterNameModify.gridy = 0;
		panelcashRegisterManagement.add(lblcashRegisterNameModify, gbc_lblcashRegisterNameModify);
		
		textFieldCashRegisterNameModify = new JTextField();
		textFieldCashRegisterNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldCashRegisterNameModify.setColumns(10);
		GridBagConstraints gbc_textFieldCashRegisterNameModify = new GridBagConstraints();
		gbc_textFieldCashRegisterNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCashRegisterNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCashRegisterNameModify.gridx = 5;
		gbc_textFieldCashRegisterNameModify.gridy = 0;
		panelcashRegisterManagement.add(textFieldCashRegisterNameModify, gbc_textFieldCashRegisterNameModify);
		
		JLabel lblcashRegisterActualStock = new JLabel("Ist-Bestand");
		lblcashRegisterActualStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterActualStock = new GridBagConstraints();
		gbc_lblcashRegisterActualStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblcashRegisterActualStock.gridwidth = 2;
		gbc_lblcashRegisterActualStock.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterActualStock.gridx = 0;
		gbc_lblcashRegisterActualStock.gridy = 1;
		panelcashRegisterManagement.add(lblcashRegisterActualStock, gbc_lblcashRegisterActualStock);
		
		textFieldcashRegisterActualStock = new JTextField();
		textFieldcashRegisterActualStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcashRegisterActualStock.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterActualStock = new GridBagConstraints();
		gbc_textFieldcashRegisterActualStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterActualStock.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldcashRegisterActualStock.gridx = 2;
		gbc_textFieldcashRegisterActualStock.gridy = 1;
		panelcashRegisterManagement.add(textFieldcashRegisterActualStock, gbc_textFieldcashRegisterActualStock);
		
		JLabel lblcashRegisterActualStockModify = new JLabel("Ist-Bestand");
		lblcashRegisterActualStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterActualStockModify = new GridBagConstraints();
		gbc_lblcashRegisterActualStockModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterActualStockModify.gridx = 3;
		gbc_lblcashRegisterActualStockModify.gridy = 1;
		panelcashRegisterManagement.add(lblcashRegisterActualStockModify, gbc_lblcashRegisterActualStockModify);
		
		textFieldcashRegisterActualStockModify = new JTextField();
		textFieldcashRegisterActualStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcashRegisterActualStockModify.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterActualStockModify = new GridBagConstraints();
		gbc_textFieldcashRegisterActualStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterActualStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldcashRegisterActualStockModify.gridx = 5;
		gbc_textFieldcashRegisterActualStockModify.gridy = 1;
		panelcashRegisterManagement.add(textFieldcashRegisterActualStockModify, gbc_textFieldcashRegisterActualStockModify);
		
		JLabel lblcashRegisterEstimatedStock = new JLabel("Soll-Bestand");
		lblcashRegisterEstimatedStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterEstimatedStock = new GridBagConstraints();
		gbc_lblcashRegisterEstimatedStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblcashRegisterEstimatedStock.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterEstimatedStock.gridx = 0;
		gbc_lblcashRegisterEstimatedStock.gridy = 2;
		panelcashRegisterManagement.add(lblcashRegisterEstimatedStock, gbc_lblcashRegisterEstimatedStock);
		
		textFieldcashRegisterEstimatedStock = new JTextField();
		textFieldcashRegisterEstimatedStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcashRegisterEstimatedStock.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterEstimatedStock = new GridBagConstraints();
		gbc_textFieldcashRegisterEstimatedStock.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterEstimatedStock.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldcashRegisterEstimatedStock.gridx = 2;
		gbc_textFieldcashRegisterEstimatedStock.gridy = 2;
		panelcashRegisterManagement.add(textFieldcashRegisterEstimatedStock, gbc_textFieldcashRegisterEstimatedStock);
		
		JLabel lblcashRegisterEstimatedStockModify = new JLabel("Soll-Bestand");
		lblcashRegisterEstimatedStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterEstimatedStockModify = new GridBagConstraints();
		gbc_lblcashRegisterEstimatedStockModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterEstimatedStockModify.gridx = 3;
		gbc_lblcashRegisterEstimatedStockModify.gridy = 2;
		panelcashRegisterManagement.add(lblcashRegisterEstimatedStockModify, gbc_lblcashRegisterEstimatedStockModify);
		
		textFieldcashRegisterEstimatedStockModify = new JTextField();
		textFieldcashRegisterEstimatedStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcashRegisterEstimatedStockModify.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterEstimatedStockModify = new GridBagConstraints();
		gbc_textFieldcashRegisterEstimatedStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterEstimatedStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldcashRegisterEstimatedStockModify.gridx = 5;
		gbc_textFieldcashRegisterEstimatedStockModify.gridy = 2;
		panelcashRegisterManagement.add(textFieldcashRegisterEstimatedStockModify, gbc_textFieldcashRegisterEstimatedStockModify);
		
		JButton btnaddcashRegister = new JButton("Kasse hinzufügen");
		btnaddcashRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnaddcashRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnaddcashRegister = new GridBagConstraints();
		gbc_btnaddcashRegister.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddcashRegister.insets = new Insets(0, 0, 5, 5);
		gbc_btnaddcashRegister.gridx = 2;
		gbc_btnaddcashRegister.gridy = 3;
		panelcashRegisterManagement.add(btnaddcashRegister, gbc_btnaddcashRegister);
		
		JButton btncashRegisterSaveChanges = new JButton("Änderungen speichern");
		btncashRegisterSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncashRegisterSaveChanges.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btncashRegisterSaveChanges = new GridBagConstraints();
		gbc_btncashRegisterSaveChanges.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncashRegisterSaveChanges.insets = new Insets(0, 0, 5, 0);
		gbc_btncashRegisterSaveChanges.gridx = 5;
		gbc_btncashRegisterSaveChanges.gridy = 3;
		panelcashRegisterManagement.add(btncashRegisterSaveChanges, gbc_btncashRegisterSaveChanges);
		
		JButton btncashRegisterClearInputs = new JButton("Felder zurücksetzen");
		btncashRegisterClearInputs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			textFieldcashRegisterName.setText("");
			textFieldcashRegisterActualStock.setText("");
			textFieldcashRegisterEstimatedStock.setText("");
			
			}
		});
		btncashRegisterClearInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btncashRegisterClearInputs = new GridBagConstraints();
		gbc_btncashRegisterClearInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncashRegisterClearInputs.insets = new Insets(0, 0, 5, 5);
		gbc_btncashRegisterClearInputs.gridx = 2;
		gbc_btncashRegisterClearInputs.gridy = 4;
		panelcashRegisterManagement.add(btncashRegisterClearInputs, gbc_btncashRegisterClearInputs);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 6;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 6;
		panelcashRegisterManagement.add(scrollPane, gbc_scrollPane);
		
		tablecashRegister = new JTable();
		scrollPane.setViewportView(tablecashRegister);
		
		JButton btncashRegisterDelete = new JButton("Kasse löschen");
		btncashRegisterDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btncashRegisterDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btncashRegisterDelete = new GridBagConstraints();
		gbc_btncashRegisterDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncashRegisterDelete.gridwidth = 4;
		gbc_btncashRegisterDelete.gridx = 2;
		gbc_btncashRegisterDelete.gridy = 7;
		panelcashRegisterManagement.add(btncashRegisterDelete, gbc_btncashRegisterDelete);
		
		JMenuBar menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);
		
		JMenu mnNewMenuOptions = new JMenu("Menü");
		mnNewMenuOptions.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuOptions);
		
		JMenuItem mntmNewMenuItembacktoMain = new JMenuItem("Hauptmen\u00FC");
		mntmNewMenuItembacktoMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			GuiMenue backmen = new GuiMenue();
			frmElabVerwaltungsprogramm.dispose();
			
			
			}
		});
		mntmNewMenuItembacktoMain.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuOptions.add(mntmNewMenuItembacktoMain);
	
		
		JMenuItem mntmNewMenuItemlogOut = new JMenuItem("Ausloggen");
		mntmNewMenuItemlogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GuiLogin logout = new GuiLogin();
				frmElabVerwaltungsprogramm.dispose();
				
			}
		});
		mntmNewMenuItemlogOut.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuOptions.add(mntmNewMenuItemlogOut);
		
		
		JMenuItem mntmNewMenuItemcloseapplication = new JMenuItem("Anwendung verlassen");
		mntmNewMenuItemcloseapplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			
			}
		});
		mntmNewMenuItemcloseapplication.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuOptions.add(mntmNewMenuItemcloseapplication);
	
		
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

	
	
}
