package domain;

import java.util.Comparator;

public class Song implements Comparable{

    //Create a Song class with the following information: Billboard Chart URL (String), WeekID (Date), Song Name (String), 
    //Performer Name (String), SongID (String), Instance(Integer), Peak Position (Integer) and Weeks on Chart (Integer).
    protected String billboardChartUrl;
    protected Dating weekId;
    protected String songName;
    protected String performerName;
    protected String songId;
    protected Integer instance;
    protected Integer position;
    protected Integer weeksOnChart;

    public Song() {

    }

    public Song(String billboardChartUrl, Dating weekId, String songName, String performerName, String songId, Integer instance, Integer position, Integer weeksOnChart) {
        this.billboardChartUrl = billboardChartUrl;
        this.weekId = weekId;
        this.songName = songName;
        this.performerName = performerName;
        this.songId = songId;
        this.instance = instance;
        this.position = position;
        this.weeksOnChart = weeksOnChart;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Song)) {
            return false;
        }
        Song song = (Song) obj;
        if (this.songId.equals(song.songId)) {
            return true;
        }
        return false;
    }

    public static Comparator<Song> SongNameComparator() {
        return new Comparator<Song>() {
            public int compare(Song song1, Song song2) {
                return song1.songName.compareTo(song2.songName);
            }
        };
    }

    public static Comparator<Song> performerNameComparator() {
        return new Comparator<Song>() {
            public int compare(Song song1, Song song2) {
                return song1.performerName.compareTo(song2.performerName);
            }
        };
    }

    public static Comparator<Song> weekIdComparator() {
        return new Comparator<Song>() {
            public int compare(Song song1, Song song2) {
                return song1.weekId.compareTo(song2.weekId);
            }
        };
    }

    public static Comparator<Song> dateInverseComparator() {
        return new Comparator<Song>() {
            public int compare(Song song1, Song song2) {
                return song2.weekId.compareTo(song1.weekId);
            }
        };
    }

    @Override
    public String toString() {
        return billboardChartUrl + ", " + weekId + ", " + songName + ", " + performerName + ", " + songId + ", " + instance + ", " + position + ", " + weeksOnChart;
    }

    @Override
    public int compareTo(Object obj) {
        if(!(obj instanceof Song)){
            return -1;
        }else{
            Song song = (Song) obj;
        return this.songId.compareTo(song.songId);
        }
     
    }

}
