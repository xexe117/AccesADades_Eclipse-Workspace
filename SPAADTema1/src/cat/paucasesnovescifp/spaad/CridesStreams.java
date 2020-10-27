package cat.paucasesnovescifp.spaad;

import java.io.*;
import java.util.ArrayList;

public class CridesStreams {
	private final String desti;
    private final String informacio;	
    
	public static void main(String[] args){
		CridesStreams test = new CridesStreams ("C:/Users/Alumne/eclipse-workspace/SPAADTema1", "Els Ocells.txt");
		
		//test.escriuByte();
	}
	
	public CridesStreams(String desti, String informacio) {
        this.desti = desti;
        this.informacio = informacio;
	}
	
	public static void escriuByte(String desti, byte[] infromacio) throws FileNotFoundException, IOException {
		byte[] cont = {14, 41, 37, 20, 68, 55, 52, 67, 12, 34, 5, 7, 1};
		
		//escriuByte(desti + "Els Ocells.txt", cont);
		escriuByte(desti + infromacio, "Vola vola la cadernera".getBytes());
        }
	
	public void legeixBytes(String origen) throws FileNotFoundException, IOException  {
		origen = "C:/Users/Alumne/eclipse-workspace/SPAADTema1/Els Ocells.txt";
		
		 try (FileInputStream in = new FileInputStream(origen)) {
	            int c;
	            while ((c = in.read()) != -1) {
	                byte b=(byte)c;
	                System.out.print((char)b); 
	            }
		 }
	}
	
	public static Byte[] tornaBytes(String origen) throws FileNotFoundException, IOException {
		origen = "C:/Users/Alumne/eclipse-workspace/SPAADTema1/Els Ocells.txt";
		 
		ArrayList<Byte> cadenes = new ArrayList<>();
		 try (FileInputStream in = new FileInputStream(origen)) {
	            Byte Linia;
	            while ((c = in.read()) != -1) {
	                byte b=(byte)c;
	                System.out.print((char)b); 
	            }
		 }
		 return resultado;
	}
}
