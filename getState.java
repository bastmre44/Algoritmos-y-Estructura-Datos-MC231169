public class getState {
    public boolean statusradio = false;

    void status() {
        if (statusradio == false) {
            System.out.println("La radio está apagada.");
        } else {
            System.out.println("La radio está encendida.");
        }
    }
}
