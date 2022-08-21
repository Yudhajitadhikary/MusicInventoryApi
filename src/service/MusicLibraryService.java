package service;

import dao.MusicInventory;
import entity.*;

public class MusicLibraryService {
    private MusicInventory  inventory;

    public MusicLibraryService() {
        this.inventory = new MusicInventory();
    }
    public void registerUser(String firstName, String lastName, String emailId,long phoneNumber,String city, String locality, String state,int pinCode ){
    Contact contact=new Contact(emailId, phoneNumber);
    Address address= new Address(city,locality,state,pinCode);
    User user=new User(firstName,lastName,contact,address);
    inventory.addUser(user);
    System.out.println("Registered User with Id : "+user.getId()+". name: "+user.getName());
    }
    public void registerArtists(String firstName, String lastName){
        Artist artist= new Artist(firstName,lastName);
        inventory.addArtist(artist);
        System.out.println("Registered Artist with id"+artist.getId()+", name "+ artist.getName());

    }
    public void releaseSong(String title, String genre, int releaseYear, String language, long artistId){
        Song song=new Song(title,genre,releaseYear,language);
        //Check if the artist is registered
        Artist artist= inventory.getArtistById(artistId);
        if(artist ==null){
            System.out.println("the artist with id:"+artistId+ "is not registered to the Application");
            return;
        }
        else{
            inventory.addSong(song);
            artist.releaseSong(song);
            System.out.println("Released song with Id : "+song.getId()+". title: "+song.getTitle());
        }
        // Tag it to the artist
        //Add it to the inventory
    }
    public void listenToSong(long userId,long songId){
     User user= inventory.getUserById(userId);
     Song song = inventory.getSongById(songId);
     if(user==null){
         System.out.println("The user is:"+userId+" is not registered");
     }
     else if (song == null){
        System.out.println("The Song id: "+songId+ " is not registered");
     }
     else{
         song.listen();
         user.listenToSong(song);
         System.out.println("Listening to the song: "+song.getTitle());
     }
    }
}
