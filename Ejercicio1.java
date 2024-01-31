import java.io.IOException;

public class Ejercicio1 {
    public static void main(String... args){
        String[] command = {
            ".\\Docto\\docto.exe",
            "-f", ".\\Notasdebate.docx",
            "-O", ".\\Conversion.txt",
            "-T", "wdFormatText"
        };

        ProcessBuilder processBuilder = new ProcessBuilder(command);

        try {
            Process process = processBuilder.start();

            int exitCode = process.waitFor();

            System.out.println("La aplicacion fue executada con código: "+exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}