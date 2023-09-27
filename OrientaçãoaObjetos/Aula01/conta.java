package OrientaçãoaObjetos.Aula01;

class conta {
    int agencia;
    int numConta;
    String cliente;
    float saldo;

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
}
