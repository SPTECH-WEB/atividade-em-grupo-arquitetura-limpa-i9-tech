package school.sptech.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Cpf {
    private String value;

    protected Cpf() {
    }

    public Cpf(String value) {
        if (value == null || !value.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
