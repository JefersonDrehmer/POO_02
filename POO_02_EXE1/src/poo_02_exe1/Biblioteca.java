
package poo_02_exe1;

public class Biblioteca {
    public String nome;
    public Livro livro;

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    
    public void Status(){
        System.out.println("Biblioteca "+ this.getNome() + "Livro  " + this.getLivro());
    }

   
  
    
}
