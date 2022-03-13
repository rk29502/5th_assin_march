package march_5th_assin;

public class swap_two_string_variables {
	public static void main(String args[]) {  
        String a = "Am";  
        String b = "I";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("\n\n After : " + a + " " + b);  
    }  

}
