package NivelIntermediario5;

public enum RankingDeMissoes {
    D("baixa ", 2),
    C("moderado ", 3 ),
    B("Confortavel ", 4),
    A("Dificil ", 5),
    S("Altissimo", 12);

    private String Descricao;
    private int Dificuldade;

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getDificuldade() {
        return Dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        Dificuldade = dificuldade;
    }

    RankingDeMissoes(String Descricao, int Dificuldade) {
        this.Descricao = Descricao;
        this.Dificuldade = Dificuldade;

    }
}