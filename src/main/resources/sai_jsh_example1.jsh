// java_shell_code contents.

/* If you observe it does not need a class declaration.
 Using the power of jshell,
 we can write functions and call functions with out creating class,
 just like functional programming */

 // You can also include comments like above, anywhere in the script

String var1 = "Hello";
System.out.println(var1);

public int getInt1(){
    return 2;
}

public int getInt2(){
    return 4;
}

getInt1() + getInt2();

public class MyClass{
    public void sayHelloWorld(){
        System.out.println("HelloWorld");
    }
}

new MyClass().sayHelloWorld()