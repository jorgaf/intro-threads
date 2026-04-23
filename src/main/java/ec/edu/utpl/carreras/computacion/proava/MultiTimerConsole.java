package ec.edu.utpl.carreras.computacion.proava;

/**
 * Hello world!
 */
public class MultiTimerConsole {
    public static void main(String[] args) throws InterruptedException {
        TimerTask timerA = new TimerTask("Temporizador A", 8);
        TimerTask timerB = new TimerTask("Temporizador B", 5);
        TimerTask timerC = new TimerTask("Temporizador C", 3);

        Thread hiloA = new Thread(() -> timerA.run(), "Hilo-A");
        Thread hiloB = new Thread(() -> timerB.run(), "Hilo-B");
        Thread hiloC = new Thread(() -> timerC.run(), "Hilo-C");

        hiloA.start(); hiloB.start(); hiloC.start();

        try {
            hiloA.join();
            hiloB.join();
            hiloC.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(">>> Todos los temporizadores han finalizado.");
    }
}
