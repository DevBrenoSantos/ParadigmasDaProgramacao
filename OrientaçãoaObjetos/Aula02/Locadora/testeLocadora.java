package OrientaçãoaObjetos.Aula02.Locadora;

public class testeLocadora {
    public static void main(String[] args) {
        categoria cat = new categoria("ECONOMICO COM AR", 150);
        System.out.println(cat);


        unidade unid = new unidade("São Paulo", "(11)4500-4500", "Pedro Paulo", "pedro@paulo.com");
        System.out.println(unid);

        Veiculo V = new Veiculo("AAA-1000",  "XPT01000", 2023, cat, unid);
        System.out.println(V);
    }
}