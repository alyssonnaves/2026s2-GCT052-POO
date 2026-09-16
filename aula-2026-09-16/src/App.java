import java.util.LinkedList;

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
    

        Exemplar ex1 = new Exemplar("23", "A");
        Exemplar ex2 = new Exemplar("12", "B");

        LinkedList<Exemplar> lista = new LinkedList<Exemplar>();
        lista.add(ex1);
        lista.add(ex2);
        
        ex1.bloquear();
        // ex1.devolver();
        
        System.out.println("Codigo\t|\tTitulo\t|\tStatus\t\t|\tDisponivel");
        for (int i = 0; i < lista.size(); i++) {
            Exemplar obj = lista.get(i);
            System.out.print(obj.getCodigo());
            System.out.print("\t|\t");
            System.out.print(obj.getTitulo());
            System.out.print("\t|\t");
            System.out.print(obj.getStatus());
            System.out.print("\t|\t");
            System.out.println(obj.isDisponivel()); // pra quebrar linha
        }
       
    }
}
