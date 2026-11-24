import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AppArquivo {

    public static void salvar(String texto) throws IOException {
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("/relatorio.txt"))) {
            bw.write(texto);
        } // o BufferedWriter e fechado automaticamente
    }

    public static void main(String[] args) throws IOException{
        salvar("Ola mundo");
    }
}
