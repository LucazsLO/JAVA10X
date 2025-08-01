package NivelIntermediario5;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoes;
    private final double altura= 2.80;

    public Ninja(String aldeia, int idade, String nome, int numeroDeMissoes) {
        this.aldeia = aldeia;
        this.idade = idade;
        this.nome = nome;
        this.numeroDeMissoes = numeroDeMissoes;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeMissoes() {
        return numeroDeMissoes;
    }

    public void setNumeroDeMissoes(int numeroDeMissoes) {
        this.numeroDeMissoes = numeroDeMissoes;
    }
}
