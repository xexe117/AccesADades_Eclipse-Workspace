package cat.spaad.iniciacio;

import cat.spaad.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class IniciacioStreams {

  private final String path;
  private final String fitxer;	
	
	public static void main(String[] args) {
      IniciacioStreams proves = new IniciacioStreams("C:/Users/Alumne/eclipse-workspace/IniciacioT1Streams/src", "Reunion.txt");
     // proves.provesByte();
     // proves.provesCharacter();
     // proves.provesBuffered();
     // proves.provesData();
      proves.provesObjecte();
	}
	
	public IniciacioStreams(String path, String fitxer) {
        this.path = path;
        this.fitxer = fitxer;
       
    }
}
