package school.sptech.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Email {
    private String value;

    protected Email() {
    }

    public Email(String value) {
        if (value == null || !value.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
