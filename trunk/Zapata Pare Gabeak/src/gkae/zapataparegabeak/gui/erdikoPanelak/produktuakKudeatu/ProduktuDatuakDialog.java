package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

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
import gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu.ProduktuDatuak;
import gkae.zapataparegabeak.objektuak.Zapata;

public class ProduktuDatuakDialog extends JDialog {

	

	/**
	 * Create the dialog
	 */
	public ProduktuDatuakDialog(Zapata z) {
		super();
		setTitle("Produktua Editatu");

		ProduktuDatuak produktuDatuak;
		produktuDatuak = new ProduktuDatuak (z);

		JButton atzeraButton;
		atzeraButton = new JButton();
		atzeraButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		atzeraButton.setIcon(SwingResourceManager.getIcon(ProduktuDatuakDialog.class, "/gkae/zapataparegabeak/resources/ikonoak/left_arrow24.png"));
		atzeraButton.setText("Atzera");

		JButton onartuButton;
		onartuButton = new JButton();
		onartuButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				dispose();
				JOptionPane jop = new JOptionPane(
                        "Produktuan editatutako datuak gorde dira.",
                        JOptionPane.INFORMATION_MESSAGE);
						jop.createDialog("Datuak gordeta")
                        .setVisible(true);
			}
			
		});
		onartuButton.setIcon(SwingResourceManager.getIcon(ProduktuDatuakDialog.class, "/gkae/zapataparegabeak/resources/ikonoak/accept_item24.png"));
		onartuButton.setText("Onartu");
		final GroupLayout groupLayout = new GroupLayout((JComponent) getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(produktuDatuak, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(atzeraButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(onartuButton)
							.addGap(32, 32, 32))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(produktuDatuak, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(atzeraButton)
						.addComponent(onartuButton))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		pack();
		//
	}

}
