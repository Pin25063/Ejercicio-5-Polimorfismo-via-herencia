//Jose Pinto 25063
public class ProcesoImpresion extends Proceso {
    private int paginas;

    public ProcesoImpresion(int pid, String nombre, int paginas) {
        super(pid, nombre);
        this.paginas = paginas;
    }
    //Metodo que simula el proceso de imprimir paginas
    @Override
    public String ejecutar() {
        return "Imprimiendo " + paginas + " páginas en modo simplex. \nListo.";
    }
    //To string que muestra informacion del proceso
    @Override
    public String toString() {
        return "Proceso de impresion: numero de proceso: " + pid + " nombre: " + nombre;
    }
}
