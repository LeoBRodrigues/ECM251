
public class Conta {

    private double saldo;
    private Usuario usuario;
    private int id;
    private static int IDconta = 1;

    public Conta(Usuario usuario, double saldoInicial) 
    {
        this.usuario = usuario;
        this.saldo = saldoInicial;
        this.id = IDconta++;
        
    }


    public void depositar(double valor)
    {
        this.saldo += valor;
    }

    public boolean sacar(double valor)
    {
        if (this.saldo >= valor)
        {
            this.saldo -= valor;
            return true;

        }
        else
        {
            return false;
        }

    }

    public int getID()
    {
        return id;
    }


    public Usuario getUsuario()
    {
        return usuario;
    }
    

    public double getSaldo()
    {
        return saldo;
    }

}