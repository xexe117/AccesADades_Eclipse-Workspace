package cad.spaad.tipusstreams;

import java.io.*;
import java.io.IOException;

public class MetodesByteStreams {
	public static void llegir(String ruta) throws FileNotFoundException, IOException {
		ruta = "C:/Users/Alumne/eclipse-workspace/IniciacioT1Streams/src/Reunion.txt";
		FileInputStream in = new FileInputStream(ruta);

		int c;
		while ((c = in.read()) != -1){
			 byte b=(byte)c;
			 System.out.print((char)b);
		}
		in.close();
	}

	public static void escriuByte(String ruta, byte[] dades) throws FileNotFoundException, IOException {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(ruta);
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

