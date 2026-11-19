public class Produto {
    private String sku;
    private String nome;
    private String descricao;

    public Produto(String sku, String nome, String descricao){
        setSku(sku);
        setNome(nome);
        setDescricao(descricao);
    }

    private void setSku(String sku){
        this.sku = sku;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }   

    public String getSku(){
        return this.sku;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    @Override 
    public boolean equals(Object obj){
        Produto outro = (Produto) obj;
        return this.getSku().equals(outro.getSku()) && this.getNome().equals(outro.getNome()) && this.getDescricao().equals(outro.getDescricao());
    }

    @Override
    public int hashCode(){
        return this.getSku().hashCode();
    }

    @Override
    public String toString() {
        return "Produto [sku=" + sku + ", nome=" + nome + ", descricao=" + descricao + "]";
    }

    

}
