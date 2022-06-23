package main.java;

public class SpiralMatrix {



    private static void printSpiral(int[][]matrix)
    {
        if(matrix==null || matrix.length==0)
            return;

        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;

        while (true)
        {

            if(left>right)
            {
                return;
            }

            for(int i=left; i<=right; i++)
            {
                System.out.print(matrix[top][i]+" ");
            }
            top++;

            if(top>bottom)
            {
                return;
            }
            for(int i=top; i<=bottom; i++)
            {
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            if(left>right)
            {
                return;
            }
            for(int i=right; i>=left; i--)
            {
                System.out.print(matrix[bottom][i]+" ");
            }
            bottom--;
            if(top>bottom)
            {
                return;
            }
            for(int i=bottom; i>=top; i--)
            {
                System.out.print(matrix[i][left]+" ");
            }
            left++;
        }
    }


    public static void main(String[] args) {
int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};

printSpiral(matrix);
    }
}
