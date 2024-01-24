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
public void NextFrequency(){
    if (isFM){
        currentFrequency += 0.2; /// para incrementar la frecuencia 
    if (currentFrequency > 108.of){
        currentFrequency = 87.5;
    }
    } else {
        currentFrequency += 10.of;/// para incrementar la frecuencia AM
    if (currentFrequency > 1700.of){
        currentFrequency = 530.of;  /// para volver a la frecuencia inicail 

    }
    }    
    System.out.println("Frecuencia actual: " + currentFrequency);
    }



    public void PreviousFrequency(){
        if (isFM){
            currentFrequency -= 0.2f; /// para decrementar la frecuencia|
        if (currentFrequency < 87.5){
            currentFrequency = 108.of;

        }
        } else {
            currentFrequency += 10.of;/// para decrementar 
        if (currentFrequency < 530.of){
            currentFrequency = 1700.of;  /// para volver la frecuencia
        }
    } else {
        currentFrequency -= 10.0f; // Decrementa la frecuencia AM por 10 (puedes ajustar este valor)
        if (currentFrequency < 530.0f) {
            currentFrequency = 1700.0f; // Vuelve a la frecuencia máxima si es menor que el límite inferior
        }
    }
    System.out.println("Frecuencia actual: " + currentFrequency);
}
    

