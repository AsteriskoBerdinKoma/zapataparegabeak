package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import gkae.zapataparegabeak.objektuak.ErabiltzaileInfo;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class BezeroenDatuakPanel extends JPanel {

	private JTextField harProbintzia;
	private JTextField harAbizenak;
	private JTextField harIzena;
	private JTextField ePosta;
	private JTextField erabIzena;
	/**
	 * Create the panel
	 */
	public BezeroenDatuakPanel() {
		super();
		final TitledBorder as = new TitledBorder(null, "Erabiltzaile datuak:", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null);
		setBorder(as);

		JLabel erabiltzaileIzenaLabel;
		erabiltzaileIzenaLabel = new JLabel();
		erabiltzaileIzenaLabel.setText("Erabiltzaile izena:");

		erabIzena = new JTextField();

		JLabel erabiltzailePostaLabel;
		erabiltzailePostaLabel = new JLabel();
		erabiltzailePostaLabel.setText("Erabiltzaile Posta:");

		ePosta = new JTextField();

		JLabel izenaLabel;
		izenaLabel = new JLabel();
		izenaLabel.setText("Izena:");

		harIzena = new JTextField();

		JLabel abizenakLabel;
		abizenakLabel = new JLabel();
		abizenakLabel.setText("Abizenak:");

		harAbizenak = new JTextField();

		JLabel probintziaLabel;
		probintziaLabel = new JLabel();
		probintziaLabel.setText("Probintzia:");

		harProbintzia = new JTextField();
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(54, 54, 54)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(erabiltzailePostaLabel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
								.addComponent(erabiltzaileIzenaLabel, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(erabIzena)
								.addComponent(ePosta, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(probintziaLabel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(abizenakLabel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(izenaLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(harIzena, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addComponent(harProbintzia, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addComponent(harAbizenak, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))))
					.addGap(46, 46, 46))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erabiltzaileIzenaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(erabIzena, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(erabiltzailePostaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(ePosta, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(izenaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(harIzena, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(abizenakLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(harAbizenak, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(probintziaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(harProbintzia, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}
	
	void setEditable(boolean editable){
		harProbintzia.setEditable(editable);
		harAbizenak.setEditable(editable);
		harIzena.setEditable(editable);
		ePosta.setEditable(editable);
		erabIzena.setEditable(editable);
	}
	
	public void setDatuak(ErabiltzaileInfo e) {
		// TODO Auto-generated method stub
	
		
		if(e != null){
			/*System.out.println(e.getErabIzena());
			System.out.println(e.getEPosta());
			System.out.println(e.getHarIzena());
			System.out.println(e.getHarAbizenak());
			System.out.println(e.getHarProbintzia());
			*/
		harProbintzia.setText(e.getHarProbintzia());
		harAbizenak.setText(e.getHarAbizenak());
		harIzena.setText(e.getHarIzena());
		ePosta.setText(e.getEPosta());
		erabIzena.setText(e.getErabIzena());
		}
		else{
			harProbintzia.setText("");
			harAbizenak.setText("");
			harIzena.setText("");
			ePosta.setText("");
			erabIzena.setText("");
		}
	}
	
	public String getEposta(){
		return ePosta.getText();
	}

}
