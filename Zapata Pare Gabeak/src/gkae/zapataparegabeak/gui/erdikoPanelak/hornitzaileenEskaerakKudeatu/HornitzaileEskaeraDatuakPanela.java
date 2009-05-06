package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileenEskaerakKudeatu;

import gkae.zapataparegabeak.objektuak.HornitzaileEskaera;
import gkae.zapataparegabeak.objektuak.Hornitzailea;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class HornitzaileEskaeraDatuakPanela extends JPanel {
	

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

		JLabel label;
		label = new JLabel();
		label.setText("Kodea");

		JLabel label_1;
		label_1 = new JLabel();
		label_1.setText("Hornitzaile izena");

		JLabel label_2;
		label_2 = new JLabel();
		label_2.setText("Hornitzailearen e-Posta");

		JLabel label_3;
		label_3 = new JLabel();
		label_3.setText("Kantitatea");

		HEkodea = new JTextField();

		HEizena = new JTextField();

		HEePosta = new JTextField();

		HEkantitatea = new JTextField();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5, 5, 5)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2)
						.addComponent(label_1)
						.addComponent(label_3))
					.addGap(4, 4, 4)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(HEizena, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
						.addComponent(HEePosta, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
						.addComponent(HEkantitatea, GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
						.addComponent(HEkodea, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
					.addContainerGap())
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
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(14, 14, 14)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(14, 14, 14)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(13, 13, 13)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)))
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
