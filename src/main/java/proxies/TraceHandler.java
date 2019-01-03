package proxies;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//the proxy class can create brand-new classes at runtime.
//a proxy class implements the interfaces that you specify.
//this example uses proxies and invocation handlers to trace method calls

public class TraceHandler implements InvocationHandler {
private Object target;
public TraceHandler(Object t) {
        target = t;
}

public Object invoke(Object proxy, Method m, Object[] args)
        throws Throwable {
// print method name and parameters
        ...
// invoke actual method
        return m.invoke(target, args);
    }
}

//Note to self - see page 355 for all proxy properties