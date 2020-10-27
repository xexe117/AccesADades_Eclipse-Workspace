package cat.paucasesnovescifp.spaad.porcessat;

import cat.paucasesnovescifp.spaad.Main;
import cat.paucasesnovescifp.spaad.vehicle.Cotxe;
import cat.paucasesnovescifp.spaad.vehicle.Aparcament;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileWriter;
import java.io.IOException;

public final class Processador {
	public static Cotxe llegeixVehicle(String origen) throws JAXBException {
		JAXBContext context; 
		context = JAXBContext.newInstance(Cotxe.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Cotxe) unmarshaller.unmarshal(Main.class.getResourceAsStream(origen));
	}
	
	public static void escriuVehicle(String desti, Cotxe cotxe) throws IOException, JAXBException {
		try (FileWriter fw = new FileWriter(desti)) {
			JAXBContext context = JAXBContext.newInstance(Cotxe.class);
	        Marshaller marshaller = context.createMarshaller();
	        marshaller.marshal(cotxe, fw);
	      }
	 }
	 
	public static Aparcament llegeixAparcament(String origen) throws JAXBException {
        JAXBContext context;
        context = JAXBContext.newInstance(Aparcament.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (Aparcament) unmarshaller.unmarshal(Main.class.getResourceAsStream(origen));
    }
	
	public static void escriuAparcament(String desti, Aparcament aparcament) throws IOException, JAXBException {
        try (FileWriter fw = new FileWriter(desti)) {
            JAXBContext context = JAXBContext.newInstance(Aparcament.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(aparcament, fw);
        }
	}
}
