package org.vaadin.addons.webcam;

import com.vaadin.flow.component.customfield.CustomField;

/*
 * 
 */
public class Webcam extends CustomField<String> {

    WebcamComponent webcam = new WebcamComponent();

    /**
     * The default constructor.
     */
    public Webcam() {
        this(null);
    }

    /**
     * Create a Webcam with a given label.
     * 
     * @param label
     */
    public Webcam(String label) {
        setLabel(label);
        setWidth(640);
        setHeight(480);
        add(webcam);
        webcam.addFocusListener(e -> {
            fireEvent(new FocusEvent<Webcam>(this, e.isFromClient()));
        });
        webcam.addBlurListener(e -> {
            fireEvent(new BlurEvent<Webcam>(this, e.isFromClient()));
        });
        webcam.addValueChangeListener(e -> {
            setModelValue(e.getValue(), true);
        });
    }

    /**
     * Set the width of the cam area in pixels.
     * 
     * @param width int value
     */
    public void setWidth(int width) {
        webcam.setWidth(width);
    }

    /**
     * Set the height of the cam area in pixels

     * @param height int value
     */
    public void setHeight(int height) {
        webcam.setHeight(height);
    }

    /**
     * Show control buttons if true.
     * 
     * @param controls boolean value.
     */
    public void setControls(boolean controls) {
        webcam.setControls(controls);
    }

    @Override
    protected String generateModelValue() {
        return webcam.getValue();
    }

    @Override
    protected void setPresentationValue(String newPresentationValue) {
        webcam.setValue(newPresentationValue);
    }
}
