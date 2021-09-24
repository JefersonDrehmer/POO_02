
package baralho01;


public class Baralho {
    
    
    private final static int MAXCARTAS = 52;
    private Cartas[] cartas;
    private int numCartas;
     private int ouros;
    private int espadas;
    private int copas;
    private int paus;
   
    
    public Baralho(){
        numCartas = 0;
        cartas = new Cartas[this.MAXCARTAS];
    }
    
    public void adicionarCarta(int num, String naipe) throws Exception{
        if (numCartas >= MAXCARTAS){
            throw new Exception("Todas as cartas já informadas");
        }        
        for (int i = 0; i < numCartas; i++){
            if (cartas[i].getNum() == num && cartas[i].getNaipe().equals(naipe)){
                throw new Exception("Já possui uma carta com o mesmo numero e naipe");
            }
        }
       
        if (naipe == "Copas"){
            if(copas <= 13){
                this.copas++;
            }else{
                throw new Exception("ESSE NAIPE JA CHEGOU NO SEU LIMITE DE 13 CARTAS");
            }
        }
        
        if (naipe == "Paus"){
            if(paus <= 13){
                this.paus++;
            }else{
                throw new Exception("ESSE NAIPE JA CHEGOU NO SEU LIMITE DE 13 CARTAS");
            }
        }
        
        if (naipe == "ouros"){
            if(ouros <= 13){
                this.ouros++;
            }else{
                throw new Exception("ESSE NAIPE JA CHEGOU NO SEU LIMITE DE 13 CARTAS");
            }
        }
        
        if (naipe == "Espadas"){
            if(espadas <= 13){
                this.espadas++;
            }else{
                throw new Exception("ESSE NAIPE JA CHEGOU NO SEU LIMITE DE 13 CARTAS!!");
            }
        }
        
        this.cartas[numCartas] = new Cartas(num, naipe);
        numCartas++;
    } 
    
    @Override
    public String toString(){
        String tx = "";
        
        for (int i = 0; i < numCartas; i++){
            tx += cartas[i].getNum() + " | " + cartas[i].getNaipe() + "\n";
        }
        return tx;
    }
}
