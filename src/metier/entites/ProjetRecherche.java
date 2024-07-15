package metier.entites;

import java.util.Arrays;

public class ProjetRecherche {
	private int id_projet_recherche  ;
	private String titre_projet_recherch ;
	private String  description_projet_recherche ;
	private double budget_projet_recherche ;
	private byte[] justificatif_projet_recherche ;
	private byte[] pdfProjet ;
	private int id_chercheur;
	
	public ProjetRecherche() {
		super();
	}

	public ProjetRecherche(int id_projet_recherche, String titre_projet_recherch, String description_projet_recherche,
			double budget_projet_recherche, byte[] justificatif_projet_recherche, byte[] pdfProjet, int id_chercheur) {
		super();
		this.id_projet_recherche = id_projet_recherche;
		this.titre_projet_recherch = titre_projet_recherch;
		this.description_projet_recherche = description_projet_recherche;
		this.budget_projet_recherche = budget_projet_recherche;
		this.justificatif_projet_recherche = justificatif_projet_recherche;
		this.pdfProjet = pdfProjet;
		this.id_chercheur = id_chercheur;
	}
	
	public ProjetRecherche( String titre_projet_recherch, String description_projet_recherche,
			double budget_projet_recherche, byte[] justificatif_projet_recherche, byte[] pdfProjet, int id_chercheur) {
		super();
		
		this.titre_projet_recherch = titre_projet_recherch;
		this.description_projet_recherche = description_projet_recherche;
		this.budget_projet_recherche = budget_projet_recherche;
		this.justificatif_projet_recherche = justificatif_projet_recherche;
		this.pdfProjet = pdfProjet;
		this.id_chercheur = id_chercheur;
	}

	public int getId_projet_recherche() {
		return id_projet_recherche;
	}

	public void setId_projet_recherche(int id_projet_recherche) {
		this.id_projet_recherche = id_projet_recherche;
	}

	public String getTitre_projet_recherch() {
		return titre_projet_recherch;
	}

	public void setTitre_projet_recherch(String titre_projet_recherch) {
		this.titre_projet_recherch = titre_projet_recherch;
	}

	public String getDescription_projet_recherche() {
		return description_projet_recherche;
	}

	public void setDescription_projet_recherche(String description_projet_recherche) {
		this.description_projet_recherche = description_projet_recherche;
	}

	public double getBudget_projet_recherche() {
		return budget_projet_recherche;
	}

	public void setBudget_projet_recherche(double budget_projet_recherche) {
		this.budget_projet_recherche = budget_projet_recherche;
	}

	public byte[] getJustificatif_projet_recherche() {
		return justificatif_projet_recherche;
	}

	public void setJustificatif_projet_recherche(byte[] justificatif_projet_recherche) {
		this.justificatif_projet_recherche = justificatif_projet_recherche;
	}

	public byte[] getPdfProjet() {
		return pdfProjet;
	}

	public void setPdfProjet(byte[] pdfProjet) {
		this.pdfProjet = pdfProjet;
	}

	public int getId_chercheur() {
		return id_chercheur;
	}

	public void setId_chercheur(int id_chercheur) {
		this.id_chercheur = id_chercheur;
	}

	@Override
	public String toString() {
		return "ProjetRecherche [id_projet_recherche=" + id_projet_recherche + ", titre_projet_recherch="
				+ titre_projet_recherch + ", description_projet_recherche=" + description_projet_recherche
				+ ", budget_projet_recherche=" + budget_projet_recherche + ", justificatif_projet_recherche="
				+ Arrays.toString(justificatif_projet_recherche) + ", pdfProjet=" + Arrays.toString(pdfProjet)
				+ ", id_chercheur=" + id_chercheur + "]";
	}

	
}
