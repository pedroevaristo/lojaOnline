package Cliente;

public class informacoes {
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private String CEP;//Ou será que eu uso int?


    //colocar confirmação de login por e-mail e senha
    public informacoes(String nome, String sobrenome, String email, String senha, String CEP) {
        this.nome = nome;   //entender sobre essa parte do código
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.CEP = CEP;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

}

