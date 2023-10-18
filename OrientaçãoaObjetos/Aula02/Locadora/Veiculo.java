package OrientaçãoaObjetos.Aula02.Locadora;

public class Veiculo {
    private final String placa;
    private final String chassi;
    private final int anoModelo;
    private final categoria categoria;
    private final unidade unidade;

    public Veiculo (String placa, String chassi, int anoModelo, categoria categoria, unidade unidade) {
        this.placa = placa;
        this.chassi = chassi;
        this.anoModelo = anoModelo;
        this.categoria = categoria;
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
        "placa='" + placa + '\'' +
        ", chassi='" + chassi + '\'' +
        ". anoModelo=" + anoModelo +
        ", categoria=" + categoria +
        ", unidade=" + unidade + 
        '}'; 
    } 
}