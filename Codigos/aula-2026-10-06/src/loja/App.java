package loja;
public class App {
    public static void main(String[] args) {
        Gerente ger = new Gerente();
        ger.setNome("Gerente");
        ger.setDocumento("122345");
        ger.setEndereco("Rua A, 12");
        ger.setMatricula("222");
        ger.setSalario(5000);
        ger.setBonusSalario(3000);

        Vendedor vend1 = new Vendedor();
        vend1.setDocumento("5555");
        vend1.setEndereco("Rua B");
        vend1.setMatricula("3333");
        vend1.setSalario(3000);
        vend1.setSetor("vestuario");

        Vendedor vend2 = new Vendedor();
        vend2.setDocumento("444");
        vend2.setEndereco("Rua C");
        vend2.setMatricula("1111");
        vend2.setSalario(2800);
        vend2.setSetor("eletrodomesticos");

        System.out.println(ger);
        System.out.println(vend1);
        System.out.println(vend2);
        
        
    }
}
