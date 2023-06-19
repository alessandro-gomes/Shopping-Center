public class Produto {
    
    private String nome;
    private double preco;
    private Data dataValidade;
    
    
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public String toString() {
        return "Nome: " + nome + "\nPreço: R$ " + preco + "\nData de validade: " + dataValidade;
    }
    
    public boolean estaVencido(Data dataAtual) {
        boolean vencido;
        
        if (dataAtual.getAno() > dataValidade.getAno()){
            vencido = true;
        } else if (dataAtual.getAno() == dataValidade.getAno() && dataAtual.getMes() > dataValidade.getMes()) {
            vencido = true;
        } else if (dataAtual.getAno() == dataValidade.getAno() && dataAtual.getMes() == dataValidade.getMes() && dataAtual.getDia() > dataValidade.getDia()) {
            vencido = true;
        } else {
            vencido = false;
        }
        return vencido;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Data getDataValidade() {
        return dataValidade;
    }
    
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
}