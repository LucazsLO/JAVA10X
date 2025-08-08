package NivelIntermediario6;

import java.util.Locale;

public record NinjaRecord(String nome, String email, int tel) {
    public String caixaAlta(){
        return email.toUpperCase();
    }
}
