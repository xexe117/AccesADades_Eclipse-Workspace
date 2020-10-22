package cat.paucasesnovescifp.spaad.vehicle;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder={"marca", "nom", "CV"})
public class Cotxe {

	//https://howtodoinjava.com/jaxb/jaxb-annotations/
	private String marca, nom, CV;
	
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
	
	public String getCV() {
		return CV;
	}
	
	@XmlElement
	public void setCV(String cV) {
		CV = cV;
	}
	
	
	public Cotxe(){
		
	}
	
	public Cotxe(String marca, String nom, String CV) {

	}
	
	@Override
	public String toString() {
		return "Cotxe [marca=" + marca + ", nom=" + nom + ", CV=" + CV + "]";
	}
}
