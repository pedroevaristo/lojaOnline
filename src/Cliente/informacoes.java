package Cliente;

public class informacoes {
    private int id_user;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private int CEP;//Ou será que eu uso int?



    //colocar confirmação de login por e-mail e senha
    public informacoes(int id_User, String nome, String sobrenome, String email, String senha, int CEP) {//construtor
        this.id_user = id_User;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.CEP = CEP;

    }

    public int getId_User() {
        return id_user;
    }
    public void setId_User(int id_User) {
        this.id_user = id_User;
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

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

}

