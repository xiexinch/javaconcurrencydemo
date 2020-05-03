package chapter10;

public class NameSpace {
    public static void main(String[] args) throws ClassNotFoundException {
        // ClassLoader classLoader = NameSpace.class.getClassLoader();
        MyClassLoader myClassLoader = new MyClassLoader();
        BrokerDelegateClassLoader brokerDelegateClassLoader = new BrokerDelegateClassLoader();
        Class<?> aClass = myClassLoader.loadClass("chapter10.Test");
        Class<?> bClass = brokerDelegateClassLoader.loadClass("chapter10.Test");
        System.out.println(aClass.getClassLoader());
        System.out.println(bClass.getClassLoader());
        System.out.println(aClass.hashCode());
        System.out.println(bClass.hashCode());
        System.out.println(aClass == bClass);
    }
}
