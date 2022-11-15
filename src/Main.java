import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Album album1 = new Album("Ronnie", "No.3");

        album1.addSong("Razor", 1.3);
        album1.addSong("Bull", 3.2);
        album1.addSong("Eddy", 4.3);

        LinkedList<Song> myPlaylist = new LinkedList<>();

        album1.addToPlaylist("Razor", myPlaylist);
        album1.addToPlaylist(2, myPlaylist);

        printList(myPlaylist);

        play(myPlaylist);
    }

    public static void play(LinkedList<Song> playlist) {
        Scanner sc = new Scanner(System.in);

        ListIterator<Song> itr = playlist.listIterator();

        if(!itr.hasNext())
        {
            System.out.println("Playlist is Empty");
            return;
        }

        System.out.println("You are listening to : " + itr.next().getTitle());

        while(true){
            showMenu();
            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("Thank you for listening");
                    return;

                case 2:
                    showMenu();
                    break;

                case 3:
                    printList(playlist);
                    break;

                case 4:

            }
        }



    }

    public static void printList(LinkedList<Song>playlist){
        ListIterator<Song>itr = playlist.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public static void showMenu(){
        System.out.println("1. Exit");
        System.out.println("2. Show Menu");
        System.out.println("3. Show Songs list");
        System.out.println("4. Play next");
        System.out.println("5. Play previous");
        System.out.println("6. Repeat current song");
        System.out.println("7. Delete song");
    }
}