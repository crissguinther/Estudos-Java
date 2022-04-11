package entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextWriter {

	private static BufferedWriter bw = null;
	private List<Product> list = new ArrayList<>();
	private Path directory;
	private final Path DESTINATION_DIRECTORY;

	public TextWriter(List<Product> products, Path directory) {
		for (Product p : products) {
			list.add(p);
		}
		this.directory = directory;
		this.DESTINATION_DIRECTORY = Paths.get(directory.toString() + "/opt");
	}

	public TextWriter(List<Product> products, String path) {
		for (Product p : products) {
			list.add(p);
		}
		this.directory = Paths.get(path);
		this.DESTINATION_DIRECTORY = Paths.get(directory.toString() + "/opt");
	}

	private boolean hasPath() {
		File file = new File(DESTINATION_DIRECTORY.toString());
		return file.exists();
	}

	public boolean createPath() {
		return new File(DESTINATION_DIRECTORY.toString()).mkdir();
	}

	public void writeFiles(String destination) throws IOException {
		if (!hasPath()) {
			boolean success = createPath();
			if (!success)
				throw new FileSystemException("Couldn't create the directory!");
		}

		bw = new BufferedWriter(new FileWriter(DESTINATION_DIRECTORY.toString() + destination));

		for (Product prod : list) {
			System.out.println(prod.toString());
			bw.write(prod.toString());
			bw.newLine();
		}

		bw.close();

	}

}
