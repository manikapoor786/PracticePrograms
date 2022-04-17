package modules;

public class RemoveExtraSpacesfromString {
	public static void main(String[] args) {
		String a="man i  s    h";
		System.out.println(a.replaceAll("\\s+", "").trim());
	}
}
