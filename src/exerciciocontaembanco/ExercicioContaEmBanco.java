package exerciciocontaembanco;

public class ExercicioContaEmBanco {

    public static void main(String[] args) {
        
        //Crio a conta do primeiro (p) cliente (Cliente)
        ContaBanco pCliente = new ContaBanco();
        
        //Defino os valores para os atributos do primeiro cliente
        pCliente.setDono("Jubileu");
        pCliente.setNumConta(430);
        pCliente.setTipo("CP");
        pCliente.setStatus(true);
        pCliente.depositar(300.00f);
        pCliente.abrirConta();
      
        //chama o método que mostra as informações definidas
        pCliente.mostraStatusAtual();
        
        //pular linha entre as informações
        System.out.println("");
        
        //Crio a conta do primeiro (p) cliente (Cliente)
        ContaBanco sCliente = new ContaBanco();
        
        //Defino os valores para os atributos do primeiro cliente
        sCliente.setDono("Creusa");
        sCliente.setNumConta(432);
        sCliente.setTipo("CC");
        sCliente.setStatus(true);
        sCliente.depositar(500.00f);
        sCliente.abrirConta();
      
        //chama o método que mostra as informações definidas
        sCliente.mostraStatusAtual();
        
        //pular linha
        System.out.println("");
        //Mensagem
        System.out.println("Creusa vai sacar R$ 100");
        
        //chama método sacar
        sCliente.sacar(100.00f);
        
        //pula linha
        System.out.println("");
        
        //chama o método que mostra as informações definidas
        sCliente.mostraStatusAtual();
        
        //pula linha
        System.out.println("");
        
        //Sacar mais que o saldo existente
        System.out.println("Creusa vai sacar mais que o saldo: 1000 reais");
        
        //pular linha
        System.out.println("");
        
        sCliente.sacar(1000.00f);
        
        //pular linha
        System.out.println("");
        
        System.out.println("Debitar mensalidade dos clientes");
        
        //pular linha
        System.out.println("");
        
        //chama método para debitar mensalidade
        pCliente.pagarMensal();
        sCliente.pagarMensal();
        
        //pular linha
        System.out.println("");
        
        //mostra status atual das contas
        pCliente.mostraStatusAtual();
        
        //pular linha
        System.out.println("");
        
        //mostra status atual das contas
        sCliente.mostraStatusAtual();
        
        //pular linha
        System.out.println("");
        
        //mensagem
        System.out.println("Vamos fechar a conta do Jubileu:");
        
        //pular linha
        System.out.println("");
        
        pCliente.fecharConta();
                
        //vou fazer um saque na conta do Jubileu
        pCliente.sacar(430.00f);
        
        //pular linha
        System.out.println("");
        pCliente.fecharConta();
    }
    
}
