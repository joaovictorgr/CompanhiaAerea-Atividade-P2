package br.edu.fescfafic.poo.CompanhiaAerea.Model;

public class PassagemAviao {
    public String campanhiaAerea;
    public String origem;
    public String destino;
    public int quantidadeAssentosDisponiveis;
    public String dataDaViagem;
    public double valorDaPassagemInteira;
    public double valorCarteiraDeEstudante;

    public PassagemAviao(String campanhiaAerea, String origem, String destino,
                         int quantidadeAssentosDisponiveis, String dataDaViagem,
                         double valorDaPassagemInteira, double valorCarteiraDeEstudante){
        this.campanhiaAerea = campanhiaAerea;
        this.origem = origem;
        this.destino = destino;
        this.quantidadeAssentosDisponiveis = quantidadeAssentosDisponiveis;
        this.dataDaViagem = dataDaViagem;
        this.valorDaPassagemInteira = valorDaPassagemInteira;
        this.valorCarteiraDeEstudante = valorCarteiraDeEstudante;
    }
    public void atualizarValor(double novoValorPassagemInteira, double novoValorCarteiraDeEstudante){
        this.valorDaPassagemInteira = novoValorPassagemInteira;
        this.valorCarteiraDeEstudante = novoValorCarteiraDeEstudante;
    }
    public void atualizarData(String novaDataDaViagem){
        this.dataDaViagem = novaDataDaViagem;
    }
    public void atualizarAssentos(int novaQuantDeAssentosDisponiveis){
        this.quantidadeAssentosDisponiveis = novaQuantDeAssentosDisponiveis;
    }

}
