/*
 * package metier.entites;
 * 
 * public class PDFG {
 * 
 * 
 * 
 * private List<Sout> listPub;
 * 
 * public PDFPub(List<Publication> listPub) { super(); this.listPub = listPub; }
 * 
 * public List<Publication> getListPub() { return listPub; }
 * 
 * public void setListPub(List<Publication> listPub) { this.listPub = listPub; }
 * private void writeTableHeader(PdfPTable table) { PdfPCell cell = new
 * PdfPCell(); cell.setBackgroundColor(Color.BLUE); cell.setPadding(5);
 * 
 * com.lowagie.text.Font font = FontFactory.getFont(FontFactory.HELVETICA);
 * font.setColor(Color.WHITE);
 * 
 * 
 * cell.setPhrase(new Phrase("Titre", font));
 * 
 * table.addCell(cell);
 * 
 * 
 * cell.setPhrase(new Phrase("abstract", font)); table.addCell(cell);
 * 
 * cell.setPhrase(new Phrase("type", font)); table.addCell(cell);
 * 
 * cell.setPhrase(new Phrase("Annee", font)); table.addCell(cell);
 * 
 * cell.setPhrase(new Phrase("Nom de l'auteur", font)); table.addCell(cell);
 * 
 * 
 * 
 * 
 * } private void writeTableData(PdfPTable table) { for (Publication user :
 * listPub) { table.addCell(user.getTitre_pub());
 * table.addCell(user.getAbstract_pub());
 * table.addCell(user.getType_publication()); table.addCell(user.getD());
 * table.addCell(chercheur_data_base.getCherchParId(user.getId_chercheur()).
 * getNom_chercheur()); } } public void export(HttpServletResponse response)
 * throws DocumentException, IOException { // Document document = new
 * Document(PageSize.A4); com.lowagie.text.Document d = new
 * com.lowagie.text.Document(PageSize.A4);
 * PdfWriter.getInstance((com.lowagie.text.Document) d,
 * response.getOutputStream());
 * 
 * d.open(); // Font f = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
 * com.lowagie.text.Font f = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
 * f.setSize(18); f.setColor(Color.BLUE);
 * 
 * Paragraph p = new Paragraph("Liste des publications ", f);
 * p.setAlignment(Paragraph.ALIGN_CENTER);
 * 
 * d.add(p);
 * 
 * PdfPTable table = new PdfPTable(5); table.setWidthPercentage(100f);
 * table.setWidths(new float[] {1.5f, 3.5f, 3.0f,3.0f,1.5f});
 * table.setSpacingBefore(10);
 * 
 * writeTableHeader(table); writeTableData(table);
 * 
 * d.add(table);
 * 
 * d.close();
 * 
 * }
 * 
 * 
 * 
 * 
 * } }
 */