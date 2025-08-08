package NivelIntermediario6;

public class Ninja {

    private final String nome;
    private final String email;
    private final int tel;

    public Ninja(String email, String nome, int tel) {
        this.email = email;
        this.nome = nome;
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public int getTel() {
        return tel;
    }
}
