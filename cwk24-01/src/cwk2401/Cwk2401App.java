/*
 * Cwk2401App.java
 */

package cwk2401;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class Cwk2401App extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new Cwk2401View(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of Cwk2401App
     */
    public static Cwk2401App getApplication() {
        return Application.getInstance(Cwk2401App.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(Cwk2401App.class, args);
    }
}
