//Demostrate caste.

class TypeCaste {
	public static void main (String args[]) {
		byte b ;
		int i = 257 ; 
		double d = 323.142 ;

		System.out.println("\n Conversion of int to byte.");
		b = (byte) i ;
		System.out.println("i and b\t" +i+ " " +b);

		System.out.println("\n Conversion of double to int.");
		i = (int) d ;
		System.out.println("d and i\t" +d+ " " +i);

        System.out.println("\n Conversion of double to byte.");
		b = (byte) d ;
		System.out.println("d and b\t" +d+ " " +b);

	}
}