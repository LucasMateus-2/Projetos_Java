package Enum;

import java.util.ArrayList;
import java.util.Arrays;

public class Teste
{
    public static void main(String[] args)
    {
        DiaSemana dia = DiaSemana.DOMINGO;

        System.out.println(dia.toString() + " valor -> " + dia.getValor() );

        Data data = new Data(1,4,2016,DiaSemana.SEXTA);
        System.out.println(data);

        DiaSemana[] dias = DiaSemana.values();

        for (DiaSemana Dia : dias)
        {
            System.out.println(Dia);
        }
        System.out.println("----------------");
        System.out.println(Enum.valueOf(DiaSemana.class,"DOMINGO"));

    }

    private static void imprindoDiaSemana(DiaSemana dia)
    {
        switch (dia)
        {
            case SEGUNDA:
                System.out.println("Segunda-feira");
                break;
            case TERCA:
                System.out.println("Terçaa-feira");
                break;
            case QUARTA:
                System.out.println("Quarta-feira");
                break;
            case QUINTA:
                System.out.println("Quinta-feira");
                break;
            case SEXTA:
                System.out.println("Sexta-feira");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }
    private static void usandoEnum()
    {
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SABADO;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
        System.out.println("Testando com Enum!!");

        imprindoDiaSemana(segunda);
        imprindoDiaSemana(terca);
        imprindoDiaSemana(quarta);
        imprindoDiaSemana(quinta);
        imprindoDiaSemana(sexta);
        imprindoDiaSemana(sabado);
        imprindoDiaSemana(domingo);
    }
}
