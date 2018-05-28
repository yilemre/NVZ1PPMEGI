package userInterface;

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
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import logic.ComponentManagement;

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

public class GUIComponentmanagement implements ActionListener {

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
	private JTextField textFieldstorageLocationModify;
	private JTextField textFieldpartNumberSearch;
	private JTextField textFieldcategoryNameNew;
	private JTextField textFieldcategoryIDModify;
	private JTextField textFieldcategoryNameModify;
	private JTextField textFieldcategoryNameSearch;
	private JTextField textFieldsearchModifyPart;
	private JTextField textFieldcategoryNoteNew;
	private JTextField textFieldcategoryNoteModify;

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
		frmElabVerwaltungsprogramm.setBounds(100, 100, 1036, 727);
		frmElabVerwaltungsprogramm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		frmElabVerwaltungsprogramm.getContentPane().setLayout(gridBagLayout);

		JLabel lblcomponentManagement = new JLabel("Bauteilverwaltung");
		lblcomponentManagement.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblcomponentManagement = new GridBagConstraints();
		gbc_lblcomponentManagement.insets = new Insets(0, 0, 5, 0);
		gbc_lblcomponentManagement.gridx = 0;
		gbc_lblcomponentManagement.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblcomponentManagement, gbc_lblcomponentManagement);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(tabbedPane, gbc_tabbedPane);

		JPanel paneladdPart = new JPanel();
		tabbedPane.addTab("Bauteil hinzufügen", null, paneladdPart, null);
		GridBagLayout gbl_paneladdPart = new GridBagLayout();
		gbl_paneladdPart.columnWidths = new int[] { 0, 0, 0 };
		gbl_paneladdPart.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_paneladdPart.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_paneladdPart.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		paneladdPart.setLayout(gbl_paneladdPart);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		paneladdPart.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblpartName = new JLabel("Bauteilname");
		GridBagConstraints gbc_lblpartName = new GridBagConstraints();
		gbc_lblpartName.anchor = GridBagConstraints.EAST;
		gbc_lblpartName.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartName.gridx = 0;
		gbc_lblpartName.gridy = 1;
		paneladdPart.add(lblpartName, gbc_lblpartName);

		textFieldpartName = new JTextField();
		GridBagConstraints gbc_textFieldpartName = new GridBagConstraints();
		gbc_textFieldpartName.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartName.gridx = 1;
		gbc_textFieldpartName.gridy = 1;
		paneladdPart.add(textFieldpartName, gbc_textFieldpartName);
		textFieldpartName.setColumns(10);

		JLabel lblcategory = new JLabel("Kategorie");
		GridBagConstraints gbc_lblcategory = new GridBagConstraints();
		gbc_lblcategory.anchor = GridBagConstraints.EAST;
		gbc_lblcategory.insets = new Insets(0, 0, 5, 5);
		gbc_lblcategory.gridx = 0;
		gbc_lblcategory.gridy = 2;
		paneladdPart.add(lblcategory, gbc_lblcategory);

		JComboBox comboBoxcategory = new JComboBox();
		GridBagConstraints gbc_comboBoxcategory = new GridBagConstraints();
		gbc_comboBoxcategory.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxcategory.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxcategory.gridx = 1;
		gbc_comboBoxcategory.gridy = 2;
		paneladdPart.add(comboBoxcategory, gbc_comboBoxcategory);

		JLabel lblpartLink = new JLabel("Produktlink");
		GridBagConstraints gbc_lblpartLink = new GridBagConstraints();
		gbc_lblpartLink.anchor = GridBagConstraints.EAST;
		gbc_lblpartLink.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartLink.gridx = 0;
		gbc_lblpartLink.gridy = 3;
		paneladdPart.add(lblpartLink, gbc_lblpartLink);

		textFieldpartLink = new JTextField();
		GridBagConstraints gbc_textFieldpartLink = new GridBagConstraints();
		gbc_textFieldpartLink.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartLink.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartLink.gridx = 1;
		gbc_textFieldpartLink.gridy = 3;
		paneladdPart.add(textFieldpartLink, gbc_textFieldpartLink);
		textFieldpartLink.setColumns(10);

		JLabel lblpartPrize = new JLabel("Einzelpreis");
		GridBagConstraints gbc_lblpartPrize = new GridBagConstraints();
		gbc_lblpartPrize.anchor = GridBagConstraints.EAST;
		gbc_lblpartPrize.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartPrize.gridx = 0;
		gbc_lblpartPrize.gridy = 4;
		paneladdPart.add(lblpartPrize, gbc_lblpartPrize);

		textFieldpartPrize = new JTextField();
		GridBagConstraints gbc_textFieldpartPrize = new GridBagConstraints();
		gbc_textFieldpartPrize.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartPrize.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartPrize.gridx = 1;
		gbc_textFieldpartPrize.gridy = 4;
		paneladdPart.add(textFieldpartPrize, gbc_textFieldpartPrize);
		textFieldpartPrize.setColumns(10);

		JLabel lblquantityStoring = new JLabel("Menge (lagernd)");
		GridBagConstraints gbc_lblquantityStoring = new GridBagConstraints();
		gbc_lblquantityStoring.anchor = GridBagConstraints.EAST;
		gbc_lblquantityStoring.insets = new Insets(0, 0, 5, 5);
		gbc_lblquantityStoring.gridx = 0;
		gbc_lblquantityStoring.gridy = 5;
		paneladdPart.add(lblquantityStoring, gbc_lblquantityStoring);

		textFieldquantityStoring = new JTextField();
		GridBagConstraints gbc_textFieldquantityStoring = new GridBagConstraints();
		gbc_textFieldquantityStoring.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldquantityStoring.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldquantityStoring.gridx = 1;
		gbc_textFieldquantityStoring.gridy = 5;
		paneladdPart.add(textFieldquantityStoring, gbc_textFieldquantityStoring);
		textFieldquantityStoring.setColumns(10);

		JLabel lblquantityPlanned = new JLabel("Menge (geplant)");
		lblquantityPlanned.setToolTipText("");
		GridBagConstraints gbc_lblquantityPlanned = new GridBagConstraints();
		gbc_lblquantityPlanned.anchor = GridBagConstraints.EAST;
		gbc_lblquantityPlanned.insets = new Insets(0, 0, 5, 5);
		gbc_lblquantityPlanned.gridx = 0;
		gbc_lblquantityPlanned.gridy = 6;
		paneladdPart.add(lblquantityPlanned, gbc_lblquantityPlanned);

		textFieldquantityPlanned = new JTextField();
		GridBagConstraints gbc_textFieldquantityPlanned = new GridBagConstraints();
		gbc_textFieldquantityPlanned.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldquantityPlanned.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldquantityPlanned.gridx = 1;
		gbc_textFieldquantityPlanned.gridy = 6;
		paneladdPart.add(textFieldquantityPlanned, gbc_textFieldquantityPlanned);
		textFieldquantityPlanned.setColumns(10);

		JLabel lblquantityOrdered = new JLabel("Menge (bestellt)");
		GridBagConstraints gbc_lblquantityOrdered = new GridBagConstraints();
		gbc_lblquantityOrdered.anchor = GridBagConstraints.EAST;
		gbc_lblquantityOrdered.insets = new Insets(0, 0, 5, 5);
		gbc_lblquantityOrdered.gridx = 0;
		gbc_lblquantityOrdered.gridy = 7;
		paneladdPart.add(lblquantityOrdered, gbc_lblquantityOrdered);

		textFieldquantityOrdered = new JTextField();
		GridBagConstraints gbc_textFieldquantityOrdered = new GridBagConstraints();
		gbc_textFieldquantityOrdered.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldquantityOrdered.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldquantityOrdered.gridx = 1;
		gbc_textFieldquantityOrdered.gridy = 7;
		paneladdPart.add(textFieldquantityOrdered, gbc_textFieldquantityOrdered);
		textFieldquantityOrdered.setColumns(10);

		JLabel lblstorageLocation = new JLabel("Lagerort");
		GridBagConstraints gbc_lblstorageLocation = new GridBagConstraints();
		gbc_lblstorageLocation.anchor = GridBagConstraints.EAST;
		gbc_lblstorageLocation.insets = new Insets(0, 0, 5, 5);
		gbc_lblstorageLocation.gridx = 0;
		gbc_lblstorageLocation.gridy = 8;
		paneladdPart.add(lblstorageLocation, gbc_lblstorageLocation);

		textFieldstorageLocation = new JTextField();
		GridBagConstraints gbc_textFieldstorageLocation = new GridBagConstraints();
		gbc_textFieldstorageLocation.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldstorageLocation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldstorageLocation.gridx = 1;
		gbc_textFieldstorageLocation.gridy = 8;
		paneladdPart.add(textFieldstorageLocation, gbc_textFieldstorageLocation);
		textFieldstorageLocation.setColumns(10);

		JButton btnaddPart = new JButton("Bauteil hinzufügen");
		btnaddPart.addActionListener(this);
		GridBagConstraints gbc_btnaddPart = new GridBagConstraints();
		gbc_btnaddPart.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddPart.insets = new Insets(0, 0, 5, 0);
		gbc_btnaddPart.gridx = 1;
		gbc_btnaddPart.gridy = 9;
		paneladdPart.add(btnaddPart, gbc_btnaddPart);

		JButton btndeleteallInputs = new JButton("Eingabe l\u00F6schen");
		btndeleteallInputs.addActionListener(this);
		GridBagConstraints gbc_btndeleteallInputs = new GridBagConstraints();
		gbc_btndeleteallInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputs.gridx = 1;
		gbc_btndeleteallInputs.gridy = 10;
		paneladdPart.add(btndeleteallInputs, gbc_btndeleteallInputs);

		JLabel lbleLabpicture = new JLabel("");
		lbleLabpicture.setIcon(new ImageIcon("C:\\Users\\Nils\\git\\ProPraElab\\ProPraElab\\pictures\\elab.png"));
		GridBagConstraints gbc_lbleLabpicture = new GridBagConstraints();
		gbc_lbleLabpicture.gridwidth = 2;
		gbc_lbleLabpicture.gridx = 0;
		gbc_lbleLabpicture.gridy = 11;
		paneladdPart.add(lbleLabpicture, gbc_lbleLabpicture);
		
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
						GridBagConstraints gbc_lblcategoryIDModify = new GridBagConstraints();
						gbc_lblcategoryIDModify.anchor = GridBagConstraints.EAST;
						gbc_lblcategoryIDModify.insets = new Insets(0, 0, 5, 5);
						gbc_lblcategoryIDModify.gridx = 2;
						gbc_lblcategoryIDModify.gridy = 0;
						panelcategoryManagement.add(lblcategoryIDModify, gbc_lblcategoryIDModify);
						
								textFieldcategoryIDModify = new JTextField();
								textFieldcategoryIDModify.setEditable(false);
								GridBagConstraints gbc_textFieldcategoryIDModify = new GridBagConstraints();
								gbc_textFieldcategoryIDModify.insets = new Insets(0, 0, 5, 5);
								gbc_textFieldcategoryIDModify.fill = GridBagConstraints.HORIZONTAL;
								gbc_textFieldcategoryIDModify.gridx = 3;
								gbc_textFieldcategoryIDModify.gridy = 0;
								panelcategoryManagement.add(textFieldcategoryIDModify, gbc_textFieldcategoryIDModify);
								textFieldcategoryIDModify.setColumns(10);
								
										JLabel lblcategoryNameNew = new JLabel("Kategorie");
										GridBagConstraints gbc_lblcategoryNameNew = new GridBagConstraints();
										gbc_lblcategoryNameNew.anchor = GridBagConstraints.EAST;
										gbc_lblcategoryNameNew.insets = new Insets(0, 0, 5, 5);
										gbc_lblcategoryNameNew.gridx = 0;
										gbc_lblcategoryNameNew.gridy = 1;
										panelcategoryManagement.add(lblcategoryNameNew, gbc_lblcategoryNameNew);
										
												textFieldcategoryNameNew = new JTextField();
												GridBagConstraints gbc_textFieldcategoryNameNew = new GridBagConstraints();
												gbc_textFieldcategoryNameNew.insets = new Insets(0, 0, 5, 5);
												gbc_textFieldcategoryNameNew.fill = GridBagConstraints.HORIZONTAL;
												gbc_textFieldcategoryNameNew.gridx = 1;
												gbc_textFieldcategoryNameNew.gridy = 1;
												panelcategoryManagement.add(textFieldcategoryNameNew, gbc_textFieldcategoryNameNew);
												textFieldcategoryNameNew.setColumns(10);
												
														JLabel lblcategoryNameModify = new JLabel("Kategorie");
														GridBagConstraints gbc_lblcategoryNameModify = new GridBagConstraints();
														gbc_lblcategoryNameModify.anchor = GridBagConstraints.EAST;
														gbc_lblcategoryNameModify.insets = new Insets(0, 0, 5, 5);
														gbc_lblcategoryNameModify.gridx = 2;
														gbc_lblcategoryNameModify.gridy = 1;
														panelcategoryManagement.add(lblcategoryNameModify, gbc_lblcategoryNameModify);
														
																textFieldcategoryNameModify = new JTextField();
																GridBagConstraints gbc_textFieldcategoryNameModify = new GridBagConstraints();
																gbc_textFieldcategoryNameModify.insets = new Insets(0, 0, 5, 5);
																gbc_textFieldcategoryNameModify.fill = GridBagConstraints.HORIZONTAL;
																gbc_textFieldcategoryNameModify.gridx = 3;
																gbc_textFieldcategoryNameModify.gridy = 1;
																panelcategoryManagement.add(textFieldcategoryNameModify, gbc_textFieldcategoryNameModify);
																textFieldcategoryNameModify.setColumns(10);
																
																		JButton btncategoryNew = new JButton("Kategorie hinzufügen");
																		btncategoryNew.addActionListener(this);
																		
																		JLabel lblcategoryNoteNew = new JLabel("Notiz");
																		GridBagConstraints gbc_lblcategoryNoteNew = new GridBagConstraints();
																		gbc_lblcategoryNoteNew.anchor = GridBagConstraints.EAST;
																		gbc_lblcategoryNoteNew.insets = new Insets(0, 0, 5, 5);
																		gbc_lblcategoryNoteNew.gridx = 0;
																		gbc_lblcategoryNoteNew.gridy = 2;
																		panelcategoryManagement.add(lblcategoryNoteNew, gbc_lblcategoryNoteNew);
																		
																		textFieldcategoryNoteNew = new JTextField();
																		GridBagConstraints gbc_textFieldcategoryNoteNew = new GridBagConstraints();
																		gbc_textFieldcategoryNoteNew.insets = new Insets(0, 0, 5, 5);
																		gbc_textFieldcategoryNoteNew.fill = GridBagConstraints.HORIZONTAL;
																		gbc_textFieldcategoryNoteNew.gridx = 1;
																		gbc_textFieldcategoryNoteNew.gridy = 2;
																		panelcategoryManagement.add(textFieldcategoryNoteNew, gbc_textFieldcategoryNoteNew);
																		textFieldcategoryNoteNew.setColumns(10);
																		
																		JLabel lblcategoryNoteModify = new JLabel("Notiz");
																		GridBagConstraints gbc_lblcategoryNoteModify = new GridBagConstraints();
																		gbc_lblcategoryNoteModify.anchor = GridBagConstraints.EAST;
																		gbc_lblcategoryNoteModify.insets = new Insets(0, 0, 5, 5);
																		gbc_lblcategoryNoteModify.gridx = 2;
																		gbc_lblcategoryNoteModify.gridy = 2;
																		panelcategoryManagement.add(lblcategoryNoteModify, gbc_lblcategoryNoteModify);
																		
																		textFieldcategoryNoteModify = new JTextField();
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
																				btncategoryModify.addActionListener(this);
																				GridBagConstraints gbc_btncategoryModify = new GridBagConstraints();
																				gbc_btncategoryModify.fill = GridBagConstraints.HORIZONTAL;
																				gbc_btncategoryModify.insets = new Insets(0, 0, 5, 5);
																				gbc_btncategoryModify.gridx = 3;
																				gbc_btncategoryModify.gridy = 3;
																				panelcategoryManagement.add(btncategoryModify, gbc_btncategoryModify);
																				
																						JButton btncategoryDeleteInputs = new JButton("Eingaben löschen");
																						btncategoryDeleteInputs.addActionListener(this);
																						GridBagConstraints gbc_btncategoryDeleteInputs = new GridBagConstraints();
																						gbc_btncategoryDeleteInputs.fill = GridBagConstraints.HORIZONTAL;
																						gbc_btncategoryDeleteInputs.insets = new Insets(0, 0, 5, 5);
																						gbc_btncategoryDeleteInputs.gridx = 1;
																						gbc_btncategoryDeleteInputs.gridy = 4;
																						panelcategoryManagement.add(btncategoryDeleteInputs, gbc_btncategoryDeleteInputs);
																						
																								JButton btncategoryModifyDeleteInputs = new JButton("Änderungen löschen");
																								btncategoryModifyDeleteInputs.addActionListener(this);
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
																										
																												JList list = new JList();
																												list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
																												scrollPane.setViewportView(list);
																												
																														JLabel lblcategoryNameSearch = new JLabel("Kategorie");
																														GridBagConstraints gbc_lblcategoryNameSearch = new GridBagConstraints();
																														gbc_lblcategoryNameSearch.anchor = GridBagConstraints.EAST;
																														gbc_lblcategoryNameSearch.insets = new Insets(0, 0, 5, 5);
																														gbc_lblcategoryNameSearch.gridx = 0;
																														gbc_lblcategoryNameSearch.gridy = 7;
																														panelcategoryManagement.add(lblcategoryNameSearch, gbc_lblcategoryNameSearch);
																														
																																textFieldcategoryNameSearch = new JTextField();
																																GridBagConstraints gbc_textFieldcategoryNameSearch = new GridBagConstraints();
																																gbc_textFieldcategoryNameSearch.gridwidth = 5;
																																gbc_textFieldcategoryNameSearch.insets = new Insets(0, 0, 5, 0);
																																gbc_textFieldcategoryNameSearch.fill = GridBagConstraints.HORIZONTAL;
																																gbc_textFieldcategoryNameSearch.gridx = 1;
																																gbc_textFieldcategoryNameSearch.gridy = 7;
																																panelcategoryManagement.add(textFieldcategoryNameSearch, gbc_textFieldcategoryNameSearch);
																																textFieldcategoryNameSearch.setColumns(10);
																																
																																		JButton btncategorySearch = new JButton("Nach Kategorie suchen");
																																		btncategorySearch.addActionListener(this);
																																		GridBagConstraints gbc_btncategorySearch = new GridBagConstraints();
																																		gbc_btncategorySearch.gridwidth = 5;
																																		gbc_btncategorySearch.fill = GridBagConstraints.HORIZONTAL;
																																		gbc_btncategorySearch.insets = new Insets(0, 0, 5, 0);
																																		gbc_btncategorySearch.gridx = 1;
																																		gbc_btncategorySearch.gridy = 8;
																																		panelcategoryManagement.add(btncategorySearch, gbc_btncategorySearch);
																																		
																																				JButton btncategoryDelete = new JButton("Kategorie löschen");
																																				btncategoryDelete.addActionListener(this);
																																				GridBagConstraints gbc_btncategoryDelete = new GridBagConstraints();
																																				gbc_btncategoryDelete.gridwidth = 5;
																																				gbc_btncategoryDelete.fill = GridBagConstraints.HORIZONTAL;
																																				gbc_btncategoryDelete.gridx = 1;
																																				gbc_btncategoryDelete.gridy = 9;
																																				panelcategoryManagement.add(btncategoryDelete, gbc_btncategoryDelete);

		JPanel panelmodify = new JPanel();
		tabbedPane.addTab("Bauteil bearbeiten", null, panelmodify, null);
		GridBagLayout gbl_panelmodify = new GridBagLayout();
		gbl_panelmodify.columnWidths = new int[] { 152, 0, 0 };
		gbl_panelmodify.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelmodify.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelmodify.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panelmodify.setLayout(gbl_panelmodify);

		JLabel lblpartNameModify = new JLabel("Bauteilname");
		GridBagConstraints gbc_lblpartNameModify = new GridBagConstraints();
		gbc_lblpartNameModify.anchor = GridBagConstraints.EAST;
		gbc_lblpartNameModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartNameModify.gridx = 0;
		gbc_lblpartNameModify.gridy = 0;
		panelmodify.add(lblpartNameModify, gbc_lblpartNameModify);

		textFieldpartNameModify = new JTextField();
		GridBagConstraints gbc_textFieldpartNameModify = new GridBagConstraints();
		gbc_textFieldpartNameModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartNameModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartNameModify.gridx = 1;
		gbc_textFieldpartNameModify.gridy = 0;
		panelmodify.add(textFieldpartNameModify, gbc_textFieldpartNameModify);
		textFieldpartNameModify.setColumns(10);

		JLabel lblcategoryModify = new JLabel("Kategorie");
		GridBagConstraints gbc_lblcategoryModify = new GridBagConstraints();
		gbc_lblcategoryModify.anchor = GridBagConstraints.EAST;
		gbc_lblcategoryModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblcategoryModify.gridx = 0;
		gbc_lblcategoryModify.gridy = 1;
		panelmodify.add(lblcategoryModify, gbc_lblcategoryModify);

		JComboBox comboBoxcategoryModify = new JComboBox();
		GridBagConstraints gbc_comboBoxcategoryModify = new GridBagConstraints();
		gbc_comboBoxcategoryModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxcategoryModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxcategoryModify.gridx = 1;
		gbc_comboBoxcategoryModify.gridy = 1;
		panelmodify.add(comboBoxcategoryModify, gbc_comboBoxcategoryModify);

		JLabel lblpartLinkModify = new JLabel("Produktlink");
		GridBagConstraints gbc_lblpartLinkModify = new GridBagConstraints();
		gbc_lblpartLinkModify.anchor = GridBagConstraints.EAST;
		gbc_lblpartLinkModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartLinkModify.gridx = 0;
		gbc_lblpartLinkModify.gridy = 2;
		panelmodify.add(lblpartLinkModify, gbc_lblpartLinkModify);

		textFieldpartLinkModify = new JTextField();
		GridBagConstraints gbc_textFieldpartLinkModify = new GridBagConstraints();
		gbc_textFieldpartLinkModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartLinkModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartLinkModify.gridx = 1;
		gbc_textFieldpartLinkModify.gridy = 2;
		panelmodify.add(textFieldpartLinkModify, gbc_textFieldpartLinkModify);
		textFieldpartLinkModify.setColumns(10);

		JLabel lblpartPrizeModify = new JLabel("Einzelpreis");
		GridBagConstraints gbc_lblpartPrizeModify = new GridBagConstraints();
		gbc_lblpartPrizeModify.anchor = GridBagConstraints.EAST;
		gbc_lblpartPrizeModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblpartPrizeModify.gridx = 0;
		gbc_lblpartPrizeModify.gridy = 3;
		panelmodify.add(lblpartPrizeModify, gbc_lblpartPrizeModify);

		textFieldpartPrizeModify = new JTextField();
		GridBagConstraints gbc_textFieldpartPrizeModify = new GridBagConstraints();
		gbc_textFieldpartPrizeModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartPrizeModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartPrizeModify.gridx = 1;
		gbc_textFieldpartPrizeModify.gridy = 3;
		panelmodify.add(textFieldpartPrizeModify, gbc_textFieldpartPrizeModify);
		textFieldpartPrizeModify.setColumns(10);

		JLabel lblquantityStoringModify = new JLabel("Menge (lagernd)");
		GridBagConstraints gbc_lblquantityStoringModify = new GridBagConstraints();
		gbc_lblquantityStoringModify.anchor = GridBagConstraints.EAST;
		gbc_lblquantityStoringModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblquantityStoringModify.gridx = 0;
		gbc_lblquantityStoringModify.gridy = 4;
		panelmodify.add(lblquantityStoringModify, gbc_lblquantityStoringModify);

		JSpinner spinnerquantityStorageModify = new JSpinner();
		GridBagConstraints gbc_spinnerquantityStorageModify = new GridBagConstraints();
		gbc_spinnerquantityStorageModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerquantityStorageModify.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerquantityStorageModify.gridx = 1;
		gbc_spinnerquantityStorageModify.gridy = 4;
		panelmodify.add(spinnerquantityStorageModify, gbc_spinnerquantityStorageModify);

		JLabel lblquantityPlannedModify = new JLabel("Menge (geplant)");
		GridBagConstraints gbc_lblquantityPlannedModify = new GridBagConstraints();
		gbc_lblquantityPlannedModify.anchor = GridBagConstraints.EAST;
		gbc_lblquantityPlannedModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblquantityPlannedModify.gridx = 0;
		gbc_lblquantityPlannedModify.gridy = 5;
		panelmodify.add(lblquantityPlannedModify, gbc_lblquantityPlannedModify);

		JSpinner spinnerquantityPlannedModify = new JSpinner();
		GridBagConstraints gbc_spinnerquantityPlannedModify = new GridBagConstraints();
		gbc_spinnerquantityPlannedModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerquantityPlannedModify.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerquantityPlannedModify.gridx = 1;
		gbc_spinnerquantityPlannedModify.gridy = 5;
		panelmodify.add(spinnerquantityPlannedModify, gbc_spinnerquantityPlannedModify);

		JLabel lblquantityOrderedModify = new JLabel("Menge (bestellt)");
		GridBagConstraints gbc_lblquantityOrderedModify = new GridBagConstraints();
		gbc_lblquantityOrderedModify.anchor = GridBagConstraints.EAST;
		gbc_lblquantityOrderedModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblquantityOrderedModify.gridx = 0;
		gbc_lblquantityOrderedModify.gridy = 6;
		panelmodify.add(lblquantityOrderedModify, gbc_lblquantityOrderedModify);

		JSpinner spinnerquantityOrderedModify = new JSpinner();
		GridBagConstraints gbc_spinnerquantityOrderedModify = new GridBagConstraints();
		gbc_spinnerquantityOrderedModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinnerquantityOrderedModify.insets = new Insets(0, 0, 5, 0);
		gbc_spinnerquantityOrderedModify.gridx = 1;
		gbc_spinnerquantityOrderedModify.gridy = 6;
		panelmodify.add(spinnerquantityOrderedModify, gbc_spinnerquantityOrderedModify);

		JLabel lblstorageLocationModify = new JLabel("Lagerort");
		GridBagConstraints gbc_lblstorageLocationModify = new GridBagConstraints();
		gbc_lblstorageLocationModify.anchor = GridBagConstraints.EAST;
		gbc_lblstorageLocationModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblstorageLocationModify.gridx = 0;
		gbc_lblstorageLocationModify.gridy = 7;
		panelmodify.add(lblstorageLocationModify, gbc_lblstorageLocationModify);

		textFieldstorageLocationModify = new JTextField();
		GridBagConstraints gbc_textFieldstorageLocationModify = new GridBagConstraints();
		gbc_textFieldstorageLocationModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldstorageLocationModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldstorageLocationModify.gridx = 1;
		gbc_textFieldstorageLocationModify.gridy = 7;
		panelmodify.add(textFieldstorageLocationModify, gbc_textFieldstorageLocationModify);
		textFieldstorageLocationModify.setColumns(10);

		JButton btnsaveModifiedValues = new JButton("\u00C4nderungen speichern");
		btnsaveModifiedValues.addActionListener(this);
		GridBagConstraints gbc_btnsaveModifiedValues = new GridBagConstraints();
		gbc_btnsaveModifiedValues.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsaveModifiedValues.insets = new Insets(0, 0, 5, 0);
		gbc_btnsaveModifiedValues.gridx = 1;
		gbc_btnsaveModifiedValues.gridy = 8;
		panelmodify.add(btnsaveModifiedValues, gbc_btnsaveModifiedValues);

		JScrollPane scrollPanemodifyPart = new JScrollPane();
		scrollPanemodifyPart.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanemodifyPart.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanemodifyPart = new GridBagConstraints();
		gbc_scrollPanemodifyPart.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanemodifyPart.gridwidth = 2;
		gbc_scrollPanemodifyPart.fill = GridBagConstraints.BOTH;
		gbc_scrollPanemodifyPart.gridx = 0;
		gbc_scrollPanemodifyPart.gridy = 9;
		panelmodify.add(scrollPanemodifyPart, gbc_scrollPanemodifyPart);

		JList listPart = new JList();
		listPart.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listPart.setModel(new AbstractListModel() {
			String[] values = new String[] {};

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPanemodifyPart.setViewportView(listPart);

		JComboBox comboBoxsearchModifyPart = new JComboBox();
		comboBoxsearchModifyPart.setModel(new DefaultComboBoxModel(new String[] { "Artikelnummer", "Name" }));
		GridBagConstraints gbc_comboBoxsearchModifyPart = new GridBagConstraints();
		gbc_comboBoxsearchModifyPart.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxsearchModifyPart.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxsearchModifyPart.gridx = 0;
		gbc_comboBoxsearchModifyPart.gridy = 10;
		panelmodify.add(comboBoxsearchModifyPart, gbc_comboBoxsearchModifyPart);

		textFieldsearchModifyPart = new JTextField();
		GridBagConstraints gbc_textFieldsearchModifyPart = new GridBagConstraints();
		gbc_textFieldsearchModifyPart.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldsearchModifyPart.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldsearchModifyPart.gridx = 1;
		gbc_textFieldsearchModifyPart.gridy = 10;
		panelmodify.add(textFieldsearchModifyPart, gbc_textFieldsearchModifyPart);
		textFieldsearchModifyPart.setColumns(10);

		JButton btnsearchModifyPart = new JButton("Suchen");
		btnsearchModifyPart.addActionListener(this);
		GridBagConstraints gbc_btnsearchModifyPart = new GridBagConstraints();
		gbc_btnsearchModifyPart.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsearchModifyPart.gridx = 1;
		gbc_btnsearchModifyPart.gridy = 11;
		panelmodify.add(btnsearchModifyPart, gbc_btnsearchModifyPart);

		JPanel paneldeletePart = new JPanel();
		tabbedPane.addTab("Bauteil entfernen", null, paneldeletePart, null);
		GridBagLayout gbl_paneldeletePart = new GridBagLayout();
		gbl_paneldeletePart.columnWidths = new int[] { 155, 0, 0 };
		gbl_paneldeletePart.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_paneldeletePart.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_paneldeletePart.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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

		JList listdeleteParts = new JList();
		scrollPanedeletePerson.setViewportView(listdeleteParts);

		JComboBox comboBoxdeletePart = new JComboBox();
		comboBoxdeletePart.setModel(new DefaultComboBoxModel(new String[] { "Artikelnummer", "Name" }));
		GridBagConstraints gbc_comboBoxdeletePart = new GridBagConstraints();
		gbc_comboBoxdeletePart.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxdeletePart.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxdeletePart.gridx = 0;
		gbc_comboBoxdeletePart.gridy = 1;
		paneldeletePart.add(comboBoxdeletePart, gbc_comboBoxdeletePart);

		textFieldpartNumberSearch = new JTextField();
		GridBagConstraints gbc_textFieldpartNumberSearch = new GridBagConstraints();
		gbc_textFieldpartNumberSearch.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpartNumberSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpartNumberSearch.gridx = 1;
		gbc_textFieldpartNumberSearch.gridy = 1;
		paneldeletePart.add(textFieldpartNumberSearch, gbc_textFieldpartNumberSearch);
		textFieldpartNumberSearch.setColumns(10);

		JButton btnpartSearch = new JButton("Nach Bauteil suchen");
		btnpartSearch.addActionListener(this);
		GridBagConstraints gbc_btnpartSearch = new GridBagConstraints();
		gbc_btnpartSearch.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnpartSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnpartSearch.gridx = 1;
		gbc_btnpartSearch.gridy = 2;
		paneldeletePart.add(btnpartSearch, gbc_btnpartSearch);

		JButton btndeletePart = new JButton("Bauteil löschen");
		btndeletePart.addActionListener(this);
		GridBagConstraints gbc_btndeletePart = new GridBagConstraints();
		gbc_btndeletePart.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeletePart.gridx = 1;
		gbc_btndeletePart.gridy = 3;
		paneldeletePart.add(btndeletePart, gbc_btndeletePart);

		JMenuBar menuBar = new JMenuBar();
		frmElabVerwaltungsprogramm.setJMenuBar(menuBar);

		JMenu mnNewMenuOptions = new JMenu("Menü");
		menuBar.add(mnNewMenuOptions);

		JMenuItem mntmNewMenuItembacktoMain = new JMenuItem("Hauptmen\u00FC");
		mnNewMenuOptions.add(mntmNewMenuItembacktoMain);
		mntmNewMenuItembacktoMain.addActionListener(this);
		JMenuItem mntmNewMenuItemlogOut = new JMenuItem("Ausloggen");
		mnNewMenuOptions.add(mntmNewMenuItemlogOut);
		mntmNewMenuItemlogOut.addActionListener(this);
		JMenuItem mntmNewMenuItemcloseapplication = new JMenuItem("Anwendung verlassen");
		mnNewMenuOptions.add(mntmNewMenuItemcloseapplication);
		mntmNewMenuItemcloseapplication.addActionListener(this);
		JMenu mnNewMenuhelpWindow = new JMenu("?");
		menuBar.add(mnNewMenuhelpWindow);

		JMenuItem mntmNewMenuItemshowManual = new JMenuItem("Anleitung anzeigen");
		mnNewMenuhelpWindow.add(mntmNewMenuItemshowManual);
		mntmNewMenuItemshowManual.addActionListener(this);
		frmElabVerwaltungsprogramm.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String command = e.getActionCommand();

		if (command == "Bauteil hinzufügen") {

		}
		if (command == "Eingabe l\u00F6schen") {

			textFieldpartName.setText("");
			textFieldpartLink.setText("");
			textFieldpartPrize.setText("");
			textFieldquantityStoring.setText("");
			textFieldquantityPlanned.setText("");
			textFieldquantityOrdered.setText("");
			textFieldstorageLocation.setText("");
		}
		if (command == "\u00C4nderungen speichern") {

		}
		if (command == "Suchen") {

		}
		if (command == "Nach Bauteil suchen") {

		}
		if (command == "Bauteil löschen") {

		}
		if (command == "Kategorie hinzufügen") {
		    try {
		    ComponentManagement.addCategory(textFieldcategoryNameNew.getText(), textFieldcategoryNoteNew.getText());
		    } catch (Exception a) {
			a.getStackTrace(); 
		    }
		}
		if (command == "Änderungen an Kategorie speichern") {

		}
		if (command == "Eingaben löschen") {

			textFieldcategoryNameNew.setText("");

		}

		if (command == "Änderungen löschen") {
			textFieldcategoryNameModify.setText("");
		}
		if (command == "Nach Kategorie suchen") {

		}
		if (command == "Kategorie löschen") {

		}

		if (command == "Hauptmen\u00FC") {

			GuiMenue mainMenu = new GuiMenue();
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
