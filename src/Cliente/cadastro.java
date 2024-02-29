package Cliente;
import java.util.Scanner;
public class cadastro {
    public void cadastrando(){
        //fazer um hashmap aqui para armazena e depois repassar ao banco de dados

        Scanner sc = new Scanner(System.in);


    // fazer com se toda vez que entrar aqui vai ser + 1

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
        System.out.println("CEP ");//fazer a verificação por meio de api que consulta se o cep realmente existe
        String cep = sc.next();

        System.out.println("armazenando...\n");
        // aqui vou criar uma chave de id para cada user cadastrado
        informacoes info = new informacoes(nome, sobrenome, email, senha, cep);

    }


}
