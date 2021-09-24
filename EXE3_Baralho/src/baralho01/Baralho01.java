
package baralho01;


public class Baralho01 {

   
    public static void main(String[] args) {
       
        
          Baralho baralho01 = new Baralho();
        try{
            baralho01.adicionarCarta(1, "Paus");
            baralho01.adicionarCarta(5, "Ouros");
            baralho01.adicionarCarta(6, "Espadas");
            baralho01.adicionarCarta(7, "Copas");
            System.out.println(baralho01.toString());
        }catch(Exception e){
            System.out.println("Erro: " +  e.getMessage());
        }
        
    }
    
}
