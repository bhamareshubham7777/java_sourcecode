package Pattern;

public class StarPattern1 {
    public static void main(String[] args) {
        int row=9;
        int col=1;

        for (int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                System.out.print(" * ");
            }
            System.out.println();
            if (i<4){
                col++;
            }else {
                col--;
            }
        }
    }
}
