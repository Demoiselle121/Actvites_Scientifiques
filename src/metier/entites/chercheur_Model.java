package metier.entites;

import java.util.Arrays;

public class chercheur_Model {
	private int id_chercheur ;
    private String  nom_chercheur ;
    private String prenom_chercheur ;

    private String mdp;
    private String type_chercheur ;
	private String email_chercheur;
    private int tel_chercheur ;
    private byte[] photo_chercheur ;
    private String responsablite_chercheur;
    private String responsabilite_pedagogique_chercheur;
    private int id_equipe;
    private int id_labo;
   
    
    public chercheur_Model() {
		super();
	}


	public chercheur_Model(int id_chercheur, String nom_chercheur, String prenom_chercheur,
			String mdp, String type_chercheur, String email_chercheur, int tel_chercheur, byte[] photo_chercheur,
			String responsablite_chercheur, String responsabilite_pedagogique_chercheur, int id_equipe, int id_labo) {
		super();
		this.id_chercheur = id_chercheur;
		this.nom_chercheur = nom_chercheur;
		this.prenom_chercheur = prenom_chercheur;
	
		this.mdp = mdp;
		this.type_chercheur = type_chercheur;
		this.email_chercheur = email_chercheur;
		this.tel_chercheur = tel_chercheur;
		this.photo_chercheur = photo_chercheur;
		this.responsablite_chercheur = responsablite_chercheur;
		this.responsabilite_pedagogique_chercheur = responsabilite_pedagogique_chercheur;
		this.id_equipe = id_equipe;
		this.id_labo = id_labo;
	}
	public chercheur_Model(int id_chercheur, String nom_chercheur, String prenom_chercheur,
			String mdp, String type_chercheur, String email_chercheur, int tel_chercheur,
			String responsablite_chercheur, String responsabilite_pedagogique_chercheur, int id_equipe, int id_labo) {
		super();
		this.id_chercheur = id_chercheur;
		this.nom_chercheur = nom_chercheur;
		this.prenom_chercheur = prenom_chercheur;
	
		this.mdp = mdp;
		this.type_chercheur = type_chercheur;
		this.email_chercheur = email_chercheur;
		this.tel_chercheur = tel_chercheur;
		
		this.responsablite_chercheur = responsablite_chercheur;
		this.responsabilite_pedagogique_chercheur = responsabilite_pedagogique_chercheur;
		this.id_equipe = id_equipe;
		this.id_labo = id_labo;
	}

	public chercheur_Model( String nom_chercheur, String prenom_chercheur,
			String mdp, String type_chercheur, String email_chercheur, int tel_chercheur, byte[] photo_chercheur,
			String responsablite_chercheur, String responsabilite_pedagogique_chercheur, int id_equipe, int id_labo) {
		super();
	
		this.nom_chercheur = nom_chercheur;
		this.prenom_chercheur = prenom_chercheur;
	
		this.mdp = mdp;
		this.type_chercheur = type_chercheur;
		this.email_chercheur = email_chercheur;
		this.tel_chercheur = tel_chercheur;
		this.photo_chercheur = photo_chercheur;
		this.responsablite_chercheur = responsablite_chercheur;
		this.responsabilite_pedagogique_chercheur = responsabilite_pedagogique_chercheur;
		this.id_equipe = id_equipe;
		this.id_labo = id_labo;
	}
	
	public chercheur_Model( String nom_chercheur, String prenom_chercheur,
			String mdp, String type_chercheur, String email_chercheur, int tel_chercheur, byte[] photo_chercheur,
			String responsablite_chercheur, String responsabilite_pedagogique_chercheur) {
		super();
	
		this.nom_chercheur = nom_chercheur;
		this.prenom_chercheur = prenom_chercheur;
	
		this.mdp = mdp;
		this.type_chercheur = type_chercheur;
		this.email_chercheur = email_chercheur;
		this.tel_chercheur = tel_chercheur;
		this.photo_chercheur = photo_chercheur;
		this.responsablite_chercheur = responsablite_chercheur;
		this.responsabilite_pedagogique_chercheur = responsabilite_pedagogique_chercheur;
		
	}


	


	public int getId_chercheur() {
		return id_chercheur;
	}


	public void setId_chercheur(int id_chercheur) {
		this.id_chercheur = id_chercheur;
	}


	public String getNom_chercheur() {
		return nom_chercheur;
	}


	public void setNom_chercheur(String nom_chercheur) {
		this.nom_chercheur = nom_chercheur;
	}


	public String getPrenom_chercheur() {
		return prenom_chercheur;
	}


	public void setPrenom_chercheur(String prenom_chercheur) {
		this.prenom_chercheur = prenom_chercheur;
	}


	


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public String getType_chercheur() {
		return type_chercheur;
	}


	public void setType_chercheur(String type_chercheur) {
		this.type_chercheur = type_chercheur;
	}


	public String getEmail_chercheur() {
		return email_chercheur;
	}


	public void setEmail_chercheur(String email_chercheur) {
		this.email_chercheur = email_chercheur;
	}


	public int getTel_chercheur() {
		return tel_chercheur;
	}


	public void setTel_chercheur(int tel_chercheur) {
		this.tel_chercheur = tel_chercheur;
	}


	public byte[] getPhoto_chercheur() {
		return photo_chercheur;
	}


	public void setPhoto_chercheur(byte[] photo_chercheur) {
		this.photo_chercheur = photo_chercheur;
	}


	public String getResponsablite_chercheur() {
		return responsablite_chercheur;
	}


	public void setResponsablite_chercheur(String responsablite_chercheur) {
		this.responsablite_chercheur = responsablite_chercheur;
	}


	public String getResponsabilite_pedagogique_chercheur() {
		return responsabilite_pedagogique_chercheur;
	}


	public void setResponsabilite_pedagogique_chercheur(String responsabilite_pedagogique_chercheur) {
		this.responsabilite_pedagogique_chercheur = responsabilite_pedagogique_chercheur;
	}


	public int getId_equipe() {
		return id_equipe;
	}


	public void setId_equipe(int id_equipe) {
		this.id_equipe = id_equipe;
	}


	public int getId_labo() {
		return id_labo;
	}


	public void setId_labo(int id_labo) {
		this.id_labo = id_labo;
	}


	@Override
	public String toString() {
		return "chercheur_Model [id_chercheur=" + id_chercheur + ", nom_chercheur=" + nom_chercheur
				+ ", prenom_chercheur=" + prenom_chercheur + ", mdp=" + mdp + ", type_chercheur=" + type_chercheur
				+ ", email_chercheur=" + email_chercheur + ", tel_chercheur=" + tel_chercheur + ", photo_chercheur="
				+ Arrays.toString(photo_chercheur) + ", responsablite_chercheur=" + responsablite_chercheur
				+ ", responsabilite_pedagogique_chercheur=" + responsabilite_pedagogique_chercheur + ", id_equipe="
				+ id_equipe + ", id_labo=" + id_labo + "]";
	}


	
	

	
}