package fr.uga.projet1.poo;

public class Etudiant {

	enum Status{RECALE, PASSABLE, BIEN, TRES_BIEN};
	
	Status statusEtu;
	String nom, prenom;
	double moyenne;
	
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String nom, String prenom, double d) {
		setNom(nom);
		setPrenom(prenom);
		setMoyenne(d);
 	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double d) {
		this.moyenne = d;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", moyenne=" + moyenne + "]";
	}

	public String getMention() {
		
		if (moyenne < 10)
			return "Recale";
		if (moyenne < 12)
			return "Passable";
		if (moyenne <14)
			return "Bien";
		
	   return ("Tès bien");				
	}

}
