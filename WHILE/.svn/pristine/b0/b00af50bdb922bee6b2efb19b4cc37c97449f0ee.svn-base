Notes on the WHILE language project.

This project implements some static analyses for the WHILE language
of the book Principles of Program Analysis by Nielson, Nielson and Hankin.

The main files are:
  - ScannerPrelude.flex, ScannerBody.flex, and ScannerEnd.flex, which together
    make up the lexical grammar input (for JFlex)
  - ParserPrelude.parser, and ParserWHILERules.parser, which together
    make up the context-free grammar (for Beaver)
  - WHILE.ast, which defines the Abstract Syntax Trees for the WHILE language.
  - build.xml, which is an ant build file
  
There is also an extension to add assert statements to the language.
This is found in the files:
  - ScannerAssert.flex, which adds the lexical syntax (in JFlex)
  - ParserAssertRules.flex, which adds the contex-free syntax (for Beaver)
  - WHILEAssert.ast, which adds the ASTs for assert statements

And another extension is to add read, sanitize, and print statements
to the language (for Taint analysis). These are found in the files:
  - ScannerTaint.flex, which adds the lexical syntax (in JFlex)
  - ParserTaintRules.flex, which adds the contex-free syntax (for Beaver)
  - WHILETaint.ast, which adds the ASTs.
  
Various analyses are given in .jrag and .jadd files in the top directory.
Some have explicit extensions for the assert statements; if there is no
additional file *Assert.jrag, it means that such a file was not needed.
Extensions for the Taint language are found in files *Taint.jrag.

The directory apps contains Java applications (main programs) that can be run for testing.

There are JUnit tests (built with JUnit 3) in the tests package/directory.

The tools/junit.jar file contains JUnit 3. The tools/jastadd2.jar file contains JastAdd2.
Also tools/beaver.jar contains the Beaver runtime. These should be the only jar files
needed to run the tests and apps from the command line.

Input files for the tests are found in the testsrc folder. Programs are in files named *.wh.
Note that tc[1-3].wh have intentional type errors, for checking the type checker.
  
WORKING IN ECLIPSE
  
To build the system, make a external tool configuration
(using Run > External Tools > External Tool Configurations...)
and make one for ant, by following the directions at
http://jastadd.org/old/manual/running-jastadd-under-eclipse.php#ANT
I made targets gen, build, and cleanGen (which run ant gen, ant gen build, and ant cleanGen).
Note that you will need to use the menus to insert ${project_loc} into the external tool configuration,
as typing that in by hand doesn't seem to have the same effect as selecting project_loc from the menu.
  
To run the apps it is important to use a run configuration where you add the project directory
itself to the CLASSPATH. This can be done by creating a run configuration
(by selecting the WHILEChecker.java file, right click, select Run as > Run Configurations...) 
and then select the Classpath tab, select the "(default classpath)" entry on the bottom,
then click the "Advanced" button on the right side, and then select the "Add Folders" button and click OK;
then when the dialog prompts you to select a folder, select the root of this project
(that is, the directory containing this file).
You will also have to give the run configuration arguments (in the "(x)= args" tab).
Finally, you must name the right class (e.g., apps.WHILEChecker) in the "(C) Main" tab. 

To run the JUnit (3) tests in the tests package, 
first select a file in that package (such as CFGTests.java), then
right click on Run As > Run Configurations...
Then create a JUnit run configuration (press the New button, 
at the top left of the run configurations dialog)
and adjust the classpath as above, making the project directory an element of the classpath.

ACKNOWLEDGMENTS

This project benefited greatly from the work and advice of Ghaith Haddad.
Thanks to Ghaith Haddad and Rochelle Elva for their help on the project.
