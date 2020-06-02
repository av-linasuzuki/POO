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
        
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.tampada = false;
        
        //ponta tem acesso privado. Dá erro
        //c1.ponta = 0.5f;
        //c1.tampada = false;
     
        c1.status();
        c1.rabiscar();
        c1.tampar();
        System.out.println("Agora a sua caneta está: " + c1.tampada);
    }
    
}
