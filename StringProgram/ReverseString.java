package StringProgram;

public class ReverseString {
    public static void main(String[] args) {
        String str="PROGRAMMING";
        String revStr="";

        for (int i=str.length()-1 ; i>=0 ; i--){
            revStr+=str.charAt(i);
        }
        System.out.println(revStr);
        }
    }

