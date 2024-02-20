package Cliente;

import java.util.Scanner;

public class logins {
    public boolean checar_Login(){
        Scanner sc = new Scanner(System.in);
        informacoes checar = new informacoes();
        System.out.println("Digite seu email e senha");
        String email = sc.nextLine();//qual a diferença entre next e next line
        String senha = sc.next();

       try{
           
       }catch (Exception e){

       }
/*        if(email == checar.getEmail()){//qui tem que buscar informação dos dados inseridos

        }
        if(senha == checar.getSenha()){


        }*/
    }
}
