package java_Practice;

public class AllUnicodeKannadaWords {
	public static void main(String[] args) {
		for (char c = 0x0C80; c <= 0x0CFF; c++) {
			System.out.println(" " + c);
		}
	}
}
