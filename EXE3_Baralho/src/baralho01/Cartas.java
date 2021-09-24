
package baralho01;


public class Cartas {
    
   
    private String naipe;
    private int num;
    
    public Cartas(int num, String naipe) throws Exception{
        setNumero(num);
        setNaipe(naipe);
    }
    
    public void setNaipe(String naipe) throws Exception{
        if(naipe == "Paus" || naipe == "Espadas" || naipe == "Ouros" || naipe == "Copas"){
            this.naipe = naipe;
        }else{
            throw new Exception("Você inseriu um naipe imcompativel!!");
        }
    }
    
    public void setNumero(int num) throws Exception{
        if(num < 1){
            throw new Exception("O número da carta é menor que 1");
        }
        if(num > 13){
            throw new Exception("Número da carta não pode ser maior que 13");
        }
        this.num = num;
    }
   

    public String getNaipe() {
        return naipe;
    }
    
     public int getNum() {
        return num;
    }
    
}
