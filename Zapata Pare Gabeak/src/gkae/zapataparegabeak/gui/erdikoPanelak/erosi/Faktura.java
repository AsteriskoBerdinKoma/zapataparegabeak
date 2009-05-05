package gkae.zapataparegabeak.gui.erdikoPanelak.erosi;

import gkae.zapataparegabeak.objektuak.SaskiratutakoZapatak;
import gkae.zapataparegabeak.objektuak.Zapata;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;

public class Faktura extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final URL reportPath = Faktura.class
			.getResource("/gkae/zapataparegabeak/resources/reports/Faktura.jasper");

	private JRViewer viewer;

	/**
	 * Create the panel
	 */
	public Faktura() {
		super();
		try {
			this.setBorder(new TitledBorder(null, "Faktura",
					TitledBorder.DEFAULT_JUSTIFICATION,
					TitledBorder.DEFAULT_POSITION, null, null));
			final FlowLayout flowLayout = new FlowLayout();
			flowLayout.setAlignment(FlowLayout.RIGHT);

			Collection lista = new ArrayList();
			// lista.add();

			JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(
					lista);

			JasperReport jr = (JasperReport) JRLoader.loadObject(reportPath);

			JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap(),
					datasource);

			viewer = new JRViewer(jp);
			final GroupLayout groupLayout = new GroupLayout((JComponent) this);
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
					GroupLayout.Alignment.LEADING).addGroup(
					groupLayout.createSequentialGroup().addContainerGap()
							.addComponent(viewer, GroupLayout.DEFAULT_SIZE,
									464, Short.MAX_VALUE).addContainerGap()));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(
					GroupLayout.Alignment.LEADING).addGroup(
					groupLayout.createSequentialGroup().addContainerGap()
							.addComponent(viewer, GroupLayout.DEFAULT_SIZE,
									323, Short.MAX_VALUE).addContainerGap()));
			setLayout(groupLayout);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// //////////////////////////////////

		String reportName = "faktura";
		JRBeanCollectionDataSource dataSource;
		JasperReport jasperReport;
		JasperPrint jasperPrint;
		Map pars = new HashMap();
		pars.put("LOGO_URL", Faktura.class
				.getResource("/gkae/zapataparegabeak/resources/banner.jpg"));
		pars.put("DENDA_DATUAK", "Zapata Pare Gabeak S.A.");
		pars.put("EROSLE_DATUAK", "Eroslearen datuak");
		pars.put("FAKTURA_ZENB", "0001");

		try {
			DecimalFormat twoDForm = new DecimalFormat("#.##");
			// 1-Llenar el datasource con la informacion de la base de datos o
			// de donde este, en este caso "hardcode"
			Collection<FacturaItem> lista = new ArrayList<FacturaItem>();

			Vector<Zapata> zapatak = SaskiratutakoZapatak.getInstance()
					.getSaskikoZapatak();
			double prezioTotala = 0;
			for (Zapata z : zapatak) {
				int kopurua = SaskiratutakoZapatak.getInstance()
						.getSaskiratutakoKopurua(z);
				double prezioa = z.getPrezioa();
				lista.add(new FacturaItem(new Integer(z.getId()).toString(), z
						.getKategoria()
						+ " "
						+ z.getMarka()
						+ " "
						+ z.getEstiloa()
						+ " "
						+ z.getKolorea()
						+ " "
						+ z.getGeneroa()
						+ " "
						+ z.getNeurria() + " " + z.getOina(), new Integer(
						kopurua).toString(), twoDForm.format(prezioa),
						twoDForm.format(prezioa * kopurua)));
				prezioTotala += prezioa;
			}
			
			double garraioKostuak = 10;
			double zergaOinarri = prezioTotala + garraioKostuak;
			pars.put("ZENB_GORD", twoDForm.format(prezioTotala));
			pars.put("GARRAIO_KOST", twoDForm.format(garraioKostuak));
			pars.put("ZERGA_OINARRI", twoDForm.format(zergaOinarri));
			pars.put("BEZ", twoDForm.format(zergaOinarri * 0.16));
			pars.put("TOTALA", twoDForm.format(zergaOinarri * 1.16));
			
			dataSource = new JRBeanCollectionDataSource(lista);

			// 2-Compilamos el archivo XML y lo cargamos en memoria
			jasperReport = JasperCompileManager.compileReport(reportName
					+ ".jrxml");

			// 3-Llenamos el reporte con la información de la coleccion y
			// parámetros necesarios para la consulta
			jasperPrint = JasperFillManager.fillReport(jasperReport, pars,
					dataSource);

			// 4-Exportamos el reporte a pdf y lo guardamos en disco
			JasperExportManager.exportReportToPdfFile(jasperPrint, reportName
					+ ".pdf");

			System.out.println("Done!");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	private class FacturaItem {

		private String kodea;
		private String deskribapena;
		private String kopurua;
		private String prezioa;
		private String zenbatekoa;

		public FacturaItem() {
		}

		public FacturaItem(String kodea, String deskribapena, String kopurua,
				String prezioa, String zenbatekoa) {
			super();
			this.deskribapena = deskribapena;
			this.kopurua = kopurua;
			this.prezioa = prezioa;
			this.zenbatekoa = zenbatekoa;
		}

		public String getKodea() {
			return kodea;
		}

		public void setKodea(String kodea) {
			this.kodea = kodea;
		}

		public String getDeskribapena() {
			return deskribapena;
		}

		public void setDeskribapena(String deskribapena) {
			this.deskribapena = deskribapena;
		}

		public String getKopurua() {
			return kopurua;
		}

		public void setKopurua(String kopurua) {
			this.kopurua = kopurua;
		}

		public String getPrezioa() {
			return prezioa;
		}

		public void setPrezioa(String prezioa) {
			this.prezioa = prezioa;
		}

		public String getZenbatekoa() {
			return zenbatekoa;
		}

		public void setZenbatekoa(String zenbatekoa) {
			this.zenbatekoa = zenbatekoa;
		}

	}

}
