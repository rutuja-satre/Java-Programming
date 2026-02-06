//replace first letter with _

import java.util.*;

class StringX
{
    public String Update(String str)
    {
        char Arr[] = str.toCharArray();

        Arr[0] = '_';

        return new String(Arr);                             // changee
    }
}

class program254
{
    public static void main(String A[])
        {
            Scanner scanobj = new Scanner(System.in);

            System.out.println("Enter string :");
            String sobj = scanobj.nextLine(); 
            
            StringX strobj = new StringX();

            sobj = strobj.Update(sobj);         //change (not prefferable bcoz original string is not displayed)

            System.out.println("Updated String : "+sobj);
        }   
}