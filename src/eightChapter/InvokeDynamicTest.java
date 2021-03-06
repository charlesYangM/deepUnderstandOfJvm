package eightChapter;

import java.lang.invoke.*;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * Created by CharlesYang on 2018/1/31.
 */
public class InvokeDynamicTest {
    public static void main(String[] args) throws Throwable {
        INDY_BoostrapMethod().invokeWithArguments("haha");
    }
    public static void testMethod(String s){
        System.out.println("hello String : "+ s);
    }

    private static CallSite BootstrapMethod(MethodHandles.Lookup lookup,String name ,MethodType mt) throws Throwable{
        return new ConstantCallSite(lookup.findStatic(InvokeDynamicTest.class,name,mt));
    }
    public static MethodType MT_BootstrapMethod(){
        return MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;" +
                "Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;",null);
    }
    private static MethodHandle MH_BootstrapMethod() throws Throwable{
        return lookup().findStatic(InvokeDynamicTest.class,"BootstrapMethod",MT_BootstrapMethod());
    }
    private static MethodHandle INDY_BoostrapMethod() throws Throwable{
        CallSite cs = (CallSite)MH_BootstrapMethod().invokeWithArguments(lookup(),"testMethod",
                MethodType.fromMethodDescriptorString("(Ljava/lang/String;)V",null));
        return cs.dynamicInvoker();
    }


}
