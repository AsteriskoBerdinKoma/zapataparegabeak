package gkae.zapataparegabeak.gui.erdikoPanelak.produktuakKudeatu;

import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle;

import com.swtdesigner.SwingResourceManager;

public class ProduktuDatuakDialog extends JDialog {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
						.addComponent(produktuDatuak, GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
						.addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(atzeraButton)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(onartuButton, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(produktuDatuak, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(atzeraButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(onartuButton))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		pack();
		//
	}

}
