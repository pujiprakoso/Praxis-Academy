package kasus3;

public class MySimpleGenerics{

    public static void main(String a[] ) {
        SimpleGeneric<String> sgs = new SimpleGeneric<String>("JAVA2NOVICE");
        sgs.printType();

        SimpleGeneric<Boolean> sgb = new SimpleGeneric<Boolean>(Boolean.TRUE);
        sgb.printType();
    }
}

/**
 * SimpleGeneric
 */
class SimpleGeneric<T> {

    // declaration of object type T
    private T objReff = null;

    //constructor to accept type parameter T
    public SimpleGeneric(T param){
        this.objReff = param;
    }

    public T getObjReff(){
        return this.objReff;
    }

    

    // this method prints the holdong parameter type

    public void printType(){
        System.out.println("Type: "+objReff.getClass().getName());
    }
    
}