package cat.spaad.iniciacio;
import java.io.*;
import java.io.IOException;

public class provesByte {
	public static void llegir() throws FileNotFoundException, IOException {
		String ruta = "C:/Users/Alumne/eclipse-workspace/IniciacioT1Streams/src/Reunion.txt";
		FileInputStream in = new FileInputStream(ruta);
		
		int c;
		while ((c = in.read()) != -1){
			 byte b=(byte)c;
			 System.out.println(b);
		} 
		 if (in != null) {
			 in.close();
		 }
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
