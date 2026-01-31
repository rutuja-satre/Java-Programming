class ArrayX
{
    public void Display(int Arr[])
    {
        int  i = 0;

        System.out.println("Number of elements : "+Arr.length);

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class program94
{
    public static void main(String A[])
    {
        int Brr[] = {10,20,30,40};

        ArrayX aobj = new ArrayX();

        aobj.Display(Brr);


    }
}