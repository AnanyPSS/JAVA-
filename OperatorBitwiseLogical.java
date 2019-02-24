// Demonstrate the bitwise logical operators.

class OperatorBitwiseLogical {
	public static void main(String args[]) {
		String binary[] = {
			"000","001","010","011","100","101","110","111"
		};

		int a = 3; // 0 + 2 + 1 or 011 in binary
		int b = 6; // 4 + 2 + 0 or 110 in binary
		int c = a|b;
		int d = a&b;
		int e = a^b;
		int f = (~a & b)|(a & ~b);
		int g = ~a & 0x0f;

		System.out.println(" a = " +binary[a]);
		System.out.println(" b = " +binary[b]);
		System.out.println(" a|b = " +binary[c]);
		System.out.println(" a&b = " +binary[d]);
		System.out.println(" a^b = " +binary[e]);
		System.out.println(" (~a & b)|(a & ~b) = " +binary[f]);
		System.out.println(" ~a & 0x0f = " +binary[g]);
	}
}