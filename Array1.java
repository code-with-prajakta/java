class Array1
{
    public static void main(String Arg[])
    {
        //Static way
        int Arr[ ] = {10,20,30,40};

        //Dynamic way
        int Arr2[ ] = new int [4];
        int Arr1[ ] = new int [4];
        Arr2[0] = 10;
        Arr2[1] = 20;
        Arr2[2] = 30;
        Arr2[3] = 40;

        Arr1[0] = 50;
        Arr1[1] = 60;
        Arr1[2] = 70;
        Arr1[3] = 80;

        System.out.println("Length of Arr1 is; " +Arr1.length);
        System.out.println("Length of Arr2 is; " +Arr2.length);
    }
}