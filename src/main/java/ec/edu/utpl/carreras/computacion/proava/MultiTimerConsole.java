package ec.edu.utpl.carreras.computacion.proava;
public class MultiTimerConsole {
    public static void main(String[] args) {
        TimerTask timerA = new TimerTask("Temporizador A", 8);
        timerA.run();
        System.out.println();
    }
}
