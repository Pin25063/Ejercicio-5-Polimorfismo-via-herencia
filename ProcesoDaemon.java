//Jose Pinto 25063
public class ProcesoDaemon extends Proceso{
    public ProcesoDaemon(int pid, String nombre) {
        super(pid, nombre);
    }
    //Metodo sobre escrito para simular un proceso de antivirus
    @Override
    public String ejecutar() {
        return "Ejecutando antivirus...\nNingun virus detectado";
    }
    //To string mostrando informacion del proceso
    @Override
    public String toString(){
        return "Proceso Daemon: numero de proceso " + pid + " Nombre: " + nombre;
    }
}
