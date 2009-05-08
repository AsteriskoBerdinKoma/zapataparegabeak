package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
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
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(eskerrikAskoGurekinLabel)
						.addComponent(eskerrikAskoGurekinTextArea, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(segunduBatzukBarruTextArea, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskerrikAskoGurekinLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskerrikAskoGurekinTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(32, 32, 32)
					.addComponent(segunduBatzukBarruTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(261, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
