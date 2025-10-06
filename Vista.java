//Jose Pinto 25063
import java.util.Scanner;
//Clase que realizara los print en pantalla
public class Vista {
    public void mostrarMenu(){
        System.out.println("""
                Se ejecutaran procesos simulando un sencillo sistema operativo. 
                Se ejecutara:
                1. Un proceso de CPU
                2. Un proceso de IO
                3. Un proceso Daemon 
                4. Un proceso de Impresion
                5. Un proceso de compresion 
                """);
    }
    public static int pedirDatosProceso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver si es par o impar");
        int a = sc.nextInt(); sc.nextLine();
        return a;
    }

    public void mostrarMensaje(String msg){
        System.out.println(msg);
    }
}

