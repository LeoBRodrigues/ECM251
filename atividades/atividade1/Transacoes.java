import java.util.Random;

public class Transacoes {


    public static String QRcode(Conta conta, double valor)
    {
        return String.format("%d;%s;%f;%d", conta.getID(), conta.getUsuario().getNome(), valor, getRandomNumberInRange(1000, 9999));
    }

    public static void pagar(Conta de, Conta para, String QRcode)
    {
        String[] dados = QRcode.split(";");
        double valor = Double.parseDouble(dados[2]);

        if(de.sacar(valor))
        {
            para.deposositar(valor);
            System.out.println("Transação de ID: " + dados[3] + " para a conta " + dados[0] + " foi realizada com sucesso." );
        }
        else 
        {
            System.out.println("Não foi possível completar a transação");
        }
        

    }

    // gerador de números aleatórios

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
        }
}