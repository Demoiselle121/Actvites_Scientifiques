package metier.entites;

public class Axe_recherche_equipe {
	private int id_axe;
	private int id_equipe;
	
	public Axe_recherche_equipe(int id_axe, int id_equipe) {
		super();
		this.id_axe = id_axe;
		this.id_equipe = id_equipe;
	}
	
	public Axe_recherche_equipe( int id_equipe) {
		super();
		this.id_equipe = id_equipe;
	}

	public Axe_recherche_equipe() {
		super();
	}

	public int getId_axe() {
		return id_axe;
	}

	public void setId_axe(int id_axe) {
		this.id_axe = id_axe;
	}

	public int getid_equipe() {
		return id_equipe;
	}

	public void setid_equipe(int id_equipe) {
		this.id_equipe = id_equipe;
	}

	@Override
	public String toString() {
		return "Axe_recherche_equipe [id_axe=" + id_axe + ", id_equipe=" + id_equipe + "]";
	}
	
	
	
	
}
