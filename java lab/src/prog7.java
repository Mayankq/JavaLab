import java.util.Scanner;
public class prog7 {
    public static void main(String args[])
    {
        int temp;
        int [] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array");
        for(int i=0;i<10;i++)
        {
           System.out.println("Enter the elements "+(i+1)+ ":");
           arr[i] = sc.nextInt();
        }
        System.out.println("The array before sorting:");
        for(int j=0;j<10;j++)
        {
            System.out.print(arr[j]+",");
        }
     for(int k=0;k<10;k++){
        for(int l=1;l<10-k;l++)
        if(arr[l]<arr[l-1])
        {
            temp = arr[l];
            arr[l]=arr[l-1];
            arr[l-1]=temp;
        }
     } System.out.println("The array after sorting:");
        for(int m=0;m<10;m++)
        {
            System.out.print(arr[m]+",");
        }
          for(int s=0;s<10;s++){
        for(int t=1;t<10-s;t++)
        if(arr[t]>arr[t-1])
        {
            temp = arr[t];
            arr[t]=arr[t-1];
            arr[t-1]=temp;
        }
     } System.out.println("The array after sorting:");
        for(int p=0;p<10;p++)
        {
            System.out.print(arr[p]+",");
        }
        sc.close();
    } }
     


