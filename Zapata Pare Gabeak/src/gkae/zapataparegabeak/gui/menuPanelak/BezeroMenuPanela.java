package gkae.zapataparegabeak.gui.menuPanelak;

import gkae.zapataparegabeak.gui.NagusiaPanel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.border.TitledBorder;

import org.jdesktop.swingx.JXHyperlink;
import org.jdesktop.swingx.JXTaskPane;

import com.swtdesigner.SwingResourceManager;

public class BezeroMenuPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NagusiaPanel jabea;
	private final JXTaskPane taskPane;

	/**
	 * Create the panel.
	 */
	public BezeroMenuPanela(NagusiaPanel jabea) {
		
		this.jabea = jabea;
		
		setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			add(scrollPane, BorderLayout.CENTER);
			{
				
				scrollPane.setBorder(new TitledBorder(null, "Katalogoa", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
			}

			final JPanel panel = new JPanel();
			scrollPane.setViewportView(panel);

			taskPane = new JXTaskPane();
			taskPane.setTitle("Gizonezkoen zapatak");

			final JXHyperlink botakHyperlink = new JXHyperlink();
			botakHyperlink.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					ikusiFiltroEmaitzak("Gizonezkoen Botak");
				}
			});
			botakHyperlink.setText("� Botak");
			taskPane.add(botakHyperlink, BorderLayout.NORTH);

			final JXHyperlink kirolZapatakHyperlink = new JXHyperlink();
			kirolZapatakHyperlink.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					ikusiFiltroEmaitzak("Gizonezkoen Kirol Zapatak");
				}
			});
			kirolZapatakHyperlink.setText("� Kirol zapatak");
			taskPane.add(kirolZapatakHyperlink, BorderLayout.SOUTH);

			final JXHyperlink bereziakHyperlink = new JXHyperlink();
			bereziakHyperlink.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					ikusiFiltroEmaitzak("Gizonezkoen Zapata Bereziak");
				}
			});
			bereziakHyperlink.setText("� Bereziak");
			taskPane.add(bereziakHyperlink, BorderLayout.WEST);

			final JXHyperlink bestelakoakHyperlink = new JXHyperlink();
			bestelakoakHyperlink.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					ikusiFiltroEmaitzak("Gizonezkoen Bestelako Zapatak");
				}
			});
			bestelakoakHyperlink.setText("� Bestelakoak");
			taskPane.add(bestelakoakHyperlink, BorderLayout.EAST);

			JXTaskPane taskPane_1;
			taskPane_1 = new JXTaskPane();
			taskPane_1.setTitle("Emakumezkoen zapatak");

			final JXHyperlink botakHyperlink_1 = new JXHyperlink();
			botakHyperlink_1.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					ikusiFiltroEmaitzak("Emakumezkoen Botak");
				}
			});
			botakHyperlink_1.setText("� Botak");
			taskPane_1.add(botakHyperlink_1, BorderLayout.NORTH);

			final JXHyperlink kirolZapatakHyperlink_1 = new JXHyperlink();
			kirolZapatakHyperlink_1.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					ikusiFiltroEmaitzak("Emakumezkoen Kirol Zapatak");
				}
			});
			kirolZapatakHyperlink_1.setText("� Kirol zapatak");
			taskPane_1.add(kirolZapatakHyperlink_1, BorderLayout.SOUTH);

			final JXHyperlink bestelakoakHyperlink_1 = new JXHyperlink();
			bestelakoakHyperlink_1.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					ikusiFiltroEmaitzak("Emakumezkoen Bestelako Zapatak");
				}
			});
			bestelakoakHyperlink_1.setText("� Bestelakoak");
			taskPane_1.add(bestelakoakHyperlink_1, BorderLayout.WEST);

			final JXHyperlink takoidunakHyperlink = new JXHyperlink();
			takoidunakHyperlink.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					ikusiFiltroEmaitzak("Emakumezkoen Takoidun Zapatak");
				}
			});
			takoidunakHyperlink.setText("� Takoidunak");
			taskPane_1.add(takoidunakHyperlink, BorderLayout.EAST);

			final JXHyperlink bereziakHyperlink_1 = new JXHyperlink();
			bereziakHyperlink_1.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					ikusiFiltroEmaitzak("Emakumezkoen Zapata Bereziak");
				}
			});
			bereziakHyperlink_1.setText("� Bereziak");
			taskPane_1.add(bereziakHyperlink_1);

			JXHyperlink produktuBerrienakHyperlink;
			produktuBerrienakHyperlink = new JXHyperlink();
			produktuBerrienakHyperlink.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					BezeroMenuPanela.this.jabea.ikusiKatalogoaPanela();
				}
			});
			produktuBerrienakHyperlink.setIcon(SwingResourceManager.getIcon(BezeroMenuPanela.class, "/gkae/zapataparegabeak/resources/ikonoak/home24.png"));
			produktuBerrienakHyperlink.setFont(new Font("", Font.BOLD, 14));
			produktuBerrienakHyperlink.setText("Produktu berrienak");
			
			final GroupLayout groupLayout = new GroupLayout((JComponent) panel);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(taskPane, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
							.addComponent(taskPane_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(produktuBerrienakHyperlink, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
						.addContainerGap())
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addComponent(produktuBerrienakHyperlink, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(taskPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(taskPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			panel.setLayout(groupLayout);
		}

	}
	
	private void ikusiFiltroEmaitzak(String titulua){
		this.jabea.ikusiMenuEmaitzaPanela(titulua);
	}
}
