package userInterface;



import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPasswordField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
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
import javax.swing.JSplitPane;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class GUIComponentUserInterface {

	private JFrame frmElabVerwaltungsprogramm;
	private JTextField textFieldpartSearch;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIComponentUserInterface window = new GUIComponentUserInterface();
					window.frmElabVerwaltungsprogramm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIComponentUserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setTitle("Elab Verwaltungsprogramm");
		frmElabVerwaltungsprogramm.setBounds(100, 100, 1036, 727);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		gbl_panelshoppingCart.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelshoppingCart.setLayout(gbl_panelshoppingCart);
		
		JScrollPane scrollPanedeletePerson = new JScrollPane();
		scrollPanedeletePerson.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanedeletePerson.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanedeletePerson = new GridBagConstraints();
		gbc_scrollPanedeletePerson.gridwidth = 3;
		gbc_scrollPanedeletePerson.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanedeletePerson.fill = GridBagConstraints.BOTH;
		gbc_scrollPanedeletePerson.gridx = 0;
		gbc_scrollPanedeletePerson.gridy = 0;
		panelshoppingCart.add(scrollPanedeletePerson, gbc_scrollPanedeletePerson);
		
		JList listdeleteParts = new JList();
		listdeleteParts.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPanedeletePerson.setViewportView(listdeleteParts);
		
		JComboBox comboBoxcategoryPartSearch = new JComboBox();
		comboBoxcategoryPartSearch.setToolTipText("Suchkategorie auswählen");
		comboBoxcategoryPartSearch.setModel(new DefaultComboBoxModel(new String[] {"Name", "Artikelnummer"}));
		GridBagConstraints gbc_comboBoxcategoryPartSearch = new GridBagConstraints();
		gbc_comboBoxcategoryPartSearch.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxcategoryPartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxcategoryPartSearch.gridx = 0;
		gbc_comboBoxcategoryPartSearch.gridy = 1;
		panelshoppingCart.add(comboBoxcategoryPartSearch, gbc_comboBoxcategoryPartSearch);
		
		textFieldpartSearch = new JTextField();
		GridBagConstraints gbc_textFieldpartSearch = new GridBagConstraints();
		gbc_textFieldpartSearch.gridwidth = 2;
		gbc_textFieldpartSearch.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartSearch.gridx = 1;
		gbc_textFieldpartSearch.gridy = 1;
		panelshoppingCart.add(textFieldpartSearch, gbc_textFieldpartSearch);
		textFieldpartSearch.setColumns(10);
		
		JButton btnpartSearch = new JButton("Nach Bauteil suchen");
		GridBagConstraints gbc_btnpartSearch = new GridBagConstraints();
		gbc_btnpartSearch.gridwidth = 2;
		gbc_btnpartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnpartSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnpartSearch.gridx = 1;
		gbc_btnpartSearch.gridy = 2;
		panelshoppingCart.add(btnpartSearch, gbc_btnpartSearch);
		
		JLabel lblpartQuantity = new JLabel("Anzahl");
		GridBagConstraints gbc_lblpartQuantity = new GridBagConstraints();
		gbc_lblpartQuantity.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartQuantity.anchor = GridBagConstraints.EAST;
		gbc_lblpartQuantity.gridx = 0;
		gbc_lblpartQuantity.gridy = 3;
		panelshoppingCart.add(lblpartQuantity, gbc_lblpartQuantity);
		
		JSpinner spinnerdekrementParts = new JSpinner();
		spinnerdekrementParts.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinnerdekrementParts = new GridBagConstraints();
		gbc_spinnerdekrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerdekrementParts.insets = new Insets(0, 0, 5, 5);
		gbc_spinnerdekrementParts.gridx = 1;
		gbc_spinnerdekrementParts.gridy = 3;
		panelshoppingCart.add(spinnerdekrementParts, gbc_spinnerdekrementParts);
		
		JSpinner spinnerincrementParts = new JSpinner();
		spinnerincrementParts.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinnerincrementParts = new GridBagConstraints();
		gbc_spinnerincrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerincrementParts.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerincrementParts.gridx = 2;
		gbc_spinnerincrementParts.gridy = 3;
		panelshoppingCart.add(spinnerincrementParts, gbc_spinnerincrementParts);
		
		JButton btndekrementParts = new JButton("Dem Warenkorb hinzufügen");
		btndekrementParts.setToolTipText("Das entnommene Bauteil wird ihrer Rechnung hinzugefügt");
		GridBagConstraints gbc_btndekrementParts = new GridBagConstraints();
		gbc_btndekrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndekrementParts.insets = new Insets(0, 0, 5, 5);
		gbc_btndekrementParts.gridx = 1;
		gbc_btndekrementParts.gridy = 4;
		panelshoppingCart.add(btndekrementParts, gbc_btndekrementParts);
		
		JButton btnincrementParts = new JButton("Aus Warenkorb entfernen");
		btnincrementParts.setToolTipText("Das Bauteil wird in der angegebenen Menge \r\naus ihrem Warenkorb entfernt.");
		GridBagConstraints gbc_btnincrementParts = new GridBagConstraints();
		gbc_btnincrementParts.insets = new Insets(0, 0, 5, 0);
		gbc_btnincrementParts.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnincrementParts.gridx = 2;
		gbc_btnincrementParts.gridy = 4;
		panelshoppingCart.add(btnincrementParts, gbc_btnincrementParts);
		
		JButton btnplaceOrder = new JButton("Bestellung abschließen");
		GridBagConstraints gbc_btnplaceOrder = new GridBagConstraints();
		gbc_btnplaceOrder.gridwidth = 2;
		gbc_btnplaceOrder.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnplaceOrder.gridx = 1;
		gbc_btnplaceOrder.gridy = 5;
		panelshoppingCart.add(btnplaceOrder, gbc_btnplaceOrder);
		
		JPanel panelChangePassword = new JPanel();
		tabbedPane.addTab("Passwort ändern", null, panelChangePassword, null);
		GridBagLayout gbl_panelChangePassword = new GridBagLayout();
		gbl_panelChangePassword.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelChangePassword.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelChangePassword.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panelChangePassword.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelChangePassword.setLayout(gbl_panelChangePassword);
		
		JLabel lbluserName = new JLabel("Username");
		GridBagConstraints gbc_lbluserName = new GridBagConstraints();
		gbc_lbluserName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbluserName.insets = new Insets(0, 0, 5, 5);
		gbc_lbluserName.gridx = 0;
		gbc_lbluserName.gridy = 0;
		panelChangePassword.add(lbluserName, gbc_lbluserName);
		
		textField = new JTextField();
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panelChangePassword.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblnewPassword = new JLabel("Neues Passwort");
		GridBagConstraints gbc_lblnewPassword = new GridBagConstraints();
		gbc_lblnewPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblnewPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblnewPassword.gridx = 0;
		gbc_lblnewPassword.gridy = 1;
		panelChangePassword.add(lblnewPassword, gbc_lblnewPassword);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 4;
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 1;
		panelChangePassword.add(passwordField, gbc_passwordField);
		
		JLabel lblnewPasswordRepeat = new JLabel("Neues Passwort wiederholen");
		GridBagConstraints gbc_lblnewPasswordRepeat = new GridBagConstraints();
		gbc_lblnewPasswordRepeat.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblnewPasswordRepeat.insets = new Insets(0, 0, 5, 5);
		gbc_lblnewPasswordRepeat.gridx = 0;
		gbc_lblnewPasswordRepeat.gridy = 2;
		panelChangePassword.add(lblnewPasswordRepeat, gbc_lblnewPasswordRepeat);
		
		passwordField_1 = new JPasswordField();
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.gridwidth = 4;
		gbc_passwordField_1.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridx = 1;
		gbc_passwordField_1.gridy = 2;
		panelChangePassword.add(passwordField_1, gbc_passwordField_1);
		
		JButton btnclearAllInputs = new JButton("Eingaben löschen");
		GridBagConstraints gbc_btnclearAllInputs = new GridBagConstraints();
		gbc_btnclearAllInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnclearAllInputs.gridwidth = 4;
		gbc_btnclearAllInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btnclearAllInputs.gridx = 1;
		gbc_btnclearAllInputs.gridy = 3;
		panelChangePassword.add(btnclearAllInputs, gbc_btnclearAllInputs);
		
		JButton btnsaveChange = new JButton("Änderung speichern");
		GridBagConstraints gbc_btnsaveChange = new GridBagConstraints();
		gbc_btnsaveChange.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsaveChange.gridwidth = 4;
		gbc_btnsaveChange.gridx = 1;
		gbc_btnsaveChange.gridy = 4;
		panelChangePassword.add(btnsaveChange, gbc_btnsaveChange);
		
		JMenuBar menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);
		
		JMenu mnNewMenuOptions = new JMenu("Datei");
		menuBar.add(mnNewMenuOptions);
		
		JMenuItem mntmNewMenuItemlogOut = new JMenuItem("Ausloggen");
		mnNewMenuOptions.add(mntmNewMenuItemlogOut);
		
		JMenu mnNewMenuhelpWindow = new JMenu("?");
		menuBar.add(mnNewMenuhelpWindow);
		
		JMenuItem mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);
		
	}
}
