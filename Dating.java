
package domain;

import java.io.*;


public class Dating implements Comparable<Dating>, Serializable {
    protected int month;
    protected int day;
    protected int year;
    
    public Dating(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public boolean equals(Object obj) {

        Dating date2 = (Dating) obj;
        if (this.month == date2.month && this.day == date2.day && this.year == date2.year) {
            return true;
        }
        return false;
    }
    public int compareTo(Dating date2){
        
        if(this.year > date2.year){
        return 1;
        }
        else if(this.year < date2.year){
        return -1;
        }
        else if (this.month > date2.month){
        return 1;
        }
        else if (this.month < date2.month){
        return -1;
        }
        else if (this.day > date2.day){
        return 1;
        }
        else if (this.day < date2.day){
        return -1;
        }
        else{
        
        return 0;
        }
    }

    @Override
    public String toString() {
        return  + month + "/" + day + "/" + year;
    }
    

}
