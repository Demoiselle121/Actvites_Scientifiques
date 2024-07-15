package metier.entites;

import java.sql.Date;
import java.util.Arrays;





public class Soutenance {
	private int id_soutenance;
    private String type_soutenance ;
    private String  intitule_soutenance ;
    private byte[] justificatif_soutenance;
    private String lieu_soutenance ;
    private int id_chercheur ; 
    private Date date_soutenance;
    private byte[] pdfSout;
    
    public Soutenance() {
		super();
	}

	public Soutenance(int id_soutenance, String type_soutenance, String intitule_soutenance,
			byte[] justificatif_soutenance, String lieu_soutenance, int id_chercheur, Date date_soutenance,
			byte[] pdfSout) {
		super();
		this.id_soutenance = id_soutenance;
		this.type_soutenance = type_soutenance;
		this.intitule_soutenance = intitule_soutenance;
		this.justificatif_soutenance = justificatif_soutenance;
		this.lieu_soutenance = lieu_soutenance;
		this.id_chercheur = id_chercheur;
		this.date_soutenance = date_soutenance;
		this.pdfSout = pdfSout;
	}
	
	public Soutenance( String type_soutenance, String intitule_soutenance,
			byte[] justificatif_soutenance, String lieu_soutenance, int id_chercheur, Date date_soutenance,
			byte[] pdfSout) {
		super();
		
		this.type_soutenance = type_soutenance;
		this.intitule_soutenance = intitule_soutenance;
		this.justificatif_soutenance = justificatif_soutenance;
		this.lieu_soutenance = lieu_soutenance;
		this.id_chercheur = id_chercheur;
		this.date_soutenance = date_soutenance;
		this.pdfSout = pdfSout;
	}

	public int getId_soutenance() {
		return id_soutenance;
	}

	public void setId_soutenance(int id_soutenance) {
		this.id_soutenance = id_soutenance;
	}

	public String getType_soutenance() {
		return type_soutenance;
	}

	public void setType_soutenance(String type_soutenance) {
		this.type_soutenance = type_soutenance;
	}

	public String getIntitule_soutenance() {
		return intitule_soutenance;
	}

	public void setIntitule_soutenance(String intitule_soutenance) {
		this.intitule_soutenance = intitule_soutenance;
	}

	public byte[] getJustificatif_soutenance() {
		return justificatif_soutenance;
	}

	public void setJustificatif_soutenance(byte[] justificatif_soutenance) {
		this.justificatif_soutenance = justificatif_soutenance;
	}

	public String getLieu_soutenance() {
		return lieu_soutenance;
	}

	public void setLieu_soutenance(String lieu_soutenance) {
		this.lieu_soutenance = lieu_soutenance;
	}

	public int getId_chercheur() {
		return id_chercheur;
	}

	public void setId_chercheur(int id_chercheur) {
		this.id_chercheur = id_chercheur;
	}

	public Date getDate_soutenance() {
		return date_soutenance;
	}

	public void setDate_soutenance(Date date_soutenance) {
		this.date_soutenance = date_soutenance;
	}

	public byte[] getPdfSout() {
		return pdfSout;
	}

	public void setPdfSout(byte[] pdfSout) {
		this.pdfSout = pdfSout;
	}

	@Override
	public String toString() {
		return "Soutenance [id_soutenance=" + id_soutenance + ", type_soutenance=" + type_soutenance
				+ ", intitule_soutenance=" + intitule_soutenance + ", justificatif_soutenance="
				+ Arrays.toString(justificatif_soutenance) + ", lieu_soutenance=" + lieu_soutenance + ", id_chercheur="
				+ id_chercheur + ", date_soutenance=" + date_soutenance + ", pdfSout=" + Arrays.toString(pdfSout) + "]";
	}

	
}
