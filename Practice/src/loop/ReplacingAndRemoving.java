package loop;

public class ReplacingAndRemoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is demo";
		System.out.println(s.replace("is", "was"));
		System.out.println(s.replaceFirst("is", "was"));
		System.out.println(s.replaceAll("is", "was"));
		System.err.println(s.replaceAll("is(.)","was"));
		System.err.println(s.replaceAll("is(.*)","was"));

	}

}
