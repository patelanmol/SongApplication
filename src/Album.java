import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> album;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.album = new ArrayList<>();
    }

    //find

    public boolean findSong(String title)
    {
        for(Song currentSong : this.album) {
            if (currentSong.getTitle().equals(title)) {
                System.out.println("Song Found!! ");
                return true;
            }
        }
        return false;
    }

    //add
    public void addSong(String title, double duration)
    {
        if(findSong(title))
        {
            System.out.println("Song already present");

        }
        album.add(new Song(title, duration));
    }

    public void  addToPlaylist(String title, LinkedList<Song>playlist)
    {
        for(Song currentSong:this.album)
        {
            if(currentSong.getTitle().equals(title))
            {
                System.out.println("Added to Playlist");
                playlist.add(currentSong);
                return;
            }
        }
        System.out.println("Cannot be added to Playlist");

    }
    public void addToPlaylist(int trackNumber, LinkedList<Song>playlist)
    {
        int index = trackNumber-1;

        if(index >=0 && index < this.album.size())
        {
            System.out.println("Added to Playlist");
            playlist.add(this.album.get(index));
            return;
        }
        System.out.println("Invalid Track Number");

    }
}
