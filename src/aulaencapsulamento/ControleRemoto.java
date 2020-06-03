package aulaencapsulamento;

public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //metodo contrutor
    public ControleRemoto()
    {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    //metodos getters e setter
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //metodos abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Ligado: " + this.getLigado());
        System.out.println("Tocando: " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume() && i <= 100 && this.getVolume() >= 0; i++)
        {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true && this.getVolume() >= 0 && this.getVolume() <= 100)
        {
            this.setVolume(this.getVolume() + 1);
        }
        else
        {
            if(this.getLigado() == false)
            {
                System.out.println("Seu aparelho está desligado");
            }
            else
            {
                if(this.getVolume() == 100)
                {
                    System.out.println("Seu aparelho está com volume máximo");
                }
            }
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true && this.getVolume() <= 100 && this.getVolume() > 0)
        {
            this.setVolume(this.getVolume() - 1);
        }
        else
        {
            if(this.getLigado() == false)
            {
                System.out.println("Seu aparelho está desligado");
            }
            else
            {
                if(this.getVolume() == 0)
                {
                    System.out.println("Seu aparelho está com volume mínimo");
                }
            }
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0)
        {
            this.setVolume(0);
        }
        else
        {
            System.out.println("Seu aparelho já está com o mudo ativo");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0)
        {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        //A " ! " (exclamação) nega o próximo argumento
        //this.getLigado() sem usar o operador de comparação, por padrão já é true
        if(this.getLigado() && !(this.getTocando()))
        {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando())
        {
            this.setTocando(false);
        }
    }
}
