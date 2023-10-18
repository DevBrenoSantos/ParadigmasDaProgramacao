package OrientaçãoaObjetos.Aula02.Locadora;

public class unidade {
    private final String endereco;
    private final String telefone;
    private final String contato;
    private final String email;
    
    private Veiculo veiculos[];

    private int numVeiculos = 0;

    public unidade (String endereco, String telefone, String contato, String email) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.contato = contato;
        this.email = email;
        veiculos = new Veiculo[5];
    }

    @Override
    public String toString() {
        return "Unidade{" +
                "endereço='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' + 
                ", contato='" + contato + '\'' + 
                ", email='" + email + '\'' +
                '}';
    }

    public void addVeiculo(Veiculo V) {
        veiculos[numVeiculos] = V;
        numVeiculos++;
    }

    public void printVeiculosDaUNidade() {
        for (int i=0; i<numVeiculos; i++) {
            System.out.println(veiculos[i]);
        }
    }
}
