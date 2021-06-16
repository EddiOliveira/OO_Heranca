package com.eduardo;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProfessorTest 
{
    Professor professor = new Professor();

    @Test
    public void deveRetornarProfessorNome()
    {
        professor.setNome("Marco Antonio");
        assertEquals("Marco Antonio", professor.getNome());
    }

    @Test
    public void deveRetornarProfessorTitulacaoMaxima()
    {
        professor.setTitulacaoMaxima("Professor Titular");
        assertEquals("Professor Titular", professor.getTitulacaoMaxima());
    }
}
