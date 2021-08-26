
package poo_02_exe1;


public class Livro {
    
    public String ISBN;
    public Autor autor;
    public Biblioteca biblioteca;

    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public String toString() {
        return "Livro{" + "ISBN=" + ISBN + ", autor=" + autor + ", biblioteca=" + biblioteca + '}';
    }
    
    
   
}
