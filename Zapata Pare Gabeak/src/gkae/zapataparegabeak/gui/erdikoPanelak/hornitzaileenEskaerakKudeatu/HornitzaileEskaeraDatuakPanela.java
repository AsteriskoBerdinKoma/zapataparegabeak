package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu;

import gkae.zapataparegabeak.objektuak.HornitzaileEskaera;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

public class HornitzaileEskaeraDatuakPanela extends JPanel {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	class TableTableModel extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private final String[] COLUMNS = new String[] {
			"Generoa", "Oina", "Kategoria", "Marka", "Materiala", "Kopurua", "Prezioa"
		};
		private final String[][] CELLS = new String[][] {
			{"Gizonezkoa", "Ezker", "Korritzeko zapata", "Brooks", "Larrua", "20", "80€"},
			{"Emakumezkoa", "Ezker", "Negozio zapata", "Enzo Angiolini", "Larrua" ,"5", "30€"},
			{"Gizonezkoa", "Eskuin", "Sandalia", "Stride Rite", "Neoprenoa", "15", "10€"},
		};
		public int getRowCount() {
			return CELLS.length;
		}
		public int getColumnCount() {
			return COLUMNS.length;
		}
		public String getColumnName(int column) {
			return COLUMNS[column];
		}
		public Object getValueAt(int row, int column) {
			return CELLS[row].length > column ? CELLS[row][column] : (column + " - " + row);
		}
	}

	private JTable table;
	private JTextField HEkantitatea;
	private JTextField HEePosta;
	private JTextField HEizena;
	private JTextField HEkodea;
	/**
	 * Create the panel
	 */
	public HornitzaileEskaeraDatuakPanela() {
		super();
		setBorder(new TitledBorder(null, "Eskaeraren Datuak", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));

		JLabel kodeaLabel;
		kodeaLabel = new JLabel();
		kodeaLabel.setText("Kodea:");

		JLabel hornitzaileIzenaLabel;
		hornitzaileIzenaLabel = new JLabel();
		hornitzaileIzenaLabel.setText("Hornitzaile izena:");

		JLabel hornitzailearenEpostaLabel;
		hornitzailearenEpostaLabel = new JLabel();
		hornitzailearenEpostaLabel.setText("Hornitzailearen e-Posta:");

		JLabel kantitateaLabel;
		kantitateaLabel = new JLabel();
		kantitateaLabel.setText("Kantitatea:");

		HEkodea = new JTextField();

		HEizena = new JTextField();

		HEePosta = new JTextField();

		HEkantitatea = new JTextField();

		JLabel eskatutakoProduktuakLabel;
		eskatutakoProduktuakLabel = new JLabel();
		eskatutakoProduktuakLabel.setText("Eskatutako Produktuak:");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

		table = new JTable();
		table.setModel(new TableTableModel());
		scrollPane.setViewportView(table);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5, 5, 5)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
							.addGap(12, 12, 12))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(eskatutakoProduktuakLabel)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(hornitzailearenEpostaLabel)
										.addComponent(hornitzaileIzenaLabel)
										.addComponent(kantitateaLabel)
										.addComponent(kodeaLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
									.addGap(4, 4, 4)
									.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(HEizena, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
										.addComponent(HEePosta, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
										.addComponent(HEkantitatea, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
										.addComponent(HEkodea, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))))
							.addGap(7, 7, 7))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5, 5, 5)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(HEkodea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10, 10, 10)
							.addComponent(HEizena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(10, 10, 10)
							.addComponent(HEePosta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(9, 9, 9)
							.addComponent(HEkantitatea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(kodeaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(14, 14, 14)
							.addComponent(hornitzaileIzenaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(14, 14, 14)
							.addComponent(hornitzailearenEpostaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(13, 13, 13)
							.addComponent(kantitateaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
					.addGap(14, 14, 14)
					.addComponent(eskatutakoProduktuakLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}
	void setEditable(boolean editable){
		HEkodea.setEditable(editable);
		HEizena.setEditable(editable);
		HEePosta.setEditable(editable);
		HEkantitatea.setEditable(editable);
	}

	public void setDatuak(HornitzaileEskaera h) {
		
		if(h != null){
		
		HEkodea.setText(new Integer(h.getKodea()).toString());
		HEizena.setText(h.getHornitzaileIzena());
		HEePosta.setText(h.getHornitzaileEPosta());
		HEkantitatea.setText(new Integer(h.getKantitatea()).toString());
		
		}
		else{
			
			HEkodea.setText("");
			HEizena.setText("");
			HEePosta.setText("");
			HEkantitatea.setText("");
		}
		
	}
	public String getKodea(){
		return HEkodea.getText();
	}
	public String getIzena(){
		return HEizena.getText();
	}
	public String getePosta(){
		return HEePosta.getText();
	}
	public String getKantitatea(){
		return HEkantitatea.getText();
	}
}
