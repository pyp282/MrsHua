package test.lister;

import org.testng.*;
import org.testng.internal.ConstructorOrMethod;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pei on 2017/2/25.
 */
public class MyInterceptor implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
        List<IMethodInstance> result = new ArrayList<>();

        return null;
    }

    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }
}
