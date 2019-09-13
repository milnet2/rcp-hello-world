Simple RCP hello-world application
==================================

The application will print "Hello World" to the console. Once from the Bundle-Activator and once from the
application.

Usage
-----

* Download  EclipseRT-OSGi-StarterKit-Mars from
    https://archive.eclipse.org/equinox/drops/R-Mars-201506032000/index.php
* Unpack it into the same directory (so that rt is a sub-folder of the root-directory)
* Run "mvn clean package"
* Run "./rt/rt"

Launch through IDEA
-------------------

Ensure the following prerequisites:
* OSGi-Framework is set up (does not need but can be the rt-directory)
* Bundle has the OSGi-facet
* Facet "bundle .jar" has no "File ignore pattern"
* Run "mvn package", so the runtime-dependencies are collected into the rt-dir

Then add a run-configuration of type OSGI using the settings:

* Framework & Bundles
  * OSGi-Framework: Eclipse RT (wherever you have installed it)
  * Framework start level: Auto
  * Default start level: 5
  * Bundles:

    | Bundle                       | Start-Level | Start | Comment                                          |
    |------------------------------|-------------|-------|--------------------------------------------------|
    | org.apache.felix.fileinstall | 1           | X     | Will pick up other bundles                       |
    | org.elipse.equinox.ds        | 2           | X     | Needs to be started early                        |
    | org.eclipse.equinox.console  | 2           |       | Optional                                         |
    | org.eclipse.core.runtime     | 4           | X     | Will start helloworld                            |
    | helloworld                   | 4           |       | Not started by the framework, but by Eclipse     |

* Parameters
  * VM-Options: 
       ```
       -Dfelix.fileinstall.dir=./plugins -Dfelix.fileinstall.noInitialDelay=true -Dfelix.fileinstall.start.level=4 -Dfelix.fileinstall.bundles.new.start=false -Dosgi.instance.area=temp 
       ```
  * Program Parameters:
       ```
       -consoleLog -noExit -console
       ```
  * Runtime directory: The rt-directory from before
  
* Additional framework properties
  * Uncheck: "Launch OSGi console" 
  * Application: de.tobiasblaschke.test.rcp.helloworld
 
 After the launch there will be a couple of stack-traces "File already installed", that can be ignored.