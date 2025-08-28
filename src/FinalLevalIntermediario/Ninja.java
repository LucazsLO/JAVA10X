package FinalLevalIntermediario;

public class Ninja {
    private String name;
    private int idade;
    private String aldeia;

    public Ninja(String aldeia, int idade, String name) {
        this.aldeia = aldeia;
        this.idade = idade;
        this.name = name;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "aldeia='" + aldeia + '\'' +
                ", name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }
}
