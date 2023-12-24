// 1. Write a program to demonstrate method overloading with 3 different parameters.

class pie{
    void berry(int a){
    System.out.println("int " + a);
    }
    void berry(char a){
        System.out.println("char " + a);
    }
    void berry(float a){
        System.out.println("float " + a);
    }
}
public class assignment1 {
    public static void main(String[] args){
    pie obj= new pie();
    obj.berry(9);
    }
    
}
