class OOP
{
    public static void main(String Arg[])
    {
        System.out.println("Inside main Function");

        Arithematic obj1 = new Arithematic();
        Arithematic obj2 = new Arithematic(11,10);

        int iRet = 0;
        iRet = obj1.Addition();    //0
        System.out.println("Addition is: "+iRet);

        iRet = obj1.Substraction();   //0
        System.out.println("Substraction is: "+iRet);

        iRet = obj2.Addition();    //21
        System.out.println("Addition is: "+iRet);
    }
}
class Arithematic
{
    public int no1;
    public int no2;

    public Arithematic()   //Default Construction
    {
        System.out.println("Inside Default Construction");
        this.no1 = 0;
        this.no2 = 0;
    }
    public Arithematic(int i,int j)   //parametrsied construction
    {
        System.out.println("Inside parametrsied construction");
        this.no1 = i;
        this.no2 = j;
    }
    public int Addition()
    {
        int Ans = 0;
        Ans = this.no1 + this.no2;
        return 0;
    }
    public int Substraction()
    {
        int Ans = 0;
        Ans = this.no1 - this.no2;
        return Ans;
    }
}