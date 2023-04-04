import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupança extends Conta {

    // Construtor da classe
    public ContaPoupança(int numeroConta, double saldo) {
        super (numeroConta, saldo);
    }

    // Implementação do método imprimeExtrato da classe abstrata Conta
    @Override
    public void imprimeExtrato() {
        Date dataAtual = new Date();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Extrato da conta poupança - " + formatoData.format(dataAtual));
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Saldo atual: R$" + this.saldo);
    }
}