public class ClasseB {
    public void modificarAtributosB(){
        ClasseA obj = new ClasseA();
        obj.modificarAtributos();
        obj.atibutoPublico = -9;
        obj.atributoPadrao = -10;
        obj.atributoProtegido = -11;
        // obj.atributoPrivado = -12;
        System.out.println(obj);
    }

    public static void main(String[] args) {
        ClasseB cb = new ClasseB();
        cb.modificarAtributosB();
        
    }
}
