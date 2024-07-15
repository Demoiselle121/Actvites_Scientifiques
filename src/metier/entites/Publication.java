package metier.entites;

import java.sql.Date;
import java.util.Arrays;

public class Publication {
	private int id_pub;
	private String titre_pub ;
	private String abstract_pub ;
	private byte[] justificatif_pub ;
	private String type_publication ;
	private int id_chercheur ;
	private Date date_publication;
	private byte[] pdfPub ;
	private String d ;
	
	
	public Publication() {
		super();
	}


	public int getId_pub() {
		return id_pub;
	}


	public void setId_pub(int id_pub) {
		this.id_pub = id_pub;
	}


	public String getTitre_pub() {
		return titre_pub;
	}


	public void setTitre_pub(String titre_pub) {
		this.titre_pub = titre_pub;
	}


	public String getAbstract_pub() {
		return abstract_pub;
	}


	public void setAbstract_pub(String abstract_pub) {
		this.abstract_pub = abstract_pub;
	}


	public byte[] getJustificatif_pub() {
		return justificatif_pub;
	}


	public void setJustificatif_pub(byte[] justificatif_pub) {
		this.justificatif_pub = justificatif_pub;
	}


	public String getType_publication() {
		return type_publication;
	}


	public void setType_publication(String type_publication) {
		this.type_publication = type_publication;
	}


	public int getId_chercheur() {
		return id_chercheur;
	}


	public void setId_chercheur(int id_chercheur) {
		this.id_chercheur = id_chercheur;
	}


	public Date getDate_publication() {
		return date_publication;
	}


	public void setDate_publication(Date date_publication) {
		this.date_publication = date_publication;
	}


	public byte[] getPdfPub() {
		return pdfPub;
	}


	public void setPdfPub(byte[] pdfPub) {
		this.pdfPub = pdfPub;
	}


	public String getD() {
		return d;
	}


	public void setD(String d) {
		this.d = d;
	}


	public Publication(int id_pub, String titre_pub, String abstract_pub, byte[] justificatif_pub,
			String type_publication, int id_chercheur, Date date_publication, byte[] pdfPub, String d) {
		super();
		this.id_pub = id_pub;
		this.titre_pub = titre_pub;
		this.abstract_pub = abstract_pub;
		this.justificatif_pub = justificatif_pub;
		this.type_publication = type_publication;
		this.id_chercheur = id_chercheur;
		this.date_publication = date_publication;
		this.pdfPub = pdfPub;
		this.d = d;
	}

	public Publication( String titre_pub, String abstract_pub, byte[] justificatif_pub,
			String type_publication, int id_chercheur, Date date_publication, byte[] pdfPub, String d) {
		super();
		
		this.titre_pub = titre_pub;
		this.abstract_pub = abstract_pub;
		this.justificatif_pub = justificatif_pub;
		this.type_publication = type_publication;
		this.id_chercheur = id_chercheur;
		this.date_publication = date_publication;
		this.pdfPub = pdfPub;
		this.d = d;
	}

	public Publication( String titre_pub, String abstract_pub, byte[] justificatif_pub,
			String type_publication, int id_chercheur, Date date_publication, byte[] pdfPub) {
		super();
		
		this.titre_pub = titre_pub;
		this.abstract_pub = abstract_pub;
		this.justificatif_pub = justificatif_pub;
		this.type_publication = type_publication;
		this.id_chercheur = id_chercheur;
		this.date_publication = date_publication;
		this.pdfPub = pdfPub;
	
	}


	@Override
	public String toString() {
		return "Publication [id_pub=" + id_pub + ", titre_pub=" + titre_pub + ", abstract_pub=" + abstract_pub
				+ ", justificatif_pub=" + Arrays.toString(justificatif_pub) + ", type_publication=" + type_publication
				+ ", id_chercheur=" + id_chercheur + ", date_publication=" + date_publication + ", pdfPub="
				+ Arrays.toString(pdfPub) + ", d=" + d + "]";
	}

	

}
	
	