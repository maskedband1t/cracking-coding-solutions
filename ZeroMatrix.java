public class ZeroMatrix {
	void zero_matrix(int[][] matrix){
		for(int m = 0; m < matrix.length; m++){
			for(int n = 0; n < matrix[m].length; n++){
				if(matrix[m][n] == 0){
					i = 0;
					j = 0;
					// set row equal to zero
					while(i < matrix.length){
						matrix[i][n] = 0;
						i++;
					}
					// set column equal to zero
					while(j < matrix[m].length){
						matrix[m][j] = 0;
						j++;
					}
				}
			}
		}	
	}	
}
