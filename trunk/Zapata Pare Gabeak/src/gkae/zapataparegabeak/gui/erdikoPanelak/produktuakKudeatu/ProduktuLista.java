package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu.ProduktuDatuak;

public class ProduktuLista extends JPanel {

	private JList list;
	private JTextField textField;
	private JComboBox comboBox;
	/**
	 * Create the panel
	 */
	public ProduktuLista() {
		super();

		JLabel produktueLabel;
		produktueLabel = new JLabel();
		produktueLabel.setText("Produktuen Kudeaketa");

		comboBox = new JComboBox();

		JLabel motaLabel;
		motaLabel = new JLabel();
		motaLabel.setText("Mota:");

		textField = new JTextField();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setText("Bilatu");

		list = new JList();
		list.setBorder(new TitledBorder(null, "Produktuen Lista", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, Color.BLUE));

		JButton atzeraButton;
		atzeraButton = new JButton();
		atzeraButton.setText("Atzera");

		JButton editatuButton;
		editatuButton = new JButton();
		editatuButton.setText("Editatu");

		JButton ezabatuButton;
		ezabatuButton = new JButton();
		ezabatuButton.setText("Ezabatu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12, 12, 12)
					.addComponent(produktueLabel))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12, 12, 12)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(72, 72, 72)
							.addComponent(atzeraButton)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(editatuButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
						.addComponent(ezabatuButton)))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(motaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(75, 75, 75)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(235, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12, 12, 12)
					.addComponent(produktueLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(motaLabel)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(bilatuButton))
					.addGap(19, 19, 19)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(list, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(editatuButton)
							.addGap(6, 6, 6)
							.addComponent(ezabatuButton)))
					.addGap(23, 23, 23)
					.addComponent(atzeraButton)
					.addGap(31, 31, 31))
		);
		setLayout(groupLayout);
		//
	}

}
