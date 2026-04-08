public abstract class Aviao {
    private Tripulacao tripulacao;
    private String modelo;
    public Aviao(String modelo, Tripulacao tripulacao) {
        this.modelo = modelo;
        this.tripulacao = tripulacao;

    }

    public  String getModelo() {return this.modelo;};

    public  String getComposicaoDaTripulacao(){
        return this.tripulacao.getComposicaoDaTripulacao();
    };

























}
