package gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import gkae.zapataparegabeak.gui.erdikoPanelak.bezeroenEskaerakKudeatu.AlbaranPanel;
import javax.swing.LayoutStyle;
import com.swtdesigner.SwingResourceManager;

public class AlbaranaSortuDa extends JPanel {

	private BezeroenEskaerakPanel owner;
	/**
	 * Create the panel
	 */
	public AlbaranaSortuDa(BezeroenEskaerakPanel bezeroeneskaerakpanel) {
		super();
		owner = bezeroeneskaerakpanel;

		JLabel eskaerarenAlbaranaSortuLabel;
		eskaerarenAlbaranaSortuLabel = new JLabel();
		eskaerarenAlbaranaSortuLabel.setFont(new Font("", Font.PLAIN, 18));
		eskaerarenAlbaranaSortuLabel.setText("Eskaeraren Albarana Sortu da");

		JSeparator separator;
		separator = new JSeparator();

		AlbaranPanel albaranPanel;
		albaranPanel = new AlbaranPanel();

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				owner.changeCard("bezeroekEgindakoEskaerenLista");
			}
		});
		onartuButton.setIcon(SwingResourceManager.getIcon(AlbaranaSortuDa.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		onartuButton.setText("Onartu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(albaranPanel, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
									.addGap(39, 39, 39)
									.addComponent(separator, GroupLayout.PREFERRED_SIZE, 462, GroupLayout.PREFERRED_SIZE))
								.addComponent(eskaerarenAlbaranaSortuLabel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(186, 186, 186)
							.addComponent(onartuButton)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerarenAlbaranaSortuLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
						.addComponent(albaranPanel, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
					.addGap(14, 14, 14)
					.addComponent(onartuButton)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
