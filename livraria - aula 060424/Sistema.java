package livraria0604;

import java.util.Scanner;

public class Sistema {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Livraria livraria060424 = new Livraria(); // Corrigido: Adição de parênteses para fechar a instanciação da Livraria

        while (opcao != 4){

            System.out.println("1-adicionar livro");
            System.out.println("2-listar livros");
            System.out.println("3-detalhar livro");
            System.out.println("4-sair");
            opcao = sc.nextInt();
            sc.nextLine(); // Adicionado para consumir a quebra de linha após o nextInt()

            switch (opcao) {
                case 1:
                    System.out.println("adicionar livro");
                    int id; String título;
                    String nomeAutor; String anoPublicacao; String editora;
                    System.out.println("Id: ");
                    id = sc.nextInt();
                    sc.nextLine(); // Adicionado para consumir a quebra de linha após o nextInt()
                    System.out.println("Título: ");
                    título = sc.nextLine();
                    System.out.println("Nome do autor: ");
                    nomeAutor = sc.nextLine();
                    System.out.println("Ano de publicação: ");
                    anoPublicacao = sc.nextLine();
                    System.out.println("Editora: ");
                    editora = sc.nextLine();

                    Livro l = new Livro(id, título, nomeAutor, anoPublicacao, editora);
                    livraria060424.cadastrarLivro(l); // Corrigido: Passando o objeto Livro ao método cadastrarLivro
                    break;
                case 2:
                    System.out.println("listando livros");
                    System.out.println(livraria060424.listarLivros()); // Corrigido: Chamada ao método listarLivros
                    break;

                case 3:
                    System.out.println("detalhando livro"); 
                    // Adicione aqui a lógica para detalhar o livro
                    break;

                case 4:
                    System.out.println("saindo");
                    break;

                default:
                    System.out.println("opcao invalida");
                    break;
            }
        }
    }
}
