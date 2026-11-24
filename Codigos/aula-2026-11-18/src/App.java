public class App {
    public static void main(String[] args) {
        Peca objeto = new Peca();
        objeto.baixa(5);
        System.out.println("Sucesso");
        try{
            objeto.baixa_v2(5);
            System.out.println("ola mundo");
        }catch (IllegalStateException e){
            System.out.println("valor acima: " + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Valor negativo foi passado ");
            objeto.baixa_v2(2);
        }

        objeto.baixa_v2(5);
        System.out.println("fim");
    }
}
