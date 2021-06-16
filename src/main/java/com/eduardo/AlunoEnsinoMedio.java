package com.eduardo;

public class AlunoEnsinoMedio extends Aluno
{

    public AlunoEnsinoMedio() { }

    public AlunoEnsinoMedio(String nome)
    {
        setNome(nome);
    }

    public String alunoEnsinoMedioAprovadoReprovado()
    {
        if(mediaNotas() >= 6.0f)
        {
            return "\n\nAluno: " + getNome() +
                   " - Matricula: " + getMatricula() +
                   " - Aprovado\n\n";
        }
        else
        {
            return "\n\nAluno: " + getNome() +
                   " - Matricula: " + getMatricula() +
                   " - Reprovado\n\n";
        }
    }
}
