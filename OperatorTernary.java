// this program demonstrate the ? operator . 
// it uses it to obtain the absolute value of a variable.

class OperatorTernary {
	public static void main(String []args) {
		int i,k ;

		i = 10 ;
		k = i < 0 ? -i : i ; // get absolute value of i
		System.out.println("Absolute value of ");
		System.out.println( i + " is " + k);

		i = -10 ;
		k = i < 0 ? -i : i ; // get absolute value of i
		System.out.println("Absolute value of ");
		System.out.println( i + " is " + k);
	}
}