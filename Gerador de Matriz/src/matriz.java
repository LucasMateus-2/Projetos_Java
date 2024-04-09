package src;

import java.util.Scanner;

import src.models.*;

public class matriz 
{
    public static void main(String[] args) 
    {   System.out.println("  |---------------------------|");
        System.out.println("  |-GERE UMA MATRIZ ALEATÓRIA-|");
        System.out.println("  |---------------------------|");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número para escolher o tamanho da matriz:");
        int n1 = scan.nextInt();
        System.out.print("Digite outro número para escolher o tamanho da matriz:");
        int n2 = scan.nextInt();
        System.err.println(" ");
        System.out.printf("matriz %d por %d",n1,n2);
        System.err.println("");
        final int linhas=n1;
        final int colunas=n2;
        int matriz1= 0;
        CalcMatriz matriz=new CalcMatriz(linhas, colunas);
        
    
    }
}

