package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import com.swtdesigner.SwingResourceManager;

public class ProduktuEditatu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JComboBox comboBox_1;
	/**
	 * Create the panel
	 */
	public ProduktuEditatu() {
		super();

		JLabel produktueLabel;
		produktueLabel = new JLabel();
		produktueLabel.setText("Aukeratutako Produktuaren Edizioa");

		JLabel motaLabel;
		motaLabel = new JLabel();
		motaLabel.setText("Mota:");

		comboBox_1 = new JComboBox();

		textField_1 = new JTextField();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setIcon(SwingResourceManager.getIcon(ProduktuEditatu.class, "/gkae/zapataparegabeak/resources/ikonoak/search_magnifier24.png"));
		bilatuButton.setText("Bilatu");

		JButton adosButton;
		adosButton = new JButton();
		adosButton.setIcon(SwingResourceManager.getIcon(ProduktuEditatu.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		adosButton.setText("Ados");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.setIcon(SwingResourceManager.getIcon(ProduktuEditatu.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		itzuliButton.setText("Itzuli");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(316, Short.MAX_VALUE)
					.addComponent(itzuliButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(adosButton)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(produktueLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(motaLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(100, 100, 100)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(6, 6, 6)
							.addComponent(bilatuButton)))
					.addGap(40, 40, 40))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(produktueLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addGap(27, 27, 27)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(motaLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(adosButton)
						.addComponent(itzuliButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
