package wso2.esb.command;

public class Reader {

	public static void read() {
		int files = 5;
		for (int j = 0; j < files; j++) {
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
