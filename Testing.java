package domain;


import java.io.*;
import java.util.*;
import static domain.billboard100.*;

public class Testing {

    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        int menuNumber=0;
        do{
        try {
            String songFile;
            
            Scanner input = new Scanner(System.in);
            System.out.println("**********WELCOME TO THE BILLBOARD FILE**************\n");
            System.out.println("How would you like to sort it: ");
            System.out.println("Press 1 to sort it by Song ID: ");
            System.out.println("Press 2 to sort it by number of weeks on chart: ");
            System.out.println("Press 3 to display the songs in a specific week. Remember, weeks start on Sturday:");
            System.out.println("Press 4 to search by a performer name: ");
            System.out.println("Press 5 to search by a song name: ");
            System.out.println("Press 6 to search by number of instance greater than a number: ");
            System.out.println("Press 7 to search by number of position equal than a number: ");
            System.out.println("Press 8 to sort by week ID increasing order: ");
            System.out.println("Press 9 to sort by week ID decreasing order: ");
            System.out.println("Press 10 to sort by song name: ");
            System.out.println("Press 11 to sort by performer name: ");
            System.out.println("Press zero \"0\" to exit: ");
            menuNumber = input.nextInt();
            File myFile = new File("hot.stuff.2018.csv");
            Scanner inFile = new Scanner(myFile);
            SortedABList<Song> billboardSongs = new SortedABList<>();

            build(billboardSongs, inFile);
            
            ABListIterator iterator = new ABListIterator<>(billboardSongs);
            
            switch(menuNumber){
                case 1: naturalOrderSort(billboardSongs);
                break;
                case 2: numberOfWeeksSearch(billboardSongs);
                break;
                case 3: specificWeekSearch(billboardSongs);
                break;
                case 4: performerNameSearch(billboardSongs);
                break;
                case 5: songNameSearch(billboardSongs);
                break;
                case 6: InstanceSearch(billboardSongs);
                break;
                case 7: peakPositionSearch(billboardSongs);
                break;
                case 8: weekIdSort(billboardSongs);
                break;
                case 9: weekIdInverseSort(billboardSongs);
                break;
                case 10: songNameSort(billboardSongs);
                break;
                case 11: performerNameSort(billboardSongs);
                break;
                
            }
           } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
           }catch(InputMismatchException ex){
           
           }
        }while(!(menuNumber == 0));
        

    }

}
