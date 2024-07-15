package metier.entites;

public class Labo {
	private int id_labo ;
	private String nom_labo;
	
	public Labo() {
		super();
	}
	public Labo( String nom_labo) {
		super();
		this.nom_labo = nom_labo;
	}
	public Labo(int id_labo, String nom_labo) {
		super();
		this.id_labo = id_labo;
		this.nom_labo = nom_labo;
	}

	public int getId_labo() {
		return id_labo;
	}

	public void setId_labo(int id_labo) {
		this.id_labo = id_labo;
	}

	public String getNom_labo() {
		return nom_labo;
	}

	public void setNom_labo(String nom_labo) {
		this.nom_labo = nom_labo;
	}
	@Override
	public String toString() {
		return "Labo [id_labo=" + id_labo + ", nom_labo=" + nom_labo + "]";
	}

}
