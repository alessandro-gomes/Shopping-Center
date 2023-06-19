public class Informatica extends Loja {
    
    private double seguroEletronicos;
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public String toString() {
        return super.toString() + "\nValor seguro eletrônicos: R$ " + seguroEletronicos;
    }
    
    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }
    
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
    
}