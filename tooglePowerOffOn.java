public class tooglePowerOffOn {
    private boolean AMFM = false;
    private String frecuencia;

    void toggleAMFM() {
        if (AMFM == false) {
            frecuencia = "FM";
        } else {
            frecuencia = "AM";
        }
        AMFM = !AMFM;
    }

    void getStateAMFM() {
        System.out.println("La radio está en " + frecuencia);
    }

    public static void main(String[] args) {
        tooglePowerOffOn radio = new tooglePowerOffOn();

        radio.toggleAMFM();

        radio.getStateAMFM();
    }
}
