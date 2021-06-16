package com.eduardo;

public class Aluno extends Pessoa
{
    private float notaTeste1;
    private float notaTeste2;
    private int matricula;

    public float getNotaTeste1()
    {
        return this.notaTeste1;
    }

    public void setNotaTeste1(float notaTeste1)
    {
        this.notaTeste1 = notaTeste1;
    }

    public float getNotaTeste2()
    {
        return this.notaTeste2;
    }

    public void setNotaTeste2(float notaTeste2)
    {
        this.notaTeste2 = notaTeste2;
    }

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public int getMatricula()
    {
        return this.matricula;
    }

    public float mediaNotas()
    {
        return (this.notaTeste1 + this.notaTeste2) / 2;
    }
}
