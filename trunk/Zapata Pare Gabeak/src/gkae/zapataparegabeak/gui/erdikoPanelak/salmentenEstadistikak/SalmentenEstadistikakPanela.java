package gkae.zapataparegabeak.gui.erdikoPanelak.salmentenEstadistikak;

import gkae.zapataparegabeak.gui.erdikoPanelak.katalogoa.KatalogoItemPanela;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;
import org.jdesktop.swingx.JXImagePanel;
import com.swtdesigner.SwingResourceManager;

public class SalmentenEstadistikakPanela extends JPanel {

	private JTextArea TextArea_1;
	private JTextArea TextArea;
	private JLabel irudiaLabel_1;
	private JLabel irudiaLabel;
	public SalmentenEstadistikakPanela() {
		super();

		JRadioButton azkenAstekoEstadistikakRadioButton;
		azkenAstekoEstadistikakRadioButton = new JRadioButton();
		azkenAstekoEstadistikakRadioButton.setText("Azken asteko estadistikak");

		JRadioButton azkenHilabetekoEstadistikakRadioButton;
		azkenHilabetekoEstadistikakRadioButton = new JRadioButton();
		azkenHilabetekoEstadistikakRadioButton.setText("Azken hilabeteko estadistikak");

		JLabel eskaerenHistorikoaLabel;
		eskaerenHistorikoaLabel = new JLabel();
		eskaerenHistorikoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		eskaerenHistorikoaLabel.setText("Salmenten Estadistikak");

		JSeparator separator;
		separator = new JSeparator();

		irudiaLabel = new JLabel();
		ImageIcon iconOrig = SwingResourceManager.getIcon(SalmentenEstadistikakPanela.class, "/gkae/zapataparegabeak/resources/asteko estadistikak.jpg");
		ImageIcon iconResized = new ImageIcon(iconOrig.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
		irudiaLabel.setIcon(iconResized);
		irudiaLabel.setBorder(new LineBorder(Color.black, 1, false));
		irudiaLabel.setOpaque(true);
		irudiaLabel.setBackground(Color.WHITE);

		irudiaLabel_1 = new JLabel();
//		irudiaLabel_1.setIcon(SwingResourceManager.getIcon(SalmentenEstadistikakPanela.class, "/gkae/zapataparegabeak/resources/hilabeteko estadistikak.jpg"));
		ImageIcon iconOrig1 = SwingResourceManager.getIcon(SalmentenEstadistikakPanela.class, "/gkae/zapataparegabeak/resources/hilabeteko estadistikak.jpg");
		ImageIcon iconResized1 = new ImageIcon(iconOrig1.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
		irudiaLabel_1.setIcon(iconResized1);
		
		irudiaLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		irudiaLabel_1.setOpaque(true);
		irudiaLabel_1.setBackground(Color.WHITE);

		TextArea = new JTextArea();
		TextArea.setText("Brooks: Gizonezko korritzeko ezker zapata\nSaucony: Emakumezko korritzeko ezker zapata. \nParis Hilton: Emakumezko fashion ezker zapata.\nEcco: Gizonezko mendiko ezker bota.\nTouch ups: Emakumezko ballet eskuin zapata.\nStride Rite: Gizonezko ezker sandalia.");
		TextArea.setLineWrap(true);
		TextArea.setEditable(false);
		TextArea.setOpaque(false);

		TextArea_1 = new JTextArea();
		TextArea_1.setText("Brooks: Gizonezko korritzeko ezker zapata\nSaucony: Emakumezko korritzeko ezker zapata. \nParis Hilton: Emakumezko fashion ezker zapata.\nEcco: Gizonezko mendiko ezker bota.\nTouch ups: Emakumezko ballet eskuin zapata.\nStride Rite: Gizonezko ezker sandalia.");
		TextArea_1.setLineWrap(true);
		TextArea_1.setEditable(false);
		TextArea_1.setOpaque(false);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
							.addGap(14, 14, 14))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(TextArea)
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addComponent(irudiaLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(azkenAstekoEstadistikakRadioButton)))
							.addGap(75, 75, 75)
							.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(TextArea_1)
								.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addComponent(azkenHilabetekoEstadistikakRadioButton)
									.addComponent(irudiaLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(31, 31, 31)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(azkenAstekoEstadistikakRadioButton)
						.addComponent(azkenHilabetekoEstadistikakRadioButton))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(irudiaLabel)
						.addComponent(irudiaLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(TextArea, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(TextArea_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
					.addGap(84, 84, 84))
		);
		setLayout(groupLayout);
		//
	}

}
