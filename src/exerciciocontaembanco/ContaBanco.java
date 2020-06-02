package exerciciocontaembanco;

public class ContaBanco {
    
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //método construtor
    //METODO CONSTRUTOR É SEMPRE ONDE VC VAI DEFINIR VALOR INICIAL
    public ContaBanco()
    {
        //DEFINE VALORES INICIAIS AO CRIAR UMA NOVA CONTA
        this.setSaldo(0.00f);;
        this.setStatus(false);
    }
    
    //métodos getter and setter
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //método abrirConta
    public void abrirConta()
    {
          
        //Mostra saldo e status inicial
        //System.out.println("Saldo inicial: " + this.getSaldo());
        //System.out.println("Status da conta: " + this.getStatus());
        float credito;
        
        this.setTipo(tipo);
        this.setStatus(true);
        
        if(this.getTipo()== "CC")
        {
            credito = 50.00f;
            this.setSaldo(this.getSaldo() + credito);
        }
        if(this.getTipo() == "CP")
        {
            credito = 150.00f;
            this.setSaldo(this.getSaldo() + credito);
        }
    }
    
    //metodo fechar conta
    public void fecharConta()
    {
        if(this.getSaldo() > 0.00f)
        {
            System.out.println("Conta com saldo positivo. Retire para inativar a conta.");
            System.out.println("Saldo: " + this.getSaldo());
        }
        else
        {
            if(this.getSaldo() < 0.00f)
            {
                System.out.println("O saldo desta conta está negativo. Impossível desativar a conta.");
                System.out.println("Saldo: " + this.getSaldo());
            }
            else
            {
                if(this.getSaldo() == 0.00f)
                {
                    this.setStatus(false);
                    System.out.println("Status atual da conta: " + this.getStatus());
                    System.out.println("A conta foi desativada.");
                }
                else 
                {
                
                }
            }
        }
        
    }
    
    //metodo depositar
    public void depositar(float valorDeposito)
    {
        //primeiro mostra saldo atual
        //System.out.println("Saldo atual: " + this.getSaldo());
        if(this.getStatus() == true)
        {
            this.setSaldo(this.getSaldo() + valorDeposito);
        }
        else
        {
            System.out.println("Conta desativada. Impossível depositar.");
        }
        
    }
    
    //método sacar
    public void sacar(float valorSaque)
    {
        if(this.getSaldo() > 0 && this.getSaldo() >= valorSaque && this.getStatus() == true)
        {
            this.setSaldo(this.getSaldo() - valorSaque);
        }
        else
        {
            System.out.println("Saldo insuficiente para saque");
        }
    }
    
    //método pagarMensal
    public void pagarMensal()
    {
        if(this.getTipo() == "CC" && this.getStatus() == true && this.getSaldo() > 0)
        {
            //Mostra saldo para usuário antes de debitar a mensalidade
           // System.out.println("Saldo atual: " + this.getSaldo());
            //Debita mensalidade
            this.setSaldo(this.getSaldo() - 12.00f);
            //Mostra mensagem de sucesso e o saldo após débito
            //System.out.println("Mensalidade debitado com sucesso.");
            //System.out.println("Saldo atual: " + this.getSaldo());
        }
        else
        {
            if(this.getTipo() == "CP" && this.getStatus() == true && this.getSaldo() > 0)
            {
                //Mostra saldo para usuário antes de debitar a mensalidade
                //System.out.println("Saldo atual: " + this.getSaldo());
                //Debita mensalidade
                this.setSaldo(this.getSaldo() - 20.00f);
                //Mostra mensagem de sucesso e o saldo após débito
                //System.out.println("Mensalidade debitado com sucesso.");
                //System.out.println("Saldo atual: " + this.getSaldo());
            }
            else
            {
            
            }
        }
    }
    //Método para mostrar o estado atual
    public void mostraStatusAtual()
    {
        System.out.println("Titular da conta: " + this.getDono());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Status da conta: " + this.getStatus());
        System.out.println("Saldo da conta: " + this.getSaldo());        
    }
}