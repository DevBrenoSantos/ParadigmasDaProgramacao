package OrientaçãoaObjetos.Aula01;

class conta {
    int agencia;
    int numConta;
    String cliente;
    float saldo;
    static int numContas = 0;

    void depositar (float valor) {
        saldo = saldo + valor;
    }

    float getSaldo () {
        return saldo;
    }

    boolean sacar (float valor) {
        if (valor > saldo) 
            return false;
        saldo  = saldo - valor;
        return true;
    }

    @Override
    public String toString() {
        String msg = "";
        msg += "Agencia: " + agencia + " - ";
        msg += "Conta: " + numConta + "\n";
        msg += "Nome: " + cliente + "\n";
        msg += "Saldo: R$ " + String.format("%.2f", saldo) + "\n";
        return msg;
    }
}