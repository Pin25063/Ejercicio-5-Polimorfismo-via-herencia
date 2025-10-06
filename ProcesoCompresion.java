//Jose Pinto 25063
public class ProcesoCompresion extends Proceso {
    private String origen;
    private String destino;
    private int tamanoMB; // tamaño estimado

    public ProcesoCompresion(int pid, String nombre, String origen, String destino, int tamanoMB) {
        super(pid, nombre);
        this.origen = origen;
        this.destino = destino;
        this.tamanoMB = tamanoMB;
    }
    //Ejecucion de proceso simulando la compresion de archivos
    @Override
    public String ejecutar() {
        // Simulación: comprimir al 60%
        int comprimido = (int) Math.ceil(tamanoMB * 0.6);
        return "BACKUP: " + origen + " → " + destino + " (" + tamanoMB + "MB → " + comprimido + "MB). \nCompletado.";
    }
    //To string mostrando los datos del proceso
    @Override
    public String toString() {
        return "Proceso de BackUp: numero de proceso: " + pid + " nombre: " + nombre;
    }
}
