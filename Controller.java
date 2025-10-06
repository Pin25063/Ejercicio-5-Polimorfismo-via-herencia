//Jose Pinto 25063
public class Controller {
    private TaskManager taskManager;
    private Vista view;

    public Controller(Vista vista){
        this.taskManager = new TaskManager();
        this.view = vista;
    }
    //Metodo que ejecuta los metodos necesarios para mostrar los procesos
    public void start() {
        //Guarda todos los metodos en la lista Procesos
        taskManager.ejecutarTodos();
        view.mostrarMenu();
        //For que muestra los atributos de los procesos y los ejecuta
        for (Proceso p : taskManager.getProcesos()){
            view.mostrarMensaje(p.toString());
            view.mostrarMensaje(p.ejecutar());
            view.mostrarMensaje("");
        }
    }
}
