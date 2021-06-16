package com.eduardo;


public class Main 
{
    public static void main(String[] args) 
    {
        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio("João de Oliveira");

        alunoEnsinoMedio.setMatricula(12346);
        alunoEnsinoMedio.setNotaTeste1(10.0f);
        alunoEnsinoMedio.setNotaTeste2(1.0f);

        System.out.println(alunoEnsinoMedio.alunoEnsinoMedioAprovadoReprovado());


        AlunoGraduacao   alunoGraduacao   = new AlunoGraduacao("Alice Dias");

        alunoGraduacao.setMatricula(12345);
        alunoGraduacao.setNotaTeste1(5.0f);
        alunoGraduacao.setNotaTeste2(9.0f);

        System.out.println(alunoGraduacao.alunoGraduacaoAprovadoReprovado());
                       

        Professor        professor        = new Professor("Marco Antonio");

        professor.setTitulacaoMaxima("Professor Titular");

        System.out.println("\n\n" + professor.getTitulacaoMaxima() + ": " + professor.getNome() + "\n\n");
    }
}
