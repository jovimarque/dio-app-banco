
import java.util.Scanner;

public class Conta {

    public String nome;
    public int conta;
    public String agencia;
    public Double saldo;

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void getNome(String nome) {

        this.nome = nome;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;

    }

    public void getAgencia(String Agencia) {

        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void getConta(int conta) {
        this.conta = conta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void getSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // metodos
    public void conta() {

        System.out.println("Nome titular " + this.nome);
        System.out.println("Agencia " + this.agencia);
        System.out.println("Conta " + this.conta);
        System.out.println("Saldo " + this.saldo);
    }

}
