package arrays;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		int[][] matrixA = new int[3][2];
		int[][] matrixB = new int[3][2];
		int[][] matrixC = new int[3][2];
		
		matrixA[0][0] = 50;
		matrixA[0][1] = 60;
		matrixA[1][0] = 80;
		matrixA[1][1] = 20;
		matrixA[2][0] = 90;
		matrixA[2][1] = 30;
		
		matrixB[0][0] = 50;
		matrixB[0][1] = 90;
		matrixB[1][0] = 20;
		matrixB[1][1] = 40;
		matrixB[2][0] = 60;
		matrixB[2][1] = 10;
		
		
		if(matrixA.length == matrixB.length && matrixA[0].length == matrixB[0].length) {
			System.out.println("Addition possible!");
			for(int i=0;i<matrixA.length;i++) {
				for(int j=0;j<matrixA[i].length;j++) {
					matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
				}
			}
			
			System.out.println("Matrix addition :");
			for(int[] eachRow: matrixC) {
				for(int eachValue: eachRow) {
					System.out.print(eachValue + "  ");
				}
				System.out.println();
			}
		}else {
			System.out.println("Addition not possible!");
		}
		
	}

}
