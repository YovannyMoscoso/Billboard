package domain;

import static domain.Files.*;
import java.util.*;
public class billboard100 {
   
    
     public static void build(SortedABList<Song> list, Scanner billboardFile) {
        String billboardChartUrl;
        Dating weekId;
        String songName;
        String performerName;
        String songId;
        Integer instance;
        Integer position;
        Integer weeksOnChart;
        Song oneSong;
        
        
        billboardFile.nextLine();

        while (billboardFile.hasNext()) {
            

            String[] string = billboardFile.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

            billboardChartUrl = string[0];
            String stringDate = string[1];
            String[] arrayDate = stringDate.split("/");
            int month =  Integer.valueOf(arrayDate[0]);
            int day =  Integer.valueOf(arrayDate[1]);
            int year = Integer.valueOf(arrayDate[2]);
            weekId = new Dating(month, day, year);

            songName = string[2];
            performerName = string[3];
            songId = string[4];
            instance = Integer.valueOf(string[5]);
            position = Integer.valueOf(string[6]);
            weeksOnChart = Integer.valueOf(string[7]);
            oneSong = new Song(billboardChartUrl, weekId, songName, performerName, songId, instance, position, weeksOnChart);
            list.add(oneSong);
            

        }
    
    }
     public static void naturalOrderSort(SortedABList<Song> list){
     anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY SONG ID NUMBER \n");
     anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
     ABListIterator iterator = new ABListIterator<>(list);
     
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        
                        anexFile("newTest.csv", element.toString());
                          
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");


}
    public static void numberOfWeeksSearch(SortedABList<Song> list){
        Scanner input = new Scanner(System.in);
       System.out.println("Insert the number of weeks on chart: ");
       int n = input.nextInt();
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY NUMBER OF WEEKS ON CHART GREATER OR EQUAL THAN " + n + "\n");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
        ABListIterator iterator = new ABListIterator<>(list);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        if(element.weeksOnChart >= n){
                        anexFile("newTest.csv", element.toString());
                        }
                        
                        
                        
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    public static void performerNameSearch(SortedABList<Song> list){
       
       Scanner input = new Scanner(System.in);
       System.out.println("Insert the performer name: ");
       String performerName = input.nextLine();
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY PERFORMER: " + performerName + " \n");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
       //SortedABList<Song> performerList = new SortedABList<>(Song.performerNameComparator());
        ABListIterator iterator = new ABListIterator<>(list);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        if(element.performerName.equals(performerName)){
                        anexFile("newTest.csv", element.toString());
                        }                  
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    public static void songNameSearch(SortedABList<Song> list){
       
       Scanner input = new Scanner(System.in);
       System.out.println("Insert the song name: ");
       String songName = input.nextLine();
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY SONG NAME \n");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
        ABListIterator iterator = new ABListIterator<>(list);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        if(element.songName.equals(songName)){
                        anexFile("newTest.csv", element.toString());
                        }
                        
                        
                        
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    public static void specificWeekSearch(SortedABList<Song> list) throws InputMismatchException{
       
       Scanner input = new Scanner(System.in);
       System.out.println("Insert the specific week. Insert \"mm/dd/yyyy\": ");
       String specificWeek = input.nextLine();
       String[] dateString = specificWeek.split("/");
       int day = Integer.parseInt(dateString[0]);
       int month = Integer.parseInt(dateString[1]);
       int year = Integer.parseInt(dateString[2]);
       
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY SPECIFIC WEEK: WEEK (" + specificWeek + ") \n");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
       //SortedABList<Song> performerList = new SortedABList<>(Song.performerNameComparator());
        ABListIterator iterator = new ABListIterator<>(list);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        if(element.weekId.equals(new Dating(day, month, year))){
                        anexFile("newTest.csv", element.toString());
                        }                  
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    public static void InstanceSearch(SortedABList<Song> list){
        Scanner input = new Scanner(System.in);
       System.out.println("Insert the min number of Instance: ");
       int n = input.nextInt();
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY NUMBER INSTANCES GREATER THAN " + n + "\n");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
        ABListIterator iterator = new ABListIterator<>(list);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        if(element.weeksOnChart > n){
                        anexFile("newTest.csv", element.toString());
                        }
                        
                        
                        
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    public static void peakPositionSearch(SortedABList<Song> list){
        Scanner input = new Scanner(System.in);
       System.out.println("Insert the number of peak position: ");
       int n = input.nextInt();
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY WEEK POSTION NUMBER EQUAL THAN " + n + "\n");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
        ABListIterator iterator = new ABListIterator<>(list);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        if(element.position == n){
                        anexFile("newTest.csv", element.toString());
                        }
                        
                        
                        
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    public static void weekIdSort(SortedABList<Song> list){
        SortedABList<Song> newList = new SortedABList<>(Song.weekIdComparator());
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY WEEK ID FROM OLDEST TO NEWEST \n ");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
        ABListIterator iterator = new ABListIterator<>(list);
        ABListIterator iterator2 = new ABListIterator<>(newList);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        newList.add(element);
                            
                    }
                    while(iterator2.hasNext()){
                    Song element = (Song) iterator2.next();
                    anexFile("newTest.csv", element.toString());
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    public static void weekIdInverseSort(SortedABList<Song> list){
        SortedABList<Song> newList = new SortedABList<>(Song.dateInverseComparator());
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY WEEK ID FROM NEWEST TO OLDEST \n ");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
        ABListIterator iterator = new ABListIterator<>(list);
        ABListIterator iterator2 = new ABListIterator<>(newList);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        newList.add(element);
                            
                    }
                    while(iterator2.hasNext()){
                    Song element = (Song) iterator2.next();
                    anexFile("newTest.csv", element.toString());
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    
    
    public static void songNameSort(SortedABList<Song> list){
       SortedABList<Song> newList = new SortedABList<>(Song.SongNameComparator());
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY SONG NAME \n ");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
        ABListIterator iterator = new ABListIterator<>(list);
        ABListIterator iterator2 = new ABListIterator<>(newList);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        newList.add(element);
                            
                    }
                    while(iterator2.hasNext()){
                    Song element = (Song) iterator2.next();
                    anexFile("newTest.csv", element.toString());
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    public static void performerNameSort(SortedABList<Song> list){
        SortedABList<Song> newList = new SortedABList<>(Song.performerNameComparator());
       anexFile("newTest.csv", "\t\t\t\t\t\t\t SORTED BY PERFORMER NAME \n ");
       anexFile("newTest.csv","url, WeekID, Song, Performer, SongID, Instance, Peak Position, Weeks on Chart");
        ABListIterator iterator = new ABListIterator<>(list);
        ABListIterator iterator2 = new ABListIterator<>(newList);
                    while (iterator.hasNext()) {
                        
                        Song element = (Song)iterator.next();
                        newList.add(element);
                            
                    }
                    while(iterator2.hasNext()){
                    Song element = (Song) iterator2.next();
                    anexFile("newTest.csv", element.toString());
                    }
                    anexFile("newTest.csv", "\n");
                    anexFile("newTest.csv", "\n");
                    System.out.println("(File written)");
        }
    
}
