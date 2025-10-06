//Jose Pinto 25063
//Clase abstracta que se vuelve base de el resto de procesos
public abstract class Proceso {
    protected int pid;
    protected String nombre;

    public Proceso(int pid, String nombre){
        this.pid = pid;
        this.nombre = nombre;
    }
    //Metodos abstractos que deben de ser sobre escritos en las clases heredadas
    public abstract String ejecutar();
    public abstract String toString();
    //Getters y setters
    public int getPid() {
        return pid;
    }
    public String getNombre() {
        return nombre;
    }
}