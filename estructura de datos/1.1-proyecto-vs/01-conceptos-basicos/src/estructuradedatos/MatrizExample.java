public class MatrizExample {
    public static void main(String[] args) {
        int[][] tabla = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("Elemento en [" + i + "][" + j + "]: " + tabla[i][j]);
            }
        }
    }
}