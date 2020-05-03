package chapter10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        MyClassLoader classLoader = new MyClassLoader();
        Class<?> aClass = classLoader.loadClass("chapter10.HelloWorld");
        System.out.println(aClass.getClassLoader());

        //
        Object helloWolrd = aClass.newInstance();
        System.out.println(helloWolrd);
        Method welcomeMethod = aClass.getMethod("welcome");
        String result = (String) welcomeMethod.invoke(helloWolrd);
        System.out.println("Result: " + result);
    }
}
