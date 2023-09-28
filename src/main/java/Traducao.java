public class Traducao implements ITraducao {
    @Override
    public String traduzir(String texto) {
        return "Tradução: " + texto;
    }
}