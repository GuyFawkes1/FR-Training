package typecasting;

public class worker {
	
	public static void main(String[] args) {
		
		int i = 100;
		float implicit = i;
		System.out.println("Implicit -->"+ implicit);
		double d = 10.15;
		int explicit = (int) d;
		System.out.println("Explicit -->" + explicit);
	}

}
