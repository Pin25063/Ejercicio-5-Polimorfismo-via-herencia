import java.util.ArrayList;
//Jose Pinto 25063
public class TaskManager {
    private ArrayList<Proceso> procesos = new ArrayList<>();

    public void registrarProceso(Proceso p){
        procesos.add(p);
    }
    //Metodo donde se agregan todos los procesos a la lista para ejecutarlas luego
    public void ejecutarTodos(){
        Proceso proceso1 = new ProcesoCpu(527, "Calculo complejo");
        Proceso proceso2 = new ProcesoIO(432, "Verificacion de numero par");
        Proceso proceso3 = new ProcesoDaemon(967, "Ejecucion de antivirus");
        Proceso proceso4 = new ProcesoImpresion(874, "Proceso de impresion", 3);
        Proceso proceso5 = new ProcesoCompresion(941, "Compresion de datos", "/Descargas", "/Deskstop", 150);
        registrarProceso(proceso1);
        registrarProceso(proceso2);
        registrarProceso(proceso3);
        registrarProceso(proceso4);
        registrarProceso(proceso5);
    }

    public ArrayList<Proceso> getProcesos() {
        return procesos;
    }
}
