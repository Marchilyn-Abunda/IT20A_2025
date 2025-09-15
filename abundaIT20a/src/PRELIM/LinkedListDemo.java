package PRELIM;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

//        create Linkedlist 
        LinkedList<String> playlist = new LinkedList<>();

//        Add element
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");

//        indert at first
        playlist.addFirst("Intro song");

//        Insert at end
        playlist.addLast("Ending song");

//        remove
        playlist.remove("Song A");
        playlist.removeLast();

//        Acces song
        System.out.print(playlist.getFirst());
//        print list
        System.out.print(playlist);
    }

}
