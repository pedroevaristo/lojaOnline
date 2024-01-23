import ConexaoBD.conexaoBD;
import java.sql.Connection;
import java.util.Scanner;
import ConexaoBD.conexaoBD;
import Cliente.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conexao = conexaoBD.conexao();
        if(conexao == null){
            System.out.println("Problema na conexão com banco de dados");
        }else {
        System.out.println("Bem-vindo ao site");
        System.out.println("Quer fazer clique 1 - Cadastrar-se \n 2 - Login");
        Integer entrar = sc.nextInt();

        switch (entrar){
            case 1:

                break;
            case 2:

                break;
        }


    }}
}
