import ConexaoBD.conexaoBD;
import java.sql.Connection;
import java.util.Scanner;

import Cliente.cadastro;


public class main {
    public static void main(String[] args) {
        conexaoBD.conexao();
        Scanner sc = new Scanner(System.in);
        cadastro cadastro_User = new cadastro();

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
