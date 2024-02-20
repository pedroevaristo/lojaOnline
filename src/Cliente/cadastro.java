package Cliente;
import java.util.Scanner;

public class cadastro {
    public void cadastrando(){
        private
        informacoes info = new informacoes();
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite as informações abaixo: ");
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Sobrenome: ");
        String sobrenome = sc.next();
        System.out.println("email: ");
        String email = sc.next();
        System.out.println("Senha ");
        String senha = sc.next();
        //System.out.println(""); aqui fazer um verificador se a senha é forte, um sistema proprio
        System.out.println("CEP ");
        String cep = sc.next();


        //fazer a verificação por meio de api que consulta se o cep realmente existe

        System.out.println("armazenando...\n");
        info_User = info();

    }
}
