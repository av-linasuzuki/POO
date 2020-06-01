package classes;

/**
 * Curso em vídeo
 * Aula sobre programação orientado a objetos
 * Aula 02 - Classes
 * @author lina.akemi.suzuki
 */
public class Caneta 
{
    //declaração dos atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //status
    void status()
    {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    //métodos
    void rabiscar()
    {
        if(tampada == true)
        {
            System.out.println("Não consigo rabiscar");
        }
        else
        {
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar()
    {
        this.tampada = true;
    }
    
    void destampar()
    {
        this.tampada = false;
    }
}
