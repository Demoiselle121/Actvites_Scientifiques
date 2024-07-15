package metier.entites;

import java.sql.Date;
import java.util.Arrays;

public class Encadrement {
	private int id_encadrement ;
	private String type_encadrement ; 
	private String intitule_encadrement;
	private String niveau_encadrement ;
	byte[] justificatif ;
	byte[] pdfEncadre ;
    private int id_chercheur;
    Date date_encadrement;
    private String encadrement ;
    
    public Encadrement() {
		super();	
	}

	public int getId_encadrement() {
		return id_encadrement;
	}

	public void setId_encadrement(int id_encadrement) {
		this.id_encadrement = id_encadrement;
	}

	public String getType_encadrement() {
		return type_encadrement;
	}

	public void setType_encadrement(String type_encadrement) {
		this.type_encadrement = type_encadrement;
	}

	public String getIntitule_encadrement() {
		return intitule_encadrement;
	}

	public void setIntitule_encadrement(String intitule_encadrement) {
		this.intitule_encadrement = intitule_encadrement;
	}

	public String getNiveau_encadrement() {
		return niveau_encadrement;
	}

	public void setNiveau_encadrement(String niveau_encadrement) {
		this.niveau_encadrement = niveau_encadrement;
	}

	public byte[] getJustificatif() {
		return justificatif;
	}

	public void setJustificatif(byte[] justificatif) {
		this.justificatif = justificatif;
	}

	public byte[] getPdfEncadre() {
		return pdfEncadre;
	}

	public void setPdfEncadre(byte[] pdfEncadre) {
		this.pdfEncadre = pdfEncadre;
	}

	public int getId_chercheur() {
		return id_chercheur;
	}

	public void setId_chercheur(int id_chercheur) {
		this.id_chercheur = id_chercheur;
	}

	public Date getDate_encadrement() {
		return date_encadrement;
	}

	public void setDate_encadrement(Date date_encadrement) {
		this.date_encadrement = date_encadrement;
	}

	public String getEncadrement() {
		return encadrement;
	}

	public void setEncadrement(String encadrement) {
		this.encadrement = encadrement;
	}

	public Encadrement(int id_encadrement, String type_encadrement, String intitule_encadrement,
			String niveau_encadrement, byte[] justificatif, byte[] pdfEncadre, int id_chercheur, Date date_encadrement,
			String encadrement) {
		super();
		this.id_encadrement = id_encadrement;
		this.type_encadrement = type_encadrement;
		this.intitule_encadrement = intitule_encadrement;
		this.niveau_encadrement = niveau_encadrement;
		this.justificatif = justificatif;
		this.pdfEncadre = pdfEncadre;
		this.id_chercheur = id_chercheur;
		this.date_encadrement = date_encadrement;
		this.encadrement = encadrement;
	}

	public Encadrement( String type_encadrement, String intitule_encadrement,
			String niveau_encadrement, byte[] justificatif, byte[] pdfEncadre, int id_chercheur, Date date_encadrement,
			String encadrement) {
		super();
				this.type_encadrement = type_encadrement;
		this.intitule_encadrement = intitule_encadrement;
		this.niveau_encadrement = niveau_encadrement;
		this.justificatif = justificatif;
		this.pdfEncadre = pdfEncadre;
		this.id_chercheur = id_chercheur;
		this.date_encadrement = date_encadrement;
		this.encadrement = encadrement;
	}

	@Override
	public String toString() {
		return "Encadrement [id_encadrement=" + id_encadrement + ", type_encadrement=" + type_encadrement
				+ ", intitule_encadrement=" + intitule_encadrement + ", niveau_encadrement=" + niveau_encadrement
				+ ", justificatif=" + Arrays.toString(justificatif) + ", pdfEncadre=" + Arrays.toString(pdfEncadre)
				+ ", id_chercheur=" + id_chercheur + ", date_encadrement=" + date_encadrement + ", encadrement="
				+ encadrement + "]";
	}

	
}
