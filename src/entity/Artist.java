package entity;
import java.util.ArrayList;
import java.util.List;
public class Artist {
    private long id;
    private static long counter=0;
    private String firstName;
    private String lastName;
    private List<Song> releasedSongs;

    public Artist(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        counter++;
        this.id=counter;
        this.releasedSongs=new ArrayList<>();
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return firstName+" "+lastName;
    }
    public void releaseSong(Song song){
        this.releasedSongs.add(song);
    }
}
