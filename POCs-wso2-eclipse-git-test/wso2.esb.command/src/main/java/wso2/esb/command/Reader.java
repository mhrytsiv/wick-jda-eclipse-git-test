package wso2.esb.command;

public class Reader {

	public static void read() {
		int files = 10;
		for (int i = 0; i < files; i++) {
			readFile();
			printStatus();
		}
	}

	private static void readFile() {
		System.out.println("readFile");
	}

	private static void printStatus() {
		System.out.println("readFile");
	}
}
