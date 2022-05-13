package Desafio;

public class Main {
    public static void main(String[] args) {
        Cliente daiane = new Cliente();
        daiane.setNome("Daiane");

        Conta cc = new ContaCorrente(daiane);
        Conta poupanca = new ContaPoupanca(daiane);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
