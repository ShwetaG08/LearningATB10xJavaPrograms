package Feb7JavaCode;

public class invertedrightangle {
    public static void main(String[] args) {
        int row=5;
        for(int i=row;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
