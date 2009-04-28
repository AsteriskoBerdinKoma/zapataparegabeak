package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class BezeroenLista extends JPanel {

	private JList list;
	private JTextField textField;
	/**
	 * Create the panel
	 */
	public BezeroenLista() {
		super();

		JLabel bezeroenListaLabel;
		bezeroenListaLabel = new JLabel();
		bezeroenListaLabel.setText("Bezeroen Lista");

		textField = new JTextField();

		JButton bilatuButton;
		bilatuButton = new JButton();
		bilatuButton.setText("Bilatu");

		list = new JList();

		JButton emailButton;
		emailButton = new JButton();
		emailButton.setText("E-mail");

		JButton bajaEmanButton;
		bajaEmanButton = new JButton();
		bajaEmanButton.setText("Baja eman");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
									.addGap(19, 19, 19)
									.addComponent(bilatuButton))
								.addComponent(bezeroenListaLabel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(46, 46, 46)
							.addComponent(list, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(118, 118, 118)
							.addComponent(emailButton)
							.addGap(33, 33, 33)
							.addComponent(bajaEmanButton)))
					.addContainerGap(174, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroenListaLabel)
					.addGap(24, 24, 24)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(bilatuButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(38, 38, 38)
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(emailButton)
						.addComponent(bajaEmanButton))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
