package school.sptech.entities;

public enum ClassificacaoRisco {

    BAIXO(1, "Contato automático por e-mail"),
    MEDIO(2, "Análise manual em até 48h"),
    ALTO(1, "Contato telefônico em até 24h + análise crítica");

    private final int prioridade;
    private final String estrategiaContato;

    ClassificacaoRisco(int prioridade, String estrategiaContato) {
        this.prioridade = prioridade;
        this.estrategiaContato = estrategiaContato;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public String getEstrategiaContato() {
        return estrategiaContato;
    }

    public static ClassificacaoRisco avaliarClassificacao(float rendaMensal, int idade){
        if (rendaMensal > 6000 && idade > 30){
            return BAIXO;
        } else if(rendaMensal < 3000){
            return ALTO;
        } else {
            return MEDIO;
        }
}


}
