package gkae.zapataparegabeak.gui.menuPanelak;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import org.jdesktop.swingx.JXTaskPane;

public class AbisuakMenuPanela extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextArea textArea_3;
	private JTextArea textArea_2;
	private JTextArea fashionZapatakTextArea;
	/**
	 * Create the panel
	 */
	public AbisuakMenuPanela() {
		super();

		JScrollPane scrollPane;
		scrollPane = new JScrollPane();

		final JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);

		JXTaskPane taskPane;
		taskPane = new JXTaskPane();
		taskPane.setTitle("Abisuak");

		textArea_3 = new JTextArea();
		textArea_3.setText("• Marutxi larruzko zapateko stock-erik gabe gelditu gara");
		textArea_3.setWrapStyleWord(true);
		textArea_3.setLineWrap(true);
		textArea_3.setEditable(false);
		textArea_3.setBackground(new Color(238, 238, 238));
		taskPane.add(textArea_3, BorderLayout.WEST);

		textArea_2 = new JTextArea();
		textArea_2.setText("• Gaur Paris Hilton Fashion zapatetako eskaera bat itsiko da");
		textArea_2.setWrapStyleWord(true);
		textArea_2.setLineWrap(true);
		textArea_2.setEditable(false);
		textArea_2.setBackground(new Color(238, 238, 238));
		taskPane.add(textArea_2, BorderLayout.SOUTH);

		fashionZapatakTextArea = new JTextArea();
		fashionZapatakTextArea.setText("• Patxi bezeroaren mezu berri bat iritsi da");
		fashionZapatakTextArea.setWrapStyleWord(true);
		fashionZapatakTextArea.setLineWrap(true);
		fashionZapatakTextArea.setEditable(false);
		fashionZapatakTextArea.setBackground(UIManager.getColor("Button.background"));
		taskPane.add(fashionZapatakTextArea, BorderLayout.NORTH);
		final GroupLayout groupLayout_1 = new GroupLayout((JComponent) panel);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(taskPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(taskPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel.setLayout(groupLayout_1);
		final GroupLayout groupLayout = new GroupLayout((JComponent) this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
		//
	}

}
