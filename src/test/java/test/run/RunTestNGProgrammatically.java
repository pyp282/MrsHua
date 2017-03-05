package test.run;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import test.lister.MyTransformer;

import java.util.ArrayList;
import java.util.List;

public class RunTestNGProgrammatically {
    public static void main(String[] args) {
        XmlSuite suite = new XmlSuite();
        suite.setName("TmpSuite");

        XmlTest test = new XmlTest(suite);
        test.setName("TmpTest");

        List<XmlClass> classes = new ArrayList<>();
        classes.add(new XmlClass("test.failures.ChildTest"));

        test.setXmlClasses(classes);

        // pass XmlSuite to TestNG
        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        TestNG tng = new TestNG();
        tng.setXmlSuites(suites);
        tng.setAnnotationTransformer(new MyTransformer());

        tng.run();

    }
}
