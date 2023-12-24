// 2. Write a program to create an object of an class which contain a method and call that class method in main method.

class Berry{
    void blueberry(int a[][]){
    for (int b[]: a){
        for (int c: b){
        System.out.print(c);
        }
    System.out.println("");
    }
    }
}

public class assignment2 {
public static void main(String[] args){

    Berry obj= new Berry();
    
    int a[][]= {{1,2},{2,3}};

    obj.blueberry(a);  
    
}    
}
