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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import com.swtdesigner.SwingResourceManager;

public class Emailbidalizaio extends JPanel {
	
	private BezeroenEskaerakPanel owner;
	/**
	 * Create the panel
	 */
	public Emailbidalizaio(BezeroenEskaerakPanel bezeroeneskaerakpanel) {
		super();
		owner = bezeroeneskaerakpanel;
		JSeparator separator;
		separator = new JSeparator();

		JLabel emailBidalitaLabel;
		emailBidalitaLabel = new JLabel();
		emailBidalitaLabel.setText("Email bidalita");

		JLabel bezeroariEmailBatLabel;
		bezeroariEmailBatLabel = new JLabel();
		bezeroariEmailBatLabel.setFont(new Font("", Font.PLAIN, 24));
		bezeroariEmailBatLabel.setText("Bezeroari email bat bidali zaio");

		JLabel bezeroariEmailBatLabel_1;
		bezeroariEmailBatLabel_1 = new JLabel();
		bezeroariEmailBatLabel_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		bezeroariEmailBatLabel_1.setText("egindako eskaera konfirmatuz");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("bezeroekEgindakoEskaerenLista");
			}
		});
		onartuButton.setIcon(SwingResourceManager.getIcon(Emailbidalizaio.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		onartuButton.setText("Onartu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(emailBidalitaLabel, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65, 65, 65)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(bezeroariEmailBatLabel_1, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE)
								.addComponent(bezeroariEmailBatLabel)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(170, 170, 170)
							.addComponent(onartuButton)))
					.addContainerGap(42, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(emailBidalitaLabel)
					.addGap(21, 21, 21)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(54, 54, 54)
					.addComponent(bezeroariEmailBatLabel)
					.addGap(25, 25, 25)
					.addComponent(bezeroariEmailBatLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(38, 38, 38)
					.addComponent(onartuButton)
					.addContainerGap(109, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
		//
	}

}