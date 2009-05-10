package gkae.zapataparegabeak.gui.erdikoPanelak.salmentenEstadistikak;

import java.awt.Color;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;
import org.jdesktop.swingx.JXImagePanel;

public class SalmentenEstadistikakPanela extends JPanel {

	private JLabel irudiaLabel_1;
	private JLabel irudiaLabel;
	public SalmentenEstadistikakPanela() {
		super();

		JRadioButton azkenAstekoEstadistikakRadioButton;
		azkenAstekoEstadistikakRadioButton = new JRadioButton();
		azkenAstekoEstadistikakRadioButton.setText("Azken asteko estadistikak");

		JRadioButton azkenHilabetekoEstadistikakRadioButton;
		azkenHilabetekoEstadistikakRadioButton = new JRadioButton();
		azkenHilabetekoEstadistikakRadioButton.setText("Azken hilabeteko estadistikak");

		JLabel eskaerenHistorikoaLabel;
		eskaerenHistorikoaLabel = new JLabel();
		eskaerenHistorikoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		eskaerenHistorikoaLabel.setText("Salmenten Estadistikak");

		JSeparator separator;
		separator = new JSeparator();

		irudiaLabel = new JLabel();
		irudiaLabel.setBorder(new LineBorder(Color.black, 1, false));
		irudiaLabel.setOpaque(true);
		irudiaLabel.setBackground(Color.WHITE);
		irudiaLabel.setText("New JLabel");

		irudiaLabel_1 = new JLabel();
		irudiaLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		irudiaLabel_1.setOpaque(true);
		irudiaLabel_1.setBackground(Color.WHITE);
		irudiaLabel_1.setText("New JLabel");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(azkenAstekoEstadistikakRadioButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
							.addComponent(azkenHilabetekoEstadistikakRadioButton)
							.addGap(27, 27, 27))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
							.addGap(14, 14, 14))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55, 55, 55)
					.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
					.addComponent(irudiaLabel_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
					.addGap(82, 82, 82))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(31, 31, 31)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(azkenAstekoEstadistikakRadioButton)
						.addComponent(azkenHilabetekoEstadistikakRadioButton))
					.addGap(27, 27, 27)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(irudiaLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
						.addComponent(irudiaLabel_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(149, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}
