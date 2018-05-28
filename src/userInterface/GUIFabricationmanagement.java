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

public class GUIFabricationmanagement implements ActionListener {

	private JFrame frmElabVerwaltungsprogramm;
	private JTextField textFieldorderTitel;
	private JTextField textFieldnoteOther;
	private JTextField textFieldpredictedCosts;
	private JTextField textFieldactualCosts;
	private JTextField textFieldorderTitelModify;
	private JTextField textFieldnoteOtherModify;
	private JTextField textFieldpredictedCostsModify;
	private JTextField textFieldactualCostsModify;
	private JTextField textFieldorderSearchModify;
	private JTextField textFieldorderSearchDelete;
	private JTextField textFieldfilePath;
	private JTextField textFieldfilePathModify;

	/**
	 * Initialize the contents of the frame.
	 */
	public GUIFabricationmanagement() {
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

		JLabel lblorderManagement = new JLabel("Auftragsverwaltung");
		lblorderManagement.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblorderManagement = new GridBagConstraints();
		gbc_lblorderManagement.insets = new Insets(0, 0, 5, 0);
		gbc_lblorderManagement.gridx = 0;
		gbc_lblorderManagement.gridy = 0;
		frmElabVerwaltungsprogramm.getContentPane().add(lblorderManagement, gbc_lblorderManagement);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		frmElabVerwaltungsprogramm.getContentPane().add(tabbedPane, gbc_tabbedPane);

		JPanel paneladdOrder = new JPanel();
		tabbedPane.addTab("Auftrag hinzuf\u00FCgen", null, paneladdOrder, null);
		GridBagLayout gbl_paneladdOrder = new GridBagLayout();
		gbl_paneladdOrder.columnWidths = new int[] { 0, 0, 0 };
		gbl_paneladdOrder.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_paneladdOrder.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_paneladdOrder.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		paneladdOrder.setLayout(gbl_paneladdOrder);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		paneladdOrder.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblorderTitel = new JLabel("Titel");
		GridBagConstraints gbc_lblorderTitel = new GridBagConstraints();
		gbc_lblorderTitel.anchor = GridBagConstraints.EAST;
		gbc_lblorderTitel.insets = new Insets(0, 0, 5, 5);
		gbc_lblorderTitel.gridx = 0;
		gbc_lblorderTitel.gridy = 1;
		paneladdOrder.add(lblorderTitel, gbc_lblorderTitel);

		textFieldorderTitel = new JTextField();
		GridBagConstraints gbc_textFieldorderTitel = new GridBagConstraints();
		gbc_textFieldorderTitel.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldorderTitel.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldorderTitel.gridx = 1;
		gbc_textFieldorderTitel.gridy = 1;
		paneladdOrder.add(textFieldorderTitel, gbc_textFieldorderTitel);
		textFieldorderTitel.setColumns(10);

		JLabel lblorderTyp = new JLabel("Auftragsart");
		GridBagConstraints gbc_lblorderTyp = new GridBagConstraints();
		gbc_lblorderTyp.anchor = GridBagConstraints.EAST;
		gbc_lblorderTyp.insets = new Insets(0, 0, 5, 5);
		gbc_lblorderTyp.gridx = 0;
		gbc_lblorderTyp.gridy = 2;
		paneladdOrder.add(lblorderTyp, gbc_lblorderTyp);

		JComboBox comboBoxorderTyp = new JComboBox();
		comboBoxorderTyp.setModel(new DefaultComboBoxModel(new String[] { "Leiterplatte", "3D-Druck", "Sonstiges" }));
		GridBagConstraints gbc_comboBoxorderTyp = new GridBagConstraints();
		gbc_comboBoxorderTyp.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxorderTyp.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxorderTyp.gridx = 1;
		gbc_comboBoxorderTyp.gridy = 2;
		paneladdOrder.add(comboBoxorderTyp, gbc_comboBoxorderTyp);

		JLabel lblnoteOther = new JLabel("Notiz zu sonstiges");
		GridBagConstraints gbc_lblnoteOther = new GridBagConstraints();
		gbc_lblnoteOther.anchor = GridBagConstraints.EAST;
		gbc_lblnoteOther.insets = new Insets(0, 0, 5, 5);
		gbc_lblnoteOther.gridx = 0;
		gbc_lblnoteOther.gridy = 3;
		paneladdOrder.add(lblnoteOther, gbc_lblnoteOther);

		textFieldnoteOther = new JTextField();
		GridBagConstraints gbc_textFieldnoteOther = new GridBagConstraints();
		gbc_textFieldnoteOther.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldnoteOther.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldnoteOther.gridx = 1;
		gbc_textFieldnoteOther.gridy = 3;
		paneladdOrder.add(textFieldnoteOther, gbc_textFieldnoteOther);
		textFieldnoteOther.setColumns(10);
		
		JLabel lblfilePath = new JLabel("Dateipfad");
		GridBagConstraints gbc_lblfilePath = new GridBagConstraints();
		gbc_lblfilePath.anchor = GridBagConstraints.EAST;
		gbc_lblfilePath.insets = new Insets(0, 0, 5, 5);
		gbc_lblfilePath.gridx = 0;
		gbc_lblfilePath.gridy = 4;
		paneladdOrder.add(lblfilePath, gbc_lblfilePath);
		
		textFieldfilePath = new JTextField();
		GridBagConstraints gbc_textFieldfilePath = new GridBagConstraints();
		gbc_textFieldfilePath.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldfilePath.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldfilePath.gridx = 1;
		gbc_textFieldfilePath.gridy = 4;
		paneladdOrder.add(textFieldfilePath, gbc_textFieldfilePath);
		textFieldfilePath.setColumns(10);

		JLabel lblpredictedCost = new JLabel("prognostizierte Kosten");
		GridBagConstraints gbc_lblpredictedCost = new GridBagConstraints();
		gbc_lblpredictedCost.anchor = GridBagConstraints.EAST;
		gbc_lblpredictedCost.insets = new Insets(0, 0, 5, 5);
		gbc_lblpredictedCost.gridx = 0;
		gbc_lblpredictedCost.gridy = 5;
		paneladdOrder.add(lblpredictedCost, gbc_lblpredictedCost);

		textFieldpredictedCosts = new JTextField();
		GridBagConstraints gbc_textFieldpredictedCosts = new GridBagConstraints();
		gbc_textFieldpredictedCosts.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpredictedCosts.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpredictedCosts.gridx = 1;
		gbc_textFieldpredictedCosts.gridy = 5;
		paneladdOrder.add(textFieldpredictedCosts, gbc_textFieldpredictedCosts);
		textFieldpredictedCosts.setColumns(10);

		JLabel lblactualCosts = new JLabel("reele Kosten");
		GridBagConstraints gbc_lblactualCosts = new GridBagConstraints();
		gbc_lblactualCosts.anchor = GridBagConstraints.EAST;
		gbc_lblactualCosts.insets = new Insets(0, 0, 5, 5);
		gbc_lblactualCosts.gridx = 0;
		gbc_lblactualCosts.gridy = 6;
		paneladdOrder.add(lblactualCosts, gbc_lblactualCosts);

		textFieldactualCosts = new JTextField();
		textFieldactualCosts.setEditable(false);
		GridBagConstraints gbc_textFieldactualCosts = new GridBagConstraints();
		gbc_textFieldactualCosts.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldactualCosts.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldactualCosts.gridx = 1;
		gbc_textFieldactualCosts.gridy = 6;
		paneladdOrder.add(textFieldactualCosts, gbc_textFieldactualCosts);
		textFieldactualCosts.setColumns(10);

		JLabel lblresponsiblePerson = new JLabel("Verantwortlicher");
		lblresponsiblePerson.setToolTipText("");
		GridBagConstraints gbc_lblresponsiblePerson = new GridBagConstraints();
		gbc_lblresponsiblePerson.anchor = GridBagConstraints.EAST;
		gbc_lblresponsiblePerson.insets = new Insets(0, 0, 5, 5);
		gbc_lblresponsiblePerson.gridx = 0;
		gbc_lblresponsiblePerson.gridy = 7;
		paneladdOrder.add(lblresponsiblePerson, gbc_lblresponsiblePerson);

		JComboBox comboBoxresponsible = new JComboBox();
		GridBagConstraints gbc_comboBoxresponsible = new GridBagConstraints();
		gbc_comboBoxresponsible.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxresponsible.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxresponsible.gridx = 1;
		gbc_comboBoxresponsible.gridy = 7;
		paneladdOrder.add(comboBoxresponsible, gbc_comboBoxresponsible);

		JLabel lblstandinResponsible = new JLabel("Vertretung");
		GridBagConstraints gbc_lblstandinResponsible = new GridBagConstraints();
		gbc_lblstandinResponsible.anchor = GridBagConstraints.EAST;
		gbc_lblstandinResponsible.insets = new Insets(0, 0, 5, 5);
		gbc_lblstandinResponsible.gridx = 0;
		gbc_lblstandinResponsible.gridy = 8;
		paneladdOrder.add(lblstandinResponsible, gbc_lblstandinResponsible);

		JComboBox comboBoxstandinResponsible = new JComboBox();
		GridBagConstraints gbc_comboBoxstandinResponsible = new GridBagConstraints();
		gbc_comboBoxstandinResponsible.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxstandinResponsible.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxstandinResponsible.gridx = 1;
		gbc_comboBoxstandinResponsible.gridy = 8;
		paneladdOrder.add(comboBoxstandinResponsible, gbc_comboBoxstandinResponsible);

		JLabel lblorderStatus = new JLabel("Auftragsstatus");
		GridBagConstraints gbc_lblorderStatus = new GridBagConstraints();
		gbc_lblorderStatus.anchor = GridBagConstraints.EAST;
		gbc_lblorderStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblorderStatus.gridx = 0;
		gbc_lblorderStatus.gridy = 9;
		paneladdOrder.add(lblorderStatus, gbc_lblorderStatus);

		JComboBox comboBoxorderStatus = new JComboBox();
		comboBoxorderStatus.setModel(
				new DefaultComboBoxModel(new String[] { "Angenommen", "Gefertigt", "Kosten kalkuliert", "Abgeholt",
						"Abgerechnet", "Warten auf Material", "Fertigung unterbrochen/defekt", "Rechnung erzeugt" }));
		GridBagConstraints gbc_comboBoxorderStatus = new GridBagConstraints();
		gbc_comboBoxorderStatus.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxorderStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxorderStatus.gridx = 1;
		gbc_comboBoxorderStatus.gridy = 9;
		paneladdOrder.add(comboBoxorderStatus, gbc_comboBoxorderStatus);

		JButton btnaddOrder = new JButton("Auftrag hinzuf\u00FCgen");
		btnaddOrder.addActionListener(this);
		GridBagConstraints gbc_btnaddOrder = new GridBagConstraints();
		gbc_btnaddOrder.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnaddOrder.insets = new Insets(0, 0, 5, 0);
		gbc_btnaddOrder.gridx = 1;
		gbc_btnaddOrder.gridy = 10;
		paneladdOrder.add(btnaddOrder, gbc_btnaddOrder);

		JButton btndeleteallInputs = new JButton("Eingaben l\u00F6schen");
		btndeleteallInputs.addActionListener(this);
		GridBagConstraints gbc_btndeleteallInputs = new GridBagConstraints();
		gbc_btndeleteallInputs.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteallInputs.insets = new Insets(0, 0, 5, 0);
		gbc_btndeleteallInputs.gridx = 1;
		gbc_btndeleteallInputs.gridy = 11;
		paneladdOrder.add(btndeleteallInputs, gbc_btndeleteallInputs);

		JLabel lbleLabpicture = new JLabel("");
		lbleLabpicture.setIcon(new ImageIcon("C:\\Users\\Nils\\git\\ProPraElab\\ProPraElab\\pictures\\elab.png"));
		GridBagConstraints gbc_lbleLabpicture = new GridBagConstraints();
		gbc_lbleLabpicture.gridwidth = 2;
		gbc_lbleLabpicture.gridx = 0;
		gbc_lbleLabpicture.gridy = 12;
		paneladdOrder.add(lbleLabpicture, gbc_lbleLabpicture);

		JPanel panelmodify = new JPanel();
		tabbedPane.addTab("Auftrag bearbeiten", null, panelmodify, null);
		GridBagLayout gbl_panelmodify = new GridBagLayout();
		gbl_panelmodify.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panelmodify.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelmodify.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panelmodify.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panelmodify.setLayout(gbl_panelmodify);

		JLabel lblorderTitelModify = new JLabel("Titel");
		GridBagConstraints gbc_lblorderTitelModify = new GridBagConstraints();
		gbc_lblorderTitelModify.gridwidth = 2;
		gbc_lblorderTitelModify.anchor = GridBagConstraints.EAST;
		gbc_lblorderTitelModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblorderTitelModify.gridx = 0;
		gbc_lblorderTitelModify.gridy = 0;
		panelmodify.add(lblorderTitelModify, gbc_lblorderTitelModify);

		textFieldorderTitelModify = new JTextField();
		GridBagConstraints gbc_textFieldorderTitelModify = new GridBagConstraints();
		gbc_textFieldorderTitelModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldorderTitelModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldorderTitelModify.gridx = 2;
		gbc_textFieldorderTitelModify.gridy = 0;
		panelmodify.add(textFieldorderTitelModify, gbc_textFieldorderTitelModify);
		textFieldorderTitelModify.setColumns(10);

		JLabel lblorderTypModify = new JLabel("Auftragsart");
		GridBagConstraints gbc_lblorderTypModify = new GridBagConstraints();
		gbc_lblorderTypModify.gridwidth = 2;
		gbc_lblorderTypModify.anchor = GridBagConstraints.EAST;
		gbc_lblorderTypModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblorderTypModify.gridx = 0;
		gbc_lblorderTypModify.gridy = 1;
		panelmodify.add(lblorderTypModify, gbc_lblorderTypModify);

		JComboBox comboBoxtypModify = new JComboBox();
		comboBoxtypModify.setModel(new DefaultComboBoxModel(new String[] { "Leiterplatte", "3D-Druck", "Sonstiges" }));
		GridBagConstraints gbc_comboBoxtypModify = new GridBagConstraints();
		gbc_comboBoxtypModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxtypModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxtypModify.gridx = 2;
		gbc_comboBoxtypModify.gridy = 1;
		panelmodify.add(comboBoxtypModify, gbc_comboBoxtypModify);

		JLabel lblnoteOtherModify = new JLabel("Notiz zu sonstiges");
		GridBagConstraints gbc_lblnoteOtherModify = new GridBagConstraints();
		gbc_lblnoteOtherModify.gridwidth = 2;
		gbc_lblnoteOtherModify.anchor = GridBagConstraints.EAST;
		gbc_lblnoteOtherModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblnoteOtherModify.gridx = 0;
		gbc_lblnoteOtherModify.gridy = 2;
		panelmodify.add(lblnoteOtherModify, gbc_lblnoteOtherModify);

		textFieldnoteOtherModify = new JTextField();
		GridBagConstraints gbc_textFieldnoteOtherModify = new GridBagConstraints();
		gbc_textFieldnoteOtherModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldnoteOtherModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldnoteOtherModify.gridx = 2;
		gbc_textFieldnoteOtherModify.gridy = 2;
		panelmodify.add(textFieldnoteOtherModify, gbc_textFieldnoteOtherModify);
		textFieldnoteOtherModify.setColumns(10);
		
		JLabel lblfilePathModify = new JLabel("Dateipfad");
		GridBagConstraints gbc_lblfilePathModify = new GridBagConstraints();
		gbc_lblfilePathModify.anchor = GridBagConstraints.EAST;
		gbc_lblfilePathModify.gridwidth = 2;
		gbc_lblfilePathModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblfilePathModify.gridx = 0;
		gbc_lblfilePathModify.gridy = 3;
		panelmodify.add(lblfilePathModify, gbc_lblfilePathModify);
		
		textFieldfilePathModify = new JTextField();
		textFieldfilePathModify.setText("");
		GridBagConstraints gbc_textFieldfilePathModify = new GridBagConstraints();
		gbc_textFieldfilePathModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldfilePathModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldfilePathModify.gridx = 2;
		gbc_textFieldfilePathModify.gridy = 3;
		panelmodify.add(textFieldfilePathModify, gbc_textFieldfilePathModify);
		textFieldfilePathModify.setColumns(10);

		JLabel lblpredictedCostsModify = new JLabel("prognostizierte Kosten");
		GridBagConstraints gbc_lblpredictedCostsModify = new GridBagConstraints();
		gbc_lblpredictedCostsModify.gridwidth = 2;
		gbc_lblpredictedCostsModify.anchor = GridBagConstraints.EAST;
		gbc_lblpredictedCostsModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblpredictedCostsModify.gridx = 0;
		gbc_lblpredictedCostsModify.gridy = 4;
		panelmodify.add(lblpredictedCostsModify, gbc_lblpredictedCostsModify);

		textFieldpredictedCostsModify = new JTextField();
		GridBagConstraints gbc_textFieldpredictedCostsModify = new GridBagConstraints();
		gbc_textFieldpredictedCostsModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldpredictedCostsModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldpredictedCostsModify.gridx = 2;
		gbc_textFieldpredictedCostsModify.gridy = 4;
		panelmodify.add(textFieldpredictedCostsModify, gbc_textFieldpredictedCostsModify);
		textFieldpredictedCostsModify.setColumns(10);

		JLabel lblactualCostsModify = new JLabel("reelle Kosten");
		GridBagConstraints gbc_lblactualCostsModify = new GridBagConstraints();
		gbc_lblactualCostsModify.gridwidth = 2;
		gbc_lblactualCostsModify.anchor = GridBagConstraints.EAST;
		gbc_lblactualCostsModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblactualCostsModify.gridx = 0;
		gbc_lblactualCostsModify.gridy = 5;
		panelmodify.add(lblactualCostsModify, gbc_lblactualCostsModify);

		textFieldactualCostsModify = new JTextField();
		textFieldactualCostsModify.setEditable(false);
		GridBagConstraints gbc_textFieldactualCostsModify = new GridBagConstraints();
		gbc_textFieldactualCostsModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldactualCostsModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldactualCostsModify.gridx = 2;
		gbc_textFieldactualCostsModify.gridy = 5;
		panelmodify.add(textFieldactualCostsModify, gbc_textFieldactualCostsModify);
		textFieldactualCostsModify.setColumns(10);

		JLabel lblresponsiblePersonModify = new JLabel("Verantwortlicher");
		GridBagConstraints gbc_lblresponsiblePersonModify = new GridBagConstraints();
		gbc_lblresponsiblePersonModify.gridwidth = 2;
		gbc_lblresponsiblePersonModify.anchor = GridBagConstraints.EAST;
		gbc_lblresponsiblePersonModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblresponsiblePersonModify.gridx = 0;
		gbc_lblresponsiblePersonModify.gridy = 6;
		panelmodify.add(lblresponsiblePersonModify, gbc_lblresponsiblePersonModify);

		JComboBox comboBoxresponsiblePersonModify = new JComboBox();
		GridBagConstraints gbc_comboBoxresponsiblePersonModify = new GridBagConstraints();
		gbc_comboBoxresponsiblePersonModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxresponsiblePersonModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxresponsiblePersonModify.gridx = 2;
		gbc_comboBoxresponsiblePersonModify.gridy = 6;
		panelmodify.add(comboBoxresponsiblePersonModify, gbc_comboBoxresponsiblePersonModify);

		JLabel lblstandinresponsiblePersonModify = new JLabel("Vertretung");
		GridBagConstraints gbc_lblstandinresponsiblePersonModify = new GridBagConstraints();
		gbc_lblstandinresponsiblePersonModify.gridwidth = 2;
		gbc_lblstandinresponsiblePersonModify.anchor = GridBagConstraints.EAST;
		gbc_lblstandinresponsiblePersonModify.insets = new Insets(0, 0, 5, 5);
		gbc_lblstandinresponsiblePersonModify.gridx = 0;
		gbc_lblstandinresponsiblePersonModify.gridy = 7;
		panelmodify.add(lblstandinresponsiblePersonModify, gbc_lblstandinresponsiblePersonModify);

		JComboBox comboBoxstandinresponsiblePersonModify = new JComboBox();
		GridBagConstraints gbc_comboBoxstandinresponsiblePersonModify = new GridBagConstraints();
		gbc_comboBoxstandinresponsiblePersonModify.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxstandinresponsiblePersonModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxstandinresponsiblePersonModify.gridx = 2;
		gbc_comboBoxstandinresponsiblePersonModify.gridy = 7;
		panelmodify.add(comboBoxstandinresponsiblePersonModify, gbc_comboBoxstandinresponsiblePersonModify);

		JLabel lblmodifyOrderStatus = new JLabel("Auftragsstatus");
		GridBagConstraints gbc_lblmodifyOrderStatus = new GridBagConstraints();
		gbc_lblmodifyOrderStatus.gridwidth = 2;
		gbc_lblmodifyOrderStatus.anchor = GridBagConstraints.EAST;
		gbc_lblmodifyOrderStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblmodifyOrderStatus.gridx = 0;
		gbc_lblmodifyOrderStatus.gridy = 8;
		panelmodify.add(lblmodifyOrderStatus, gbc_lblmodifyOrderStatus);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "Angenommen", "Gefertigt", "Kosten kalkuliert", "Abgeholt",
						"Abgerechnet", "Warten auf Material", "Fertigung unterbrochen/defekt", "Rechnung erzeugt" }));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 8;
		panelmodify.add(comboBox, gbc_comboBox);

		JButton btnsaveModifiedValues = new JButton("\u00C4nderungen speichern");
		btnsaveModifiedValues.addActionListener(this);
		GridBagConstraints gbc_btnsaveModifiedValues = new GridBagConstraints();
		gbc_btnsaveModifiedValues.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnsaveModifiedValues.insets = new Insets(0, 0, 5, 0);
		gbc_btnsaveModifiedValues.gridx = 2;
		gbc_btnsaveModifiedValues.gridy = 9;
		panelmodify.add(btnsaveModifiedValues, gbc_btnsaveModifiedValues);

		JScrollPane scrollPanemodifyPerson = new JScrollPane();
		scrollPanemodifyPerson.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanemodifyPerson.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanemodifyPerson = new GridBagConstraints();
		gbc_scrollPanemodifyPerson.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanemodifyPerson.gridwidth = 3;
		gbc_scrollPanemodifyPerson.fill = GridBagConstraints.BOTH;
		gbc_scrollPanemodifyPerson.gridx = 0;
		gbc_scrollPanemodifyPerson.gridy = 10;
		panelmodify.add(scrollPanemodifyPerson, gbc_scrollPanemodifyPerson);

		JList listPerson = new JList();
		listPerson.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listPerson.setModel(new AbstractListModel() {
			String[] values = new String[] {};

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPanemodifyPerson.setViewportView(listPerson);

		JComboBox comboBoxorderSearchModify = new JComboBox();
		comboBoxorderSearchModify.setToolTipText("Bitte Suchkategorie auswÃ¤hlen");
		comboBoxorderSearchModify.setModel(new DefaultComboBoxModel(new String[] { "Titel", "Auftragsart", "Status" }));
		GridBagConstraints gbc_comboBoxorderSearchModify = new GridBagConstraints();
		gbc_comboBoxorderSearchModify.gridwidth = 2;
		gbc_comboBoxorderSearchModify.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxorderSearchModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxorderSearchModify.gridx = 0;
		gbc_comboBoxorderSearchModify.gridy = 11;
		panelmodify.add(comboBoxorderSearchModify, gbc_comboBoxorderSearchModify);

		textFieldorderSearchModify = new JTextField();
		GridBagConstraints gbc_textFieldorderSearchModify = new GridBagConstraints();
		gbc_textFieldorderSearchModify.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldorderSearchModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldorderSearchModify.gridx = 2;
		gbc_textFieldorderSearchModify.gridy = 11;
		panelmodify.add(textFieldorderSearchModify, gbc_textFieldorderSearchModify);
		textFieldorderSearchModify.setColumns(10);

		JButton btnorderSearchModify = new JButton("Auftrag suchen");
		btnorderSearchModify.addActionListener(this);
		GridBagConstraints gbc_btnorderSearchModify = new GridBagConstraints();
		gbc_btnorderSearchModify.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnorderSearchModify.gridx = 2;
		gbc_btnorderSearchModify.gridy = 12;
		panelmodify.add(btnorderSearchModify, gbc_btnorderSearchModify);

		JPanel paneldeleteOrder = new JPanel();
		tabbedPane.addTab("Auftrag l\u00F6schen", null, paneldeleteOrder, null);
		GridBagLayout gbl_paneldeleteOrder = new GridBagLayout();
		gbl_paneldeleteOrder.columnWidths = new int[] { 0, 98, 0, 0 };
		gbl_paneldeleteOrder.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_paneldeleteOrder.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_paneldeleteOrder.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		paneldeleteOrder.setLayout(gbl_paneldeleteOrder);

		JScrollPane scrollPanedeletePerson = new JScrollPane();
		scrollPanedeletePerson.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanedeletePerson.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPanedeletePerson = new GridBagConstraints();
		gbc_scrollPanedeletePerson.gridwidth = 3;
		gbc_scrollPanedeletePerson.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPanedeletePerson.fill = GridBagConstraints.BOTH;
		gbc_scrollPanedeletePerson.gridx = 0;
		gbc_scrollPanedeletePerson.gridy = 0;
		paneldeleteOrder.add(scrollPanedeletePerson, gbc_scrollPanedeletePerson);

		JList listdeletePerson = new JList();
		listdeletePerson.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		scrollPanedeletePerson.setViewportView(listdeletePerson);

		JComboBox comboBoxorderSearchDelete = new JComboBox();
		comboBoxorderSearchDelete.setModel(new DefaultComboBoxModel(new String[] { "Titel", "Auftragsart", "Status" }));
		GridBagConstraints gbc_comboBoxorderSearchDelete = new GridBagConstraints();
		gbc_comboBoxorderSearchDelete.gridwidth = 2;
		gbc_comboBoxorderSearchDelete.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxorderSearchDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxorderSearchDelete.gridx = 0;
		gbc_comboBoxorderSearchDelete.gridy = 1;
		paneldeleteOrder.add(comboBoxorderSearchDelete, gbc_comboBoxorderSearchDelete);

		textFieldorderSearchDelete = new JTextField();
		GridBagConstraints gbc_textFieldorderSearchDelete = new GridBagConstraints();
		gbc_textFieldorderSearchDelete.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldorderSearchDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldorderSearchDelete.gridx = 2;
		gbc_textFieldorderSearchDelete.gridy = 1;
		paneldeleteOrder.add(textFieldorderSearchDelete, gbc_textFieldorderSearchDelete);
		textFieldorderSearchDelete.setColumns(10);

		JButton btnorderSearchDelete = new JButton("Suchen");
		btnorderSearchDelete.addActionListener(this);
		GridBagConstraints gbc_btnorderSearchDelete = new GridBagConstraints();
		gbc_btnorderSearchDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnorderSearchDelete.insets = new Insets(0, 0, 5, 0);
		gbc_btnorderSearchDelete.gridx = 2;
		gbc_btnorderSearchDelete.gridy = 2;
		paneldeleteOrder.add(btnorderSearchDelete, gbc_btnorderSearchDelete);

		JButton btndeleteOrder = new JButton("Auftrag l\u00F6schen");
		btndeleteOrder.addActionListener(this);
		GridBagConstraints gbc_btndeleteOrder = new GridBagConstraints();
		gbc_btndeleteOrder.fill = GridBagConstraints.HORIZONTAL;
		gbc_btndeleteOrder.gridx = 2;
		gbc_btndeleteOrder.gridy = 3;
		paneldeleteOrder.add(btndeleteOrder, gbc_btndeleteOrder);

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

		if (command == "Auftrag hinzuf\u00FCgen") {

		}

		if (command == "Eingaben l\u00F6schen") {

		}

		if (command == "\u00C4nderungen speichern") {

		}

		if (command == "Auftrag suchen") {

		}

		if (command == "Suchen") {

		}

		if (command == "Auftrag l\u00F6schen") {

		}

		if (command == "Hauptmen\u00FC") {

		GuiMenue mainMenu= new GuiMenue();
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
