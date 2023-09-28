public class AdaptadorWAVParaMP3 implements ReprodutorAudio {
    private ReprodutorWAV reprodutorWAV;

    public AdaptadorWAVParaMP3(ReprodutorWAV reprodutorWAV) {
        this.reprodutorWAV = reprodutorWAV;
    }

    @Override
    public void reproduzir(String arquivo) {
        String arquivoConvertido = converterWAVParaMP3(arquivo);
        reprodutorWAV.reproduzirWAV(arquivoConvertido);
    }

    private String converterWAVParaMP3(String arquivoWAV) {
        return arquivoWAV.replace(".wav", ".mp3");
    }
}
