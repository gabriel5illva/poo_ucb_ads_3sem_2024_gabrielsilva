package livraria - aula 060424;

public class Livraria{

    public ArrayList<Livros> Livros;

    public Livraria(){
        this.Livros = new ArrayList<>();
    }
public void cadastrarLivros(Livros Livros){
    this.Livros.add(Livros);
}

public String listarLivros(){
    String ListaLivros = "";
    for (Livro 1 : this.Livros){
        ListaLivros += 1.id + " - " + 1.titulo + "\n";

    }
    return ListaLivros;
}
}