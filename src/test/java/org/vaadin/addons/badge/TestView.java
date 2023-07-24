package org.vaadin.addons.badge;

import org.vaadin.addons.webcam.Webcam;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.router.Route;

/**
 * Test View for our {@link Webcam} add-on class. This class and others in the
 * test folder will not be included in the final JAR.
 */
@Route("")
@CssImport("./styles.css")
public class TestView extends VerticalLayout implements AppShellConfigurator {

    public TestView() {
        HorizontalLayout layout = new HorizontalLayout();
        Webcam webcam = new Webcam();
        webcam.setWidth(320);
        webcam.setHeight(240);
        webcam.setControls(true);
        webcam.setLabel("Shoot me!");
        webcam.addValueChangeListener(event -> {
            Image image = new Image();
            image.setWidth("320px");
            image.setSrc(webcam.getValue());
            layout.add(image);
        });
        webcam.setTooltipText("Shoot me!");
        webcam.setHelperText("You can also click the camera view to shoot");
        add(webcam);
        add(layout);
    }

}
