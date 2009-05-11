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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(onartuButton))
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
							.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(eskaerarenAlbaranaSortuLabel)
								.addGap(348, 348, 348)))
						.addComponent(albaranPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerarenAlbaranaSortuLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(albaranPanel, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(onartuButton)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
