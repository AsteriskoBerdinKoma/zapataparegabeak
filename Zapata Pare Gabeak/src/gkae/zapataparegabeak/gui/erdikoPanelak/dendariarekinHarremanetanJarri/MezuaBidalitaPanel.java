package gkae.zapataparegabeak.gui.erdikoPanelak.dendariarekinHarremanetanJarri;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;

public class MezuaBidalitaPanel extends JPanel {

	private JTextArea eskerrikAskoGurekinTextArea;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public MezuaBidalitaPanel() {
		super();

		eskerrikAskoGurekinTextArea = new JTextArea();
		eskerrikAskoGurekinTextArea.setLineWrap(true);
		eskerrikAskoGurekinTextArea.setWrapStyleWord(true);
		eskerrikAskoGurekinTextArea.setBorder(null);
		eskerrikAskoGurekinTextArea.setBackground(UIManager.getColor("Button.background"));
		eskerrikAskoGurekinTextArea.setEditable(false);
		eskerrikAskoGurekinTextArea.setText("Eskerrik asko gurekin kontaktuan jartzeagatik. E-posta helbide bat eman baduzu ahalik eta azkarren erantzuten saitauko gara.");

		JLabel eskerrikAskoGurekinLabel;
		eskerrikAskoGurekinLabel = new JLabel();
		eskerrikAskoGurekinLabel.setFont(new Font("", Font.BOLD, 12));
		eskerrikAskoGurekinLabel.setText("Zure mezua jaso dugu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(eskerrikAskoGurekinLabel)
						.addComponent(eskerrikAskoGurekinTextArea, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(GroupLayout.Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskerrikAskoGurekinLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskerrikAskoGurekinTextArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
