package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;

public class MezuBidaliaPanel extends JPanel {

	private JTextArea segunduBatzukBarruTextArea;
	private JTextArea eskerrikAskoGurekinTextArea;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public MezuBidaliaPanel() {
		super();

		eskerrikAskoGurekinTextArea = new JTextArea();
		eskerrikAskoGurekinTextArea.setLineWrap(true);
		eskerrikAskoGurekinTextArea.setWrapStyleWord(true);
		eskerrikAskoGurekinTextArea.setBorder(null);
		eskerrikAskoGurekinTextArea.setBackground(UIManager.getColor("Button.background"));
		eskerrikAskoGurekinTextArea.setEditable(false);
		eskerrikAskoGurekinTextArea.setText("Aukeratutako erabiltzaileari idatzitako mezua bidali zaio eta \"Erabiltzaileari baja eman\" aukeratu baduzu operazioa burutu da. ");

		JLabel eskerrikAskoGurekinLabel;
		eskerrikAskoGurekinLabel = new JLabel();
		eskerrikAskoGurekinLabel.setFont(new Font("", Font.BOLD, 12));
		eskerrikAskoGurekinLabel.setText("Zure mezua bidali da");

		segunduBatzukBarruTextArea = new JTextArea();
		segunduBatzukBarruTextArea.setText("Segundu batzuk barru mezu hau desagertuko da");
		segunduBatzukBarruTextArea.setBackground(UIManager.getColor("Button.background"));

		JSeparator separator;
		separator = new JSeparator();

		JLabel bezeroekinHarremanetanJarriLabel;
		bezeroekinHarremanetanJarriLabel = new JLabel();
		bezeroekinHarremanetanJarriLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		bezeroekinHarremanetanJarriLabel.setText("Bezeroarekin Harremanetan Jarri");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(separator, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
						.addComponent(segunduBatzukBarruTextArea, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(eskerrikAskoGurekinLabel, GroupLayout.Alignment.LEADING)
						.addComponent(bezeroekinHarremanetanJarriLabel, GroupLayout.Alignment.LEADING)
						.addComponent(eskerrikAskoGurekinTextArea, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroekinHarremanetanJarriLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(8, 8, 8)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskerrikAskoGurekinLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskerrikAskoGurekinTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(segunduBatzukBarruTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
