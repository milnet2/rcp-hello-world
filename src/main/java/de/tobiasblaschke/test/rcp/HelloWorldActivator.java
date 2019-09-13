package de.tobiasblaschke.test.rcp;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorldActivator implements BundleActivator {
    public void start(final BundleContext bundleContext) throws Exception {
        System.out.println("Hello World from Activator!");
    }

    public void stop(final BundleContext bundleContext) throws Exception {

    }
}
