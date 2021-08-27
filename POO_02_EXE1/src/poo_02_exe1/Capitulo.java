
package poo_02_exe1;


public class Capitulo {
    
    public int numero;
    public Livro livro;

    public Capitulo(int numero, Livro livro) {
        this.numero = numero;
        this.livro = livro;
    }

    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void Status(){
    
        System.out.println("Numero do capitulo:"+ this.getNumero() + "  Livro " + this.getLivro().getISBN());
    } 
    
    
    
}
