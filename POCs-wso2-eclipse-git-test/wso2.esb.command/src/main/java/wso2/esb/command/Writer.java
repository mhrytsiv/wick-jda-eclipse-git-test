package wso2.esb.command;

import java.io.File;

public class Writer {

	public static void write() {
		String fileName = "data.txt";
		File data = new File(fileName);
		writeToFile(data);
	}

	public static void writeToFile(final File file) {
		System.out.println("Write to file");
	}
}
