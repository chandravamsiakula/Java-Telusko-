
public class Demo {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] =new int[3];
        jaggedArray[1] =new int[4];
        jaggedArray[2] =new int[2];
        for(int i=0;i<3;i++){
            int m = jaggedArray[i].length;
            for(int j=0;j<m;j++){
                jaggedArray[i][j] = (int)(Math.random() * 100);
            }
        }
        for(int i=0;i<3;i++){
            int m = jaggedArray[i].length;
            for(int j=0;j<m;j++){
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("------------------");
        for(int i[] : jaggedArray){
            for(int j : i){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        
    }
    
}
