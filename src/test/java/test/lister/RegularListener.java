package test.lister;

import org.testng.*;
import org.testng.internal.ConstructorOrMethod;

import java.lang.annotation.Annotation;

/**
 * Created by pei on 2017/2/26.
 */

public class RegularListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        ConstructorOrMethod constructorOrMethod = method.getTestMethod().getConstructorOrMethod();
        Annotation disable = constructorOrMethod.getMethod().getDeclaringClass().getAnnotation(DisableListener.class);
        if(disable != null) {
            return;
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

    }
}
