import java.io.IOException;

public class ConvertidorDocTo {
    public static void main(String[] args) {
        // Ruta del archivo .doc a convertir
        String inputFile = "C:\\Users\\MarioCorado\\OneDrive\\Desktop\\Ejercicio#1\\MyFile.doc";

        // Ruta de salida del archivo convertido
        String outputFile = "C:\\Users\\MarioCorado\\OneDrivre\\Desktop\\Carpeta\\Ejercicio1.txt";

        // Comando para ejecutar DocTo
        String command = "docto -f " + inputFile + " -O \"" + outputFile + "\" -T wdFormatText";

        try {
            // Crear el proceso para ejecutar el comando
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", command);

            // Redirigir la salida estándar y la salida de error a la consola
            processBuilder.inheritIO();

            // Ejecutar el proceso
            Process process = processBuilder.start();

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();

            // Verificar el código de salida
            if (exitCode == 0) {
                System.out.println("Conversión exitosa");
            } else {
                System.err.println("Error en la conversión. Código de salida: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
