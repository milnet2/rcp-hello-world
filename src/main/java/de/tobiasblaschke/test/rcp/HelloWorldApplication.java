package de.tobiasblaschke.test.rcp;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class HelloWorldApplication implements IApplication {
    public Object start(final IApplicationContext iApplicationContext) throws Exception {
        System.out.println("Hello World from Application");
        return IApplication.EXIT_OK;
    }

    public void stop() {

    }
}
