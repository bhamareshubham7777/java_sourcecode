package PatternDemo;

public class Pattern5 {
    public static void main(String[] args) {
        int lines = 5;
        int stars = 5;

        for(int i=0; i<lines; i++){
            for(int j=0; j<stars; j++){
                if(i==j || j==0 || i==4){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
