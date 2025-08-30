package school.sptech.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Telefone {
    private String value;

    protected Telefone() {
    }

    public Telefone(String value) {
        if (value == null || value.replaceAll("\\D", "").length() < 10) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
