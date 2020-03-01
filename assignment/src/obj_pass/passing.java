package obj_pass;

class Methods {
    public static void staticMethod(test obj){
        obj.name ="static";
    }
    public void instanceMethod(test obj){
        obj.name = "Instance Method";
    }
    Methods(test obj){
        obj.name="constructor";
    }
}

public class passing {
    public static void main(String[] args){
        test t=new test();
        t.name="Main";
        System.out.println(t.name);
        Methods mtd=new Methods(t);
        System.out.println(t.name);
        Methods.staticMethod(t);
        System.out.println(t.name);
        Methods.instanceMethod(t);
        System.out.println(t.name);
    }
}
