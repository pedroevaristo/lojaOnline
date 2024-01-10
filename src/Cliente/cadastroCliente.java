package Cliente;

public class cadastroCliente{
    private String nomeCliente;
    private String email;
    private String senhaCliente;
    private String CEP;//Ou será que eu uso int?

    private String getNomeCliente() {
        return nomeCliente;
    }

    private void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getSenhaCliente() {
        return senhaCliente;
    }

    private void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }

    private String getCEP() {
        return CEP;
    }

    private void setCEP(String CEP) {
        this.CEP = CEP;
    }
}
