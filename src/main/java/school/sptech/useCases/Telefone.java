package school.sptech.useCases;

public class Telefone {
    private final String value;

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
