package dao;
import entity.Artist;
import entity.Song;
import entity.User;

import java.util.HashMap;
import java.util.Map;
public class MusicInventory {
    private Map<Long, User>users;
    private Map<Long, Artist>artists;
    private Map<Long,Song>songs;
    public MusicInventory() {
        this.users = new HashMap<>();
        this.artists = new HashMap<>();
        this.songs = new HashMap<>();
    }

    public void addUser(User user){
        this.users.put(user.getId(),user);
    }
    public void addArtist(Artist artist){
        this.artists.put(artist.getId(),artist);
    }
    public void addSong(Song song){
        this.songs.put(song.getId(),song);
    }
    public User getUserById(long userId){
        return users.get(userId);
    }
    public Artist getArtistById(long artistId){
        return artists.get(artistId);
    }
    public Song getSongById(long songId){
        return songs.get(songId);
    }

}
