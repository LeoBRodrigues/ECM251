/*
 Leonardo de Barros Rodrigues
    18.02401-7
*/

public class main{
    public static void main(String[] args){

        Usuario usuario1 = new Usuario("Leo", "1234", "leo@email.com");
        Usuario usuario2 = new Usuario("John", "1234", "John@email.com");
        Usuario usuario3 = new Usuario("Maria", "1234", "Maria@email.com");

        Conta conta1 = new Conta(usuario1, 1000);
        Conta conta2 = new Conta(usuario2, 250);
        Conta conta3 = new Conta(usuario3, 3000);

        // Operação de Recebimento do Usuario 1
        String QRcode1 = Transacoes.QRcode(conta1, 250);

        // primeiro pagamento do user 2 para 1

        Transacoes.pagar(conta2, conta1, QRcode1);

        // primeiro pagamento do user 3 para 1

        Transacoes.pagar(conta3, conta1, QRcode1);
        
        // primeiro pagamento do user 2 para 1 (dando erro)

        Transacoes.pagar(conta2, conta1, QRcode1);

        // Operação de Recebimento do Usuario 2
        
        String QRcode2 = Transacoes.QRcode(conta2, 1000);

        // primeiro pagamento do user 3 para 2
        Transacoes.pagar(conta3, conta2, QRcode2);

       

    }
}