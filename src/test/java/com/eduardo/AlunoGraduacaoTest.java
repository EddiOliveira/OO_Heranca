package com.eduardo;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AlunoGraduacaoTest 
{

    AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
    
    @Test
    public void deveRetornarNomeAlunoGraduacao()
    {
        alunoGraduacao.setNome("Alice Dias");
        assertEquals("Alice Dias", alunoGraduacao.getNome());
    }

    @Test
    public void deveRetornarMatriculaAlunoGraduacao()
    {
        alunoGraduacao.setMatricula(12346);
        assertEquals(12346, alunoGraduacao.getMatricula());
    }

    @Test
    public void deveRetornarNotaTeste1ALunoGraduacao()
    {
        alunoGraduacao.setNotaTeste1(5.0f);
        assertEquals(5.0f, alunoGraduacao.getNotaTeste1(), 0);
    }

    @Test
    public void deveRetornarNotaTeste2ALunoGraduacao()
    {
        alunoGraduacao.setNotaTeste2(9.0f);
        assertEquals(9.0f, alunoGraduacao.getNotaTeste2(), 0);
    }

    @Test
    public void deveRetornarMediaNotasALunoGraduacao()
    {
        alunoGraduacao.setNotaTeste1(5.0f);
        alunoGraduacao.setNotaTeste2(9.0f);
        assertEquals(7.0f, alunoGraduacao.mediaNotas(), 0);
    }

    @Test
    public void deveRetornarAprovadoAlunoGraduacao()
    {
        alunoGraduacao.setNome("Alice Dias");
        alunoGraduacao.setMatricula(12345);
        alunoGraduacao.setNotaTeste1(5.0f);
        alunoGraduacao.setNotaTeste2(9.0f);
        assertEquals("\n\nAluno: Alice Dias - Matricula: 12345 - Aprovado\n\n", alunoGraduacao.alunoGraduacaoAprovadoReprovado());
    }
}