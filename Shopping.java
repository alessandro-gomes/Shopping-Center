public class Shopping {
    
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }
    
    public String toString() {
        return "Nome do Shopping: " + nome +  "\nQuantidade de lojas: " + lojas.length + "\nEndereço" + "\n" + endereco;
    }
    
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public int quantidadeLojasPorTipo(String tipoDeLoja) {
        int totalLojas = -1;
        
        if (tipoDeLoja.equalsIgnoreCase("Cosmético") || tipoDeLoja.equalsIgnoreCase("Cosmetico")) {
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] != null && lojas[i] instanceof Cosmetico) {
                    if (totalLojas == -1) {
                        totalLojas = 0;
                    }
                    totalLojas += 1;
                }
            }
            return totalLojas;
        } else if (tipoDeLoja.equalsIgnoreCase("Vestuário") || tipoDeLoja.equalsIgnoreCase("Vestuario")) {
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] != null && lojas[i] instanceof Vestuario) {
                    if (totalLojas == -1) {
                        totalLojas = 0;
                    }
                    totalLojas += 1;
                }
            }
            return totalLojas;
        } else if (tipoDeLoja.equalsIgnoreCase("Bijuteria")) {
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] != null && lojas[i] instanceof Bijuteria) {
                    if (totalLojas == -1) {
                        totalLojas = 0;
                    }
                    totalLojas += 1;
                }
            }
            return totalLojas;
        } else if (tipoDeLoja.equalsIgnoreCase("Alimentacao")) {
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] != null && lojas[i] instanceof Alimentacao) {
                    if (totalLojas == -1) {
                        totalLojas = 0;
                    }
                    totalLojas += 1;
                }
            }
            return totalLojas;
        } else if (tipoDeLoja.equalsIgnoreCase("Informática") || tipoDeLoja.equalsIgnoreCase("Informatica")) {
            for (int i = 0; i < lojas.length; i++) {
                if (lojas[i] != null && lojas[i] instanceof Informatica) {
                    if (totalLojas == -1) {
                        totalLojas = 0;
                    }
                    totalLojas += 1;
                }
            }
            return totalLojas;
        } else {
            return -1;
        }
    }
    
    public Informatica lojaSeguroMaisCaro() {
        double maiorValorDeSeguro = -1;
        Informatica loja = null;
        
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i] instanceof Informatica) {
                if (((Informatica)lojas[i]).getSeguroEletronicos() > maiorValorDeSeguro) {
                    maiorValorDeSeguro = ((Informatica)lojas[i]).getSeguroEletronicos();
                    loja = (Informatica)lojas[i];
                }
            }
        }
        
        return loja;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Loja[] getLojas() {
        return lojas;
    }
    
    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
    
}