package OrientaçãoaObjetos.Aula02.Locadora;

public class categoria {
    

    private final String nome;
    private final float valorDiaria;
    
    public categoria (String nome, float valorDiaria) {
        this.nome = nome;
        this.valorDiaria = valorDiaria;
    }

    public float calculaTotalDiarias (int dias) {
        return this.valorDiaria * dias;
    }

    @Override
    public String toString() {
        return "Categoria{" +
            "nome='" + nome + '\'' + 
            ", valorDiaria=" + valorDiaria +
            '}';
    }
}
