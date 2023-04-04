import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Conta {
        private double saldo;

        // Método set para o saldo
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        // Método get para o saldo
        public double getSaldo() {
            return this.saldo;
        }

        // Método abstrato para imprimir extrato
        public abstract void imprimeExtrato(); {
        System.out.println( "### Extrato da Conta ###" );

    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/aaaa HH:mm:ss");

    Date date = new Date();
System.out. println ("Saldo: "+this.getSaldo());
System.out.println("Data: "+sdf.format (date));
}
    }

