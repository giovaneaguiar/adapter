public class ReprodutorMP3 implements ReprodutorAudio {
    private boolean reproduzindo = false;
    private String ultimoArquivoReproduzido;

    @Override
    public void reproduzir(String arquivo) {
        reproduzindo = true;
        ultimoArquivoReproduzido = "MP3: " + arquivo;
    }

    public boolean estaReproduzindo() {
        return reproduzindo;
    }

    public String getUltimoArquivoReproduzido() {
        return ultimoArquivoReproduzido;
    }
}