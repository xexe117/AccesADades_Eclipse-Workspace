package cat.paucasesnovescifp.spaad.vehicle;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder={"marca", "nom", "CV"})
public class Cotxe {

	//https://howtodoinjava.com/jaxb/jaxb-annotations/
	private String marca, nom;
	int CV;
	
	public String getMarca() {
		return marca;
	}

	@XmlAttribute
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@XmlElement
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getCV() {
		return CV;
	}

	public void setCV(int cV) {
		CV = cV;
	}
	
	
	public Cotxe(){
        this(null, null, 0);
	}
	
	public Cotxe(String marca, String nom, int CV) {
		this.setMarca(marca);
        this.setNom(nom);
        this.setCV(CV);
	}
	
	@Override
	public String toString() {
		return "Cotxe [marca=" + marca + ", nom=" + nom + ", CV=" + CV + "]";
	}
}
