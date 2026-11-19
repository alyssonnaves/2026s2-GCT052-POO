public class Numero {
    int x; 

    public void somar(int x){
        this.x += x;  // this.x = this.x + x
    }

    public Numero sum(int x){
        this.x += x;
        return this;
    }

    public static void main(String[] args) {
        Numero v = new Numero();
        v.x = 2;
        v.somar(10);
        v.somar(20);
        System.out.println("valor de v: " + v.x); // ??

        v.sum(4).sum(5);
        System.out.println("valor de v: " + v.x); 
    }
}