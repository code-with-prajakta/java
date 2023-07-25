import java.util.*;
class Arrayfor1
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner (System.in);

        System.out.println("Enter the size of array: ");

        int isize = sobj.nextInt();
        int Arr[] = new int[isize];

        System.out.println("Enter the element");

        int iCnt = 0;

        for(iCnt = 0;iCnt < isize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt(); //4
        }
        System.out.println("Element of array are : " );

        for(iCnt = 0;iCnt < isize;iCnt++)
        {
            System.out.println(Arr[iCnt]); //4
        }
    }
}