package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

public class AlbaranaSortuDa extends JPanel {
	
	BezeroenEskaerakPanel owner;

	/**
	 * Create the panel
	 */
	public AlbaranaSortuDa(BezeroenEskaerakPanel nagusia) {
		super();
		owner = nagusia;

		JLabel eskaerarenAlbaranaSortuLabel;
		eskaerarenAlbaranaSortuLabel = new JLabel();
		eskaerarenAlbaranaSortuLabel.setFont(new Font("", Font.PLAIN, 20));
		eskaerarenAlbaranaSortuLabel.setText("Eskaeraren Albarana Sortu Da");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				owner.changeCard("proba");
			}
		});
		onartuButton.setText("Onartu");

		JButton inprimatuButton;
		inprimatuButton = new JButton();
		inprimatuButton.setText("Inprimatu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(eskaerarenAlbaranaSortuLabel, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(74, 74, 74)
							.addComponent(onartuButton)
							.addGap(121, 121, 121)
							.addComponent(inprimatuButton)))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21, 21, 21)
					.addComponent(eskaerarenAlbaranaSortuLabel, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(onartuButton)
						.addComponent(inprimatuButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
