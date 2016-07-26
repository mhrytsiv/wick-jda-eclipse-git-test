package wso2.esb.command;

import java.io.File;

public class Writer {

	public static void write() {
		final String fileName = "test.txt";
		final File file = new File(fileName);
		writeToFile(file);
	}

	public static void writeToFile(final File file) {
		System.out.println("Write to file");
	}

}
