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
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import com.swtdesigner.SwingResourceManager;

public class EmailbidalizaioKantzelatuta extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BezeroenEskaerakPanel owner;
	/**
	 * Create the panel
	 */
	public EmailbidalizaioKantzelatuta(BezeroenEskaerakPanel bezeroeneskaerakpanel) {
		super();
		owner = bezeroeneskaerakpanel;
		JSeparator separator;
		separator = new JSeparator();

		JLabel emailBidalitaLabel;
		emailBidalitaLabel = new JLabel();
		emailBidalitaLabel.setFont(new Font("", Font.PLAIN, 18));
		emailBidalitaLabel.setText("Email bidalita");

		JLabel bezeroariEmailBatLabel;
		bezeroariEmailBatLabel = new JLabel();
		bezeroariEmailBatLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		bezeroariEmailBatLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bezeroariEmailBatLabel.setFont(new Font("", Font.PLAIN, 24));
		bezeroariEmailBatLabel.setText("Bezeroari email bat bidali zaio");

		JLabel bezeroariEmailBatLabel_1;
		bezeroariEmailBatLabel_1 = new JLabel();
		bezeroariEmailBatLabel_1.setVerticalAlignment(SwingConstants.TOP);
		bezeroariEmailBatLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		bezeroariEmailBatLabel_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		bezeroariEmailBatLabel_1.setText("egindako eskaera kantzelatuz");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("bezeroekEgindakoEskaerenLista");
			}
		});
		onartuButton.setIcon(SwingResourceManager.getIcon(EmailbidalizaioKantzelatuta.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		onartuButton.setText("Onartu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(emailBidalitaLabel, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(bezeroariEmailBatLabel, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(bezeroariEmailBatLabel_1, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(387, Short.MAX_VALUE)
							.addComponent(onartuButton)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(emailBidalitaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(88, 88, 88)
					.addComponent(bezeroariEmailBatLabel, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(bezeroariEmailBatLabel_1, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addGap(127, 127, 127)
					.addComponent(onartuButton)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
