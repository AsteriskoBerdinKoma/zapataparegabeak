package gkae.zapataparegabeak.gui.erdikoPanelak;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class KudeaketaOngiEtorriPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel
	 */
	public KudeaketaOngiEtorriPanela() {
		super();

		JLabel ongiEtorriKudeaketaLabel;
		ongiEtorriKudeaketaLabel = new JLabel();
		ongiEtorriKudeaketaLabel.setFont(new Font("", Font.BOLD, 18));
		ongiEtorriKudeaketaLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		ongiEtorriKudeaketaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ongiEtorriKudeaketaLabel.setText("Ongi etorri kudeaketa atalera");

		JTextPane administratzaileaDenErabiltzaileTextPane;
		administratzaileaDenErabiltzaileTextPane = new JTextPane();
		administratzaileaDenErabiltzaileTextPane.setOpaque(false);
		administratzaileaDenErabiltzaileTextPane.setEditable(false);
		administratzaileaDenErabiltzaileTextPane.setText("Administratzailea den erabiltzaile batekin kautotu zara. Atal honetan dendaren kudeaketa gauzatu ahal izango duzu.");
		
		StyledDocument doc = administratzaileaDenErabiltzaileTextPane.getStyledDocument();
		MutableAttributeSet standard = new SimpleAttributeSet();
		StyleConstants.setAlignment(standard, StyleConstants.ALIGN_CENTER);
		StyleConstants.setFontSize(standard, 12);
		StyleConstants.setBold(standard, true);
		StyleConstants.setFontFamily(standard, "");
		doc.setParagraphAttributes(0, 0, standard, true);
		
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(administratzaileaDenErabiltzaileTextPane, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
						.addComponent(ongiEtorriKudeaketaLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(ongiEtorriKudeaketaLabel, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(administratzaileaDenErabiltzaileTextPane, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
