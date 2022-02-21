public class MissingInteger {
    public static void main(String[] args) {
        int[] input={10,9,6,5,3,4,2,1,7};
        int n=input.length+1;

        //Sum of All N numbers
        int sum=0;
        sum =(n*(n+1)/2);

        int inputsum=0;
        for(int i=0;i<input.length;i++)
        {
            inputsum=inputsum+input[i];
        }

        int missingnumber=sum-inputsum;

        System.out.println("Missing number is: "+missingnumber);
    }
}

