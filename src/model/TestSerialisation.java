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

	/**
	 * Si je ne veux pas Serialiser un élément, je peux ajouter l'atribut transient à l'attribut de classe.
	 */
	@Test
	public void testSerialisationCycliste() {
		Cycliste riri = new Cycliste();
		riri.setPrenom("Riri");
		riri.setNom("Riri");
		riri.setClassement(1);
		riri.setNumeroLicenceFFC("NUMEROLICENCEFFC");
		riri.setEquipe(null);

		try (ObjectOutputStream oos = new ObjectOutputStream(
				Files.newOutputStream(Paths.get("/tmp/testSerialisationCycliste.txt")))) {

			oos.writeObject(riri);
			oos.flush();

		} catch (IOException e) {
			System.out.println("Et paf le Java... impossible d'écrire le fichier.");
		}

	}

	@Test
	public void testDeSerialisationCycliste() {
		Cycliste ririFromDisk;

		try (ObjectInputStream ois = new ObjectInputStream(
				Files.newInputStream(Paths.get("/tmp/testSerialisationCycliste.txt")))) {

			ririFromDisk = (Cycliste) ois.readObject();
			System.out.println(ririFromDisk);

		} catch (IOException e) {
			System.out.println("Et paf le Java... impossible de lire le fichier.");
		} catch (ClassNotFoundException e) {
			System.out.println("Et paf le Java... classe Cycliste introuvable.");
		}

	}

}
