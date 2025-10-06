//Jose Pinto 25063
public class ProcesoIO extends Proceso{

    public ProcesoIO(int pid, String nombre) {
        super(pid, nombre);
    }
    //Metodo ejecutar que simula el proceso de entrada y salida
    @Override
    public String ejecutar() {
        int num = Vista.pedirDatosProceso();
        if (num%2 == 0){
            return "Este numero es par";
        }
        return "Este numero es impar";
    }
    //To string que muestra la informacion del proceso
    @Override
    public String toString(){
        return "Proceso de IO: numero de proceso " + pid + " Nombre: " + nombre;
    }
}
