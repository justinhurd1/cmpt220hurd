public class Lab5num7 {
	public static boolean isUpperTriangular(double[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                if(i > j) {
                    if(!(array[i][j] == 0)) {
                        return false;
                    }
                }
            }
        }
        return true; 
	}

    public static void main(String[] args) {
        double[][] array = {{2, 1, 4}, {0, 3, -1}, {0, 0, -2}};
        if(isUpperTriangular(array)) {
            System.out.println("The array passed is an upper triangular matrix.");
        } else {
            System.out.println("The array passed is not an upper triangular matrix.");
        }
    }
}