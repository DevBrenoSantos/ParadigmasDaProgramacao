package TesteTrabalhoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Voo {
    private String Destino;
    private String Origem;
    private int NumVoo;

    private static ArrayList<Passageiro> ListaEspera = new ArrayList<Passageiro>();
    private static ArrayList<Passageiro> Passageiros = new ArrayList<Passageiro>();

    public Voo( String origem, String destino, int numVoo) {
        Origem = origem;
        Destino = destino;
        NumVoo = numVoo;
    }

    @Override
    public String toString() {
        return "Voo{" +
                ", Origem='" + Origem + '\'' +
                "Destino='" + Destino + '\'' +
                ", NumVoo=" + NumVoo +
                '}';
    }

    public static void cadrastrarPassageiro(Passageiro passageiro){

        if (Passageiros.size() < 10){
            Passageiros.add(passageiro);
            System.out.println("Passageiro adicionado no voo com sucesso");
        }else if (ListaEspera.size() < 5){
            ListaEspera.add(passageiro);
            System.out.println("Passageiro adicionado na fila de espera");
        }else {
            System.out.println("Fila Cheia, a reserva não pode ser feita");
        }
    }
    public static void ExcluirPassageiro(String nomePassageiro){
        for (int repete = 0; repete < Passageiros.size(); repete++) {
            Passageiro passageiro = Passageiros.get(repete);
            if (passageiro.getNome().equals(nomePassageiro)) {
                Passageiros.remove(repete);
                System.out.println("Passageiro removido com sucesso");
                return;
            }
        }
        System.out.println("Passageiro não encontrado");
    }

    public static void ImprimirPassageiros (){
        System.out.println(Passageiros);
    }
    public static void ImprimirListaEspera (){
        System.out.println(ListaEspera);
    }
    public static void ProcurarPassageiroCpf(String CPF){
        for (int repete = 0; repete < Passageiros.size(); repete++) {
            Passageiro passageiro = Passageiros.get(repete);
            if (passageiro.getCPF().equals(CPF)) {
                System.out.println("Informações do passageiro com CPF " + CPF + ":");
                System.out.println(passageiro);
                return;
            }
        }
        System.out.println("Passageiro com CPF " + CPF + " não encontrado");
    }
    public static void ProcurarPassageiroNome(String Nome){
        for (int repete = 0; repete < Passageiros.size(); repete++) {
            Passageiro passageiro = Passageiros.get(repete);
            if (passageiro.getNome().equals(Nome)) {
                System.out.println("Informações do passageiro com nome " + Nome + ":");
                System.out.println(passageiro);
                return;
            }
        }
        System.out.println("Passageiro com nome " + Nome + " não encontrado");
    }
    public static void ExcluirPassageiroListaEspera(String nome){
        for (int repete = 0; repete < ListaEspera.size(); repete++) {
            Passageiro passageiro = ListaEspera.get(repete);
            if (passageiro.getNome().equals(nome)) {
                ListaEspera.remove(repete);
                System.out.println("Passageiro com nome " + nome + " removido da lista de espera com sucesso");
                return;
            }
        }
        System.out.println("Passageiro com nome " + nome + " não encontrado na lista de espera");
    }
}
