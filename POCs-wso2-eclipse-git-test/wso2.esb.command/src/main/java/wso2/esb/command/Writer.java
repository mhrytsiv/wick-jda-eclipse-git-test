package wso2.esb.command;

import java.io.File;

public class Writer {

	public static void write() {
		final String data = "data.txt";
		final File file = new File(data);
		writeToFile(file);
	}

	public static void writeToFile(final File file) {
		System.out.println("Write to file");
	}

}
