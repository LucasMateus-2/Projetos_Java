package src.models;
import java.security.SecureRandom;

public class CalcMatriz 
{    
    public CalcMatriz(int linhas,int colunas)
    {
        int[][] numeros= GeraMatriz(linhas, colunas);

        for (int l = 0; l < linhas; l++)
        {
            for (int c = 0; c < colunas ; c++) 
            {
                System.out.printf("%2d | ",numeros[l][c]);
            }
            System.out.printf("%n");
        }
        int determinante = GeraDeterminante(numeros);
        System.out.println("Determinante: " + determinante);
    }

    private int[][] GeraMatriz(int linhas,int colunas)
    {
        int[][] numeros = new int[linhas][colunas];

        for (int l = 0; l < linhas; l++) 
        {
            for (int c = 0; c < colunas ; c++) 
            {
                numeros[l][c]= new SecureRandom().nextInt(100);
            }
        }
        return numeros;
    }

    private int GeraDeterminante(int[][]matriz)
    {
        if(matriz.length != matriz[0].length)
        {
            System.out.println("Tente novamente!");
            throw new IllegalArgumentException("A matriz deve ser quadrada");
            
        }

        if(matriz.length ==1)
        {
            return matriz[0][0];
        }

        int determinante=0;
        for (int i = 0; i < matriz.length; i++) 
        {
            determinante += matriz[0][i] *Math.pow(-1, i) * GeraDeterminante(subMatriz(matriz,0,i));   
        }
        return determinante;
    }
    private int[][] subMatriz(int[][] matriz, int linhaRemovida, int colunaRemovida) {
        int tamanho = matriz.length - 1;
        int[][] submatriz = new int[tamanho][tamanho];

        int k = 0, m = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (i == linhaRemovida) {
                continue;
            }
            for (int j = 0; j < matriz.length; j++) {
                if (j == colunaRemovida) {
                    continue;
                }
                submatriz[k][m++] = matriz[i][j];
            }
            k++;
            m = 0;
        }
        return submatriz;
    }
}
 
