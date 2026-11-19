public class ClasseA {
    int atributoPadrao;
    public int atibutoPublico;
    protected int atributoProtegido;
    private int atributoPrivado;

    // metodo de acesso
    public void modificarAtributos(){
        this.atibutoPublico = 5;
        this.atributoPadrao = 6;
        this.atributoProtegido = 7;
        this.atributoPrivado = 8;
    }

    public String toString(){
        return  "atributoPublico: " + atibutoPublico +
                "\natributoPadrao: " + atributoPadrao +
                "\natributoProtegido: " + atributoProtegido +
                "\natributoPrivado: " + atributoPrivado;
    }
}
