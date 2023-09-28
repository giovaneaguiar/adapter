public class TraducaoAdapter extends Traducao {
    private ITraducao traducaoTexto;

    public TraducaoAdapter(ITraducao traducaoTexto) {
        this.traducaoTexto = traducaoTexto;
    }

    @Override
    public String traduzir(String codigoIdioma) {
        String textoDoCodigo = traduzirCodigoParaTexto(codigoIdioma);
        return traducaoTexto.traduzir(textoDoCodigo);
    }

    private String traduzirCodigoParaTexto(String codigoIdioma) {
        if (codigoIdioma.equals("en")) {
            return "Inglês";
        } else if (codigoIdioma.equals("es")) {
            return "Espanhol";
        } else {
            return "Desconhecido";
        }
    }
}