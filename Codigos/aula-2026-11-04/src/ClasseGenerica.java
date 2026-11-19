import java.util.LinkedList;
import java.util.List;

public class ClasseGenerica <T> {
    private List<T> dados;

    public ClasseGenerica(){
        this.dados = new LinkedList<>();
    }

    public void adicionar(T objeto){
        dados.add(objeto);
    }

    public T consulta(int indice){
        return dados.get(indice);
    }

    public void imprimir(){
        System.out.println(dados);
    }
}
