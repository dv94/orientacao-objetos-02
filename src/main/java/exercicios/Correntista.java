package exercicios;

public class Correntista {
    public String codigo;
    public String nome;
    public String email;
    public String telefone;

    public Correntista(){

    }

    public Correntista(String codigo, String nome, String email, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getCodigoCliente(){
        return this.codigo +","+ this.nome +","+ this.email +","+ this.telefone;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
