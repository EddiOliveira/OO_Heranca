package com.eduardo;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AlunoEnsinoMedioTest 
{
    AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();

    @Test
    public void deveRetornarNomeAlunoEnsinoMedio()
    {
        alunoEnsinoMedio.setNome("João de Oliveira");
        assertEquals("João de Oliveira", alunoEnsinoMedio.getNome());
    }

    @Test
    public void deveRetornarMatriculaAlunoEnsinoMedio()
    {
        alunoEnsinoMedio.setMatricula(12345);
        assertEquals(12345, alunoEnsinoMedio.getMatricula());
    }

    @Test
    public void deveRetornarNotaTeste1ALunoEnsinoMedio()
    {
        alunoEnsinoMedio.setNotaTeste1(10.0f);
        assertEquals(10.0f, alunoEnsinoMedio.getNotaTeste1(), 0);
    }

    @Test
    public void deveRetornarNotaTeste2ALunoEnsinoMedio()
    {
        alunoEnsinoMedio.setNotaTeste2(1.0f);
        assertEquals(1.0f, alunoEnsinoMedio.getNotaTeste2(), 0);
    }

    @Test
    public void deveRetornarMediaNotasALunoEnsinoMedio()
    {
        alunoEnsinoMedio.setNotaTeste1(10.0f);
        alunoEnsinoMedio.setNotaTeste2(1.0f);
        assertEquals(5.5f, alunoEnsinoMedio.mediaNotas(), 0);
    }

    @Test
    public void deveRetornarAprovadoAlunoEnsinoMedio()
    {
        alunoEnsinoMedio.setNome("João de Oliveira");
        alunoEnsinoMedio.setMatricula(12345);
        alunoEnsinoMedio.setNotaTeste1(10.0f);
        alunoEnsinoMedio.setNotaTeste2(1.0f);
        assertEquals("\n\nAluno: João de Oliveira - Matricula: 12345 - Reprovado\n\n", alunoEnsinoMedio.alunoEnsinoMedioAprovadoReprovado());
    }
}
