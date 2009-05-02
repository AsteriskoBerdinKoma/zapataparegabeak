package gkae.zapataparegabeak.gui.erdikoPanelak.dendariarekinHarremanetanJarri;

import java.awt.CardLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle;

public class HarremanetanJarriPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private final MezuaIdatziPanela mezuaIdatziPanela;
	
	/**
	 * Create the panel
	 */
	public HarremanetanJarriPanela() {
		super();

		JLabel harremanetanJarriLabel;
		harremanetanJarriLabel = new JLabel();
		harremanetanJarriLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		harremanetanJarriLabel.setText("Harremanetan Jarri");

		JSeparator separator;
		separator = new JSeparator();

		panel = new JPanel();
		panel.setLayout(new CardLayout());

		mezuaIdatziPanela = new MezuaIdatziPanela(this);
		mezuaIdatziPanela.setName("mezuaIdatziPanela");
		panel.add(mezuaIdatziPanela, mezuaIdatziPanela.getName());

		final ItxaronPanela itxaronPanela = new ItxaronPanela();
		itxaronPanela.setName("itxaronPanela");
		panel.add(itxaronPanela, itxaronPanela.getName());

		final MezuaBidalitaPanel mezuaBidalitaPanel = new MezuaBidalitaPanel();
		mezuaBidalitaPanel.setName("mezuaBidalitaPanel");
		panel.add(mezuaBidalitaPanel, mezuaBidalitaPanel.getName());
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(panel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
						.addComponent(harremanetanJarriLabel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(harremanetanJarriLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

	public void mezuaBidali() {
		MezuaBidali mb = new MezuaBidali();
		mb.start();
	}
	
	class MezuaBidali extends Thread{
		
		@Override
		public void run() {
			try {
				((CardLayout)panel.getLayout()).show(panel, "itxaronPanela");
				sleep(5000);
				((CardLayout)panel.getLayout()).show(panel, "mezuaBidalitaPanel");
				sleep(15000);
				mezuaIdatziPanela.garbitu();
				((CardLayout)panel.getLayout()).show(panel, "mezuaIdatziPanela");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
