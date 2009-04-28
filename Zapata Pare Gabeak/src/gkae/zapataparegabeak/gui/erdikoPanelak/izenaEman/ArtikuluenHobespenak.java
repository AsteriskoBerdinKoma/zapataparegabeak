package gkae.zapataparegabeak.gui.erdikoPanelak.izenaEman;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class ArtikuluenHobespenak extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField oinNeurriaTextField;
	private ButtonGroup buttonGroupGenero = new ButtonGroup();
	private ButtonGroup buttonGroupOina = new ButtonGroup();
	/**
	 * Create the panel
	 */
	public ArtikuluenHobespenak() {
		super();

		JLabel izenaEmanArtikulueiLabel;
		izenaEmanArtikulueiLabel = new JLabel();
		izenaEmanArtikulueiLabel.setFont(new Font("Sans", Font.PLAIN, 18));
		izenaEmanArtikulueiLabel.setText("Izena Eman: Artikuluei Buruzko Hobespenak");

		JSeparator separator_3;
		separator_3 = new JSeparator();

		JLabel zureGustuakEzagututaLabel;
		zureGustuakEzagututaLabel = new JLabel();
		zureGustuakEzagututaLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		zureGustuakEzagututaLabel.setText("Zure gustuak ezagututa artikulu berriei buruzko informazio zehatzagoa");

		JLabel bidaliDiezazukeguEtaLabel;
		bidaliDiezazukeguEtaLabel = new JLabel();
		bidaliDiezazukeguEtaLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		bidaliDiezazukeguEtaLabel.setText("bidali diezazukegu, eta katalogoan zure gustuko artikuluak lehenago");

		JLabel agertukoDiraEdonolakoLabel;
		agertukoDiraEdonolakoLabel = new JLabel();
		agertukoDiraEdonolakoLabel.setFont(new Font("Sans", Font.ITALIC, 12));
		agertukoDiraEdonolakoLabel.setText("agertuko dira, edonolako eskaintzarik badute.");

		JLabel lehenetsitakoGeneroaLabel;
		lehenetsitakoGeneroaLabel = new JLabel();
		lehenetsitakoGeneroaLabel.setText("Lehenetsitako Generoa:");

		JLabel lehenetsitakoOinaLabel;
		lehenetsitakoOinaLabel = new JLabel();
		lehenetsitakoOinaLabel.setText("Lehenetsitako Oina:");

		JRadioButton emakumeaRadioButton;
		emakumeaRadioButton = new JRadioButton();
		buttonGroupGenero.add(emakumeaRadioButton);
		emakumeaRadioButton.setText("Emakumezkoa");

		JRadioButton gizonezkoaRadioButton;
		gizonezkoaRadioButton = new JRadioButton();
		buttonGroupGenero.add(gizonezkoaRadioButton);
		gizonezkoaRadioButton.setText("Gizonezkoa");

		JRadioButton eskuinOinaRadioButton;
		eskuinOinaRadioButton = new JRadioButton();
		buttonGroupOina.add(eskuinOinaRadioButton);
		eskuinOinaRadioButton.setText("Eskuin Oina");

		JRadioButton ezkerOinaRadioButton;
		ezkerOinaRadioButton = new JRadioButton();
		buttonGroupOina.add(ezkerOinaRadioButton);
		ezkerOinaRadioButton.setText("Ezker Oina");

		JLabel lehenetsitakoNeurriaLabel;
		lehenetsitakoNeurriaLabel = new JLabel();
		lehenetsitakoNeurriaLabel.setText("Lehenetsitako Neurria:");

		oinNeurriaTextField = new JTextField();

		JButton bukatuDenaButton;
		bukatuDenaButton = new JButton();
		bukatuDenaButton.setText("Bukatu");
		final GroupLayout groupLayout_3 = new GroupLayout((JComponent) this);
		groupLayout_3.setHorizontalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_3.createSequentialGroup()
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(groupLayout_3.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(separator_3, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
								.addComponent(izenaEmanArtikulueiLabel)
								.addComponent(zureGustuakEzagututaLabel)
								.addComponent(bidaliDiezazukeguEtaLabel)
								.addComponent(agertukoDiraEdonolakoLabel)
								.addComponent(lehenetsitakoGeneroaLabel)
								.addGroup(groupLayout_3.createSequentialGroup()
									.addGap(12, 12, 12)
									.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(gizonezkoaRadioButton)
										.addComponent(emakumeaRadioButton)))
								.addComponent(lehenetsitakoOinaLabel)
								.addGroup(groupLayout_3.createSequentialGroup()
									.addGap(12, 12, 12)
									.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(ezkerOinaRadioButton)
										.addComponent(eskuinOinaRadioButton)))
								.addGroup(groupLayout_3.createSequentialGroup()
									.addComponent(lehenetsitakoNeurriaLabel)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(oinNeurriaTextField, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout_3.createSequentialGroup()
							.addGap(192, 192, 192)
							.addComponent(bukatuDenaButton)))
					.addContainerGap())
		);
		groupLayout_3.setVerticalGroup(
			groupLayout_3.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(izenaEmanArtikulueiLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(20, 20, 20)
					.addComponent(zureGustuakEzagututaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(bidaliDiezazukeguEtaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(agertukoDiraEdonolakoLabel)
					.addGap(15, 15, 15)
					.addComponent(lehenetsitakoGeneroaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(emakumeaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(gizonezkoaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(lehenetsitakoOinaLabel)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(eskuinOinaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(ezkerOinaRadioButton)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(groupLayout_3.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(lehenetsitakoNeurriaLabel)
						.addComponent(oinNeurriaTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addComponent(bukatuDenaButton)
					.addContainerGap())
		);
		setLayout(groupLayout_3);
		//
	}

}
