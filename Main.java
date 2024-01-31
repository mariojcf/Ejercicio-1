import java.io.IOException; 

public class Main{

    public static void main(String[] args){
        ProcessBuilder pb = new ProcessBuilder( "docto.exe");
        try{
            Process proceso = pb.start();
            int estado = proceso.waitFor();
            System.out.println("El programa termino con estado" + estado);
        }catch(IOException| InterruptedException e){
            e.printStackTrace();

        }
    }
}
