import java.security.SecureRandom;

public class array {
    public static void main(String[] args) {
        //* Um array em Java é uma coleção de variáveis ​​do mesmo tipo. 
        // As variáveis ​​no array são ordenadas e cada uma possui um índice
        // e cada indece o seu valor
         
        // Array:  indexes: 0    1    2   3   4
        //         Values : 10  506  282  9   45 */

        int [] num=new int[5];

        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;

        for(int i=0; i<num.length; i++){
            System.out.printf("%d%n", num[i]);
        }
        System.out.println("%n");

        //* as matrizes em java diferentes dos arrays comuns tem dimensões
        //  quando inicio um array multidimecional, eu coloco um conjunto 
        //  de '[]' para cada dimesão. por exemplo:
        // 
        //  int[][] intArray = new int[10][20]; 
        // 
        //  isso significa que, tenho uma matrix de arrays que contém
        //  10 linhas e 20 colunas */
        
        int linhas =4;
        int conlunas =4;
        int [][] numeros = new int [linhas][conlunas];

        for(int l=0; l<linhas; l++){
            for(int c=0; c<conlunas; c++){
                numeros[l][c] = new SecureRandom().nextInt(100);
                System.out.printf("%d - ", numeros[l][c]);
            }
            System.out.println("%n");
        }
    }
}
    