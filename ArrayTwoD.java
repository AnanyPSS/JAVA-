// manually allocate different size second dimensions

class ArrayTwoD {
	public static void main(String args[]) {
		int twoD[][] = new int [4][] ;
		twoD [0] = new int [22] ;
		twoD [1] = new int [33] ;
		twoD [2] = new int [44] ;
		twoD [3] = new int [55] ;

		int i,j,k=0;
		for (i=0;i<4;i++)
			for(j=0;j<i+1;j++) {
				twoD[i][j] = k;
				k++;
			}


		for (i=0;i<4;i++) {
			for(j=0;j<i+1;j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
			}
	}
}