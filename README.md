# The Billboard File
The Billboard Hot 100 is the music industry standard record chart in the United States for songs, published weekly by Billboard magazine.
In our program we will read the information of the file, create an instance for each record and sort the information by using the different 
fields (url,WeekID,Song,Performer,SongID,Instance,Peak Position,Weeks on Chart). The data sorted will be written in a NEW FILE!

# Reading the file
When we will read The Billboard Hot 100, all the contents are read as a string and the file has each field (url,WeekID,Song,Performer,SongID,Instance,Peak Position,
Weeks on Chart) separated by COMMA. We will use the split method to separate each field and create an instance with the attributes in the file. The split method separates
an string and separates the string by using a determined character. In this case will be a comma (ex. string.split(",")). However, inside of each field,there are some fields
that also contains a COMMA. To be able to use the split method and separate the fields as needed, we will use the split method with a character delimeter. The split method
will be string.nextLine().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

# Date
In The Billboard Hot 100, the date field will also be separated with the forward slash "/". We will use the spliot method again to separate the numbers and store the value 
in an array. We will take each value of the date as an int data type. This will allow us to manipulate and sort the date from latest to earliest, and viceversa. 
