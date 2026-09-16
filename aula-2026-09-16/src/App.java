public class App {
    public static void main(String[] args)  {
        StatusExemplar status = StatusExemplar.BLOQUEADO;;
        System.out.println(status);
        // status = "PERDIDO EM MARTE";
        try {
            Exemplar exe = new Exemplar("123", "Teste");
        } catch (Exception e) {
            System.out.println("Voce deve digitar um codigo ou titulo");
        }
        System.out.println("FIM");
       
    }
}
