///lembrando que isso é pra uso da companhia, nao dos passageiros
package br.edu.fescfafic.poo.CompanhiaAerea.Main;

import br.edu.fescfafic.poo.CompanhiaAerea.Model.PassagemAviao;

public class Main {
    public static void main(String[] args) {
        PassagemAviao passagem = new PassagemAviao(
                "Gol",
                "Juazeiro do Norte-CE",
                "Campinas-SP",
                170,
                "15/10/2023",
                799.98,
                399.99
        );


        ///se caso for atualizar, retirar do comentario
        /*
        passagem.atualizarValor(500,250);
        passagem.atualizarData("20/10/2023");
        passagem.atualizarAssentos(100);
        */

        System.out.println("Companhia Aerea: " + passagem.campanhiaAerea);
        System.out.println("Origem: " + passagem.origem);
        System.out.println("Destino: " + passagem.destino);
        System.out.println("Quantidade de Assentos Disponiveis: " + passagem.quantidadeAssentosDisponiveis);
        System.out.println("Data da Viagem: " + passagem.dataDaViagem);
        System.out.println("Valor Passagem Inteira: " + passagem.valorDaPassagemInteira);
        System.out.println("Valor Passagem com Carteira de Estudante: " + passagem.valorCarteiraDeEstudante);



    }
}