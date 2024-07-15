package metier.entites;

public class Equipe {
	private int id_equipe ;
	private String nom_equipe ;
	private String ACRO_equipe;
	
	private int id_labo;
	private int id_chercheur;
	private String chef_equipe;
	
	public Equipe() {
		super();
	}


	public Equipe(int id_equipe, String nom_equipe, String aCRO_equipe,int id_chercheur, String chef_equipe
			) {
		super();
		this.id_equipe = id_equipe;
		this.nom_equipe = nom_equipe;
		ACRO_equipe = aCRO_equipe;
		this.chef_equipe = chef_equipe;
		this.id_chercheur = id_chercheur;
	}
	
	public Equipe(int id_equipe, String nom_equipe, String aCRO_equipe, int id_labo,
			int id_chercheur, String chef_equipe) {
		super();
		this.id_equipe = id_equipe;
		this.nom_equipe = nom_equipe;
		ACRO_equipe = aCRO_equipe;
		this.chef_equipe = chef_equipe;
		this.id_labo = id_labo;
		this.id_chercheur = id_chercheur;
	}
	public Equipe(int id_equipe, String nom_equipe, String aCRO_equipe, String chef_equipe,
			int id_chercheur) {
		super();
		this.id_equipe = id_equipe;
		this.nom_equipe = nom_equipe;
		ACRO_equipe = aCRO_equipe;
		this.chef_equipe = chef_equipe;
		//this.id_labo = id_labo;
		this.id_chercheur = id_chercheur;
	}

	public Equipe( String nom_equipe, String aCRO_equipe, String chef_equipe,
			int id_chercheur) {
		super();
		
		this.nom_equipe = nom_equipe;
		ACRO_equipe = aCRO_equipe;
		this.chef_equipe = chef_equipe;
		this.id_chercheur = id_chercheur;
	}


	public int getId_equipe() {
		return id_equipe;
	}


	public void setId_equipe(int id_equipe) {
		this.id_equipe = id_equipe;
	}


	public String getNom_equipe() {
		return nom_equipe;
	}


	public void setNom_equipe(String nom_equipe) {
		this.nom_equipe = nom_equipe;
	}


	public String getACRO_equipe() {
		return ACRO_equipe;
	}


	public void setACRO_equipe(String aCRO_equipe) {
		ACRO_equipe = aCRO_equipe;
	}


	public String getChef_equipe() {
		return chef_equipe;
	}


	public void setChef_equipe(String chef_equipe) {
		this.chef_equipe = chef_equipe;
	}


	public int getId_labo() {
		return id_labo;
	}


	public void setId_labo(int id_labo) {
		this.id_labo = id_labo;
	}


	public int getId_chercheur() {
		return id_chercheur;
	}


	public void setId_chercheur(int id_chercheur) {
		this.id_chercheur = id_chercheur;
	}


	@Override
	public String toString() {
		return "Equipe [id_equipe=" + id_equipe + ", nom_equipe=" + nom_equipe + ", ACRO_equipe=" + ACRO_equipe
				+ ", chef_equipe=" + chef_equipe + ", id_labo=" + id_labo + ", id_chercheur=" + id_chercheur + "]";
	}


	

}