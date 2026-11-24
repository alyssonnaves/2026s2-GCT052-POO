public class Peca {
    private int estoque = 3;

    public boolean baixa(int quantidade){
        if (quantidade > estoque){
            return false;
        }
        estoque -= quantidade;
        return true;
    }

    public void baixa_v2(int quantidade){
        if (quantidade < 0){
            throw new IllegalArgumentException("Valor incorreto");
        }
        if (quantidade > estoque){
            throw new EstoqueInsuficienteException("disponivel: " + estoque + " retirada: " + quantidade);
            // throw new IllegalStateException("Quantidade insuficiente no estoque");
        }
        estoque -= quantidade;
        System.out.println("Baixa realizada com sucesso");
    }
}

