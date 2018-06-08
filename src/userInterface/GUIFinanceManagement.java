package userInterface;

// author Nils 

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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import DataAccess.SQLManager;
import logic.CashRegister;
import logic.FinancialManagement;
import logic.Order;
import logic.Person;
import logic.PersonManagement;
import logic.Pot;
import logic.ProductionManagement;

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
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.Frame;

public class GUIFinanceManagement {

	private JFrame frmElabVerwaltungsprogramm;
	
	private JTextField textFieldbillName;
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
	private JTextField textFieldOrderSearch;
	private JTextField textFieldbillNameModify;
	private JTextField textFieldsumBillModify;
	private JTextField textFieldcustomerIDModify;
	private JTextField textFieldrelatedPersonModify;
	private JTextField textField_7;
	private JTextField textFieldBillIDModify;
	private JTextField textFieldCashRegisterIDModify;
	private JTextField textFieldPotIDModify;
	
	private JTable tableCashRegister;
	private JTable tableBillModify;
	private JTable tableNewBill;
	private JTable tableDeleteBill;
	private JTable tableJar;
	
	private JComboBox comboBoxrelatedOrder;
	
	JComboBox comboBoxpaymentTypModify = new JComboBox();
	JComboBox comboBoxpaymentTyp = new JComboBox();
	JComboBox comboBoxCashRegisterTypeModify = new JComboBox();
	JComboBox comboBoxPotRegisterIDModify = new JComboBox();
	
	private List<String> comboBoxEntries;
	private List<String> comboBoxStatusEntries;
	private JTextField textField;
	
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
		comboBoxEntries= new ArrayList<String>();
		comboBoxEntries.add("Bar");
		comboBoxEntries.add("Konto");
		comboBoxEntries.add("Kostenstelle");
		
		comboBoxStatusEntries = new ArrayList<String>();
		comboBoxStatusEntries.add("Nicht bezahlt");
		comboBoxStatusEntries.add("Bezahlt");
		
		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmElabVerwaltungsprogramm.setUndecorated(true);
	
		frmElabVerwaltungsprogramm.setTitle("Elab Verwaltungsprogramm");
		frmElabVerwaltungsprogramm.setBounds(100, 100, 1036, 727);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
		gbl_panelcreateBill.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelcreateBill.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panelcreateBill.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0};
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
		gbc_lblrelatedOrder.gridy = 2;
		gbc_lblrelatedOrder.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedOrder.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedOrder.gridx = 0;
		panelcreateBill.add(lblrelatedOrder, gbc_lblrelatedOrder);
		
		JComboBox comboBoxrelatedOrder = new JComboBox();
		try {
			for(Order o : SQLManager.getInstance().getOrders()){
				comboBoxrelatedOrder.addItem(o.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBoxrelatedOrder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxrelatedOrder = new GridBagConstraints();
		gbc_comboBoxrelatedOrder.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxrelatedOrder.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxrelatedOrder.gridx = 1;
		gbc_comboBoxrelatedOrder.gridy = 2;
		panelcreateBill.add(comboBoxrelatedOrder, gbc_comboBoxrelatedOrder);
		
		JLabel lblpaymentTyp = new JLabel("Bezahlart");
		lblpaymentTyp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpaymentTyp = new GridBagConstraints();
		gbc_lblpaymentTyp.anchor = GridBagConstraints.EAST;
		gbc_lblpaymentTyp.insets = new Insets(0, 0, 5, 5);
		gbc_lblpaymentTyp.gridx = 0;
		gbc_lblpaymentTyp.gridy = 3;
		panelcreateBill.add(lblpaymentTyp, gbc_lblpaymentTyp);
		
		JComboBox comboBoxpaymentTyp = new JComboBox();
		comboBoxpaymentTyp.setModel(new DefaultComboBoxModel(comboBoxEntries.toArray()));
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
		
		textFieldhouseNumber = new JTextField("");
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
		textresponsiblePerson.setEditable(false);
		textresponsiblePerson.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textresponsiblePerson = new GridBagConstraints();
		gbc_textresponsiblePerson.fill = GridBagConstraints.HORIZONTAL;
		gbc_textresponsiblePerson.insets = new Insets(0, 0, 5, 0);
		gbc_textresponsiblePerson.gridx = 1;
		gbc_textresponsiblePerson.gridy = 6;
		panelcreateBill.add(textresponsiblePerson, gbc_textresponsiblePerson);
		textresponsiblePerson.setColumns(10);
		
		JLabel lblrelatedCashRegister = new JLabel("zugehörige Kasse");
		lblrelatedCashRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedCashRegister = new GridBagConstraints();
		gbc_lblrelatedCashRegister.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedCashRegister.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedCashRegister.gridx = 0;
		gbc_lblrelatedCashRegister.gridy = 7;
		panelcreateBill.add(lblrelatedCashRegister, gbc_lblrelatedCashRegister);
		
		JComboBox comboBoxrelatedCashRegister = new JComboBox();
		try {
			for(CashRegister c : SQLManager.getInstance().getRegisterArray()){
				comboBoxrelatedCashRegister.addItem(c.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBoxrelatedCashRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxrelatedCashRegister = new GridBagConstraints();
		gbc_comboBoxrelatedCashRegister.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxrelatedCashRegister.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxrelatedCashRegister.gridx = 1;
		gbc_comboBoxrelatedCashRegister.gridy = 7;
		panelcreateBill.add(comboBoxrelatedCashRegister, gbc_comboBoxrelatedCashRegister);
		
		JLabel lblrelatedJar = new JLabel("zugehöriger Topf");
		lblrelatedJar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedJar = new GridBagConstraints();
		gbc_lblrelatedJar.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedJar.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedJar.gridx = 0;
		gbc_lblrelatedJar.gridy = 8;
		panelcreateBill.add(lblrelatedJar, gbc_lblrelatedJar);
		
		JComboBox comboBoxrelatedJar = new JComboBox();
		try {
			for(Pot p : SQLManager.getInstance().getPotArray()){
				comboBoxrelatedJar.addItem(p.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBoxrelatedJar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxrelatedJar = new GridBagConstraints();
		gbc_comboBoxrelatedJar.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxrelatedJar.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxrelatedJar.gridx = 1;
		gbc_comboBoxrelatedJar.gridy = 8;
		panelcreateBill.add(comboBoxrelatedJar, gbc_comboBoxrelatedJar);
		
		JLabel BillStatus = new JLabel("Status");
		BillStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_BillStatus = new GridBagConstraints();
		gbc_BillStatus.anchor = GridBagConstraints.EAST;
		gbc_BillStatus.insets = new Insets(0, 0, 5, 5);
		gbc_BillStatus.gridx = 0;
		gbc_BillStatus.gridy = 9;
		panelcreateBill.add(BillStatus, gbc_BillStatus);
		
		JComboBox comboBoxBillStatus = new JComboBox();
		comboBoxBillStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxBillStatus.setModel(new DefaultComboBoxModel(comboBoxStatusEntries.toArray()));
		GridBagConstraints gbc_comboBoxBillStatus = new GridBagConstraints();
		gbc_comboBoxBillStatus.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxBillStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxBillStatus.gridx = 1;
		gbc_comboBoxBillStatus.gridy = 9;
		panelcreateBill.add(comboBoxBillStatus, gbc_comboBoxBillStatus);
		
		JButton btnaddBill = new JButton("Rechnung hinzufügen");
		btnaddBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FinancialManagement.addBillStatus(
						(FinancialManagement.addBill(
						SQLManager.getInstance().getOrders().get(comboBoxrelatedOrder.getSelectedIndex()).getOrderId(), 
						SQLManager.getInstance().getPotArray().get(comboBoxrelatedJar.getSelectedIndex()).getId(),
						SQLManager.getInstance().getRegisterArray().get(comboBoxrelatedCashRegister.getSelectedIndex()).getId(),
						Integer.parseInt(textFieldcustomerID.getText()),
						Integer.parseInt(textresponsiblePerson.getText()), 
						textFieldbillName.getText(),
						comboBoxpaymentTyp.getSelectedIndex(),
						Double.parseDouble(textFieldhouseNumber.getText())
						))
						,comboBoxBillStatus.getSelectedIndex());

					
					refreshTableNewBill();
					
					textFieldbillName.setText("");
					comboBoxrelatedOrder.setSelectedIndex(-1);
					comboBoxrelatedJar.setSelectedIndex(-1);
					comboBoxrelatedCashRegister.setSelectedIndex(-1);
					textFieldcustomerID.setText("");
					textresponsiblePerson.setText("");
					comboBoxpaymentTyp.setSelectedIndex(-1);
					comboBoxBillStatus.setSelectedIndex(0);
				} catch (Exception a) {
					a.printStackTrace();
				}
			}
		}); 
		

		btnaddBill.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnaddBill = new GridBagConstraints();
		gbc_btnaddBill.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddBill.insets = new Insets(0, 0, 5, 0);
		gbc_btnaddBill.gridx = 1;
		gbc_btnaddBill.gridy = 10;
		panelcreateBill.add(btnaddBill, gbc_btnaddBill);
		
		JButton btndeleteallInputs = new JButton("Eingaben löschen");
		btndeleteallInputs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBoxpaymentTyp.setSelectedIndex(0);
				textFieldhouseNumber.setText("");
				textFieldbillName.setText("");
			}
		});
		btndeleteallInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btndeleteallInputs = new GridBagConstraints();
		gbc_btndeleteallInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputs.gridx = 1;
		gbc_btndeleteallInputs.gridy = 11;
		panelcreateBill.add(btndeleteallInputs, gbc_btndeleteallInputs);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_1.gridwidth = 2;
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 0;
		gbc_scrollPane_1.gridy = 12;
		panelcreateBill.add(scrollPane_1, gbc_scrollPane_1);
		
		tableNewBill = new JTable();
		tableNewBill.setFont(new Font("Tahoma", Font.PLAIN, 15));
		try {
			tableNewBill.setModel(new OrderTableModel(FinancialManagement.getOrders()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableNewBill.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_1.setViewportView(tableNewBill);
		tableNewBill.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				handleEditOrderSelectionEvent(e);

			}
		});
		tableNewBill.clearSelection();
		
		
		JComboBox comboBoxOrderSearch = new JComboBox();
		comboBoxOrderSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxOrderSearch.setModel(new DefaultComboBoxModel(new String[] {"Titel", "Art", "Status"}));
		GridBagConstraints gbc_comboBoxOrderSearch = new GridBagConstraints();
		gbc_comboBoxOrderSearch.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxOrderSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOrderSearch.gridx = 0;
		gbc_comboBoxOrderSearch.gridy = 13;
		panelcreateBill.add(comboBoxOrderSearch, gbc_comboBoxOrderSearch);
		
		textFieldOrderSearch = new JTextField();
		textFieldOrderSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldOrderSearch = new GridBagConstraints();
		gbc_textFieldOrderSearch.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldOrderSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldOrderSearch.gridx = 1;
		gbc_textFieldOrderSearch.gridy = 13;
		panelcreateBill.add(textFieldOrderSearch, gbc_textFieldOrderSearch);
		textFieldOrderSearch.setColumns(10);
		
		JButton btnnewbillOrderSearch = new JButton("Auftrag suchen");
		btnnewbillOrderSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchValue = textFieldOrderSearch.getText();
				switch(comboBoxOrderSearch.getSelectedIndex()) {
				case 0:
					try {
						tableNewBill.setModel(new OrderTableModel(ProductionManagement.getOrderByTitle(searchValue)));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 1:
					try {
						tableNewBill.setModel(new OrderTableModel(ProductionManagement.getOrdersByType(searchValue)));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 2:
					try {
						tableNewBill.setModel(new OrderTableModel(ProductionManagement.getOrdersByStatus(searchValue)));
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
		
		btnnewbillOrderSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnnewbillOrderSearch = new GridBagConstraints();
		gbc_btnnewbillOrderSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnnewbillOrderSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnnewbillOrderSearch.gridx = 1;
		gbc_btnnewbillOrderSearch.gridy = 14;
		panelcreateBill.add(btnnewbillOrderSearch, gbc_btnnewbillOrderSearch);
		
		JButton btnclearSearchBillNew = new JButton("Suche aufheben");
		btnclearSearchBillNew.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnclearSearchBillNew = new GridBagConstraints();
		gbc_btnclearSearchBillNew.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnclearSearchBillNew.gridx = 1;
		gbc_btnclearSearchBillNew.gridy = 15;
		panelcreateBill.add(btnclearSearchBillNew, gbc_btnclearSearchBillNew);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Rechnung ändern", null, panel, null);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JLabel lblBillIDModify = new JLabel("ID Rechnung");
		lblBillIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblBillIDModify = new GridBagConstraints();
		gbc_lblBillIDModify.anchor = GridBagConstraints.EAST;
		gbc_lblBillIDModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblBillIDModify.gridx = 0;
		gbc_lblBillIDModify.gridy = 1;
		panel.add(lblBillIDModify, gbc_lblBillIDModify);

		textFieldBillIDModify = new JTextField();
		textFieldBillIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldBillIDModify.setEditable(false);
		GridBagConstraints gbc_textFieldBillIDModify = new GridBagConstraints();
		gbc_textFieldBillIDModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldBillIDModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldBillIDModify.gridx = 1;
		gbc_textFieldBillIDModify.gridy = 1;
		panel.add(textFieldBillIDModify, gbc_textFieldBillIDModify);
		textFieldBillIDModify.setColumns(10);

		JLabel lblbillNameModify = new JLabel("Rechnungsname");
		lblbillNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblbillNameModify = new GridBagConstraints();
		gbc_lblbillNameModify.anchor = GridBagConstraints.EAST;
		gbc_lblbillNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblbillNameModify.gridx = 0;
		gbc_lblbillNameModify.gridy = 2;
		panel.add(lblbillNameModify, gbc_lblbillNameModify);
		
		textFieldbillNameModify = new JTextField();
		textFieldbillNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldbillNameModify.setColumns(10);
		GridBagConstraints gbc_textFieldbillNameModify = new GridBagConstraints();
		gbc_textFieldbillNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldbillNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldbillNameModify.gridx = 1;
		gbc_textFieldbillNameModify.gridy = 2;
		panel.add(textFieldbillNameModify, gbc_textFieldbillNameModify);
		
		JLabel lblrelatedOrderModify = new JLabel("dazugehöriger Auftrag");
		lblrelatedOrderModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedOrderModify = new GridBagConstraints();
		gbc_lblrelatedOrderModify.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedOrderModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedOrderModify.gridx = 0;
		gbc_lblrelatedOrderModify.gridy = 3;
		panel.add(lblrelatedOrderModify, gbc_lblrelatedOrderModify);
		
		JComboBox comboBoxrelatedOrderModify = new JComboBox();
		try {
			for(Order o : SQLManager.getInstance().getOrders()){
				comboBoxrelatedOrderModify.addItem(o.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBoxrelatedOrderModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxrelatedOrderModify = new GridBagConstraints();
		gbc_comboBoxrelatedOrderModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxrelatedOrderModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxrelatedOrderModify.gridx = 1;
		gbc_comboBoxrelatedOrderModify.gridy = 3;
		panel.add(comboBoxrelatedOrderModify, gbc_comboBoxrelatedOrderModify);
		
		JLabel lblpaymentTypModify = new JLabel("Bezahlart");
		lblpaymentTypModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpaymentTypModify = new GridBagConstraints();
		gbc_lblpaymentTypModify.anchor = GridBagConstraints.EAST;
		gbc_lblpaymentTypModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblpaymentTypModify.gridx = 0;
		gbc_lblpaymentTypModify.gridy = 4;
		panel.add(lblpaymentTypModify, gbc_lblpaymentTypModify);
		
		JComboBox comboBoxpaymentTypModify = new JComboBox();
		comboBoxpaymentTypModify.setModel(new DefaultComboBoxModel(comboBoxEntries.toArray()));
		comboBoxpaymentTypModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxpaymentTypModify = new GridBagConstraints();
		gbc_comboBoxpaymentTypModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxpaymentTypModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxpaymentTypModify.gridx = 1;
		gbc_comboBoxpaymentTypModify.gridy = 4;
		panel.add(comboBoxpaymentTypModify, gbc_comboBoxpaymentTypModify);
		
		JLabel lblsumBillModify = new JLabel("Endbetrag");
		lblsumBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblsumBillModify = new GridBagConstraints();
		gbc_lblsumBillModify.anchor = GridBagConstraints.EAST;
		gbc_lblsumBillModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblsumBillModify.gridx = 0;
		gbc_lblsumBillModify.gridy = 5;
		panel.add(lblsumBillModify, gbc_lblsumBillModify);
		
		textFieldsumBillModify = new JTextField();
		textFieldsumBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldsumBillModify.setColumns(10);
		GridBagConstraints gbc_textFieldsumBillModify = new GridBagConstraints();
		gbc_textFieldsumBillModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldsumBillModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldsumBillModify.gridx = 1;
		gbc_textFieldsumBillModify.gridy = 5;
		panel.add(textFieldsumBillModify, gbc_textFieldsumBillModify);
		
		JLabel lblcustomerIDModify = new JLabel("Kundennummer");
		lblcustomerIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcustomerIDModify = new GridBagConstraints();
		gbc_lblcustomerIDModify.anchor = GridBagConstraints.EAST;
		gbc_lblcustomerIDModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcustomerIDModify.gridx = 0;
		gbc_lblcustomerIDModify.gridy = 6;
		panel.add(lblcustomerIDModify, gbc_lblcustomerIDModify);
		
		textFieldcustomerIDModify = new JTextField();
		textFieldcustomerIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcustomerIDModify.setEditable(false);
		textFieldcustomerIDModify.setColumns(10);
		GridBagConstraints gbc_textFieldcustomerIDModify = new GridBagConstraints();
		gbc_textFieldcustomerIDModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcustomerIDModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldcustomerIDModify.gridx = 1;
		gbc_textFieldcustomerIDModify.gridy = 6;
		panel.add(textFieldcustomerIDModify, gbc_textFieldcustomerIDModify);
		
		JLabel lblrelatedPersonModify = new JLabel("Verantwortlicher");
		lblrelatedPersonModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedPersonModify = new GridBagConstraints();
		gbc_lblrelatedPersonModify.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedPersonModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedPersonModify.gridx = 0;
		gbc_lblrelatedPersonModify.gridy = 7;
		panel.add(lblrelatedPersonModify, gbc_lblrelatedPersonModify);
		
		textFieldrelatedPersonModify = new JTextField();
		textFieldrelatedPersonModify.setEditable(false);
		textFieldrelatedPersonModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldrelatedPersonModify.setColumns(10);
		GridBagConstraints gbc_textFieldrelatedPersonModify = new GridBagConstraints();
		gbc_textFieldrelatedPersonModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldrelatedPersonModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldrelatedPersonModify.gridx = 1;
		gbc_textFieldrelatedPersonModify.gridy = 7;
		panel.add(textFieldrelatedPersonModify, gbc_textFieldrelatedPersonModify);
		
		JLabel lblrelatedCashRegisterModify = new JLabel("zugehörige Kasse");
		lblrelatedCashRegisterModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedCashRegisterModify = new GridBagConstraints();
		gbc_lblrelatedCashRegisterModify.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedCashRegisterModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedCashRegisterModify.gridx = 0;
		gbc_lblrelatedCashRegisterModify.gridy = 8;
		panel.add(lblrelatedCashRegisterModify, gbc_lblrelatedCashRegisterModify);
		
		JComboBox comboBoxrelatedCashRegisterModify = new JComboBox();
		try {
			for(CashRegister c : SQLManager.getInstance().getRegisterArray()){
				comboBoxrelatedCashRegisterModify.addItem(c.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBoxrelatedCashRegisterModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxrelatedCashRegisterModify = new GridBagConstraints();
		gbc_comboBoxrelatedCashRegisterModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxrelatedCashRegisterModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxrelatedCashRegisterModify.gridx = 1;
		gbc_comboBoxrelatedCashRegisterModify.gridy = 8;
		panel.add(comboBoxrelatedCashRegisterModify, gbc_comboBoxrelatedCashRegisterModify);
		
		JLabel lblrelatedJarModify = new JLabel("zugehöriger Topf");
		lblrelatedJarModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblrelatedJarModify = new GridBagConstraints();
		gbc_lblrelatedJarModify.anchor = GridBagConstraints.EAST;
		gbc_lblrelatedJarModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblrelatedJarModify.gridx = 0;
		gbc_lblrelatedJarModify.gridy = 9;
		panel.add(lblrelatedJarModify, gbc_lblrelatedJarModify);
		
		JComboBox comboBoxrelatedJarModify = new JComboBox();
		try {
			for(Pot p : SQLManager.getInstance().getPotArray()){
				comboBoxrelatedJarModify.addItem(p.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBoxrelatedJarModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxrelatedJarModify = new GridBagConstraints();
		gbc_comboBoxrelatedJarModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxrelatedJarModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxrelatedJarModify.gridx = 1;
		gbc_comboBoxrelatedJarModify.gridy = 9;
		panel.add(comboBoxrelatedJarModify, gbc_comboBoxrelatedJarModify);
		
		JLabel BillStatusModify = new JLabel("Status");
		BillStatusModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_BillStatusModify = new GridBagConstraints();
		gbc_BillStatusModify.anchor = GridBagConstraints.EAST;
		gbc_BillStatusModify.insets = new Insets(0, 0, 5, 5);
		gbc_BillStatusModify.gridx = 0;
		gbc_BillStatusModify.gridy = 10;
		panel.add(BillStatusModify, gbc_BillStatusModify);
		

		JComboBox comboBoxBillStatusModify = new JComboBox();
		comboBoxBillStatusModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxBillStatusModify.setModel(new DefaultComboBoxModel(comboBoxStatusEntries.toArray()));
		GridBagConstraints gbc_comboBoxBillStatusModify = new GridBagConstraints();
		gbc_comboBoxBillStatusModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxBillStatusModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxBillStatusModify.gridx = 1;
		gbc_comboBoxBillStatusModify.gridy = 10;
		panel.add(comboBoxBillStatusModify, gbc_comboBoxBillStatusModify);
		
		JButton btnsaveBillModify = new JButton("Rechnung ändern");
		btnsaveBillModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 FinancialManagement.modifyBill(
							 	Integer.parseInt(textFieldBillIDModify.getText()),
							 	SQLManager.getInstance().getOrders().get(comboBoxrelatedOrderModify.getSelectedIndex()).getOrderId(), 
								SQLManager.getInstance().getPotArray().get(comboBoxrelatedJar.getSelectedIndex()).getId(),
								SQLManager.getInstance().getRegisterArray().get(comboBoxrelatedCashRegister.getSelectedIndex()).getId(),
								textFieldbillName.getText(),
								comboBoxpaymentTyp.getSelectedIndex(),
								Double.parseDouble(textFieldhouseNumber.getText())
								);
					FinancialManagement.changeBillStatus(Integer.parseInt(textFieldBillIDModify.getText()), comboBoxBillStatusModify.getSelectedIndex());
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refreshTableBillModify();
				refreshTableDeleteBill();
			}
		});
		

		btnsaveBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnsaveBillModify = new GridBagConstraints();
		gbc_btnsaveBillModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsaveBillModify.insets = new Insets(0, 0, 5, 0);
		gbc_btnsaveBillModify.gridx = 1;
		gbc_btnsaveBillModify.gridy = 11;
		panel.add(btnsaveBillModify, gbc_btnsaveBillModify);
		
		JButton btndeleteallInputsModify = new JButton("Felder leeren");
		btndeleteallInputsModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBoxpaymentTypModify.setSelectedIndex(0);
				textFieldsumBillModify.setText("");
				textFieldbillNameModify.setText("");
			}
		});
		btndeleteallInputsModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btndeleteallInputsModify = new GridBagConstraints();
		gbc_btndeleteallInputsModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputsModify.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputsModify.gridx = 1;
		gbc_btndeleteallInputsModify.gridy = 12;
		panel.add(btndeleteallInputsModify, gbc_btndeleteallInputsModify);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridwidth = 2;
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane_2.gridx = 0;
		gbc_scrollPane_2.gridy = 13;
		panel.add(scrollPane_2, gbc_scrollPane_2);
		
		tableBillModify = new JTable();
		tableBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		try {
			tableBillModify.setModel(new BillTableModel(FinancialManagement.getBills()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableBillModify.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_2.setViewportView(tableBillModify);
		tableBillModify.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				handleEditOrderSelectionEvent(e);

			}
		});
		tableBillModify.clearSelection();
		
		JComboBox comboBoxBillSearch = new JComboBox();
		comboBoxBillSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxBillSearch.setModel(new DefaultComboBoxModel(new String[] {"Name", "Datum", "Status"}));
		GridBagConstraints gbc_comboBoxBillSearch = new GridBagConstraints();
		gbc_comboBoxBillSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxBillSearch.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxBillSearch.gridx = 0;
		gbc_comboBoxBillSearch.gridy = 13;
		panel.add(comboBoxBillSearch, gbc_comboBoxBillSearch);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 13;
		panel.add(textField_7, gbc_textField_7);
		
		JButton btnSearchBillModify = new JButton("Rechnung suchen");
		btnSearchBillModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchValue = textFieldOrderSearch.getText();
				switch(comboBoxOrderSearch.getSelectedIndex()) {
				case 0:
					try {
						tableBillModify.setModel(new BillTableModel(FinancialManagement.getBillByName(searchValue)));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 1:
					try {
						tableBillModify.setModel(new BillTableModel(FinancialManagement.getBillsByDate(searchValue)));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 2:
					try {
						tableBillModify.setModel(new BillTableModel(FinancialManagement.getBillsByStatus(searchValue)));
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
		
		JComboBox comboBoxsearchBillModify = new JComboBox();
		comboBoxsearchBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxsearchBillModify = new GridBagConstraints();
		gbc_comboBoxsearchBillModify.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxsearchBillModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxsearchBillModify.gridx = 0;
		gbc_comboBoxsearchBillModify.gridy = 14;
		panel.add(comboBoxsearchBillModify, gbc_comboBoxsearchBillModify);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 14;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		btnSearchBillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnSearchBillModify = new GridBagConstraints();
		gbc_btnSearchBillModify.insets = new Insets(0, 0, 5, 0);
		gbc_btnSearchBillModify.fill = GridBagConstraints.BOTH;
		gbc_btnSearchBillModify.gridx = 1;
		gbc_btnSearchBillModify.gridy = 15;
		panel.add(btnSearchBillModify, gbc_btnSearchBillModify);
		
		JButton btnclearSearchbillModify = new JButton("Suche aufgeben");
		btnclearSearchbillModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnclearSearchbillModify = new GridBagConstraints();
		gbc_btnclearSearchbillModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnclearSearchbillModify.gridx = 1;
		gbc_btnclearSearchbillModify.gridy = 16;
		panel.add(btnclearSearchbillModify, gbc_btnclearSearchbillModify);
		
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
		
		tableDeleteBill = new JTable();
		tableDeleteBill.setFont(new Font("Tahoma", Font.PLAIN, 15));
		try {
			tableDeleteBill.setModel(new BillTableModel(FinancialManagement.getBills()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableDeleteBill.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_3.setViewportView(tableDeleteBill);
		tableDeleteBill.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				handleEditOrderSelectionEvent(e);

			}
		});
		tableDeleteBill.clearSelection();
		
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
				String searchValue = textFielddeleteBillSearch.getText();
				switch(comboBoxdeleteBillSearch.getSelectedIndex()) {
				case 0:
					try {
						tableDeleteBill.setModel(new BillTableModel(FinancialManagement.getBillByName(searchValue)));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 1:
					try {
						tableDeleteBill.setModel(new BillTableModel(FinancialManagement.getBillsByDate(searchValue)));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				case 2:
					try {
						tableDeleteBill.setModel(new BillTableModel(FinancialManagement.getBillsByStatus(searchValue)));
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
				try {
					FinancialManagement.deleteBill(Integer
							.parseInt(tableDeleteBill.getValueAt(tableDeleteBill.getSelectedRow(), 0).toString()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refreshTableBillModify();
				refreshTableDeleteBill();
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
		
		JLabel lblPotIDModify = new JLabel("ID");
		lblPotIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPotIDModify = new GridBagConstraints();
		gbc_lblPotIDModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblPotIDModify.gridx = 3;
		gbc_lblPotIDModify.gridy = 0;
		panelJarManagement.add(lblPotIDModify, gbc_lblPotIDModify);
		
		textFieldPotIDModify = new JTextField();
		textFieldPotIDModify.setEditable(false);
		textFieldPotIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldPotIDModify.setColumns(10);
		GridBagConstraints gbc_textFieldPotIDModify = new GridBagConstraints();
		gbc_textFieldPotIDModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldPotIDModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldPotIDModify.gridx = 5;
		gbc_textFieldPotIDModify.gridy = 0;
		panelJarManagement.add(textFieldPotIDModify, gbc_textFieldPotIDModify);
		
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
		gbc_lbljarNameModify.gridy = 1;
		panelJarManagement.add(lbljarNameModify, gbc_lbljarNameModify);
		
		textFieldjarNameModify = new JTextField();
		textFieldjarNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldjarNameModify = new GridBagConstraints();
		gbc_textFieldjarNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldjarNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarNameModify.gridx = 5;
		gbc_textFieldjarNameModify.gridy = 1;
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
		gbc_lbljarActualStockModify.gridy = 2;
		panelJarManagement.add(lbljarActualStockModify, gbc_lbljarActualStockModify);
		
		textFieldjarActualStockModify = new JTextField();
		textFieldjarActualStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldjarActualStockModify = new GridBagConstraints();
		gbc_textFieldjarActualStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldjarActualStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarActualStockModify.gridx = 5;
		gbc_textFieldjarActualStockModify.gridy = 2;
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
		gbc_lbljarEstimatedStockModify.gridy = 3;
		panelJarManagement.add(lbljarEstimatedStockModify, gbc_lbljarEstimatedStockModify);
		
		textFieldjarEstimatedStockModify = new JTextField();
		textFieldjarEstimatedStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldjarEstimatedStockModify = new GridBagConstraints();
		gbc_textFieldjarEstimatedStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldjarEstimatedStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldjarEstimatedStockModify.gridx = 5;
		gbc_textFieldjarEstimatedStockModify.gridy = 3;
		panelJarManagement.add(textFieldjarEstimatedStockModify, gbc_textFieldjarEstimatedStockModify);
		textFieldjarEstimatedStockModify.setColumns(10);
		
		JLabel lblPotRegisterID = new JLabel("Zugehörige Kasse");
		lblPotRegisterID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPotRegisterID = new GridBagConstraints();
		gbc_lblPotRegisterID.insets = new Insets(0, 0, 5, 5);
		gbc_lblPotRegisterID.gridx = 0;
		gbc_lblPotRegisterID.gridy = 3;
		panelJarManagement.add(lblPotRegisterID, gbc_lblPotRegisterID);
		
		JComboBox comboBoxPotRegisterID = new JComboBox();
		try {
			for(CashRegister c : SQLManager.getInstance().getRegisterArray()){
				comboBoxPotRegisterID.addItem(c.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBoxPotRegisterID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxPotRegisterID = new GridBagConstraints();
		gbc_comboBoxPotRegisterID.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPotRegisterID.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxPotRegisterID.gridx = 2;
		gbc_comboBoxPotRegisterID.gridy = 3;
		panelJarManagement.add(comboBoxPotRegisterID, gbc_comboBoxPotRegisterID);
		
		JLabel lblPotRegisterIDModify = new JLabel("Zugehörige Kasse");
		lblPotRegisterIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPotRegisterIDModify = new GridBagConstraints();
		gbc_lblPotRegisterIDModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblPotRegisterIDModify.gridx = 3;
		gbc_lblPotRegisterIDModify.gridy = 4;
		panelJarManagement.add(lblPotRegisterIDModify, gbc_lblPotRegisterIDModify);
		
		JComboBox comboBoxPotRegisterIDModify = new JComboBox();
		try {
			for(CashRegister c : SQLManager.getInstance().getRegisterArray()){
				comboBoxPotRegisterIDModify.addItem(c.toString());
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBoxPotRegisterIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxPotRegisterIDModify = new GridBagConstraints();
		gbc_comboBoxPotRegisterIDModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPotRegisterIDModify.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxPotRegisterIDModify.gridx = 5;
		gbc_comboBoxPotRegisterIDModify.gridy = 4;
		panelJarManagement.add(comboBoxPotRegisterIDModify, gbc_comboBoxPotRegisterIDModify);
		
		JButton btnaddJar = new JButton("Topf hinzufügen");
		btnaddJar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 FinancialManagement.addPot(
							 textFieldjarName.getText(), 
							 Double.parseDouble(textFieldjarActualStock.getText()),
							 Double.parseDouble(textFieldjarEstimatedStock.getText()), 
							 SQLManager.getInstance().getRegisterArray().get(comboBoxPotRegisterID.getSelectedIndex()).getId());
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refreshTableJar();
				textFieldjarName.setText("");
				textFieldjarActualStock.setText("");
				textFieldjarEstimatedStock.setText("");
				comboBoxPotRegisterID.setSelectedIndex(0);
			}
		});
		btnaddJar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnaddJar = new GridBagConstraints();
		gbc_btnaddJar.insets = new Insets(0, 0, 5, 5);
		gbc_btnaddJar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddJar.gridx = 2;
		gbc_btnaddJar.gridy = 4;
		panelJarManagement.add(btnaddJar, gbc_btnaddJar);
		
		JButton btnjarSaveChanges = new JButton("Änderungen speichern");
		btnjarSaveChanges.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						 FinancialManagement.modifyPot(
								 Integer.parseInt(textFieldPotIDModify.getText()),
								 Double.parseDouble(textFieldjarActualStockModify.getText()),
								 Double.parseDouble(textFieldjarEstimatedStockModify.getText()), 
								 textFieldjarNameModify.getText(),  
								 FinancialManagement.getRegisterArray().get(comboBoxPotRegisterIDModify.getSelectedIndex()).getId());
								 //SQLManager.getInstance().getRegisterArray().get(comboBoxPotRegisterIDModify.getSelectedIndex()).getId());
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					refreshTableJar();
					textFieldPotIDModify.setText("");
					textFieldjarNameModify.setText("");
					textFieldjarActualStockModify.setText("");
					textFieldjarEstimatedStockModify.setText("");
					comboBoxPotRegisterIDModify.setSelectedIndex(-1);
				}
			});
		btnjarSaveChanges.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnjarSaveChanges = new GridBagConstraints();
		gbc_btnjarSaveChanges.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnjarSaveChanges.insets = new Insets(0, 0, 5, 0);
		gbc_btnjarSaveChanges.gridx = 5;
		gbc_btnjarSaveChanges.gridy = 5;
		panelJarManagement.add(btnjarSaveChanges, gbc_btnjarSaveChanges);
		
		JButton btnjarClearInputs = new JButton("Eingabe löschen");
		btnjarClearInputs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			textFieldjarName.setText("");
			textFieldjarActualStock.setText("");
			textFieldjarEstimatedStock.setText("");
			comboBoxPotRegisterID.setSelectedIndex(0);
			
			}
		});
		btnjarClearInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnjarClearInputs = new GridBagConstraints();
		gbc_btnjarClearInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnjarClearInputs.insets = new Insets(0, 0, 5, 5);
		gbc_btnjarClearInputs.gridx = 2;
		gbc_btnjarClearInputs.gridy = 5;
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
		
		tableJar = new JTable();
		tableJar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		try {
			tableJar.setModel(new PotTableModel(FinancialManagement.getPotArray()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableJar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPanejar.setViewportView(tableJar);
		tableJar.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				handleEditOrderSelectionEvent(e);

			}
		});
		tableJar.clearSelection();
		
		JButton btnjarDelete = new JButton("Topf löschen");
		btnjarDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try {
				FinancialManagement.deletePot(
					Integer.parseInt(tableJar.getValueAt(tableJar.getSelectedRow(), 0).toString()));
			    } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			    }
			    refreshTableJar();
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
		
		JLabel lblcashRegisterIDModify = new JLabel("ID");
		lblcashRegisterIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterIDModify = new GridBagConstraints();
		gbc_lblcashRegisterIDModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterIDModify.gridx = 3;
		gbc_lblcashRegisterIDModify.gridy = 0;
		panelcashRegisterManagement.add(lblcashRegisterIDModify, gbc_lblcashRegisterIDModify);
		
		textFieldCashRegisterIDModify = new JTextField();
		textFieldCashRegisterIDModify.setEditable(false);
		textFieldCashRegisterIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldCashRegisterIDModify.setColumns(10);
		GridBagConstraints gbc_textFieldCashRegisterIDModify = new GridBagConstraints();
		gbc_textFieldCashRegisterIDModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCashRegisterIDModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCashRegisterIDModify.gridx = 5;
		gbc_textFieldCashRegisterIDModify.gridy = 0;
		panelcashRegisterManagement.add(textFieldCashRegisterIDModify, gbc_textFieldCashRegisterIDModify);
		
		JLabel lblcashRegisterNameModify = new JLabel("Kassenname");
		lblcashRegisterNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterNameModify = new GridBagConstraints();
		gbc_lblcashRegisterNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterNameModify.gridx = 3;
		gbc_lblcashRegisterNameModify.gridy = 1;
		panelcashRegisterManagement.add(lblcashRegisterNameModify, gbc_lblcashRegisterNameModify);
		
		textFieldCashRegisterNameModify = new JTextField();
		textFieldCashRegisterNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldCashRegisterNameModify.setColumns(10);
		GridBagConstraints gbc_textFieldCashRegisterNameModify = new GridBagConstraints();
		gbc_textFieldCashRegisterNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCashRegisterNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCashRegisterNameModify.gridx = 5;
		gbc_textFieldCashRegisterNameModify.gridy = 1;
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
		gbc_lblcashRegisterActualStockModify.gridy = 2;
		panelcashRegisterManagement.add(lblcashRegisterActualStockModify, gbc_lblcashRegisterActualStockModify);
		
		textFieldcashRegisterActualStockModify = new JTextField("");
		textFieldcashRegisterActualStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcashRegisterActualStockModify.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterActualStockModify = new GridBagConstraints();
		gbc_textFieldcashRegisterActualStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterActualStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldcashRegisterActualStockModify.gridx = 5;
		gbc_textFieldcashRegisterActualStockModify.gridy = 2;
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
		gbc_lblcashRegisterEstimatedStockModify.gridy = 3;
		panelcashRegisterManagement.add(lblcashRegisterEstimatedStockModify, gbc_lblcashRegisterEstimatedStockModify);
		
		textFieldcashRegisterEstimatedStockModify = new JTextField("");
		textFieldcashRegisterEstimatedStockModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldcashRegisterEstimatedStockModify.setColumns(10);
		GridBagConstraints gbc_textFieldcashRegisterEstimatedStockModify = new GridBagConstraints();
		gbc_textFieldcashRegisterEstimatedStockModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldcashRegisterEstimatedStockModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldcashRegisterEstimatedStockModify.gridx = 5;
		gbc_textFieldcashRegisterEstimatedStockModify.gridy = 3;
		panelcashRegisterManagement.add(textFieldcashRegisterEstimatedStockModify, gbc_textFieldcashRegisterEstimatedStockModify);
		
		JLabel lblcashRegisterType = new JLabel("Kassen-Typ");
		lblcashRegisterType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterType = new GridBagConstraints();
		gbc_lblcashRegisterType.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterType.gridx = 0;
		gbc_lblcashRegisterType.gridy = 3;
		panelcashRegisterManagement.add(lblcashRegisterType, gbc_lblcashRegisterType);
		
		JComboBox comboBoxCashRegisterType = new JComboBox();
		comboBoxCashRegisterType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxCashRegisterType.setModel(new DefaultComboBoxModel(new String[] {"Typ-1", "Typ-2", "Typ-3"}));
		GridBagConstraints gbc_comboBoxCashRegisterType = new GridBagConstraints();
		gbc_comboBoxCashRegisterType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxCashRegisterType.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxCashRegisterType.gridx = 2;
		gbc_comboBoxCashRegisterType.gridy = 3;
		panelcashRegisterManagement.add(comboBoxCashRegisterType, gbc_comboBoxCashRegisterType);
		
		JLabel lblcashRegisterTypeModify = new JLabel("Kassen-Typ");
		lblcashRegisterTypeModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcashRegisterTypeModify = new GridBagConstraints();
		gbc_lblcashRegisterTypeModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcashRegisterTypeModify.gridx = 3;
		gbc_lblcashRegisterTypeModify.gridy = 4;
		panelcashRegisterManagement.add(lblcashRegisterTypeModify, gbc_lblcashRegisterTypeModify);
		
		JComboBox comboBoxCashRegisterTypeModify = new JComboBox();
		comboBoxCashRegisterTypeModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxCashRegisterTypeModify.setModel(new DefaultComboBoxModel(new String[] {"Typ-1", "Typ-2", "Typ-3"}));
		GridBagConstraints gbc_comboBoxCashRegisterTypeModify = new GridBagConstraints();
		gbc_comboBoxCashRegisterTypeModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxCashRegisterTypeModify.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxCashRegisterTypeModify.gridx = 5;
		gbc_comboBoxCashRegisterTypeModify.gridy = 4;
		panelcashRegisterManagement.add(comboBoxCashRegisterTypeModify, gbc_comboBoxCashRegisterTypeModify);
		
		JButton btnaddcashRegister = new JButton("Kasse hinzufügen");
		btnaddcashRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 FinancialManagement.addRegister(
							 textFieldcashRegisterName.getText(), 
							 Double.parseDouble(textFieldcashRegisterActualStock.getText()),
							 Double.parseDouble(textFieldcashRegisterEstimatedStock.getText()),  
							 comboBoxCashRegisterType.getSelectedIndex());
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//Emre+
				comboBoxPotRegisterID.removeAll();
				try {
				    for(int i = 0; i<FinancialManagement.getRegisterArray().size(); i++) {
				        comboBoxPotRegisterID.addItem(FinancialManagement.getRegisterArray().get(i));
				    }
				} catch (SQLException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				}
				refreshTableCashRegister();
				textFieldcashRegisterName.setText("");
				textFieldcashRegisterActualStock.setText("");
				textFieldcashRegisterEstimatedStock.setText("");
				comboBoxCashRegisterType.setSelectedIndex(0);
			}
		});
		btnaddcashRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnaddcashRegister = new GridBagConstraints();
		gbc_btnaddcashRegister.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddcashRegister.insets = new Insets(0, 0, 5, 5);
		gbc_btnaddcashRegister.gridx = 2;
		gbc_btnaddcashRegister.gridy = 4;
		panelcashRegisterManagement.add(btnaddcashRegister, gbc_btnaddcashRegister);
		
		JButton btncashRegisterSaveChanges = new JButton("Änderungen speichern");
		btncashRegisterSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 FinancialManagement.modifyRegister(
							 Integer.parseInt(textFieldCashRegisterIDModify.getText()),
							 Double.parseDouble(textFieldcashRegisterEstimatedStockModify.getText()), 
							 Double.parseDouble(textFieldcashRegisterActualStockModify.getText()),
							 textFieldCashRegisterNameModify.getText(),  
							 comboBoxCashRegisterType.getSelectedIndex());
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refreshTableCashRegister();
				textFieldCashRegisterIDModify.setText("");
				textFieldCashRegisterNameModify.setText("");
				textFieldcashRegisterActualStockModify.setText("");
				textFieldcashRegisterEstimatedStockModify.setText("");
				comboBoxCashRegisterTypeModify.setSelectedIndex(0);
			}
		});
		btncashRegisterSaveChanges.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btncashRegisterSaveChanges = new GridBagConstraints();
		gbc_btncashRegisterSaveChanges.fill = GridBagConstraints.HORIZONTAL;
		gbc_btncashRegisterSaveChanges.insets = new Insets(0, 0, 5, 0);
		gbc_btncashRegisterSaveChanges.gridx = 5;
		gbc_btncashRegisterSaveChanges.gridy = 5;
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
		gbc_scrollPane.gridy = 6;
		panelcashRegisterManagement.add(scrollPane, gbc_scrollPane);

		tableCashRegister = new JTable();
		tableCashRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		try {
			tableCashRegister.setModel(new CashRegisterTableModel(FinancialManagement.getRegisterArray()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableCashRegister.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(tableCashRegister);
		tableCashRegister.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				handleEditOrderSelectionEvent(e);

			}
		});
		tableCashRegister.clearSelection();
		
		JButton btncashRegisterDelete = new JButton("Kasse löschen");
		btncashRegisterDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FinancialManagement.deleteCashRegister(Integer
							.parseInt(tableCashRegister.getValueAt(tableCashRegister.getSelectedRow(), 0).toString()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				refreshTableCashRegister();
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
		
		JMenuItem mntmNewMenuItembacktoMain = new JMenuItem("Hauptmenü");
		mntmNewMenuItembacktoMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			GuiMenue backmen = new GuiMenue();
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
	
	protected void handleEditOrderSelectionEvent(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if (tableNewBill.getSelectedRow() > -1) {
			comboBoxrelatedOrder.setSelectedIndex(getCorrectOrderIndex(tableNewBill.getValueAt(tableNewBill.getSelectedRow(), 0).toString()));
			textFieldcustomerID.setText((String) tableNewBill.getValueAt(tableNewBill.getSelectedRow(), 5).toString());
			textresponsiblePerson.setText((String) tableNewBill.getValueAt(tableNewBill.getSelectedRow(), 6).toString());
		}
		if(tableBillModify.getSelectedRow() > -1) {
			textFieldBillIDModify.setText((String) tableBillModify.getValueAt(tableBillModify.getSelectedRow(), 0).toString());
			textFieldcustomerIDModify.setText((String) tableBillModify.getValueAt(tableBillModify.getSelectedRow(), 5).toString());
			textFieldrelatedPersonModify.setText((String) tableBillModify.getValueAt(tableBillModify.getSelectedRow(), 6).toString());
		}
		if(tableJar.getSelectedRow() > -1) {
			textFieldPotIDModify.setText((String) tableJar.getValueAt(tableJar.getSelectedRow(), 0).toString());
			textFieldjarNameModify.setText((String) tableJar.getValueAt(tableJar.getSelectedRow(), 1).toString());
			textFieldjarActualStockModify.setText((String) tableJar.getValueAt(tableJar.getSelectedRow(), 2).toString());
			textFieldjarEstimatedStockModify.setText((String) tableJar.getValueAt(tableJar.getSelectedRow(), 3).toString());
			//comboBoxPotRegisterIDModify.setSelectedIndex(getCorrectCashRegisterIndex(tableJar.getValueAt(tableJar.getSelectedRow(), 4).toString()));
		}
		if(tableCashRegister.getSelectedRow() > -1) {
			textFieldCashRegisterIDModify.setText((String) tableCashRegister.getValueAt(tableCashRegister.getSelectedRow(), 0).toString());
			textFieldCashRegisterNameModify.setText((String) tableCashRegister.getValueAt(tableCashRegister.getSelectedRow(), 1).toString());
			textFieldcashRegisterActualStockModify.setText((String) tableCashRegister.getValueAt(tableCashRegister.getSelectedRow(), 2).toString());
			textFieldcashRegisterEstimatedStockModify.setText((String) tableCashRegister.getValueAt(tableCashRegister.getSelectedRow(), 3).toString());
			//comboBoxCashRegisterTypeModify.setSelectedIndex(tableCashRegister.getValueAt(tableCashRegister.getSelectedRow(), 4).toString());
		}
	}
	
	private int getCorrectCashRegisterIndex(String value) {
	    // TODO Auto-generated method stub
	    int x = Integer.parseInt(value); 
	    try {
		for(int i = 0; i<FinancialManagement.getRegisterArray().size();i++) {
		    if(FinancialManagement.getRegisterArray().get(i).getId()== x) {
			return i; 
		    }
		}
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }   
	    
	    return -1;
	}
	
	private int getCorrectPotIndex(String value) {
	    // TODO Auto-generated method stub
	    int x = Integer.parseInt(value); 
	    try {
		for(int i = 0; i<FinancialManagement.getPotArray().size();i++) {
		if(FinancialManagement.getPotArray().get(i).getId()== x) {
		    return i; 
		}
		
		}
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    
	    
	    return -1;
	}
	
	private int getCorrectOrderIndex(String value) {
	    // TODO Auto-generated method stub
	    int x = Integer.parseInt(value); 
	    try {
		for(int i = 0; i<FinancialManagement.getOrders().size();i++) {
		if(FinancialManagement.getOrders().get(i).getOrderId()== x) {
		    return i; 
		}
		
		}
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    
	    
	    return -1;
	}

	private int getCorrectCustomerIndex(String value) {
	    // TODO Auto-generated method stub
	    int x = Integer.parseInt(value); 
	    try {
		for(int i = 0; i<FinancialManagement.getCustomerArray().size();i++) {
		if(FinancialManagement.getCustomerArray().get(i).getId()== x) {
		    return i; 
		}
		
		}
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    
	    
	    return -1;
	}
	
	private int getCorrectAdvisorIndex(String value) {
	    // TODO Auto-generated method stub
	    int x = Integer.parseInt(value); 
	    try {
		for(int i = 0; i<FinancialManagement.getAdvisorArray().size();i++) {
		if(FinancialManagement.getAdvisorArray().get(i).getId()== x) {
		    return i; 
		}
		
		}
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    
	    
	    return -1;
	}

	protected void refreshTableNewBill() {
		try {
			tableNewBill.setModel(new OrderTableModel(FinancialManagement.getOrders()));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableNewBill.clearSelection();
	}

	protected void refreshTableDeleteBill() {
		try {
			tableDeleteBill.setModel(new BillTableModel(FinancialManagement.getBills()));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableDeleteBill.clearSelection();
	}
	
	protected void refreshTableBillModify() {
		try {
			tableBillModify.setModel(new BillTableModel(FinancialManagement.getBills()));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableBillModify.clearSelection();
	}
	
	protected void refreshTableJar() {
		try {
			tableJar.setModel(new PotTableModel(FinancialManagement.getPotArray()));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableJar.clearSelection();
	}
	
	protected void refreshTableCashRegister() {
		try {
			tableCashRegister.setModel(new CashRegisterTableModel(FinancialManagement.getRegisterArray()));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		tableCashRegister.clearSelection();
	}
	
}
