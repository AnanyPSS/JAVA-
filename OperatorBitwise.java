// this program creates a few integer variables
// and then uses compound bitwise operator assignment to manipulate the variables.

class OperatorBitwise {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c = 3;

		a |= 4; 
		b >>= 1;
		c <<= 1;
		a ^= c;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);
	}
}