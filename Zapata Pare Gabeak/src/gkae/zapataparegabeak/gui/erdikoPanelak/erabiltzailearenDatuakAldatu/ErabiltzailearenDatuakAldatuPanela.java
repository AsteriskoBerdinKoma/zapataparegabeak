package gkae.zapataparegabeak.gui.erdikoPanelak.erabiltzailearenDatuakAldatu;

import gkae.zapataparegabeak.gui.NagusiaPanel;

import java.awt.Component;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import org.jdesktop.swingx.JXBusyLabel;

public class ErabiltzailearenDatuakAldatuPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JXBusyLabel datuakAldatzenBusyLabel;
	private DatuakAldatuPanela datuakAldatuPanela;
	
	private AldaketakGorde ag;
	
	//Gurasoaren erreferentzia pantailaz aldatzeko
	//private NagusiaPanel jabea;
	
	/**
	 * Create the panel
	 * @param nagusiaPanel 
	 */
	public ErabiltzailearenDatuakAldatuPanela(NagusiaPanel nagusiaPanel) {
		super();
		//this.jabea = nagusiaPanel;

		ag = new AldaketakGorde();
		
		JSeparator separator;
		separator = new JSeparator();

		JLabel harremanetanJarriLabel;
		harremanetanJarriLabel = new JLabel();
		harremanetanJarriLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		harremanetanJarriLabel.setText("Datuak Aldatu");

		datuakAldatzenBusyLabel = new JXBusyLabel();
		datuakAldatzenBusyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		datuakAldatzenBusyLabel.setText("Datuak Aldatzen");
		datuakAldatzenBusyLabel.setVisible(false);

		datuakAldatuPanela = new DatuakAldatuPanela(this);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(datuakAldatuPanela, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
						.addComponent(harremanetanJarriLabel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
						.addComponent(datuakAldatzenBusyLabel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
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
					.addComponent(datuakAldatzenBusyLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(datuakAldatuPanela, GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
					.addContainerGap())
		);
		setLayout(groupLayout);
		//
	}

	public void aldaketakGorde() {
		ag.interrupt();
		ag = new AldaketakGorde();
		ag.start();
	}

	class AldaketakGorde extends Thread{
		
		@Override
		public void run() {
			try {
				Component[] com = datuakAldatuPanela.getComponents();
				datuakAldatzenBusyLabel.setBusy(true);
				datuakAldatzenBusyLabel.setVisible(true);
				setEnableComponents(com, false);
				sleep(3000);
				datuakAldatzenBusyLabel.setText("Datuak ondo aldatu dira");
				datuakAldatzenBusyLabel.setBusy(false);
				setEnableComponents(com, true);
				sleep(5000);
				datuakAldatzenBusyLabel.setVisible(false);
			} catch (InterruptedException e) {
				datuakAldatuPanela.setEnabled(true);
			}
		}
		
		private void setEnableComponents(Component[] com, boolean enable){
			for (int a = 0; a < com.length; a++) {
			     com[a].setEnabled(enable);
			     if(com[a] instanceof JTabbedPane){
			    	 setEnableComponents(((JTabbedPane)com[a]).getComponents(), enable);
			     } else if(com[a] instanceof JPanel){
			    	 setEnableComponents(((JPanel)com[a]).getComponents(), enable);
			     }
			}
		}
	}
}
