package Cliente;

public class informacoes {
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private int cep;//Ou será que eu uso int?



    //colocar confirmação de login por e-mail e senha
    private informacoes(int id, String nome, String sobrenome, String email, String senha, int cep) {//construtor
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.cep = cep;

    }

    private informacoes(informacoesBuilder infBuilder){
        this.id = infBuilder.id;
        this.nome = infBuilder.nome;
        this.sobrenome = infBuilder.sobrenome;
        this.email = infBuilder.email;
        this.senha =  infBuilder.senha;
        this.cep = infBuilder.cep;
    }

    public informacoesBuilder geInformacoesBuilder(){
        return new informacoesBuilder();
    }

    public static class informacoesBuilder{
        private int id;
        private String nome;
        private String sobrenome;
        private String email;
        private String senha;
        private int cep;

        public informacoesBuilder Id(int id){
            this.id = id;
            return this;
        }
        public informacoesBuilder Nome(String nome){
            this.nome = nome;
            return this;
        }
        public informacoesBuilder Sobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }
        public informacoesBuilder Email(String email){
            this.email = email;
            return this;
        }
        public informacoesBuilder Senha(String senha){
            this.senha = senha;
            return this;
        }
        public informacoesBuilder CEP(int cep){
            this.cep = cep;
            return this;
        }

        public informacoes build(){
            return new informacoes(id, nome, sobrenome, email, senha, cep);
        }

    }

}

