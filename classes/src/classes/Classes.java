package classes;
/**
 *
 * @author lina.akemi.suzuki
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Criando objeto caneta azul
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        //c1.tampada = false;
        
        System.out.println("Criado objeto caneta azul");
        c1.destampar();
        c1.status();
        c1.rabiscar();
          
        //Imprime para pular uma linha
        System.out.println();
        
        //Criando objeto caneta verde
        Caneta c2 = new Caneta();
        c2.cor = "Verde";
        c2.ponta = 0.7f;
        //c2.tampada = true;
        
        System.out.println("Criado objeto caneta verde");
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
    
}
