//Jose Pinto 25063
public class Main {
    public static void main(String []args){
        //Crear nuevas instancias de vista y los controladores
        Vista vista = new Vista();
        Controller controller = new Controller(vista);
        //Metodo de ejecucion principal del contrlador
        controller.start();
    }
}
