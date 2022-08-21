package entity;

public class Song {
    private static long counter=0;
    private long id;
    private String title;
    private String genre;
    private int releaseYear;
    private String language;
    private long totalListeners;

    public Song(String title, String genre, int releaseYear, String language) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.language = language;
        counter++;
        this.id=counter;
        this.totalListeners=0;
    }
    public long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public void listen(){
        this.totalListeners++;
    }
}
