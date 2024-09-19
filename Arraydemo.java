public class Arraydemo {
    public static void main(String args[]){
        int a[][]= new int [3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                a[i][j]= (int)(Math.random()*10);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int n[]:a){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
