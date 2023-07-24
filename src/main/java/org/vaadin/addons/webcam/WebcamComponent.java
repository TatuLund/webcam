package org.vaadin.addons.webcam;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.Focusable;
import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;

@Uses(Icon.class)
@JsModule("./web-cam.ts")
@Tag("web-cam")
class WebcamComponent
        extends AbstractSinglePropertyField<WebcamComponent, String>
        implements HasTheme, Focusable<WebcamComponent> {

    public WebcamComponent() {
        super("image", "", false);
    }

    public void setControls(boolean controls) {
        if (controls) {
            getElement().setProperty("buttons", "flex");
        } else {
            getElement().setProperty("buttons", "none");
        }
    }

    public void setWidth(int width) {
        getElement().setProperty("width", width);
    }

    public void setHeight(int height) {
        getElement().setProperty("height", height);
    }
}
