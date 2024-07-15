package metier.entites;

public class Axe_recherche {
	private int id_axe;
	private String nom_axe ;
	public Axe_recherche(int id_axe, String nom_axe) {
		super();
		this.id_axe = id_axe;
		this.nom_axe = nom_axe;
	}
	public Axe_recherche( String nom_axe) {
		super();
		
		this.nom_axe = nom_axe;
	}
	public Axe_recherche() {
		super();
	}
	public int getId_axe() {
		return id_axe;
	}
	public void setId_axe(int id_axe) {
		this.id_axe = id_axe;
	}
	public String getNom_axe() {
		return nom_axe;
	}
	public void setNom_axe(String nom_axe) {
		this.nom_axe = nom_axe;
	}
	@Override
	public String toString() {
		return "Axe_recherche [id_axe=" + id_axe + ", nom_axe=" + nom_axe + "]";
	}
	
	
	
	
	
}
