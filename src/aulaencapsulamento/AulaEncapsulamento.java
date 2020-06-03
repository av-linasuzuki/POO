package aulaencapsulamento;

public class AulaEncapsulamento {

    public static void main(String[] args) {
        
        ControleRemoto controleRemoto = new ControleRemoto();
        //Mensagem
        System.out.println("------------ MENU ------------");
        controleRemoto.ligar();
        controleRemoto.play();
        controleRemoto.ligarMudo();
        controleRemoto.abrirMenu();
        controleRemoto.fecharMenu();
    }
    
}
