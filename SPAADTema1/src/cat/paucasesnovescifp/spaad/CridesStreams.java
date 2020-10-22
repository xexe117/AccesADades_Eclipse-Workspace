package cat.paucasesnovescifp.spaad;

import java.io.*;
public class CridesStreams {
	private final String desti;
    private final String informacio;	
    
	public static void maini(String[] args){
		CridesStreams test = new CridesStreams ("C:/Users/Alumne/eclipse-workspace/SPAADTema1", "Els Ocells.txt");
	}
	
	public CridesStreams(String desti, String informacio) {
        this.desti = desti;
        this.informacio = informacio;
    
    }
	
	public void cridesBytes() {
		byte[] dades = {14, 41, 37, 20, 68, 55, 52, 67, 12, 34, 5, 7, 1};
		escriuByte = (desti + informacio ,"Vola vola la cadernera".getBytes());
	}
	
	public static void escriuByte(String desti, byte[] dades) throws FileNotFoundException, IOException {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(desti);
            for (byte b : dades) {
                out.write(b);
            }
        } finally {
            if (out != null) {
                out.close();
            }
        }	
	}
}
