package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

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
		produktueLabel.setText("Produktuen Lista");

		comboBox = new JComboBox();

		JLabel motaLabel;
		motaLabel = new JLabel();
		motaLabel.setText("Mota:");

		textField = new JTextField();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setText("Bilatu");

		list = new JList();

		JButton atzeraButton;
		atzeraButton = new JButton();
		atzeraButton.setText("Atzera");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(produktueLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(motaLabel)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
					.addGap(57, 57, 57))
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(51, 51, 51)
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(275, Short.MAX_VALUE))
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(387, Short.MAX_VALUE)
					.addComponent(atzeraButton)
					.addGap(42, 42, 42))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(produktueLabel, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
					.addGap(25, 25, 25)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(motaLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2, 2, 2)
							.addComponent(bilatuButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39, 39, 39)
					.addComponent(list, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(atzeraButton)
					.addGap(20, 20, 20))
		);
		setLayout(groupLayout);
		//
	}

}
