import java.util.Scanner;
public class Season 
{
    public static void main(String args[])
    {  
         String season;
         System.out.println("Enter the month");
         Scanner input = new Scanner(System.in);
         int month=input.nextInt();
         switch(month)
         {
              case 12:
              case 1:
              case 2:
                  season="Winter";
                  System.out.println("Season:"+season);
              break;
              case 3:      
              case 4:
              case 5:
                  season="Spring";     
                  System.out.println("Season:"+season);
              break;
              case 6:
              case 7:
              case 8:
                  season="Summer";
                  System.out.println("Season:"+season);
              break;
              case 9:
              case 10:
              case 11:
                  season="Autumn";
                  System.out.println("Season:"+season);
              break;
              default:
                season="Invalid month";
                System.out.println(season);
                  
            }    
                  
     }
}