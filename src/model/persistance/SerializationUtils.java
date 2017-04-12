package model.persistance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class SerializationUtils {

	private SerializationUtils() {
	}

	/**
	 * Méthode de déserialisation de T.
	 * 
	 * @param chemin
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	public static <T> T load(String chemin) throws IOException, ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(chemin)))) {
			return (T) ois.readObject();
		} catch (IOException e) {
			throw new IOException("SerializationUtils, impossible de lire le fichier.", e);
		} catch (ClassNotFoundException e) {
			throw new ClassNotFoundException("SerializationUtils, classe introuvable.", e);
		}
	}

	/**
	 * Méthode serialisation de cycliste.
	 * 
	 * @param chemin
	 * @throws IOException
	 */
	public static <T> void save(T objet, String chemin) throws IOException {
		try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(chemin)))) {
			oos.writeObject(objet);
			oos.flush();
		} catch (IOException e) {
			throw new IOException("SerializationUtils, impossible d'écrire le fichier.", e);
		}

	}

}
