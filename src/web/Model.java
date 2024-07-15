package web;

public class Model {
private int cpt ;//compteur
private int cpt_chercheur ;//compteur
private int cpt_equipe ;//compteur
private int cpt_equipe_cher ;
private int getPdfChEq;
private int id_axeR;
private int id_labo;

public int getId_labo() {
	return id_labo;
}

public void setId_labo(int id_labo) {
	this.id_labo = id_labo;
}

public int getId_axeR() {
	return id_axeR;
}

public void setId_axeR(int id_axeR) {
	this.id_axeR = id_axeR;
}

public int getPdfChEq() {
	return getPdfChEq;
}

public void setPdfChEq(int getPdfChEq) {
	this.getPdfChEq = getPdfChEq;
}

public int getCpt() {
	return cpt;
}

public void setCpt(int cpt) {
	this.cpt = cpt;
}

public int getCpt_chercheur() {
	return cpt_chercheur;
}

public void setCpt_chercheur(int cpt_chercheur) {
	this.cpt_chercheur = cpt_chercheur;
}

public int getCpt_equipe() {
	return cpt_equipe;
}

public int getCpt_equipe_cher() {
	return cpt_equipe_cher;
}

public void setCpt_equipe_cher(int cpt_equipe, int cpt_chercheur ) {
	this.cpt_equipe = cpt_equipe;
	this.cpt_chercheur = cpt_chercheur;
}

public void setCpt_equipe(int cpt_equipe) {
	this.cpt_equipe = cpt_equipe;
} 


}
