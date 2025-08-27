package school.sptech.interfaces;

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
        if (rendaMensal < 3.000){
            return ALTO;
        } else if(rendaMensal > 6.000 && idade > 30){
            return BAIXO;
        } else {
            return MEDIO;
        }
}


}
