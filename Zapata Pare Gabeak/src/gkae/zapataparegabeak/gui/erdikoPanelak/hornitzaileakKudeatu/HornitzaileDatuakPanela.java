package gkae.zapataparegabeak.gui.erdikoPanelak.hornitzaileakKudeatu;

import gkae.zapataparegabeak.objektuak.Hornitzailea;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class HornitzaileDatuakPanela extends JPanel {

	private SpringLayout springLayout;
	private JTextField HePosta;
	private JTextField HTelefonoa;
	private JTextField HHelbidea;
	private JTextField HIzena;
	/**
	 * Create the panel
	 */
	public HornitzaileDatuakPanela() {
		super();
		setBorder(new TitledBorder(null, "Hornitzailearen datuak", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
		springLayout = new SpringLayout();
		setLayout(springLayout);
		setSize(508, 195);

		JLabel label;
		label = new JLabel();
		add(label);
		springLayout.putConstraint(SpringLayout.SOUTH, label, 27, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, label, 11, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, label, 35, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, this);
		label.setText("Izena");

		HIzena = new JTextField();
		add(HIzena);
		springLayout.putConstraint(SpringLayout.EAST, HIzena, -12, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, HIzena, 73, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, HIzena, 29, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, HIzena, 9, SpringLayout.NORTH, this);

		JLabel helbideaLabel;
		helbideaLabel = new JLabel();
		add(helbideaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, helbideaLabel, 69, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, helbideaLabel, 53, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, helbideaLabel, 54, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, helbideaLabel, 5, SpringLayout.WEST, this);
		helbideaLabel.setText("Helbidea");

		HHelbidea = new JTextField();
		add(HHelbidea);
		springLayout.putConstraint(SpringLayout.EAST, HHelbidea, -12, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, HHelbidea, 73, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, HHelbidea, 71, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, HHelbidea, 51, SpringLayout.NORTH, this);

		JLabel telefonoaLabel;
		telefonoaLabel = new JLabel();
		add(telefonoaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, telefonoaLabel, 111, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, telefonoaLabel, 95, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, telefonoaLabel, 61, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, telefonoaLabel, 5, SpringLayout.WEST, this);
		telefonoaLabel.setText("Telefonoa");

		HTelefonoa = new JTextField();
		add(HTelefonoa);
		springLayout.putConstraint(SpringLayout.EAST, HTelefonoa, -12, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, HTelefonoa, 73, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, HTelefonoa, 113, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, HTelefonoa, 93, SpringLayout.NORTH, this);

		JLabel epostaLabel;
		epostaLabel = new JLabel();
		add(epostaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, epostaLabel, 153, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, epostaLabel, 137, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, epostaLabel, 49, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, epostaLabel, 5, SpringLayout.WEST, this);
		epostaLabel.setText("E-Posta");

		HePosta = new JTextField();
		add(HePosta);
		springLayout.putConstraint(SpringLayout.EAST, HePosta, -12, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, HePosta, 73, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, HePosta, 155, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, HePosta, 135, SpringLayout.NORTH, this);
		//
	}
	void setEditable(boolean editable){
		HIzena.setEditable(editable);
		HHelbidea.setEditable(editable);
		HTelefonoa.setEditable(editable);
		HePosta.setEditable(editable);
	}
	public void setDatuak(Hornitzailea h) {
		
		HIzena.setText(h.getIzena());
		HHelbidea.setText(h.getHelbidea());
		HTelefonoa.setText(new Integer(h.getTelefonoa()).toString());
		HePosta.setText(h.getEPosta());
		
	}

}
