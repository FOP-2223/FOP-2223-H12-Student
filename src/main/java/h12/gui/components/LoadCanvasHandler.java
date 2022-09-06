package h12.gui.components;

import h12.exceptions.JSONParseException;
import h12.gui.shapes.MyShape;
import h12.json.JSON;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static org.tudalgo.algoutils.student.Student.crash;

/**
 * A class handling the loading of a canvas from a JSON file.
 */
class LoadCanvasHandler extends FileOperationHandler {

    private final JSON json;

    private List<MyShape> shapes;
    private Color backgroundColor;

    /**
     * Creates a new {@link LoadCanvasHandler}-Instance.
     *
     * @param controlPanel The {@link ControlPanel} this {@link LoadCanvasHandler} belongs to.
     * @param json         The {@link JSON} object used to parse the contents of the selected file.
     */
    public LoadCanvasHandler(ControlPanel controlPanel, JSON json) {
        super(controlPanel);
        this.json = json;
    }

    /**
     * Shows a {@link JFileChooser} dialog to the user and tries to load the canvas stored in the selected file.
     */
    public void load() {
        crash();
    }

    /**
     * Reads the content of the root of the {@link #json} and saves them in the attributes {@link #shapes} and {@link #backgroundColor}.
     *
     * @throws JSONParseException If the json file does not describe a valid canvas.
     */
    public void canvasFromJSONObject() throws JSONParseException {
        crash();
    }

    /**
     * Creates and shows a new {@link MainFrame} with the contents of the attributes {@link #shapes} and {@link #backgroundColor}.
     */
    public void setupNewFrame() {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setLocation(mainFrame.getX() + 25, mainFrame.getY() + 25);
        mainFrame.getContentPanel().addAll(shapes);
        mainFrame.getContentPanel().setBackground(backgroundColor);
        mainFrame.setVisible(true);
    }

}
