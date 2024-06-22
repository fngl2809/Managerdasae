public class ManagerApp {

    public static void main (String[] args) throws Exception {
        Manager manager = new Manager("fiona", "google");
        manager.sayHello ("fiona");

        VicePresident vp = new VicePresident("fiona", "google");
        vp.sayHello("fiona");
    }
}