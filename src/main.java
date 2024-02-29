import ConexaoBD.conexaoBD;
import java.sql.Connection;
import java.util.Scanner;
import Cliente.informacoes;
import Cliente.cadastro;
import ConexaoBD.salvando;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conexao = conexaoBD.conexao();
        cadastro cadastro_User = new cadastro();

        if(conexao == null){
            System.out.println("Problema na conexão com banco de dados");
        }else {
        System.out.println("Bem-vindo ao site");
        System.out.println("Quer fazer digite 1 - Cadastrar-se \n 2 - Login");
        Integer entrar = sc.nextInt();

        switch (entrar){
            case 1:
                System.out.println("Digite as seguintes informações:");
                cadastro_User.cadastrando();

                //orgazniar e repassar as infromações para outra pasta de arquivos
                break;
            case 2:

                break;
        }


    }}
}
