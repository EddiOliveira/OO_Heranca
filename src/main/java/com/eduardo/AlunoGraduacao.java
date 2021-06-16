package com.eduardo;

public class AlunoGraduacao extends Aluno
{

    public AlunoGraduacao() { }

    public AlunoGraduacao(String nome)
    {
        setNome(nome);
    }

    public String alunoGraduacaoAprovadoReprovado()
    {
        if(mediaNotas() >= 7.0f)
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
