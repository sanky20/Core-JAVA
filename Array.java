import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int nums[]= {1,2,3,4,5};

        // for(int i=0;i<nums.length;i++)
        // {
        // System.out.print(nums[i]+" ");
        // }
        // System.out.println();

        // int arr[]= new int[5];

        // for(int i=0;i<arr.length;i++)
        // {
        // arr[i]=sc.nextInt();
        // }

        // for(int i=0;i<arr.length;i++)
        // {
        // System.out.print(arr[i]+" ");
        // }

        // ...........
        // Multi dimensional array

        int arr[][] = new int[3][4]; // by default zero is assigned !!!

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         arr[i][j] = (int) (Math.random() * 100);
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for (int i[] : arr) {
            for (int j : i) {
                j = (int) (Math.random() * 100);
                System.out.print(j+ " ");
            }
            System.out.println();

        }

        
        // jagged array
        // int nums[][]= {{1,2,3},{4,5,6},{1,2,3,4}};

        int nums[][]= new int[3][];

        nums[0]= new int[4];
        nums[1]= new int[3];
        nums[2]= new int[5];

        System.out.println("jagged array");

        for (int i[] : nums) {
            for (int j : i) {
                j = (int) (Math.random() * 100);
                System.out.print(j+ " ");
            }
            System.out.println();

        }

        // 3 dimensional array

        int[][][] a= new int[4][3][2];

        System.out.println("3 dimensional array");

        for(int i[][]:a)
        {
            for(int j[]:i)
            {
                for(int k: j)
                {
                    k= (int)(Math.random()*100);
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }


        



    }

}
