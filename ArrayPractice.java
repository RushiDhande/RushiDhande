package Day5;

public class ArrayPractice
{
    public static void main(String[] args)
    {
        int [][][]arr={{{1,6,8,56,67},{1,2,3,4,5,6},{23,34,25,23}}};

        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    for(int k = 0; k < arr[i][j].length; k++){
                System.out.print(arr[i][j][k]+" ");
            }
            System.out.println("");
        }}
       // System.out.println("");
        }

 }



