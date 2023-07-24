package org.vaadin.addons.badge;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

import com.vaadin.flow.component.html.testbench.DivElement;
import com.vaadin.flow.component.html.testbench.SpanElement;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.testbench.screenshot.ImageFileUtil;

public class BadgeIT extends AbstractViewTest {

    @Override
    public void setup() throws Exception {
        super.setup();

        // Hide dev mode gizmo, it would interfere screenshot tests
        $("vaadin-dev-tools").first().setProperty("hidden", true);
    }

}
