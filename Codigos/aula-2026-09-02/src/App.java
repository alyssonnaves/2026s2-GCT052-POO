public class App {
    int x; // atributo, se nao inicializado recebe valor default

    public void print(int ...vetor){
        System.out.println("X vale "+x);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + " = " + vetor[i]);
        }
    }

    public static void main(String[] args)  {
        App objeto = new App();
        objeto.print(5,7,9,11,13);
        int x=0; // variavel local - precisa ser inicializada
        int y = x+1;
        
    }
}
