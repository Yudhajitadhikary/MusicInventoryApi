package entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static long counter=0;
    private final long id;
    private String firstName;
    private String lastName;
    private Contact contact;
    private Address address;
    private List<Song> listenedSongs;

    public User(String firstName, String lastName, Contact contact,Address address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.contact=contact;
        this.address=address;
        counter++;
        this.id=counter;
        this.listenedSongs= new ArrayList<>();

    }
    public long getId(){
        return id;
    }
    public String getName(){
        return firstName+" "+lastName;
    }
    public void listenToSong(Song song){
        this.listenedSongs.add(song);
    }

}
