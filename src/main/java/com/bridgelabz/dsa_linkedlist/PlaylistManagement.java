package com.bridgelabz.dsa_linkedlist;

/*
Program to demonstrate Playlist Management using Circular Linked List
 */

class SongNode {

    private String name;
    private String artist;
    private double duration;
    private SongNode next;

    public SongNode(String name, String artist, double duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.next = this;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    public SongNode getNext() {
        return next;
    }

    public void setNext(SongNode song) {
        next = song;
    }
}


class CircularLinkedList {

    private SongNode last;
    private SongNode current;

    public CircularLinkedList() {
        last = null;
        current = null;
    }


    // Add song at beginning
    public void addSongAtBeginning(SongNode song) {

        if (last == null) {
            last = song;
            current = song;
            return;
        }

        song.setNext(last.getNext());
        last.setNext(song);
    }


    // Add song at end
    public void addSongAtEnd(SongNode song) {

        if (last == null) {
            last = song;
            current = song;
            return;
        }

        song.setNext(last.getNext());
        last.setNext(song);
        last = song;
    }


    // Add song at specific position
    // Position starts from 1
    public void addSongAtPosition(SongNode song, int position) {

        if (position < 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (position == 1) {
            addSongAtBeginning(song);
            return;
        }

        if (last == null) {
            System.out.println("Invalid position!");
            return;
        }

        SongNode curr = last.getNext(); // head

        for (int i = 1; i < position - 1; i++) {

            curr = curr.getNext();

            if (curr == last.getNext()) {
                System.out.println("Invalid position!");
                return;
            }
        }

        song.setNext(curr.getNext());
        curr.setNext(song);

        if (curr == last) {
            last = song;
        }
    }


    // Delete song by name
    public void deleteSong(String name) {

        if (last == null) {
            System.out.println("Playlist is empty!");
            return;
        }

        SongNode head = last.getNext();

        // Only one song
        if (head == last) {

            if (head.getName().equalsIgnoreCase(name)) {
                last = null;
                current = null;
                System.out.println("Song deleted!");
            } else {
                System.out.println("Song not found!");
            }

            return;
        }

        // Delete head
        if (head.getName().equalsIgnoreCase(name)) {

            last.setNext(head.getNext());

            if (current == head) {
                current = head.getNext();
            }

            System.out.println("Song deleted!");
            return;
        }

        SongNode curr = head;

        while (curr.getNext() != head) {

            if (curr.getNext().getName().equalsIgnoreCase(name)) {

                SongNode deleted = curr.getNext();

                // If deleting current song
                if (deleted == current) {
                    current = deleted.getNext();
                }

                // If deleting last song
                if (deleted == last) {
                    last = curr;
                }

                curr.setNext(deleted.getNext());

                System.out.println("Song deleted!");
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("Song not found!");
    }


    // Play current song and move to next song
    public void playNextSong() {

        if (current == null) {
            System.out.println("Playlist is empty!");
            return;
        }

        System.out.println("Now Playing:");
        System.out.println("Song: " + current.getName());
        System.out.println("Artist: " + current.getArtist());
        System.out.println("Duration: " + current.getDuration() + " minutes");

        current = current.getNext();
    }


    // Display complete playlist
    public void displayPlaylist() {

        if (last == null) {
            System.out.println("Playlist is empty!");
            return;
        }

        SongNode head = last.getNext();
        SongNode curr = head;

        System.out.println("\nPlaylist:");
        System.out.println("-------------------------");

        do {

            System.out.println("Song: " + curr.getName());
            System.out.println("Artist: " + curr.getArtist());
            System.out.println("Duration: " + curr.getDuration() + " minutes");
            System.out.println("-------------------------");

            curr = curr.getNext();

        } while (curr != head);
    }
}


public class PlaylistManagement {

    public static void main(String[] args) {

        CircularLinkedList playlist = new CircularLinkedList();

        SongNode song1 =
                new SongNode("Believer", "Imagine Dragons", 3.24);

        SongNode song2 =
                new SongNode("Perfect", "Ed Sheeran", 4.23);

        SongNode song3 =
                new SongNode("Blinding Lights", "The Weeknd", 3.20);

        SongNode song4 =
                new SongNode("Shape of You", "Ed Sheeran", 3.53);


        // Add songs
        playlist.addSongAtEnd(song1);
        playlist.addSongAtEnd(song2);
        playlist.addSongAtEnd(song3);

        // Add at beginning
        playlist.addSongAtBeginning(song4);

        // Add at position
        playlist.addSongAtPosition(
                new SongNode("Faded", "Alan Walker", 3.32),
                3
        );


        // Display playlist
        playlist.displayPlaylist();


        // Play next songs
        System.out.println("\nPlaying Songs:");
        playlist.playNextSong();
        playlist.playNextSong();


        // Delete song
        System.out.println("\nDeleting Perfect:");
        playlist.deleteSong("Perfect");


        // Display again
        playlist.displayPlaylist();
    }
}
