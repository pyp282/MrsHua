package test.lister;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by pei on 2017/2/25.
 */
public class MyTransformer implements IAnnotationTransformer{
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if("test01".equals(testMethod.getName())){
            annotation.setInvocationCount(5);
        }
    }
}
