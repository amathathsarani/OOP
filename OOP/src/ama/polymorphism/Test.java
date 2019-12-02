package ama.polymorphism;


//OverLoarding -  same function have different signatures

public class Test {

	void operator(String str1, String str2) 
    { 
        String s = str1 + str2; 
        System.out.println("Concatinated String - "
                           + s); 
    } 
  
    void operator(int a, int b) 
    { 
        int c = a + b; 
        System.out.println("Sum = " + c); 
    } 
 
  
 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        obj.operator(2, 3); 
        obj.operator("joe", "now"); 
    } 
 
}
