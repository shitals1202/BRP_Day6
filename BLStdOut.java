package classwork.Day6;

public class BLStdOut{
	public static void main(String[] args) {
		String s ="shital salunkhe";
		print(s);
		println(s);
		print1();
		printf(s);
		
	}

	private static void printf(String s) {
		String stf = String.format("name is %s",s);
		System.out.println(stf);
	}

	private static void print1() {
		System.out.println();
		
	}

	private static void println(String s) {
		System.out.println(s);
	}

	private static void print(String s) {
		System.out.print(s);
	}
}