//Jose Pinto 25063
public class ProcesoCpu extends Proceso{
    public ProcesoCpu(int pid, String nombre) {
        super(pid, nombre);
    }
    //Override del metodo ejecutar que simula el proceso de un calculo complejo de CPU
    @Override
    public String ejecutar() {
        int b = 159871578;
        int a = 351898716;
        double resultado = (double) a /b;
        return "Operando " + a + "/" +b + "\nRealizando calculo complejo...\nEl resultado es " + resultado;
    }
    //To string mostrando informacion del proceso
    @Override
    public String toString(){
        return "Proceso de CPU: numero de proceso " + pid + " Nombre: " + nombre;
    }
}
