package livraria0604;

public class livro {
    public int id;
    String titulo;
    String nomeAutor;
    String anoPublicacao;
    String editora;

    public Livro(int id, String titulo, String nomeAutor, String anoPublicacao, String editora){
        this.id = id;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
    }

}