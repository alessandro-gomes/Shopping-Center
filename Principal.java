public class Principal {
    
    public static void main (String[] args) {
        int respostaUsuario;
        
        Shopping shopping = new Shopping("Shopping Praia de Belas", new Endereco("Av. Praia de Belas", "Porto Alegre", "RS",
                                            "Brasil", "90110-001", "1181", "Edifício"), 10);
        
        do {
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            respostaUsuario = Teclado.leInt("\nDigite o número da opção desejada: ");
            
            if (respostaUsuario == 1) {
                Loja loja = new Loja(Teclado.leString("Nome da loja: "), Teclado.leInt("\nQuantidade de funcionários: "), 
                Teclado.leDouble("\nSalário base dos funcionários: "), new Endereco(Teclado.leString("\nEndereço... \nRua: "), Teclado.leString("\nCidade: "),
                Teclado.leString("\nEstado: "), Teclado.leString("\nPaís: "), Teclado.leString("\nCEP: "), Teclado.leString("\nNúmero do estabelecimento: "),
                Teclado.leString("\nComplemento: ")), new Data(Teclado.leInt("\nData fundação da loja... \nDia: "), Teclado.leInt("\nMês"), Teclado.leInt("\nAno: ")),
                Teclado.leInt("\nDigite a quantidade de produtos da loja: "));
                System.out.println("\n**** Loja criada com sucesso! ****");
                System.out.println(loja);
                System.out.println("");
            } else if (respostaUsuario == 2) {
                Produto produto = new Produto(Teclado.leString("Nome do produto: "), Teclado.leDouble("\nPreço: "), new Data(Teclado.leInt("\nValidade... \nDia: "),
                Teclado.leInt("\nMês: "), Teclado.leInt("\nAno: ")));
                if (produto.estaVencido(new Data(20,10,2023))) {
                    System.out.println("**** PRODUTO VENCIDO! ****");
                    System.out.println("");
                } else {
                    System.out.println("**** PRODUTO NÃO VENCIDO! ****");
                    System.out.println("");
                }
            } else if (respostaUsuario > 3 || respostaUsuario < 1) {
                System.out.println("\nOpção inválida!");
                System.out.println("");
            } else {
                System.out.println("Saindo...");
            }
        } while (respostaUsuario != 3);
        
        
    }
    
}