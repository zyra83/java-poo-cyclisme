package model;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

import model.entities.Cycliste;

public class TestSerialisation {

	@Test
	public void testSerialisationCycliste() throws IOException {
		Cycliste riri = new Cycliste();
		riri.setPrenom("Riri");
		riri.setNom("Riri");
		riri.setClassement(1);
		riri.setNumeroLicenceFFC("NUMEROLICENCEFFC");
		riri.setEquipe(null);

		Path path = Paths.get("/tmp/testSerialisationCycliste.txt");

		OutputStream os = Files.newOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(riri);

		oos.flush();
	}

	@Test
	public void testDeSerialisationCycliste() throws IOException, ClassNotFoundException {
		Cycliste ririFromDisk = new Cycliste();

		Path path = Paths.get("/tmp/testSerialisationCycliste.txt");

		InputStream is = Files.newInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(is);

		ririFromDisk = (Cycliste) ois.readObject();
		System.out.println(ririFromDisk);

	}

}
