public class AdaptadorWAVParaMP3 implements ReprodutorAudio {
    private ReprodutorWAV reprodutorWAV;

    public AdaptadorWAVParaMP3(ReprodutorWAV reprodutorWAV) {
        this.reprodutorWAV = reprodutorWAV;
    }

    @Override
    public void reproduzir(String arquivo) {
        reprodutorWAV.reproduzirWAV(arquivo);
    }
}
