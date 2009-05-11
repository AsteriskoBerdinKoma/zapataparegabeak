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



public class DatuKonprobaketa extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BezeroenEskaerakPanel owner;

	/**
	 * Create the panel
	 */
	public DatuKonprobaketa(BezeroenEskaerakPanel bezeroenEskaerakPanel) {
		super();
		owner = bezeroenEskaerakPanel;
		JLabel datuakLabel;
		datuakLabel = new JLabel();
		datuakLabel.setText("Eskaeran Sartutako Datuak:");

		JLabel onargarriakDiraLabel;
		onargarriakDiraLabel = new JLabel();
		onargarriakDiraLabel.setHorizontalAlignment(SwingConstants.CENTER);
		onargarriakDiraLabel.setFont(new Font("", Font.BOLD, 26));
		onargarriakDiraLabel.setText("Onargarriak dira   /    Ez dira Onargarriak");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.setIcon(SwingResourceManager.getIcon(DatuKonprobaketa.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		onartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("emailbidalizaio");
			}
		});
		onartuButton.setText("Onartu");

		JButton kantzelatuButton;
		kantzelatuButton = new JButton();
		kantzelatuButton.setIcon(SwingResourceManager.getIcon(DatuKonprobaketa.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));
		kantzelatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("emailbidalizaioKantzelatuta");
			}
		});
		kantzelatuButton.setText("Kantzelatu");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.setIcon(SwingResourceManager.getIcon(DatuKonprobaketa.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		itzuliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				owner.changeCard("bezeroekEgindakoEskaerenLista");
			}
		});
		itzuliButton.setText("Itzuli");

		JLabel eskaerenProzesamenduaLabel;
		eskaerenProzesamenduaLabel = new JLabel();
		eskaerenProzesamenduaLabel.setFont(new Font("", Font.PLAIN, 18));
		eskaerenProzesamenduaLabel.setText("Eskaeren Prozesamendua");

		JSeparator separator;
		separator = new JSeparator();

		JLabel bezeroarenKontuZbLabel;
		bezeroarenKontuZbLabel = new JLabel();
		bezeroarenKontuZbLabel.setFont(new Font("", Font.ITALIC, 12));
		bezeroarenKontuZbLabel.setText("Bezeroaren kontu zb. onargarria bada onartu, bestela kantzelatu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(eskaerenProzesamenduaLabel)
						.addComponent(bezeroarenKontuZbLabel)
						.addComponent(datuakLabel)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
						.addComponent(onargarriakDiraLabel, GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(itzuliButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(kantzelatuButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(onartuButton)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerenProzesamenduaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(11, 11, 11)
					.addComponent(bezeroarenKontuZbLabel)
					.addGap(24, 24, 24)
					.addComponent(datuakLabel)
					.addGap(26, 26, 26)
					.addComponent(onargarriakDiraLabel, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
					.addGap(136, 136, 136)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(onartuButton)
						.addComponent(kantzelatuButton)
						.addComponent(itzuliButton))
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
