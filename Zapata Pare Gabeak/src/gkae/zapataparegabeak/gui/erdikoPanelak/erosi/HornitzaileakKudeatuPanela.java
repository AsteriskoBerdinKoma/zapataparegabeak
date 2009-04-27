package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.SpringLayout;
import gkae.zapataparegabeak.gui.erdikoPanelak.erosi.HornitzaileDatuakPanela;

public class HornitzaileakKudeatuPanela extends JPanel {

	private JTextArea textArea_5;
	private JTextArea textArea_4;
	private JTextArea textArea_3;
	private JTextArea textArea_2;
	private JTextArea textArea_1;
	private JList list;
	private SpringLayout springLayout;
	/**
	 * Create the panel
	 */
	public HornitzaileakKudeatuPanela() {
		super();
		setAutoscrolls(true);
		springLayout = new SpringLayout();
		setLayout(springLayout);
		DefaultListModel listModel = new DefaultListModel();
		list = new JList(listModel);
		listModel.addElement("kaka");
		add(list);
		springLayout.putConstraint(SpringLayout.SOUTH, list, -5, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, list, 65, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, list, 130, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, list, 5, SpringLayout.WEST, this);

		final JLabel hornitzaileenZderrendaLabel = new JLabel();
		hornitzaileenZderrendaLabel.setText("Hornitzaileen Zerrenda");
		add(hornitzaileenZderrendaLabel);
		springLayout.putConstraint(SpringLayout.EAST, hornitzaileenZderrendaLabel, 130, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, hornitzaileenZderrendaLabel, 1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, hornitzaileenZderrendaLabel, 36, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, hornitzaileenZderrendaLabel, 20, SpringLayout.NORTH, this);

		final JButton editatuButton = new JButton();
		editatuButton.setText("Editatu");
		add(editatuButton);
		springLayout.putConstraint(SpringLayout.EAST, editatuButton, 215, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, editatuButton, 142, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, editatuButton, 36, SpringLayout.NORTH, list);
		springLayout.putConstraint(SpringLayout.NORTH, editatuButton, 0, SpringLayout.NORTH, list);

		final JButton berriaGehituButton = new JButton();
		berriaGehituButton.setText("Berria Gehitu");
		add(berriaGehituButton);
		springLayout.putConstraint(SpringLayout.EAST, berriaGehituButton, 250, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, berriaGehituButton, 142, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, berriaGehituButton, 155, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, berriaGehituButton, 120, SpringLayout.NORTH, this);

		textArea_1 = new JTextArea();
		add(textArea_1);
		springLayout.putConstraint(SpringLayout.NORTH, textArea_1, 255, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textArea_1, 70, SpringLayout.WEST, this);

		textArea_2 = new JTextArea();
		add(textArea_2);
		springLayout.putConstraint(SpringLayout.NORTH, textArea_2, 45, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textArea_2, 45, SpringLayout.WEST, this);

		textArea_3 = new JTextArea();
		add(textArea_3);
		springLayout.putConstraint(SpringLayout.NORTH, textArea_3, 34, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textArea_3, 0, SpringLayout.EAST, editatuButton);

		textArea_4 = new JTextArea();
		add(textArea_4);
		springLayout.putConstraint(SpringLayout.NORTH, textArea_4, 0, SpringLayout.NORTH, textArea_2);
		springLayout.putConstraint(SpringLayout.WEST, textArea_4, 80, SpringLayout.WEST, this);

		textArea_5 = new JTextArea();
		add(textArea_5);
		springLayout.putConstraint(SpringLayout.NORTH, textArea_5, 59, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textArea_5, 0, SpringLayout.EAST, textArea_4);

		final JLabel label = new JLabel();
		label.setText("Editatzeko 1 aukeratu");
		add(label);
		springLayout.putConstraint(SpringLayout.SOUTH, label, 57, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, label, 41, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, label, 124, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, label, 1, SpringLayout.WEST, this);

		final HornitzaileDatuakPanela hornitzaileDatuak = new HornitzaileDatuakPanela();
		hornitzaileDatuak.setEditable(false);
		add(hornitzaileDatuak);
		springLayout.putConstraint(SpringLayout.SOUTH, hornitzaileDatuak, 335, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, hornitzaileDatuak, 0, SpringLayout.NORTH, editatuButton);
		springLayout.putConstraint(SpringLayout.EAST, hornitzaileDatuak, 455, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, hornitzaileDatuak, 260, SpringLayout.WEST, this);
		//
	}

}
