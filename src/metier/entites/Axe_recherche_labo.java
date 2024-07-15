package metier.entites;

public class Axe_recherche_labo {
	private int id_labo;
	private int id_axe;
	public Axe_recherche_labo(int id_labo, int id_axe) {
		super();
		this.id_labo = id_labo;
		this.id_axe = id_axe;
	}
	
	public Axe_recherche_labo( int id_axe) {
		super();
		this.id_axe = id_axe;
	}

	public int getId_labo() {
		return id_labo;
	}

	public void setId_labo(int id_labo) {
		this.id_labo = id_labo;
	}

	public int getId_axe() {
		return id_axe;
	}

	public void setId_axe(int id_axe) {
		this.id_axe = id_axe;
	}

	@Override
	public String toString() {
		return "Axe_recherche_labo [id_labo=" + id_labo + ", id_axe=" + id_axe + "]";
	}
	
	
	
}
