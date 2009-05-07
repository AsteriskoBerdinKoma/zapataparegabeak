package gkae.zapataparegabeak.gui.erdikoPanelak.materialaEskatu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import javax.swing.JDialog;
import javax.swing.LayoutStyle;
import com.swtdesigner.SwingResourceManager;
import gkae.zapataparegabeak.gui.erdikoPanelak.materialaEskatu.MaterialBerriaPanela;

public class MaterialBerri extends JDialog {

	/**
	 * Launch the application
	 * @param args
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaterialBerri dialog = new MaterialBerri();
					dialog.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent e) {
							System.exit(0);
						}
					});
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog
	 */
	public MaterialBerri() {
		super();

		MaterialBerriaPanela materialBerriaPanela;
		materialBerriaPanela = new MaterialBerriaPanela();

		JButton eskaeraGordeButton;
		eskaeraGordeButton = new JButton();
		eskaeraGordeButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
				JOptionPane jop = new JOptionPane(
                        "Zure eskaera gorde da.",
                        JOptionPane.INFORMATION_MESSAGE);
						jop.createDialog("Eskaera gordeta")
                        .setVisible(true);
			}
		});
		eskaeraGordeButton.setIcon(SwingResourceManager.getIcon(MaterialBerri.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		eskaeraGordeButton.setText("Eskaera Gorde");

		JButton itzuliButton;
		itzuliButton = new JButton();
		itzuliButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		itzuliButton.setIcon(SwingResourceManager.getIcon(MaterialBerri.class, "/gkae/zapataparegabeak/resources/ikonoak/delete_item24.png"));
		itzuliButton.setText("Itzuli");
		final GroupLayout groupLayout = new GroupLayout((JComponent) getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(materialBerriaPanela, GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
				.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(240, Short.MAX_VALUE)
					.addComponent(itzuliButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskaeraGordeButton)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(materialBerriaPanela, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(eskaeraGordeButton)
						.addComponent(itzuliButton))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		pack();
		//
	}

}
