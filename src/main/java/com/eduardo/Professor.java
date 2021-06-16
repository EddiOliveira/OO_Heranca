package com.eduardo;

public class Professor extends Pessoa
{
    private String titulacaoMaxima;


    public Professor() { }

    public Professor(String nome)
    {
        setNome(nome);
    }

    public void setTitulacaoMaxima(String titulacaoMaxima)
    {
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public String getTitulacaoMaxima()
    {
        return this.titulacaoMaxima;
    }
}
