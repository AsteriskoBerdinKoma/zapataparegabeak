package gkae.zapataparegabeak.gui.erdikoPanelak.eskaeraJarraipena;

import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;
import gkae.zapataparegabeak.objektuak.Kudeaketa;

import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

import org.jdesktop.swingx.JXGlassBox;
import org.jdesktop.swingx.JXTable;
import com.swtdesigner.SwingResourceManager;

public class EskaerarenJarraipena extends JPanel {

	private JTextField textField;
	private JTable table;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	class HistorikoTableModel extends AbstractTableModel {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		String[][] datuak = new String[][] {
				{ "1", "E012-453", "2009/05/10 15:40", "Onartzeke" },
				{ "2", "E014-657", "2008/07/19 12:45", "Bukatuta" } };

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		public int getRowCount() {
			return datuak.length;
		}

		@Override
		public Object getValueAt(int row, int column) {
			return datuak[row][column];
		}

		public void setValueAt(int arg0, int arg1) {
			// no editing allowed
		}

		public boolean isCellEditable(int row, int col) {
			return false;
		}

		public String getColumnName(int column) {
			switch (column) {
			case 0:
				return new String("Zenb.");
			case 1:
				return new String("Kodea");
			case 2:
				return new String("Data");
			case 3:
				return new String("Egoera");
			default:
				return null;
			}

		}
		
	    @SuppressWarnings("unchecked")
		public Class getColumnClass(int col) {
             return getValueAt(0, col).getClass();
	     }

	}

	/**
	 * Create the panel
	 */
	public EskaerarenJarraipena() {
		super();
		setLayout(new CardLayout());

		HistorikoTableModel htm = new HistorikoTableModel();

		final JPanel eskaerenHistorikoa = new JPanel();
		eskaerenHistorikoa.setName("eskaerenHistorikoa");
		add(eskaerenHistorikoa, eskaerenHistorikoa.getName());

		JLabel eskaerenHistorikoaLabel;
		eskaerenHistorikoaLabel = new JLabel();
		eskaerenHistorikoaLabel.setFont(new Font("", Font.PLAIN, 18));
		eskaerenHistorikoaLabel.setText("Eskaeren Historikoa");

		JSeparator separator;
		separator = new JSeparator();

		JLabel atalHonetanIzenLabel;
		atalHonetanIzenLabel = new JLabel();
		atalHonetanIzenLabel.setFont(new Font("", Font.ITALIC, 12));
		atalHonetanIzenLabel
				.setText("Atal honetan, denboran zehar erabiltzaile kautotu gisa egin dituzun erosketen");

		JLabel erosketenZerrendaIkusiLabel;
		erosketenZerrendaIkusiLabel = new JLabel();
		erosketenZerrendaIkusiLabel.setFont(new Font("", Font.ITALIC, 12));
		erosketenZerrendaIkusiLabel
				.setText("zerrenda ikusi dezakezu. Hautatu ezazu bat, informazio gehiago lortzeko.");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

//		String[] zutabeHeader = new String[] { "Zenb.", "Eskaera Kodea",
//				"Data", "Egoera" };
//		String[][] datuak = new String[][] {
//				{ "1", "E012-453", "2009/05/10 15:40", "Onartzeke" },
//				{ "2", "E014-657", "2008/07/19 12:45", "Bukatuta" } };
		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(htm);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
                    ListSelectionModel lm = (ListSelectionModel) e
                                    .getSource();
                    for (int i = e.getFirstIndex(); i <= e.getLastIndex(); i++) {
                            if (lm.isSelectedIndex(i)) {
                                    //Dagokion panelera aldatu
                            		if (i==0){
                            			//Aktibo dagoena
                            			changeCard("eskaeraAktibo");
                            		} else if (i==1){
                            			changeCard("eskaeraBukatua");
                            		}
                                    break;
                            }
                    }
            }

			}
			
		});
		scrollPane.setViewportView(table);
		final GroupLayout groupLayout = new GroupLayout(
				(JComponent) eskaerenHistorikoa);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(eskaerenHistorikoaLabel, GroupLayout.Alignment.LEADING)
						.addComponent(atalHonetanIzenLabel, GroupLayout.Alignment.LEADING)
						.addComponent(erosketenZerrendaIkusiLabel, GroupLayout.Alignment.LEADING))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerenHistorikoaLabel)
					.addGap(8, 8, 8)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(atalHonetanIzenLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(erosketenZerrendaIkusiLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
					.addContainerGap())
		);
		eskaerenHistorikoa.setLayout(groupLayout);
		//
		checkKautotuta();

		final JPanel kodeEskaera = new JPanel();
		kodeEskaera.setName("kodeEskaera");
		add(kodeEskaera, kodeEskaera.getName());

		JLabel eskaerarenJarraipenaLabel;
		eskaerarenJarraipenaLabel = new JLabel();
		eskaerarenJarraipenaLabel.setFont(new Font("", Font.PLAIN, 18));
		eskaerarenJarraipenaLabel.setText("Eskaeraren Jarraipena");

		JSeparator separator_1;
		separator_1 = new JSeparator();

		JLabel pantailaHonetanErosketaLabel;
		pantailaHonetanErosketaLabel = new JLabel();
		pantailaHonetanErosketaLabel.setFont(new Font("", Font.ITALIC, 12));
		pantailaHonetanErosketaLabel.setText("Pantaila honetan erosketa gauzatzerakoan jaso zenuen Erosketa kodea sartzen");

		JLabel baduzuZureEskaerarenLabel;
		baduzuZureEskaerarenLabel = new JLabel();
		baduzuZureEskaerarenLabel.setFont(new Font("", Font.ITALIC, 12));
		baduzuZureEskaerarenLabel.setText("baduzu, zure eskaeraren egoera ikusi ahalko duzu.");

		JLabel eskaerakodeaLabel;
		eskaerakodeaLabel = new JLabel();
		eskaerakodeaLabel.setText("Eskaera-Kodea:");

		textField = new JTextField();

		JButton sartuButton;
		sartuButton = new JButton();
		sartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				if (textField.getText().equals("E012-453")){
					changeCard("eskaeraAktibo");
				} else {
					JOptionPane jop = new JOptionPane(
	                        "Emandako kodea ez da baliozkoa.\nMesedez, ziurtatu ondo idatzi duzuna.",
	                        JOptionPane.ERROR_MESSAGE);
	        jop.createDialog("Eskaera-kode desegokia")
	                        .setVisible(true);
				}
			}
		});
		sartuButton.setMargin(new Insets(2, 4, 2, 14));
		sartuButton.setIcon(SwingResourceManager.getIcon(EskaerarenJarraipena.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		sartuButton.setText("Konprobatu");
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) kodeEskaera);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(eskaerarenJarraipenaLabel)
						.addComponent(pantailaHonetanErosketaLabel)
						.addComponent(baduzuZureEskaerarenLabel)
						.addGroup(groupLayout_1.createSequentialGroup()
							.addComponent(eskaerakodeaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(sartuButton)))
					.addContainerGap())
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerarenJarraipenaLabel)
					.addGap(8, 8, 8)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(pantailaHonetanErosketaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(baduzuZureEskaerarenLabel)
					.addGap(48, 48, 48)
					.addGroup(groupLayout_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(eskaerakodeaLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sartuButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		kodeEskaera.setLayout(groupLayout_1);

		final JPanel eskaeraAktibo = new JPanel();
		eskaeraAktibo.setName("eskaeraAktibo");
		add(eskaeraAktibo, eskaeraAktibo.getName());

		JLabel eskaerarenJarraipenaLabel_1;
		eskaerarenJarraipenaLabel_1 = new JLabel();
		eskaerarenJarraipenaLabel_1.setFont(new Font("", Font.PLAIN, 18));
		eskaerarenJarraipenaLabel_1.setText("Eskaeraren Jarraipena: E012-453 ");

		JSeparator separator_2;
		separator_2 = new JSeparator();

		JLabel honaHemenEskaeraLabel;
		honaHemenEskaeraLabel = new JLabel();
		honaHemenEskaeraLabel.setText("Hona hemen eskaera honetako artikuluak eta beraien egoera.");

		JScrollPane scrollPane_1;
		scrollPane_1 = new JScrollPane();

		final JPanel panel = new JPanel();
		scrollPane_1.setViewportView(panel);
		final GroupLayout groupLayout_2 = new GroupLayout((JComponent) eskaeraAktibo);
		groupLayout_2.setHorizontalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout_2.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(scrollPane_1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(separator_2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(eskaerarenJarraipenaLabel_1, GroupLayout.Alignment.LEADING)
						.addComponent(honaHemenEskaeraLabel, GroupLayout.Alignment.LEADING))
					.addContainerGap())
		);
		groupLayout_2.setVerticalGroup(
			groupLayout_2.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerarenJarraipenaLabel_1)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(15, 15, 15)
					.addComponent(honaHemenEskaeraLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
					.addContainerGap())
		);
		eskaeraAktibo.setLayout(groupLayout_2);

		final JPanel eskaeraBukatua = new JPanel();
		eskaeraBukatua.setName("eskaeraBukatua");
		add(eskaeraBukatua, eskaeraBukatua.getName());
		final GroupLayout groupLayout_3 = new GroupLayout((JComponent) eskaeraBukatua);
		groupLayout_3.setHorizontalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE)
		);
		groupLayout_3.setVerticalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE)
		);
		eskaeraBukatua.setLayout(groupLayout_3);
	}
	
	public void changeCard(String destination){
		CardLayout cl = (CardLayout)(this.getLayout());
        cl.show(this, destination);
	}
	
	public void checkKautotuta(){
		boolean kautotua = false;
		for (ErabiltzaileInfo ei:Kudeaketa.getInstance().getErabiltzaileak()){
			if (ei.isKautotutaDago()){
				kautotua = true;
			}
		}
		if (!kautotua){
			changeCard("kodeEskaera");
		}
	}

	public static void main(String[] args) {
		JFrame j = new JFrame("Frogak");
		EskaerarenJarraipena e = new EskaerarenJarraipena();
		j.add(e);
		j.setSize(e.getPreferredSize());
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
