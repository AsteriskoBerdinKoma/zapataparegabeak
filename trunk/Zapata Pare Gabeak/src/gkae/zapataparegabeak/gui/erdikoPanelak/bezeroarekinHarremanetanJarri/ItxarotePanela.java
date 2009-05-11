package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroarekinHarremanetanJarri;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import org.jdesktop.swingx.JXBusyLabel;

public class ItxarotePanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public ItxarotePanela() {
		super();

		JXBusyLabel zureMezuaBidaltzenBusyLabel;
		zureMezuaBidaltzenBusyLabel = new JXBusyLabel();
		zureMezuaBidaltzenBusyLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		zureMezuaBidaltzenBusyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		zureMezuaBidaltzenBusyLabel.setBusy(true);
		zureMezuaBidaltzenBusyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		zureMezuaBidaltzenBusyLabel.setText("Zure mezua bidaltzen ari da. Itxaron mesedez.");

		JSeparator separator;
		separator = new JSeparator();

		JLabel bezeroekinHarremanetanJarriLabel;
		bezeroekinHarremanetanJarriLabel = new JLabel();
		bezeroekinHarremanetanJarriLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		bezeroekinHarremanetanJarriLabel.setText("Bezeroarekin Harremanetan Jarri");

		JPanel panel;
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(zureMezuaBidaltzenBusyLabel, BorderLayout.CENTER);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(bezeroekinHarremanetanJarriLabel)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(bezeroekinHarremanetanJarriLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
