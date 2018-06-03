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
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import logic.Category;
import logic.ComponentManagement;
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
import javax.swing.JSplitPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
<<<<<<< HEAD
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
=======
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
>>>>>>> branch 'master' of git@github.com:yilemre/NVZ1PPMEGI.git

public class GUIComponentmanagement  {

	private JFrame frmElabVerwaltungsprogramm;
	private JTextField textFieldpartName;
	private JTextField textFieldpartLink;
	private JTextField textFieldpartPrize;
	private JTextField textFieldpartNameModify;
	private JTextField textFieldpartLinkModify;
	private JTextField textFieldpartPrizeModify;
	private JTextField textFieldquantityStoring;
	private JTextField textFieldquantityPlanned;
	private JTextField textFieldquantityOrdered;
	private JTextField textFieldstorageLocation;
	
	private JTextField textFieldpartNumberSearch;
	private JTextField textFieldcategoryNameNew;
	private JTextField textFieldcategoryIDModify;
	private JTextField textFieldcategoryNameModify;
	private JTextField textFieldcategoryNameSearch;
	private JTextField textFieldsearchModifyPart;
	private JTextField textFieldcategoryNoteNew;
	private JTextField textFieldcategoryNoteModify;
	private JTextField tfArticleNo;
	private JTable ComponentTableModify;
	private JTextField tfComponentModifyID;
	JSpinner spinnerquantityStorageModify = new JSpinner();
	JSpinner spinnerquantityPlannedModify = new JSpinner();
	JSpinner spinnerquantityOrderedModify = new JSpinner();
	private JTextField tfStorageLocationModify;
	private JTextField tfStoring;
	private JTextField tfPlannedAmount;
	private JTextField tfOrderedAmount;
	private JTable ComponentTableDelete;
	private JTextField tfArticleNoModify;
	JComboBox comboBoxcategoryModify = new JComboBox();
	JComboBox comboBoxcategory = new JComboBox();
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public GUIComponentmanagement() {
		frmElabVerwaltungsprogramm = new JFrame();
		frmElabVerwaltungsprogramm.setTitle("Elab Verwaltungsprogramm");
		frmElabVerwaltungsprogramm.setBounds(100, 100, 1051, 772);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		frmElabVerwaltungsprogramm.getContentPane().setLayout(gridBagLayout);

		JLabel lblcomponentManagement = new JLabel("Bauteilverwaltung");
		lblcomponentManagement.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblcomponentManagement = new GridBagConstraints();
		gbc_lblcomponentManagement.insets = new Insets(0, 0, 5, 0);
		gbc_lblcomponentManagement.gridx = 0;
		gbc_lblcomponentManagement.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblcomponentManagement, gbc_lblcomponentManagement);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(tabbedPane, gbc_tabbedPane);

		JPanel paneladdPart = new JPanel();
		paneladdPart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabbedPane.addTab("Bauteil hinzufügen", null, paneladdPart, null);
		GridBagLayout gbl_paneladdPart = new GridBagLayout();
		gbl_paneladdPart.columnWidths = new int[] { 0, 0, 0 };
		gbl_paneladdPart.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_paneladdPart.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_paneladdPart.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		paneladdPart.setLayout(gbl_paneladdPart);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		paneladdPart.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblArticleNo = new JLabel("Artikel-Nr.");
		lblArticleNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblArticleNo = new GridBagConstraints();
		gbc_lblArticleNo.anchor = GridBagConstraints.EAST;
		gbc_lblArticleNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblArticleNo.gridx = 0;
		gbc_lblArticleNo.gridy = 1;
		paneladdPart.add(lblArticleNo, gbc_lblArticleNo);
		
		tfArticleNo = new JTextField();
		tfArticleNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tfArticleNo = new GridBagConstraints();
		gbc_tfArticleNo.insets = new Insets(0, 0, 5, 0);
		gbc_tfArticleNo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfArticleNo.gridx = 1;
		gbc_tfArticleNo.gridy = 1;
		paneladdPart.add(tfArticleNo, gbc_tfArticleNo);
		tfArticleNo.setColumns(10);

		JLabel lblpartName = new JLabel("Bauteilname");
		lblpartName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpartName = new GridBagConstraints();
		gbc_lblpartName.anchor = GridBagConstraints.EAST;
		gbc_lblpartName.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartName.gridx = 0;
		gbc_lblpartName.gridy = 2;
		paneladdPart.add(lblpartName, gbc_lblpartName);

		textFieldpartName = new JTextField();
		textFieldpartName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldpartName = new GridBagConstraints();
		gbc_textFieldpartName.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartName.gridx = 1;
		gbc_textFieldpartName.gridy = 2;
		paneladdPart.add(textFieldpartName, gbc_textFieldpartName);
		textFieldpartName.setColumns(10);

		JLabel lblcategory = new JLabel("Kategorie");
		lblcategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblcategory = new GridBagConstraints();
		gbc_lblcategory.anchor = GridBagConstraints.EAST;
		gbc_lblcategory.insets = new Insets(0, 0, 5, 5);
		gbc_lblcategory.gridx = 0;
		gbc_lblcategory.gridy = 3;
		paneladdPart.add(lblcategory, gbc_lblcategory);

		
		comboBoxcategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBoxcategory = new GridBagConstraints();
		gbc_comboBoxcategory.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxcategory.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxcategory.gridx = 1;
		gbc_comboBoxcategory.gridy = 3;
		paneladdPart.add(comboBoxcategory, gbc_comboBoxcategory);	
		
		//Emre begin, fill JComboxBox with categories from db 
		try {
		    for(int i = 0; i<ComponentManagement.getCategoryArray().length; i++) {
		        comboBoxcategory.addItem(ComponentManagement.getCategoryArray()[i]);
		    }
		} catch (SQLException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
		//Emre end

		JLabel lblpartLink = new JLabel("Produktlink");
		lblpartLink.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpartLink = new GridBagConstraints();
		gbc_lblpartLink.anchor = GridBagConstraints.EAST;
		gbc_lblpartLink.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartLink.gridx = 0;
		gbc_lblpartLink.gridy = 4;
		paneladdPart.add(lblpartLink, gbc_lblpartLink);

		textFieldpartLink = new JTextField();
		textFieldpartLink.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldpartLink = new GridBagConstraints();
		gbc_textFieldpartLink.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartLink.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartLink.gridx = 1;
		gbc_textFieldpartLink.gridy = 4;
		paneladdPart.add(textFieldpartLink, gbc_textFieldpartLink);
		textFieldpartLink.setColumns(10);

		JLabel lblpartPrize = new JLabel("Einzelpreis");
		lblpartPrize.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblpartPrize = new GridBagConstraints();
		gbc_lblpartPrize.anchor = GridBagConstraints.EAST;
		gbc_lblpartPrize.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartPrize.gridx = 0;
		gbc_lblpartPrize.gridy = 5;
		paneladdPart.add(lblpartPrize, gbc_lblpartPrize);

		textFieldpartPrize = new JTextField();
		textFieldpartPrize.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldpartPrize = new GridBagConstraints();
		gbc_textFieldpartPrize.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartPrize.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartPrize.gridx = 1;
		gbc_textFieldpartPrize.gridy = 5;
		paneladdPart.add(textFieldpartPrize, gbc_textFieldpartPrize);
		textFieldpartPrize.setColumns(10);

		JLabel lblquantityStoring = new JLabel("Menge (lagernd)");
		lblquantityStoring.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblquantityStoring = new GridBagConstraints();
		gbc_lblquantityStoring.anchor = GridBagConstraints.EAST;
		gbc_lblquantityStoring.insets = new Insets(0, 0, 5, 5);
		gbc_lblquantityStoring.gridx = 0;
		gbc_lblquantityStoring.gridy = 6;
		paneladdPart.add(lblquantityStoring, gbc_lblquantityStoring);

		textFieldquantityStoring = new JTextField();
		textFieldquantityStoring.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldquantityStoring = new GridBagConstraints();
		gbc_textFieldquantityStoring.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldquantityStoring.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldquantityStoring.gridx = 1;
		gbc_textFieldquantityStoring.gridy = 6;
		paneladdPart.add(textFieldquantityStoring, gbc_textFieldquantityStoring);
		textFieldquantityStoring.setColumns(10);

		JLabel lblquantityPlanned = new JLabel("Menge (geplant)");
		lblquantityPlanned.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblquantityPlanned.setToolTipText("");
		GridBagConstraints gbc_lblquantityPlanned = new GridBagConstraints();
		gbc_lblquantityPlanned.anchor = GridBagConstraints.EAST;
		gbc_lblquantityPlanned.insets = new Insets(0, 0, 5, 5);
		gbc_lblquantityPlanned.gridx = 0;
		gbc_lblquantityPlanned.gridy = 7;
		paneladdPart.add(lblquantityPlanned, gbc_lblquantityPlanned);

		textFieldquantityPlanned = new JTextField();
		textFieldquantityPlanned.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldquantityPlanned = new GridBagConstraints();
		gbc_textFieldquantityPlanned.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldquantityPlanned.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldquantityPlanned.gridx = 1;
		gbc_textFieldquantityPlanned.gridy = 7;
		paneladdPart.add(textFieldquantityPlanned, gbc_textFieldquantityPlanned);
		textFieldquantityPlanned.setColumns(10);

		JLabel lblquantityOrdered = new JLabel("Menge (bestellt)");
		lblquantityOrdered.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblquantityOrdered = new GridBagConstraints();
		gbc_lblquantityOrdered.anchor = GridBagConstraints.EAST;
		gbc_lblquantityOrdered.insets = new Insets(0, 0, 5, 5);
		gbc_lblquantityOrdered.gridx = 0;
		gbc_lblquantityOrdered.gridy = 8;
		paneladdPart.add(lblquantityOrdered, gbc_lblquantityOrdered);

		textFieldquantityOrdered = new JTextField();
		textFieldquantityOrdered.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldquantityOrdered = new GridBagConstraints();
		gbc_textFieldquantityOrdered.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldquantityOrdered.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldquantityOrdered.gridx = 1;
		gbc_textFieldquantityOrdered.gridy = 8;
		paneladdPart.add(textFieldquantityOrdered, gbc_textFieldquantityOrdered);
		textFieldquantityOrdered.setColumns(10);

		JLabel lblstorageLocation = new JLabel("Lagerort");
		lblstorageLocation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblstorageLocation = new GridBagConstraints();
		gbc_lblstorageLocation.anchor = GridBagConstraints.EAST;
		gbc_lblstorageLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblstorageLocation.gridx = 0;
		gbc_lblstorageLocation.gridy = 9;
		paneladdPart.add(lblstorageLocation, gbc_lblstorageLocation);

		textFieldstorageLocation = new JTextField();
		textFieldstorageLocation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldstorageLocation = new GridBagConstraints();
		gbc_textFieldstorageLocation.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldstorageLocation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldstorageLocation.gridx = 1;
		gbc_textFieldstorageLocation.gridy = 9;
		paneladdPart.add(textFieldstorageLocation, gbc_textFieldstorageLocation);
		textFieldstorageLocation.setColumns(10);

		JButton btnaddPart = new JButton("Bauteil hinzufügen");
		btnaddPart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    //Emre begin
			    try {
				ComponentManagement.addPart(tfArticleNo.getText(), textFieldpartLink.getText(), textFieldpartName.getText(), Double.parseDouble(textFieldpartPrize.getText()), Integer.parseInt(textFieldquantityStoring.getText()),
						Integer.parseInt(textFieldquantityPlanned.getText()), Integer.parseInt(textFieldquantityOrdered.getText()), textFieldstorageLocation.getText(),getCategoryId(comboBoxcategory.getSelectedIndex()));
			    } catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			    } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			    }
			    refreshTable(); 
			}
			
			//Emre end
		});
		btnaddPart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GridBagConstraints gbc_btnaddPart = new GridBagConstraints();
		gbc_btnaddPart.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddPart.insets = new Insets(0, 0, 5, 0);
		gbc_btnaddPart.gridx = 1;
		gbc_btnaddPart.gridy = 10;
		paneladdPart.add(btnaddPart, gbc_btnaddPart);

		JButton btndeleteallInputs = new JButton("Eingabe löschen");
		btndeleteallInputs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    //Emre begin
			    tfArticleNo.setText("");
			    textFieldpartName.setText("");
			    textFieldpartLink.setText("");
			    textFieldpartPrize.setText("");
			    textFieldquantityStoring.setText("");
			    textFieldquantityPlanned.setText("");
			    textFieldquantityOrdered.setText("");
			    textFieldstorageLocation.setText("");
			}
			//Emre end
		});
		btndeleteallInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btndeleteallInputs = new GridBagConstraints();
		gbc_btndeleteallInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputs.gridx = 1;
		gbc_btndeleteallInputs.gridy = 11;
		paneladdPart.add(btndeleteallInputs, gbc_btndeleteallInputs);

		JLabel lbleLabpicture = new JLabel("");
		lbleLabpicture.setIcon(new ImageIcon("C:\\Users\\Nils\\git\\ProPraElab\\ProPraElab\\pictures\\elab.png"));
		GridBagConstraints gbc_lbleLabpicture = new GridBagConstraints();
		gbc_lbleLabpicture.gridwidth = 2;
		gbc_lbleLabpicture.gridx = 0;
		gbc_lbleLabpicture.gridy = 12;
		paneladdPart.add(lbleLabpicture, gbc_lbleLabpicture);
				
						JPanel panelmodify = new JPanel();
						tabbedPane.addTab("Bauteil bearbeiten", null, panelmodify, null);
						GridBagLayout gbl_panelmodify = new GridBagLayout();
						gbl_panelmodify.columnWidths = new int[] { 152, 0, 0 };
						gbl_panelmodify.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
						gbl_panelmodify.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
						gbl_panelmodify.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0,
								Double.MIN_VALUE };
						panelmodify.setLayout(gbl_panelmodify);
								
								JLabel lblId = new JLabel("ID");
								lblId.setFont(new Font("Tahoma", Font.PLAIN, 15));
								GridBagConstraints gbc_lblId = new GridBagConstraints();
								gbc_lblId.anchor = GridBagConstraints.EAST;
								gbc_lblId.insets = new Insets(0, 0, 5, 5);
								gbc_lblId.gridx = 0;
								gbc_lblId.gridy = 0;
								panelmodify.add(lblId, gbc_lblId);
								
								tfComponentModifyID = new JTextField();
								tfComponentModifyID.setEditable(false);
								tfComponentModifyID.setFont(new Font("Tahoma", Font.PLAIN, 15));
								GridBagConstraints gbc_tfComponentModifyID = new GridBagConstraints();
								gbc_tfComponentModifyID.insets = new Insets(0, 0, 5, 0);
								gbc_tfComponentModifyID.fill = GridBagConstraints.HORIZONTAL;
								gbc_tfComponentModifyID.gridx = 1;
								gbc_tfComponentModifyID.gridy = 0;
								panelmodify.add(tfComponentModifyID, gbc_tfComponentModifyID);
								tfComponentModifyID.setColumns(10);
								
								JLabel lblArticleNoModify = new JLabel("Artikel-Nr.");
								lblArticleNoModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
								GridBagConstraints gbc_lblArticleNoModify = new GridBagConstraints();
								gbc_lblArticleNoModify.anchor = GridBagConstraints.EAST;
								gbc_lblArticleNoModify.insets = new Insets(0, 0, 5, 5);
								gbc_lblArticleNoModify.gridx = 0;
								gbc_lblArticleNoModify.gridy = 1;
								panelmodify.add(lblArticleNoModify, gbc_lblArticleNoModify);
								
								tfArticleNoModify = new JTextField();
								tfArticleNoModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
								GridBagConstraints gbc_tfArticleNoModify = new GridBagConstraints();
								gbc_tfArticleNoModify.insets = new Insets(0, 0, 5, 0);
								gbc_tfArticleNoModify.fill = GridBagConstraints.HORIZONTAL;
								gbc_tfArticleNoModify.gridx = 1;
								gbc_tfArticleNoModify.gridy = 1;
								panelmodify.add(tfArticleNoModify, gbc_tfArticleNoModify);
								tfArticleNoModify.setColumns(10);
						
								JLabel lblpartNameModify = new JLabel("Bauteilname");
								lblpartNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
								GridBagConstraints gbc_lblpartNameModify = new GridBagConstraints();
								gbc_lblpartNameModify.anchor = GridBagConstraints.EAST;
								gbc_lblpartNameModify.insets = new Insets(0, 0, 5, 5);
								gbc_lblpartNameModify.gridx = 0;
								gbc_lblpartNameModify.gridy = 2;
								panelmodify.add(lblpartNameModify, gbc_lblpartNameModify);
								
										textFieldpartNameModify = new JTextField();
										textFieldpartNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
										GridBagConstraints gbc_textFieldpartNameModify = new GridBagConstraints();
										gbc_textFieldpartNameModify.insets = new Insets(0, 0, 5, 0);
										gbc_textFieldpartNameModify.fill = GridBagConstraints.HORIZONTAL;
										gbc_textFieldpartNameModify.gridx = 1;
										gbc_textFieldpartNameModify.gridy = 2;
										panelmodify.add(textFieldpartNameModify, gbc_textFieldpartNameModify);
										textFieldpartNameModify.setColumns(10);
										
												JLabel lblcategoryModify = new JLabel("Kategorie");
												lblcategoryModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
												GridBagConstraints gbc_lblcategoryModify = new GridBagConstraints();
												gbc_lblcategoryModify.anchor = GridBagConstraints.EAST;
												gbc_lblcategoryModify.insets = new Insets(0, 0, 5, 5);
												gbc_lblcategoryModify.gridx = 0;
												gbc_lblcategoryModify.gridy = 3;
												panelmodify.add(lblcategoryModify, gbc_lblcategoryModify);
												
														
														
														comboBoxcategoryModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
														GridBagConstraints gbc_comboBoxcategoryModify = new GridBagConstraints();
														gbc_comboBoxcategoryModify.insets = new Insets(0, 0, 5, 0);
														gbc_comboBoxcategoryModify.fill = GridBagConstraints.HORIZONTAL;
														gbc_comboBoxcategoryModify.gridx = 1;
														gbc_comboBoxcategoryModify.gridy = 3;
														panelmodify.add(comboBoxcategoryModify, gbc_comboBoxcategoryModify);
														
														try {
														    for(int i = 0; i<ComponentManagement.getCategoryArray().length; i++) {
														        comboBoxcategoryModify.addItem(ComponentManagement.getCategoryArray()[i]);
														    }
														} catch (SQLException e1) {
														    // TODO Auto-generated catch block
														    e1.printStackTrace();
														}
														
																												
																JLabel lblpartLinkModify = new JLabel("Produktlink");
																lblpartLinkModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																GridBagConstraints gbc_lblpartLinkModify = new GridBagConstraints();
																gbc_lblpartLinkModify.anchor = GridBagConstraints.EAST;
																gbc_lblpartLinkModify.insets = new Insets(0, 0, 5, 5);
																gbc_lblpartLinkModify.gridx = 0;
																gbc_lblpartLinkModify.gridy = 4;
																panelmodify.add(lblpartLinkModify, gbc_lblpartLinkModify);
																
																		textFieldpartLinkModify = new JTextField();
																		textFieldpartLinkModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																		GridBagConstraints gbc_textFieldpartLinkModify = new GridBagConstraints();
																		gbc_textFieldpartLinkModify.insets = new Insets(0, 0, 5, 0);
																		gbc_textFieldpartLinkModify.fill = GridBagConstraints.HORIZONTAL;
																		gbc_textFieldpartLinkModify.gridx = 1;
																		gbc_textFieldpartLinkModify.gridy = 4;
																		panelmodify.add(textFieldpartLinkModify, gbc_textFieldpartLinkModify);
																		textFieldpartLinkModify.setColumns(10);
																		
																				JLabel lblpartPrizeModify = new JLabel("Einzelpreis");
																				lblpartPrizeModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																				GridBagConstraints gbc_lblpartPrizeModify = new GridBagConstraints();
																				gbc_lblpartPrizeModify.anchor = GridBagConstraints.EAST;
																				gbc_lblpartPrizeModify.insets = new Insets(0, 0, 5, 5);
																				gbc_lblpartPrizeModify.gridx = 0;
																				gbc_lblpartPrizeModify.gridy = 5;
																				panelmodify.add(lblpartPrizeModify, gbc_lblpartPrizeModify);
																				
																						textFieldpartPrizeModify = new JTextField();
																						textFieldpartPrizeModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																						GridBagConstraints gbc_textFieldpartPrizeModify = new GridBagConstraints();
																						gbc_textFieldpartPrizeModify.insets = new Insets(0, 0, 5, 0);
																						gbc_textFieldpartPrizeModify.fill = GridBagConstraints.HORIZONTAL;
																						gbc_textFieldpartPrizeModify.gridx = 1;
																						gbc_textFieldpartPrizeModify.gridy = 5;
																						panelmodify.add(textFieldpartPrizeModify, gbc_textFieldpartPrizeModify);
																						textFieldpartPrizeModify.setColumns(10);
																						
																								JLabel lblquantityStoringModify = new JLabel("Menge (lagernd)");
																								lblquantityStoringModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																								GridBagConstraints gbc_lblquantityStoringModify = new GridBagConstraints();
																								gbc_lblquantityStoringModify.anchor = GridBagConstraints.EAST;
																								gbc_lblquantityStoringModify.insets = new Insets(0, 0, 5, 5);
																								gbc_lblquantityStoringModify.gridx = 0;
																								gbc_lblquantityStoringModify.gridy = 6;
																								panelmodify.add(lblquantityStoringModify, gbc_lblquantityStoringModify);
																												
																												tfStoring = new JTextField();
																												tfStoring.setFont(new Font("Tahoma", Font.PLAIN, 15));
																												GridBagConstraints gbc_tfStoring = new GridBagConstraints();
																												gbc_tfStoring.anchor = GridBagConstraints.NORTH;
																												gbc_tfStoring.insets = new Insets(0, 0, 5, 0);
																												gbc_tfStoring.fill = GridBagConstraints.HORIZONTAL;
																												gbc_tfStoring.gridx = 1;
																												gbc_tfStoring.gridy = 6;
																												panelmodify.add(tfStoring, gbc_tfStoring);
																												tfStoring.setColumns(10);
																										
																												JLabel lblquantityPlannedModify = new JLabel("Menge (geplant)");
																												lblquantityPlannedModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																												GridBagConstraints gbc_lblquantityPlannedModify = new GridBagConstraints();
																												gbc_lblquantityPlannedModify.anchor = GridBagConstraints.EAST;
																												gbc_lblquantityPlannedModify.insets = new Insets(0, 0, 5, 5);
																												gbc_lblquantityPlannedModify.gridx = 0;
																												gbc_lblquantityPlannedModify.gridy = 7;
																												panelmodify.add(lblquantityPlannedModify, gbc_lblquantityPlannedModify);
																																
																																tfPlannedAmount = new JTextField();
																																tfPlannedAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																GridBagConstraints gbc_tfPlannedAmount = new GridBagConstraints();
																																gbc_tfPlannedAmount.insets = new Insets(0, 0, 5, 0);
																																gbc_tfPlannedAmount.fill = GridBagConstraints.HORIZONTAL;
																																gbc_tfPlannedAmount.gridx = 1;
																																gbc_tfPlannedAmount.gridy = 7;
																																panelmodify.add(tfPlannedAmount, gbc_tfPlannedAmount);
																																tfPlannedAmount.setColumns(10);
																														
																																JLabel lblquantityOrderedModify = new JLabel("Menge (bestellt)");
																																lblquantityOrderedModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																GridBagConstraints gbc_lblquantityOrderedModify = new GridBagConstraints();
																																gbc_lblquantityOrderedModify.anchor = GridBagConstraints.EAST;
																																gbc_lblquantityOrderedModify.insets = new Insets(0, 0, 5, 5);
																																gbc_lblquantityOrderedModify.gridx = 0;
																																gbc_lblquantityOrderedModify.gridy = 8;
																																panelmodify.add(lblquantityOrderedModify, gbc_lblquantityOrderedModify);
																																				
																																				tfOrderedAmount = new JTextField();
																																				tfOrderedAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																				GridBagConstraints gbc_tfOrderedAmount = new GridBagConstraints();
																																				gbc_tfOrderedAmount.insets = new Insets(0, 0, 5, 0);
																																				gbc_tfOrderedAmount.fill = GridBagConstraints.HORIZONTAL;
																																				gbc_tfOrderedAmount.gridx = 1;
																																				gbc_tfOrderedAmount.gridy = 8;
																																				panelmodify.add(tfOrderedAmount, gbc_tfOrderedAmount);
																																				tfOrderedAmount.setColumns(10);
																																		
																																				JLabel lblstorageLocationModify = new JLabel("Lagerort");
																																				lblstorageLocationModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																				GridBagConstraints gbc_lblstorageLocationModify = new GridBagConstraints();
																																				gbc_lblstorageLocationModify.anchor = GridBagConstraints.EAST;
																																				gbc_lblstorageLocationModify.insets = new Insets(0, 0, 5, 5);
																																				gbc_lblstorageLocationModify.gridx = 0;
																																				gbc_lblstorageLocationModify.gridy = 9;
																																				panelmodify.add(lblstorageLocationModify, gbc_lblstorageLocationModify);
																																								
																																								tfStorageLocationModify = new JTextField();
																																								tfStorageLocationModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																								GridBagConstraints gbc_tfStorageLocationModify = new GridBagConstraints();
																																								gbc_tfStorageLocationModify.anchor = GridBagConstraints.NORTH;
																																								gbc_tfStorageLocationModify.insets = new Insets(0, 0, 5, 0);
																																								gbc_tfStorageLocationModify.fill = GridBagConstraints.HORIZONTAL;
																																								gbc_tfStorageLocationModify.gridx = 1;
																																								gbc_tfStorageLocationModify.gridy = 9;
																																								panelmodify.add(tfStorageLocationModify, gbc_tfStorageLocationModify);
																																								tfStorageLocationModify.setColumns(10);
																																						
																																								JButton btnsaveModifiedValues = new JButton("Änderungen speichern");
																																								btnsaveModifiedValues.addActionListener(new ActionListener() {
																																									public void actionPerformed(ActionEvent e) {
																																									    //Emre begin Button for modify the Component/Part
																																									    								    																																				    
																																									   try {
																																										ComponentManagement.modifyPart(Integer.parseInt(tfComponentModifyID.getText()),tfArticleNoModify.getText(), 
																																											textFieldpartLinkModify.getText(), textFieldpartNameModify.getText(),
																																											Double.parseDouble(textFieldpartPrizeModify.getText()),Integer.parseInt(tfStoring.getText()), 
																																											Integer.parseInt(tfPlannedAmount.getText()), Integer.parseInt(tfOrderedAmount.getText()),tfStorageLocationModify.getText(), 
																																											ComponentManagement.getCategoryArray()[comboBoxcategoryModify.getSelectedIndex()].getId());
																																										
																																									    } catch (NumberFormatException e1) {
																																										// TODO Auto-generated catch block
																																										e1.printStackTrace();
																																									    } catch (SQLException e1) {
																																										// TODO Auto-generated catch block
																																										e1.printStackTrace();
																																									    }
																																									    refreshTable(); 
																																									 //Emre end    
																																									}
																																								});
																																								btnsaveModifiedValues.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																								
																																								GridBagConstraints gbc_btnsaveModifiedValues = new GridBagConstraints();
																																								gbc_btnsaveModifiedValues.fill = GridBagConstraints.HORIZONTAL;
																																								gbc_btnsaveModifiedValues.insets = new Insets(0, 0, 5, 0);
																																								gbc_btnsaveModifiedValues.gridx = 1;
																																								gbc_btnsaveModifiedValues.gridy = 10;
																																								panelmodify.add(btnsaveModifiedValues, gbc_btnsaveModifiedValues);
																																								
																																										JScrollPane scrollPanemodifyPart = new JScrollPane();
																																										scrollPanemodifyPart.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
																																										scrollPanemodifyPart.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
																																										GridBagConstraints gbc_scrollPanemodifyPart = new GridBagConstraints();
																																										gbc_scrollPanemodifyPart.insets = new Insets(0, 0, 5, 0);
																																										gbc_scrollPanemodifyPart.gridwidth = 2;
																																										gbc_scrollPanemodifyPart.fill = GridBagConstraints.BOTH;
																																										gbc_scrollPanemodifyPart.gridx = 0;
																																										gbc_scrollPanemodifyPart.gridy = 11;
																																										panelmodify.add(scrollPanemodifyPart, gbc_scrollPanemodifyPart);
																																										
																																										//Emre begin
																																										ComponentTableModify = new JTable();
																																										scrollPanemodifyPart.setViewportView(ComponentTableModify);
																																										ComponentTableModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																										try {
																																										    ComponentTableModify.setModel(new ComponentTableModel(ComponentManagement.getComponents()));
																																										} catch (SQLException e1) {
																																										    // TODO Auto-generated catch block
																																										    e1.printStackTrace();
																																										}
																																										
																																										ComponentTableModify.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
																																										scrollPanemodifyPart.setViewportView(ComponentTableModify);
																																										ComponentTableModify.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
																																											
																																											@Override
																																											public void valueChanged(ListSelectionEvent e) {
																																												handleEditComponentSelectionEvent(e);
																																												
																																											}
																																										});
																																										//Emre end
																																												
																																														JComboBox comboBoxsearchModifyPart = new JComboBox();
																																														comboBoxsearchModifyPart.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																														comboBoxsearchModifyPart.setModel(new DefaultComboBoxModel(new String[] { "Artikelnummer", "Name" }));
																																														GridBagConstraints gbc_comboBoxsearchModifyPart = new GridBagConstraints();
																																														gbc_comboBoxsearchModifyPart.insets = new Insets(0, 0, 5, 5);
																																														gbc_comboBoxsearchModifyPart.fill = GridBagConstraints.HORIZONTAL;
																																														gbc_comboBoxsearchModifyPart.gridx = 0;
																																														gbc_comboBoxsearchModifyPart.gridy = 12;
																																														panelmodify.add(comboBoxsearchModifyPart, gbc_comboBoxsearchModifyPart);
																																														
																																																textFieldsearchModifyPart = new JTextField();
																																																textFieldsearchModifyPart.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																																GridBagConstraints gbc_textFieldsearchModifyPart = new GridBagConstraints();
																																																gbc_textFieldsearchModifyPart.insets = new Insets(0, 0, 5, 0);
																																																gbc_textFieldsearchModifyPart.fill = GridBagConstraints.HORIZONTAL;
																																																gbc_textFieldsearchModifyPart.gridx = 1;
																																																gbc_textFieldsearchModifyPart.gridy = 12;
																																																panelmodify.add(textFieldsearchModifyPart, gbc_textFieldsearchModifyPart);
																																																textFieldsearchModifyPart.setColumns(10);
																																																
																																																		JButton btnsearchResetSearching = new JButton("Suche aufheben");
																																																		btnsearchResetSearching.addActionListener(new ActionListener() {
																																																			public void actionPerformed(ActionEvent arg0) {
																																																			    //Emre begin Button for searching 
																																																			    
																																																			    try {
																																																				ComponentTableModify.setModel(new ComponentTableModel(ComponentManagement.getComponents()));
																																																			    } catch (SQLException e1) {
																																																				// TODO Auto-generated catch block
																																																				e1.printStackTrace();
																																																			    }
																																																			    textFieldsearchModifyPart.setText("");
																																																			}
																																																			//Emre end
																																																		});
																																																		
																																																		JButton btnsearchModifyPart = new JButton("Suchen");
																																																		btnsearchModifyPart.addActionListener(new ActionListener() {
																																																			public void actionPerformed(ActionEvent e) {
																																																			   
																																																			    //Emre begin Button for searching 
																																																			    switch(comboBoxsearchModifyPart.getSelectedIndex()) {
																																																			    case 0: 
																																																				try {
																																																				    ComponentTableModify.setModel(new ComponentTableModel(ComponentManagement.getComponentByArticlenumber(textFieldsearchModifyPart.getText())));
																																																				} catch (SQLException a) {
																																																				    // TODO Auto-generated catch block
																																																				    a.printStackTrace();
																																																				}
																																																				break; 
																																																			    case 1: 
																																																				try {
																																																				    ComponentTableModify.setModel(new ComponentTableModel(ComponentManagement.getComponentByName(textFieldsearchModifyPart.getText())));
																																																				} catch (SQLException a1) {
																																																				    // TODO Auto-generated catch block
																																																				    a1.printStackTrace();
																																																				}
																																																				break; 
																																																			    }
																																																			    //Emre end
																																																			    
																																																			}
																																																		});
																																																		btnsearchModifyPart.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																																		GridBagConstraints gbc_btnsearchModifyPart = new GridBagConstraints();
																																																		gbc_btnsearchModifyPart.fill = GridBagConstraints.HORIZONTAL;
																																																		gbc_btnsearchModifyPart.insets = new Insets(0, 0, 5, 0);
																																																		gbc_btnsearchModifyPart.gridx = 1;
																																																		gbc_btnsearchModifyPart.gridy = 13;
																																																		panelmodify.add(btnsearchModifyPart, gbc_btnsearchModifyPart);
																																																		btnsearchResetSearching.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																																		
																																																		GridBagConstraints gbc_btnsearchResetSearching = new GridBagConstraints();
																																																		gbc_btnsearchResetSearching.fill = GridBagConstraints.HORIZONTAL;
																																																		gbc_btnsearchResetSearching.gridx = 1;
																																																		gbc_btnsearchResetSearching.gridy = 14;
																																																		panelmodify.add(btnsearchResetSearching, gbc_btnsearchResetSearching);

		JPanel paneldeletePart = new JPanel();
		paneldeletePart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabbedPane.addTab("Bauteil entfernen", null, paneldeletePart, null);
		GridBagLayout gbl_paneldeletePart = new GridBagLayout();
		gbl_paneldeletePart.columnWidths = new int[] { 155, 0, 0 };
		gbl_paneldeletePart.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_paneldeletePart.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_paneldeletePart.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		paneldeletePart.setLayout(gbl_paneldeletePart);

		JScrollPane scrollPanedeletePerson = new JScrollPane();
		scrollPanedeletePerson.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanedeletePerson.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanedeletePerson = new GridBagConstraints();
		gbc_scrollPanedeletePerson.gridwidth = 2;
		gbc_scrollPanedeletePerson.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanedeletePerson.fill = GridBagConstraints.BOTH;
		gbc_scrollPanedeletePerson.gridx = 0;
		gbc_scrollPanedeletePerson.gridy = 0;
		paneldeletePart.add(scrollPanedeletePerson, gbc_scrollPanedeletePerson);
		
		ComponentTableDelete = new JTable();
		scrollPanedeletePerson.setViewportView(ComponentTableDelete);
		ComponentTableDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		try {
			ComponentTableDelete.setModel(new ComponentTableModel(ComponentManagement.getComponents()));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ComponentTableDelete.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		ComponentTableDelete.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				handleDeleteComponentSelectionEvent(e);

			}
		});
		

		JComboBox comboBoxdeletePart = new JComboBox();
		comboBoxdeletePart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxdeletePart.setModel(new DefaultComboBoxModel(new String[] { "Artikelnummer", "Name" }));
		GridBagConstraints gbc_comboBoxdeletePart = new GridBagConstraints();
		gbc_comboBoxdeletePart.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxdeletePart.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxdeletePart.gridx = 0;
		gbc_comboBoxdeletePart.gridy = 1;
		paneldeletePart.add(comboBoxdeletePart, gbc_comboBoxdeletePart);
		
		
		textFieldpartNumberSearch = new JTextField();
		textFieldpartNumberSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_textFieldpartNumberSearch = new GridBagConstraints();
		gbc_textFieldpartNumberSearch.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartNumberSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartNumberSearch.gridx = 1;
		gbc_textFieldpartNumberSearch.gridy = 1;
		paneldeletePart.add(textFieldpartNumberSearch, gbc_textFieldpartNumberSearch);
		textFieldpartNumberSearch.setColumns(10);

		JButton btnpartSearch = new JButton("Nach Bauteil suchen");
		btnpartSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    //Emre begin; Button for searching in delete option 
			    switch(comboBoxdeletePart.getSelectedIndex()) {
			    case 0: 
				try {
				    ComponentTableDelete.setModel(new ComponentTableModel(ComponentManagement.getComponentByArticlenumber(textFieldpartNumberSearch.getText())));
				} catch (SQLException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				}
				break;
			    case 1: 
				try {
				    ComponentTableDelete.setModel((new ComponentTableModel(ComponentManagement.getComponentByName(textFieldpartNumberSearch.getText()))));
				} catch (SQLException e1) {
				    // TODO Auto-generated catch block
				    e1.printStackTrace();
				}
				break; 
				
			    }			    
			}
			//Emre end 
		});
		btnpartSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GridBagConstraints gbc_btnpartSearch = new GridBagConstraints();
		gbc_btnpartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnpartSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnpartSearch.gridx = 1;
		gbc_btnpartSearch.gridy = 2;
		paneldeletePart.add(btnpartSearch, gbc_btnpartSearch);

		JButton btndeletePart = new JButton("Bauteil löschen");
		btndeletePart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    
			    try {
				ComponentManagement.deletePart(Integer.parseInt(ComponentTableDelete.getValueAt(ComponentTableDelete.getSelectedRow(), 0).toString()));
			    } catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			    } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			    }
			    refreshTable(); 
			}
		});
		
		JButton btnResetDeleteSearch = new JButton("Suche aufheben");
		btnResetDeleteSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Emre begin, reset table to all components from db 
			    try {
				ComponentTableDelete.setModel(new ComponentTableModel(ComponentManagement.getComponents()));
			    } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }			    
			}
			//Emre end 
		});
		btnResetDeleteSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_btnResetDeleteSearch = new GridBagConstraints();
		gbc_btnResetDeleteSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnResetDeleteSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnResetDeleteSearch.gridx = 1;
		gbc_btnResetDeleteSearch.gridy = 3;
		paneldeletePart.add(btnResetDeleteSearch, gbc_btnResetDeleteSearch);
		btndeletePart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		GridBagConstraints gbc_btndeletePart = new GridBagConstraints();
		gbc_btndeletePart.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeletePart.gridx = 1;
		gbc_btndeletePart.gridy = 4;
		paneldeletePart.add(btndeletePart, gbc_btndeletePart);
		
				JPanel panelcategoryManagement = new JPanel();
				tabbedPane.addTab("Kategorienverwaltung", null, panelcategoryManagement, null);
				GridBagLayout gbl_panelcategoryManagement = new GridBagLayout();
				gbl_panelcategoryManagement.columnWidths = new int[] { 128, 128, 171, 326, 0, 0 };
				gbl_panelcategoryManagement.rowHeights = new int[] { 0, 0, 0, 0, 0, 418, 418, 0, 0, 0, 0 };
				gbl_panelcategoryManagement.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
				gbl_panelcategoryManagement.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0,
						Double.MIN_VALUE };
				panelcategoryManagement.setLayout(gbl_panelcategoryManagement);
				
						JLabel lblcategoryIDModify = new JLabel("ID");
						lblcategoryIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
						GridBagConstraints gbc_lblcategoryIDModify = new GridBagConstraints();
						gbc_lblcategoryIDModify.anchor = GridBagConstraints.EAST;
						gbc_lblcategoryIDModify.insets = new Insets(0, 0, 5, 5);
						gbc_lblcategoryIDModify.gridx = 2;
						gbc_lblcategoryIDModify.gridy = 0;
						panelcategoryManagement.add(lblcategoryIDModify, gbc_lblcategoryIDModify);
						
								textFieldcategoryIDModify = new JTextField();
								textFieldcategoryIDModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
								textFieldcategoryIDModify.setEditable(false);
								GridBagConstraints gbc_textFieldcategoryIDModify = new GridBagConstraints();
								gbc_textFieldcategoryIDModify.insets = new Insets(0, 0, 5, 5);
								gbc_textFieldcategoryIDModify.fill = GridBagConstraints.HORIZONTAL;
								gbc_textFieldcategoryIDModify.gridx = 3;
								gbc_textFieldcategoryIDModify.gridy = 0;
								panelcategoryManagement.add(textFieldcategoryIDModify, gbc_textFieldcategoryIDModify);
								textFieldcategoryIDModify.setColumns(10);
								
										JLabel lblcategoryNameNew = new JLabel("Kategorie");
										lblcategoryNameNew.setFont(new Font("Tahoma", Font.PLAIN, 15));
										GridBagConstraints gbc_lblcategoryNameNew = new GridBagConstraints();
										gbc_lblcategoryNameNew.anchor = GridBagConstraints.EAST;
										gbc_lblcategoryNameNew.insets = new Insets(0, 0, 5, 5);
										gbc_lblcategoryNameNew.gridx = 0;
										gbc_lblcategoryNameNew.gridy = 1;
										panelcategoryManagement.add(lblcategoryNameNew, gbc_lblcategoryNameNew);
										
												textFieldcategoryNameNew = new JTextField();
												textFieldcategoryNameNew.setFont(new Font("Tahoma", Font.PLAIN, 15));
												GridBagConstraints gbc_textFieldcategoryNameNew = new GridBagConstraints();
												gbc_textFieldcategoryNameNew.insets = new Insets(0, 0, 5, 5);
												gbc_textFieldcategoryNameNew.fill = GridBagConstraints.HORIZONTAL;
												gbc_textFieldcategoryNameNew.gridx = 1;
												gbc_textFieldcategoryNameNew.gridy = 1;
												panelcategoryManagement.add(textFieldcategoryNameNew, gbc_textFieldcategoryNameNew);
												textFieldcategoryNameNew.setColumns(10);
												
														JLabel lblcategoryNameModify = new JLabel("Kategorie");
														lblcategoryNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
														GridBagConstraints gbc_lblcategoryNameModify = new GridBagConstraints();
														gbc_lblcategoryNameModify.anchor = GridBagConstraints.EAST;
														gbc_lblcategoryNameModify.insets = new Insets(0, 0, 5, 5);
														gbc_lblcategoryNameModify.gridx = 2;
														gbc_lblcategoryNameModify.gridy = 1;
														panelcategoryManagement.add(lblcategoryNameModify, gbc_lblcategoryNameModify);
														
																textFieldcategoryNameModify = new JTextField();
																textFieldcategoryNameModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																GridBagConstraints gbc_textFieldcategoryNameModify = new GridBagConstraints();
																gbc_textFieldcategoryNameModify.insets = new Insets(0, 0, 5, 5);
																gbc_textFieldcategoryNameModify.fill = GridBagConstraints.HORIZONTAL;
																gbc_textFieldcategoryNameModify.gridx = 3;
																gbc_textFieldcategoryNameModify.gridy = 1;
																panelcategoryManagement.add(textFieldcategoryNameModify, gbc_textFieldcategoryNameModify);
																textFieldcategoryNameModify.setColumns(10);
																
																		JButton btncategoryNew = new JButton("Kategorie hinzufügen");
																		btncategoryNew.addActionListener(new ActionListener() {
																			public void actionPerformed(ActionEvent e) {
																			    //Emre begin
																			    try {
																				ComponentManagement.addCategory(textFieldcategoryNameNew.getText(),textFieldcategoryNoteNew.getText() );
																			    } catch (Exception a) {
																				a.getStackTrace(); 
																			    }
																			    refreshCategoryCombobox(); 
																			    
																			}
																			//Emre end
																		});
																		btncategoryNew.setFont(new Font("Tahoma", Font.PLAIN, 15));
																		
																		
																		JLabel lblcategoryNoteNew = new JLabel("Notiz");
																		lblcategoryNoteNew.setFont(new Font("Tahoma", Font.PLAIN, 15));
																		GridBagConstraints gbc_lblcategoryNoteNew = new GridBagConstraints();
																		gbc_lblcategoryNoteNew.anchor = GridBagConstraints.EAST;
																		gbc_lblcategoryNoteNew.insets = new Insets(0, 0, 5, 5);
																		gbc_lblcategoryNoteNew.gridx = 0;
																		gbc_lblcategoryNoteNew.gridy = 2;
																		panelcategoryManagement.add(lblcategoryNoteNew, gbc_lblcategoryNoteNew);
																		
																		textFieldcategoryNoteNew = new JTextField();
																		textFieldcategoryNoteNew.setFont(new Font("Tahoma", Font.PLAIN, 15));
																		GridBagConstraints gbc_textFieldcategoryNoteNew = new GridBagConstraints();
																		gbc_textFieldcategoryNoteNew.insets = new Insets(0, 0, 5, 5);
																		gbc_textFieldcategoryNoteNew.fill = GridBagConstraints.HORIZONTAL;
																		gbc_textFieldcategoryNoteNew.gridx = 1;
																		gbc_textFieldcategoryNoteNew.gridy = 2;
																		panelcategoryManagement.add(textFieldcategoryNoteNew, gbc_textFieldcategoryNoteNew);
																		textFieldcategoryNoteNew.setColumns(10);
																		
																		JLabel lblcategoryNoteModify = new JLabel("Notiz");
																		lblcategoryNoteModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																		GridBagConstraints gbc_lblcategoryNoteModify = new GridBagConstraints();
																		gbc_lblcategoryNoteModify.anchor = GridBagConstraints.EAST;
																		gbc_lblcategoryNoteModify.insets = new Insets(0, 0, 5, 5);
																		gbc_lblcategoryNoteModify.gridx = 2;
																		gbc_lblcategoryNoteModify.gridy = 2;
																		panelcategoryManagement.add(lblcategoryNoteModify, gbc_lblcategoryNoteModify);
																		
																		textFieldcategoryNoteModify = new JTextField();
																		textFieldcategoryNoteModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																		GridBagConstraints gbc_textFieldcategoryNoteModify = new GridBagConstraints();
																		gbc_textFieldcategoryNoteModify.insets = new Insets(0, 0, 5, 5);
																		gbc_textFieldcategoryNoteModify.fill = GridBagConstraints.HORIZONTAL;
																		gbc_textFieldcategoryNoteModify.gridx = 3;
																		gbc_textFieldcategoryNoteModify.gridy = 2;
																		panelcategoryManagement.add(textFieldcategoryNoteModify, gbc_textFieldcategoryNoteModify);
																		textFieldcategoryNoteModify.setColumns(10);
																		GridBagConstraints gbc_btncategoryNew = new GridBagConstraints();
																		gbc_btncategoryNew.fill = GridBagConstraints.HORIZONTAL;
																		gbc_btncategoryNew.insets = new Insets(0, 0, 5, 5);
																		gbc_btncategoryNew.gridx = 1;
																		gbc_btncategoryNew.gridy = 3;
																		panelcategoryManagement.add(btncategoryNew, gbc_btncategoryNew);
																		
																				JButton btncategoryModify = new JButton("Änderungen an Kategorie speichern");
																				btncategoryModify.setFont(new Font("Tahoma", Font.PLAIN, 15));
																				
																				GridBagConstraints gbc_btncategoryModify = new GridBagConstraints();
																				gbc_btncategoryModify.fill = GridBagConstraints.HORIZONTAL;
																				gbc_btncategoryModify.insets = new Insets(0, 0, 5, 5);
																				gbc_btncategoryModify.gridx = 3;
																				gbc_btncategoryModify.gridy = 3;
																				panelcategoryManagement.add(btncategoryModify, gbc_btncategoryModify);
																				
																						JButton btncategoryDeleteInputs = new JButton("Eingaben löschen");
																						btncategoryDeleteInputs.addActionListener(new ActionListener() {
																							public void actionPerformed(ActionEvent e) {
																							//Emre begin
																							    textFieldcategoryNameNew.setText("");
																							    textFieldcategoryNoteNew.setText("");
																							}
																							//Emre end
																						});
																						btncategoryDeleteInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
																						GridBagConstraints gbc_btncategoryDeleteInputs = new GridBagConstraints();
																						gbc_btncategoryDeleteInputs.fill = GridBagConstraints.HORIZONTAL;
																						gbc_btncategoryDeleteInputs.insets = new Insets(0, 0, 5, 5);
																						gbc_btncategoryDeleteInputs.gridx = 1;
																						gbc_btncategoryDeleteInputs.gridy = 4;
																						panelcategoryManagement.add(btncategoryDeleteInputs, gbc_btncategoryDeleteInputs);
																						
																								JButton btncategoryModifyDeleteInputs = new JButton("Änderungen löschen");
																								btncategoryModifyDeleteInputs.addActionListener(new ActionListener() {
																									public void actionPerformed(ActionEvent e) {
																									    //Emre begin
																									    textFieldcategoryNameModify.setText("");
																									    textFieldcategoryNoteModify.setText("");
																									}
																									//Emre end
																								});
																								btncategoryModifyDeleteInputs.setFont(new Font("Tahoma", Font.PLAIN, 15));
																								
																								GridBagConstraints gbc_btncategoryModifyDeleteInputs = new GridBagConstraints();
																								gbc_btncategoryModifyDeleteInputs.fill = GridBagConstraints.HORIZONTAL;
																								gbc_btncategoryModifyDeleteInputs.insets = new Insets(0, 0, 5, 5);
																								gbc_btncategoryModifyDeleteInputs.gridx = 3;
																								gbc_btncategoryModifyDeleteInputs.gridy = 4;
																								panelcategoryManagement.add(btncategoryModifyDeleteInputs, gbc_btncategoryModifyDeleteInputs);
																								
																										JScrollPane scrollPane = new JScrollPane();
																										scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
																										scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
																										GridBagConstraints gbc_scrollPane = new GridBagConstraints();
																										gbc_scrollPane.gridheight = 2;
																										gbc_scrollPane.gridwidth = 6;
																										gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
																										gbc_scrollPane.fill = GridBagConstraints.BOTH;
																										gbc_scrollPane.gridx = 0;
																										gbc_scrollPane.gridy = 5;
																										panelcategoryManagement.add(scrollPane, gbc_scrollPane);
																										
																										//Emre begin 
																										JTable CategoryTable = new JTable();
																										CategoryTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
																										scrollPane.setViewportView(CategoryTable);
																										CategoryTable.setFont(new Font("Tahoma", Font.PLAIN, 15));
																										try {
																										    CategoryTable.setModel(new CategoryTableModel(ComponentManagement.getCategories()));																										    
																										} catch (SQLException e1) {
																										    // TODO Auto-generated catch block
																										    e1.printStackTrace();
																										}																										
																										//Emre end		
																														JLabel lblcategoryNameSearch = new JLabel("Kategorie");
																														lblcategoryNameSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
																														GridBagConstraints gbc_lblcategoryNameSearch = new GridBagConstraints();
																														gbc_lblcategoryNameSearch.anchor = GridBagConstraints.EAST;
																														gbc_lblcategoryNameSearch.insets = new Insets(0, 0, 5, 5);
																														gbc_lblcategoryNameSearch.gridx = 0;
																														gbc_lblcategoryNameSearch.gridy = 7;
																														panelcategoryManagement.add(lblcategoryNameSearch, gbc_lblcategoryNameSearch);
																														
																																textFieldcategoryNameSearch = new JTextField();
																																textFieldcategoryNameSearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																GridBagConstraints gbc_textFieldcategoryNameSearch = new GridBagConstraints();
																																gbc_textFieldcategoryNameSearch.gridwidth = 5;
																																gbc_textFieldcategoryNameSearch.insets = new Insets(0, 0, 5, 0);
																																gbc_textFieldcategoryNameSearch.fill = GridBagConstraints.HORIZONTAL;
																																gbc_textFieldcategoryNameSearch.gridx = 1;
																																gbc_textFieldcategoryNameSearch.gridy = 7;
																																panelcategoryManagement.add(textFieldcategoryNameSearch, gbc_textFieldcategoryNameSearch);
																																textFieldcategoryNameSearch.setColumns(10);
																																
																																		JButton btncategorySearch = new JButton("Nach Kategorie suchen");
																																		btncategorySearch.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																		
																																		GridBagConstraints gbc_btncategorySearch = new GridBagConstraints();
																																		gbc_btncategorySearch.gridwidth = 5;
																																		gbc_btncategorySearch.fill = GridBagConstraints.HORIZONTAL;
																																		gbc_btncategorySearch.insets = new Insets(0, 0, 5, 0);
																																		gbc_btncategorySearch.gridx = 1;
																																		gbc_btncategorySearch.gridy = 8;
																																		panelcategoryManagement.add(btncategorySearch, gbc_btncategorySearch);
																																		
																																				JButton btncategoryDelete = new JButton("Kategorie löschen");
																																				btncategoryDelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																				
																																				GridBagConstraints gbc_btncategoryDelete = new GridBagConstraints();
																																				gbc_btncategoryDelete.gridwidth = 5;
																																				gbc_btncategoryDelete.fill = GridBagConstraints.HORIZONTAL;
																																				gbc_btncategoryDelete.gridx = 1;
																																				gbc_btncategoryDelete.gridy = 9;
																																				panelcategoryManagement.add(btncategoryDelete, gbc_btncategoryDelete);

		JMenuBar menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);

		JMenu mnNewMenuOptions = new JMenu("Menü");
		mnNewMenuOptions.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenuOptions);

		JMenuItem mntmNewMenuItembacktoMain = new JMenuItem("Hauptmenü");
		mntmNewMenuItembacktoMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    GuiMenue mainMenu = new GuiMenue();
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
		menuBar.add(mnNewMenuhelpWindow);

		JMenuItem mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mntmNewMenuItemshowManual.setFont(new Font("Segoe UI", Font.BOLD, 15));
		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);
		
		frmElabVerwaltungsprogramm.setVisible(true);
	}
	
	//Emre begin 
	protected void refreshCategoryCombobox() {
	    comboBoxcategory.removeAllItems();
	    comboBoxcategoryModify.removeAllItems();
	    // TODO Auto-generated method stub
	    try {
		    for(int i = 0; i<ComponentManagement.getCategoryArray().length; i++) {
		        comboBoxcategory.addItem(ComponentManagement.getCategoryArray()[i]);
		        comboBoxcategoryModify.addItem(ComponentManagement.getCategoryArray()[i]);
		    }
		} catch (SQLException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
	    
	    
	}
	protected int getCategoryId(int selectedIndex) {
	    // TODO Auto-generated method stub
	    try {
		return ComponentManagement.getCategoryArray()[selectedIndex].getId();
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } 
	    return 0; 
	    
	    
	}
	protected void handleDeleteComponentSelectionEvent(ListSelectionEvent e) {
	    // TODO Auto-generated method stub
	    
	}
	
	protected void refreshTable() {
	    // TODO Auto-generated method stub
	    	try {
		    ComponentTableModify.setModel(new ComponentTableModel(ComponentManagement.getComponents()));
		    ComponentTableDelete.setModel(new ComponentTableModel(ComponentManagement.getComponents()));
		} catch (SQLException e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
	    
	}

	protected void handleEditComponentSelectionEvent(ListSelectionEvent e) {
	    // TODO Auto-generated method stub
	    if (ComponentTableModify.getSelectedRow()>-1) {
		tfComponentModifyID.setText(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(),0).toString());
		tfArticleNoModify.setText(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(), 1).toString());
		textFieldpartNameModify.setText(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(),2).toString());
		textFieldpartLinkModify.setText(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(), 3).toString());
		textFieldpartPrizeModify.setText(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(), 4).toString());
		tfStoring.setText(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(),5).toString());		
		tfPlannedAmount.setText(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(), 6).toString());
		tfOrderedAmount.setText(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(), 7).toString());
		tfStorageLocationModify.setText(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(), 8).toString());
		comboBoxcategoryModify.setSelectedIndex(findCorrectIndexFromCategory(ComponentTableModify.getValueAt(ComponentTableModify.getSelectedRow(), 9).toString()));
		
	    }
	    
	}

	private int findCorrectIndexFromCategory(String value) {
	    // TODO Auto-generated method stub
	    int x = Integer.parseInt(value);
	    
	    try {
		Category [] array = ComponentManagement.getCategoryArray();
		for(int i = 0; i<array.length; i++) {
		    if(array[i].getId() == x) {
			return i; 
		    }
			
		    }
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    
	    	    return -1;
	}
	//Emre end 
	}
