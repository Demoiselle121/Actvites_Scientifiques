package metier.entites;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;



public class PDFChercheur {


	private List<chercheur_Model> listChercheur;

	public PDFChercheur(List<chercheur_Model> listChercheur) {
		super();
		this.listChercheur = listChercheur;
	}

	public List<chercheur_Model> getListChercheur() {
		return listChercheur;
	}

	public void setListChercheur(List<chercheur_Model> listChercheur) {
		this.listChercheur = listChercheur;
	}
	private void writeTableHeader1(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(5);
         
        com.lowagie.text.Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);
         
        cell.setPhrase(new Phrase("Nom", font));
         
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Prenom", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Email", font));
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Profile", font));
        table.addCell(cell);      
    }
	private void writeTableData1(PdfPTable table) {
        for (chercheur_Model user : listChercheur) {
            table.addCell(user.getNom_chercheur());
            table.addCell(user.getPrenom_chercheur());
            table.addCell(user.getEmail_chercheur());
            table.addCell(user.getType_chercheur());
        }
    }
	private void writeTableHeader2(PdfPTable table) {
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(Color.BLUE);
        cell.setPadding(5);
         
        com.lowagie.text.Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(Color.WHITE);
         
        cell.setPhrase(new Phrase("Nom", font));
         
        table.addCell(cell);
         
        cell.setPhrase(new Phrase("Prenom", font));
        table.addCell(cell);
         
          
    }
	private void writeTableData2(PdfPTable table) {
        for (chercheur_Model user : listChercheur) {
            table.addCell(user.getNom_chercheur());
            table.addCell(user.getPrenom_chercheur());
            
        }
    }
	public void export1(HttpServletResponse response) throws DocumentException, IOException {
      //  Document document = new Document(PageSize.A4);
        com.lowagie.text.Document d = new com.lowagie.text.Document(PageSize.A4);
        PdfWriter.getInstance((com.lowagie.text.Document) d, response.getOutputStream());
         
        d.open();
       // Font f = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        com.lowagie.text.Font f = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        f.setSize(18);
        f.setColor(Color.BLUE);
         
        Paragraph p = new Paragraph("Liste des chercheurs ", f);
        p.setAlignment(Paragraph.ALIGN_CENTER);
         
        d.add(p);
         
        PdfPTable table = new PdfPTable(4);
        table.setWidthPercentage(100f);
        table.setWidths(new float[] {1.5f, 3.5f, 3.0f, 3.0f});
        table.setSpacingBefore(10);
         
        writeTableHeader1(table);
        writeTableData1(table);
         
        d.add(table);
         
        d.close();
         
    }
	public void export2(HttpServletResponse response) throws DocumentException, IOException {
	      //  Document document = new Document(PageSize.A4);
	        com.lowagie.text.Document d = new com.lowagie.text.Document(PageSize.A4);
	        PdfWriter.getInstance((com.lowagie.text.Document) d, response.getOutputStream());
	         
	        d.open();
	       // Font f = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
	        com.lowagie.text.Font f = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
	        f.setSize(18);
	        f.setColor(Color.BLUE);
	         
	        Paragraph p = new Paragraph("Liste des chercheurs ", f);
	        p.setAlignment(Paragraph.ALIGN_CENTER);
	         
	        d.add(p);
	         
	        PdfPTable table = new PdfPTable(2);
	        table.setWidthPercentage(100f);
	        table.setWidths(new float[] { 3.5f, 3.0f});
	        table.setSpacingBefore(10);
	         
	        writeTableHeader2(table);
	        writeTableData2(table);
	         
	        d.add(table);
	         
	        d.close();
	         
	    }
	
	
	

}