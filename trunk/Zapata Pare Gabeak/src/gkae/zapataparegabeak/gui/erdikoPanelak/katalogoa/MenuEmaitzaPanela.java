package gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa;

import gkae.zapataparegabeak.gui.NagusiaPanel;
import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;

public class MenuEmaitzaPanela extends JPanel {

	
	final JPanel resultPanel;
	
	private JLabel label;
	private JLabel label_1;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Gurasoaren erreferentzia pantailaz aldatzeko
	private NagusiaPanel jabea;

	/**
	 * Create the panel
	 * @param nagusiaPanel 
	 */
	public MenuEmaitzaPanela(NagusiaPanel nagusiaPanel) {
		super();
		this.jabea = nagusiaPanel;

		JLabel bilaketarenEmaitzakLabel;
		bilaketarenEmaitzakLabel = new JLabel();
		bilaketarenEmaitzakLabel.setFont(new Font("", Font.PLAIN, 18));
		bilaketarenEmaitzakLabel.setText("Katalogoa -");

		JSeparator separator;
		separator = new JSeparator();

		label = new JLabel();
		label.setText("5 artikulu daude sail honetan.");

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

		resultPanel = new JPanel();
		resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.Y_AXIS));
		scrollPane.setViewportView(resultPanel);

		emaitzakEguneratu();

		label_1 = new JLabel();
		label_1.setFont(new Font("", Font.PLAIN, 18));
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(bilaketarenEmaitzakLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(label_1))
						.addComponent(label, GroupLayout.Alignment.LEADING))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(bilaketarenEmaitzakLabel)
						.addComponent(label_1))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
	}
	
	public void emaitzakEguneratu() {
		resultPanel.removeAll();
		int counter = 0;
		for(Zapata z: Kudeaketa.getInstance().katalogokoZapatak()){
			resultPanel.add(new KatalogoItemPanela(jabea, z));
			counter++;
			if(counter==5)
				break;
		}
		
	}
	
	public void setTitulua(String titulua){
		label_1.setText(titulua);
	}

}
