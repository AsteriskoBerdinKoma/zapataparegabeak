package gkae.zapataparegabeak.gui.erdikoPanelak.salmentenEstadistikak;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
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

import com.swtdesigner.SwingResourceManager;

public class SalmentenEstadistikakPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea TextArea;
	private JLabel irudiaLabel_1;
	private JLabel irudiaLabel;
	private JRadioButton azkenAstekoEstadistikakRadioButton;
	
	public SalmentenEstadistikakPanela() {
		super();

		JRadioButton azkenHilabetekoEstadistikakRadioButton;
		azkenHilabetekoEstadistikakRadioButton = new JRadioButton();
		buttonGroup.add(azkenHilabetekoEstadistikakRadioButton);
		azkenHilabetekoEstadistikakRadioButton.setText("Azken hilabeteko estadistikak");

		JLabel eskaerenHistorikoaLabel;
		eskaerenHistorikoaLabel = new JLabel();
		eskaerenHistorikoaLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		eskaerenHistorikoaLabel.setText("Salmenten Estadistikak");

		JSeparator separator;
		separator = new JSeparator();

		irudiaLabel = new JLabel();
		ImageIcon icon = SwingResourceManager.getIcon(SalmentenEstadistikakPanela.class, "/gkae/zapataparegabeak/resources/asteko estadistikak.jpg");
//		icon = new ImageIcon(icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
		irudiaLabel.setIcon(icon);
		irudiaLabel.setBorder(new LineBorder(Color.black, 1, false));
		irudiaLabel.setOpaque(true);
		irudiaLabel.setBackground(Color.WHITE);

		irudiaLabel_1 = new JLabel();
//		irudiaLabel_1.setIcon(SwingResourceManager.getIcon(SalmentenEstadistikakPanela.class, "/gkae/zapataparegabeak/resources/hilabeteko estadistikak.jpg"));
		ImageIcon icon1 = SwingResourceManager.getIcon(SalmentenEstadistikakPanela.class, "/gkae/zapataparegabeak/resources/hilabeteko estadistikak.jpg");
//		icon1 = new ImageIcon(icon1.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
		irudiaLabel_1.setIcon(icon1);
		irudiaLabel_1.setVisible(false);
		
		irudiaLabel_1.setBorder(new LineBorder(Color.black, 1, false));
		irudiaLabel_1.setOpaque(true);
		irudiaLabel_1.setBackground(Color.WHITE);
		
		azkenAstekoEstadistikakRadioButton = new JRadioButton();
		azkenAstekoEstadistikakRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(final ItemEvent arg0) {
				irudiaLabel.setVisible(azkenAstekoEstadistikakRadioButton.isSelected());
				irudiaLabel_1.setVisible(!azkenAstekoEstadistikakRadioButton.isSelected());
			}
		});
		azkenAstekoEstadistikakRadioButton.setSelected(true);
		buttonGroup.add(azkenAstekoEstadistikakRadioButton);
		azkenAstekoEstadistikakRadioButton.setText("Azken asteko estadistikak");

		TextArea = new JTextArea();
		TextArea.setText("Brooks: Gizonezko korritzeko ezker zapata\nSaucony: Emakumezko korritzeko ezker zapata. \nParis Hilton: Emakumezko fashion ezker zapata.\nEcco: Gizonezko mendiko ezker bota.\nTouch ups: Emakumezko ballet eskuin zapata.\nStride Rite: Gizonezko ezker sandalia.");
		TextArea.setLineWrap(true);
		TextArea.setEditable(false);
		TextArea.setOpaque(false);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(TextArea, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(azkenHilabetekoEstadistikakRadioButton)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(azkenAstekoEstadistikakRadioButton)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
							.addGap(14, 14, 14))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(irudiaLabel, GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(irudiaLabel_1, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(eskaerenHistorikoaLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(azkenAstekoEstadistikakRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(azkenHilabetekoEstadistikakRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(irudiaLabel_1, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
						.addComponent(irudiaLabel, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(TextArea, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

}
