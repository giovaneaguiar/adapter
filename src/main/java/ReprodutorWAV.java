public class ReprodutorWAV {
    private boolean reproduzindo = false;
    private String ultimoArquivoReproduzido;

    public void reproduzirWAV(String arquivo) {
        reproduzindo = true;
        ultimoArquivoReproduzido = "WAV: " + arquivo;
    }

    public boolean estaReproduzindo() {
        return reproduzindo;
    }

    public String getUltimoArquivoReproduzido() {
        return ultimoArquivoReproduzido;
    }
}