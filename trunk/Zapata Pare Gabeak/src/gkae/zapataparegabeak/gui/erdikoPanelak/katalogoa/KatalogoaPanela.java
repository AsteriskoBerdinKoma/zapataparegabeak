package gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa;

import gkae.zapataparegabeak.objektuak.Katalogoa;
import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;

public class KatalogoaPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final JPanel artikuluZerrenda;

	/**
	 * Create the panel
	 */
	public KatalogoaPanela() {
		super();

		JSeparator separator;
		separator = new JSeparator();

		JLabel katalogoaLabel;
		katalogoaLabel = new JLabel();
		katalogoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		katalogoaLabel.setText("Katalogoa");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

		artikuluZerrenda = new JPanel();
		artikuluZerrenda.setLayout(new BoxLayout(artikuluZerrenda, BoxLayout.Y_AXIS));
		artikuluZerrenda.setSize(473, 310);
		scrollPane.setViewportView(artikuluZerrenda);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(katalogoaLabel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(katalogoaLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
		katalogoaEguneratu();
	}
	
	public void katalogoaEguneratu() {
		artikuluZerrenda.removeAll();
		for(Zapata z: Kudeaketa.getInstance().katalogokoZapatak()){
			artikuluZerrenda.add(new KatalogoItemPanela(z));
		}
		
	}
	
	public static void main(String[] args){
		JFrame j = new JFrame("Frogak");
		Kudeaketa.getInstance();
		Katalogoa.getInstance();
		SaskiratutakoZapatak.getInstance();
		KatalogoaPanela k = new KatalogoaPanela();
		j.add(k);
		j.setSize(k.getPreferredSize());
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
