import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReprodutorAudioTest {
    @Test
    public void testAdaptadorWAVParaMP3() {
        ReprodutorWAV reprodutorWAV = new ReprodutorWAV();

        ReprodutorAudio adaptador = new AdaptadorWAVParaMP3(reprodutorWAV);

        String arquivoWAV = "musica.wav";

        adaptador.reproduzir(arquivoWAV);

        assertTrue(reprodutorWAV.estaReproduzindo());

        String ultimoArquivoReproduzido = reprodutorWAV.getUltimoArquivoReproduzido();
        assertTrue(verificarExtensaoMP3(ultimoArquivoReproduzido));
    }

    // Método de verificação simples para a extensão MP3
    private boolean verificarExtensaoMP3(String arquivo) {
        return arquivo.toLowerCase().endsWith(".mp3");
    }
}
