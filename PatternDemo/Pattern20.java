package PatternDemo;

public class Pattern20 {
    public static void main(String[] args) {
        int line=5;
        int space=line-1;
        int star =1;
        int ch1=5;

        for (int i=0 ; i<line ; i++){
            int ch2=ch1;
            for (int k=0 ; k<space ; k++){
                System.out.print(" ");
            }
            space--;
            for (int j=0 ; j<star ; j++){
                System.out.print(ch2++);
            }
            System.out.println();
            star++;
            ch1--;
        }
    }
}


