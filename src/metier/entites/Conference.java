package metier.entites;

import java.sql.Date;
import java.util.Arrays;

import com.mysql.cj.jdbc.Blob;

public class Conference {
	private int id_conference  ;
    private String  type_conference ;
    private String intitule_conference ;
    private byte[] justificatif_conference ; 
    
    private String lieu_conference ;
    private int id_chercheur  ;
    private Date date_conference;
    private byte[] pdfConf ; 

    public Conference() {
		super();
	}

	public Conference(int id_conference, String type_conference, String intitule_conference,
			byte[] justificatif_conference, String lieu_conference, int id_chercheur, Date date_conference,
			byte[] pdfConf) {
		super();
		this.id_conference = id_conference;
		this.type_conference = type_conference;
		this.intitule_conference = intitule_conference;
		this.justificatif_conference = justificatif_conference;
		this.lieu_conference = lieu_conference;
		this.id_chercheur = id_chercheur;
		this.date_conference = date_conference;
		this.pdfConf = pdfConf;
	}

	
	public Conference( String type_conference, String intitule_conference,
			byte[] justificatif_conference, String lieu_conference, int id_chercheur, Date date_conference,
			byte[] pdfConf) {
		super();
		
		this.type_conference = type_conference;
		this.intitule_conference = intitule_conference;
		this.justificatif_conference = justificatif_conference;
		this.lieu_conference = lieu_conference;
		this.id_chercheur = id_chercheur;
		this.date_conference = date_conference;
		this.pdfConf = pdfConf;
	}

	public int getId_conference() {
		return id_conference;
	}

	public void setId_conference(int id_conference) {
		this.id_conference = id_conference;
	}

	public String getType_conference() {
		return type_conference;
	}

	public void setType_conference(String type_conference) {
		this.type_conference = type_conference;
	}

	public String getIntitule_conference() {
		return intitule_conference;
	}

	public void setIntitule_conference(String intitule_conference) {
		this.intitule_conference = intitule_conference;
	}

	public byte[] getJustificatif_conference() {
		return justificatif_conference;
	}

	public void setJustificatif_conference(byte[] justificatif_conference) {
		this.justificatif_conference = justificatif_conference;
	}

	public String getLieu_conference() {
		return lieu_conference;
	}

	public void setLieu_conference(String lieu_conference) {
		this.lieu_conference = lieu_conference;
	}

	public int getId_chercheur() {
		return id_chercheur;
	}

	public void setId_chercheur(int id_chercheur) {
		this.id_chercheur = id_chercheur;
	}

	public Date getDate_conference() {
		return date_conference;
	}

	public void setDate_conference(Date date_conference) {
		this.date_conference = date_conference;
	}

	public byte[] getPdfConf() {
		return pdfConf;
	}

	public void setPdfConf(byte[] pdfConf) {
		this.pdfConf = pdfConf;
	}

	@Override
	public String toString() {
		return "Conference [id_conference=" + id_conference + ", type_conference=" + type_conference
				+ ", intitule_conference=" + intitule_conference + ", justificatif_conference="
				+ Arrays.toString(justificatif_conference) + ", lieu_conference=" + lieu_conference + ", id_chercheur="
				+ id_chercheur + ", date_conference=" + date_conference + ", pdfConf=" + Arrays.toString(pdfConf) + "]";
	}
	
	



}
