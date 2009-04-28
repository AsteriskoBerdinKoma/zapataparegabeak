package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import gkae.zapataparegabeak.objektuak.Kudeaketa;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

public class ErosketaSaskia extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private static ErosketaSaskia instance;
	
	private SpringLayout springLayout;
	private JScrollPane scrollPane;
	private JPanel scrollPanel;
	
	public static ErosketaSaskia getInstance() {
		if (null == instance)
			instance = new ErosketaSaskia();
		return instance;
	}

	private ErosketaSaskia() {
		super();
		setFont(new Font("Sans", Font.PLAIN, 14));
		springLayout = new SpringLayout();
		setLayout(springLayout);
		setSize(577, 422);

		final JLabel erosketaSaskiaLabel = new JLabel();
		erosketaSaskiaLabel.setFont(new Font("Sans", Font.PLAIN, 18));
		erosketaSaskiaLabel.setText("Erosketa Saskia");
		add(erosketaSaskiaLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, erosketaSaskiaLabel, 60, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, erosketaSaskiaLabel, 15, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, erosketaSaskiaLabel, 165, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, erosketaSaskiaLabel, 10, SpringLayout.WEST, this);

		scrollPane = new JScrollPane();
		add(scrollPane);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 405, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 0, SpringLayout.SOUTH, erosketaSaskiaLabel);
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, 550, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 5, SpringLayout.WEST, erosketaSaskiaLabel);

		scrollPanel = new JPanel();
		scrollPane.setViewportView(scrollPanel);

	}
	
	public void edukiakEguneratu(){
		scrollPanel.removeAll();
		//Saskira zeozer gehitu bada
		if (Kudeaketa.getInstance().saskikoZapatak().size()>0)
			for (Zapata i: Kudeaketa.getInstance().saskikoZapatak()){
				ErosketaSaskiaItem esi = new ErosketaSaskiaItem();
				esi.setDatuak(i);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
				scrollPanel.add(esi);
				
			}
	}

	public void edukiakEguneratu(ErosketaSaskiaItem erosketaSaskiaItem) {
		scrollPanel.remove(erosketaSaskiaItem);
		scrollPanel.repaint();
		
	}

}
