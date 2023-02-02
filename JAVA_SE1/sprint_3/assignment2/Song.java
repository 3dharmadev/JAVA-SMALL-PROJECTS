package java111.sprint_3.assignment2;
/* Create a class Song with the following members:
   a. following 2 fields with private visibility:
        movieName: String
        songName: String
        b. Override the hashCode and equals method to very the uniqueness of the Song
        (If movieName and songName is same for two Song object then they should be treated as
        duplicate object).
        c. public parameterized constructor to initialise the songName and movieName
        Variables.
        d. A non-static method with public visibility:
        play():void
        This play method should print:
        songName+" of "+movieName+" is playing...!"*/

import java111.sprint_3.collection_framekwork.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
    private String movieName;
    private String songName;

    public Song(String movieName,String songName){
        this.movieName=movieName;
        this.songName=songName;
    }
    @Override
    public boolean equals(Object that){
        if(this==that) return  true;
        Song s=(Song) that;
        if(this.movieName==s.movieName && this.songName==s.songName) return true;
        else return false;
    }


    public void play(){
        System.out.println( songName+" of "+movieName+" is playing...!");
    }
}

 /*
        2. Create a class PlayList with the following members:
        a. public List<Song> songs = new ArrayList<>();
        b. public void addSong(Song song);
        This addSong method will take a Song object and add the Song object to the above
        List (songs) and print: "Song added to the playlist successfully."
        If the user tries to add any duplicate song in this list of songs then it should print:
        “Song is already added in the playlist”
  */

class Playlist{
    public List<Song> songs = new ArrayList<>();
    public void addSong(Song song){
        for (Song s: songs) {
           if(s.equals(song)){
               System.out.println("Song is already added in the playlist");
               return;
           }
        }
        songs.add(song);
        System.out.println("Song added to the playlist successfully.");
    }

}

/* 3. Create a Main class with the main method and do the following task inside the main method.
        a. Create 4 song objects by taking details from the user.
        b. Create an object of the Playlist class and add all the 4 Song objects into the list of
        PlayList object by calling addSong method.
        Get all the songs one by one from the list of PlayList object and call the play() method on each
        Song object
        */
class  Main{
    public static void main(String[] args) {
      Song s1=new Song("RRR","Nacho Nacho");
        Song s2= new Song("Pushpa","Srivali");
        Song s3=new Song("Sanam Teri Kasam","Ek Number");
        Song s4= new Song("Ganga jal","singham");
        Song s5= new Song("Pushpa","Srivali");

        Playlist playlist=new Playlist();
        playlist.addSong(s5);
        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(s3);
        playlist.addSong(s4);

        for (Song s: playlist.songs) {
            s.play();
        }
    }
}