package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.BorderLayout;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;

import org.jdesktop.swingx.JXHyperlink;
import org.jdesktop.swingx.JXTaskPane;

public class KudeaketaMenuPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public KudeaketaMenuPanela() {
		
		setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			add(scrollPane, BorderLayout.CENTER);
			{
				
				scrollPane.setBorder(new TitledBorder(null, "Kudeaketa menua", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			}

			final JPanel panel = new JPanel();
			scrollPane.setViewportView(panel);

			JXTaskPane taskPane;
			taskPane = new JXTaskPane();
			taskPane.setTitle("Salmentak");

			final JXHyperlink produktuakKudeatuHyperlink = new JXHyperlink();
			produktuakKudeatuHyperlink.setText("• Produktuak kudeaketa");
			taskPane.add(produktuakKudeatuHyperlink, BorderLayout.SOUTH);

			final JXHyperlink esHyperlink = new JXHyperlink();
			esHyperlink.setText("• Eskaeren kudeaketa");
			taskPane.add(esHyperlink, BorderLayout.NORTH);

			final JXHyperlink bezeroarekinHarremanetanJarriHyperlink = new JXHyperlink();
			bezeroarekinHarremanetanJarriHyperlink.setText("• Bezeroarekin harremanetan jarri");
			taskPane.add(bezeroarekinHarremanetanJarriHyperlink, BorderLayout.CENTER);

			final JXHyperlink salmentenEstatistikakHyperlink = new JXHyperlink();
			salmentenEstatistikakHyperlink.setText("• Salmenten estatistikak");
			taskPane.add(salmentenEstatistikakHyperlink, BorderLayout.WEST);

			JXTaskPane taskPane_1;
			taskPane_1 = new JXTaskPane();
			taskPane_1.setTitle("Biltegia");

			final JXHyperlink hornitzaileenKudeaketaHyperlink = new JXHyperlink();
			hornitzaileenKudeaketaHyperlink.setText("• Hornitzaileen kudeaketa");
			taskPane_1.add(hornitzaileenKudeaketaHyperlink, BorderLayout.NORTH);

			final JXHyperlink hyperlink = new JXHyperlink();
			hyperlink.setToolTipText("Hornitzaileei egindako eskaeren kudeaketa");
			hyperlink.setText("• Hornitzaileei egindako eskaerak");
			taskPane_1.add(hyperlink, BorderLayout.SOUTH);

			final JXHyperlink hyperlink_1 = new JXHyperlink();
			hyperlink_1.setText("• Materiala eskatu");
			taskPane_1.add(hyperlink_1, BorderLayout.WEST);
			
			final GroupLayout groupLayout = new GroupLayout((JComponent) panel);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addComponent(taskPane_1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
							.addComponent(taskPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap())
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(taskPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(taskPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			panel.setLayout(groupLayout);
		}

	}
}
