package aulaquatro;

public class Caneta {
    
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    //Método construtor 
    /*public Caneta()
    {
        this.TamparCaneta();
        this.cor = "Azul";
    }*/
    //OU UMA OUTRA MANEIRA DE CRIAR MÉTODO CONSTRUTOR
    public Caneta(String m, float p, String cor )
    {
        this.modelo = m;
        this.ponta = p;
        this.cor = cor;
    }      
    
    //Método acessor GET do atributo modelo
    public String getModelo() 
    {
        return this.modelo;
    }
    
    //Método modificador SET do atributo modelo
    public void setModelo(String m) 
    {
        this.modelo = m;
    }

    //Método acessor GET do atributo ponta
    public float getPonta() 
    {
        return this.ponta;
    }

    //Método modificador SET do atributo Ponta
    public void setPonta(float p) 
    {
        this.ponta = p;
    }

    //Método acessor GET do atributo Tampada
    public boolean getTampada() {
        return this.tampada;
    }
    
    //Método modificador SET do atributo Tampada
    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    //Método acessor GET do atributo Cor
    public String getCor() {
        return this.cor;
    }
    
    //Método modificador SET do atributo Cor
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //método tampar
    public void TamparCaneta()
    {
        this.tampada = true;
    }
    
    //método destampar
    public void DestamparCaneta()
    {
        this.tampada = false;
    }    
    
    public void status()
    {
        //IMPRIMINDO MÉTODOS SET
        System.out.println("Apresentando MÉTODOS SET");
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        if(this.tampada == true)
        {
            System.out.println("A caneta está tampada ");
        }
        else
        {
            System.out.println("A caneta está sem tampa");
        }
        
        System.out.println("");
        
        //IMPRIMINDO MÉTODOS GET
        System.out.println("Apresentando MÉTODOS GET");
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        if(this.getTampada() == true)
        {
            System.out.println("A caneta está tampada ");
        }
        else
        {
            System.out.println("A caneta está sem tampa");
        }
    }
}
