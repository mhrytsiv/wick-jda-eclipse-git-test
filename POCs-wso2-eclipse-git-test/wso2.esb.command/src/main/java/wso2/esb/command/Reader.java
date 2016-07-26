package wso2.esb.command;

public class Reader {

	public static void read() {
		final int counFiles = 10;
		for (int i = 0; i < counFiles; i++) {
			readFile();
			printStatus();
		}
	}

	private static void readFile() {
		System.out.println("readFile");
	}

	private static void printStatus() {
		System.out.println("File has been read.");
	}
}
