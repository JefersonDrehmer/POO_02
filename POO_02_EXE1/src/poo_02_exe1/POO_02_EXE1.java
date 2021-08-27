
package poo_02_exe1;

public class POO_02_EXE1 {

    public static void main(String[] args) {
        
      Autor A1 = new Autor ();
        
      A1.setNome("Jonas");
      A1.getLivro();
      
      Biblioteca B1 = new Biblioteca ();
       
      Livro L1 = new Livro ();
      
      L1.getBiblioteca();
      
      L1.setISBN("A Arte da guerra");
      
      L1.setAutor(A1);
      
      B1.setNome("estudos2021");
      
      B1.setLivro(L1);
       
      B1.Status();
       
      Capitulo C1 = new Capitulo(54,L1);
       
     C1.Status();
        
                
    }
    
}
