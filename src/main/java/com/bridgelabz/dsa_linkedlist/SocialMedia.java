package com.bridgelabz.dsa_linkedlist;

import java.util.List;
import java.util.ArrayList;

/*
 * Program to implement social media using Singly Linked List
 */

// Node for main User Linked List
class UserNode {
    private int id;
    private String name;
    private int age;
    private Friends friends;
    private int noOfFriends;
    private UserNode next;

    public UserNode(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.friends = new Friends(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Friends getFriends() {
        return friends;
    }

    public int getNoOfFriends() {
        return noOfFriends;
    }

    public UserNode getNext() {
        return next;
    }

    public void setNext(UserNode next) {
        this.next = next;
    }

    public void addFriend(UserNode friend) {
        if (friend == this) {
            return;
        }

        boolean isAdded = friends.addFriend(friend);

        if (isAdded) {
            noOfFriends++;
        }
    }

    public void removeFriend(UserNode friend) {
        boolean isRemoved = friends.removeFriend(friend);

        if (isRemoved) {
            noOfFriends--;
        }
    }

    public void displayFriends() {
        friends.displayFriends();
    }

    public void mutualFriends(UserNode user) {
        friends.mutualFriends(user);
    }
}


// Node specifically for Friend List
class FriendNode {
    private UserNode user;
    private FriendNode next;

    public FriendNode(UserNode user) {
        this.user = user;
    }

    public UserNode getUser() {
        return user;
    }

    public FriendNode getNext() {
        return next;
    }

    public void setNext(FriendNode next) {
        this.next = next;
    }
}


// Main User Linked List
class UserLinkedList {
    private UserNode head;

    // Add user
    public void addUser(UserNode user) {

        if (head == null) {
            head = user;
            return;
        }

        UserNode curr = head;

        while (curr.getNext() != null) {
            curr = curr.getNext();
        }

        curr.setNext(user);
    }

    // Search user by ID
    public void searchUser(int id) {

        UserNode curr = head;

        while (curr != null) {

            if (curr.getId() == id) {
                System.out.println("User found: " + curr.getName());
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("User doesn't exist!");
    }

    // Search user by Name
    public void searchUser(String name) {

        UserNode curr = head;

        while (curr != null) {

            if (curr.getName().equalsIgnoreCase(name)) {
                System.out.println("User found: " + curr.getName());
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("User doesn't exist!");
    }

    // Display number of friends
    public void displayNoOfFriends(UserNode user) {
        System.out.println(
                "No of friends of " + user.getName()
                        + " is " + user.getNoOfFriends()
        );
    }
}


// Friend List of each user
class Friends {
    private FriendNode head;
    private UserNode parentUser;

    public Friends(UserNode parentUser) {
        this.parentUser = parentUser;
    }

    public FriendNode getHead() {
        return head;
    }

    // Add friend
    public boolean addFriend(UserNode friend) {

        if (head == null) {
            head = new FriendNode(friend);
            return true;
        }

        FriendNode curr = head;

        while (curr != null) {

            if (curr.getUser().getId() == friend.getId()) {
                System.out.println(
                        friend.getName() + " is already in friends list!"
                );
                return false;
            }

            if (curr.getNext() == null) {
                break;
            }

            curr = curr.getNext();
        }

        curr.setNext(new FriendNode(friend));

        return true;
    }

    // Remove friend
    public boolean removeFriend(UserNode friend) {

        if (head == null) {
            System.out.println("No friends in friend list!");
            return false;
        }

        // Remove first friend
        if (head.getUser().getId() == friend.getId()) {
            head = head.getNext();
            return true;
        }

        FriendNode curr = head;

        while (curr.getNext() != null) {

            if (curr.getNext().getUser().getId() == friend.getId()) {
                curr.setNext(curr.getNext().getNext());
                return true;
            }

            curr = curr.getNext();
        }

        System.out.println(
                "The given friend doesn't exist in the friends list!"
        );

        return false;
    }

    // Display all friends
    public void displayFriends() {

        if (head == null) {
            System.out.println(
                    "No friends in friend list of " + parentUser.getName()
            );
            return;
        }

        FriendNode curr = head;

        System.out.println(
                "Friends of " + parentUser.getName() + ":"
        );

        while (curr != null) {
            System.out.println(curr.getUser().getName());
            curr = curr.getNext();
        }
    }

    // Find mutual friends
    public void mutualFriends(UserNode user) {

        if (head == null) {
            System.out.println(
                    "No friends in friend list of " + parentUser.getName()
            );
            return;
        }

        if (user.getFriends().getHead() == null) {
            System.out.println(
                    "No friends in friend list of " + user.getName()
            );
            return;
        }

        List<UserNode> mutualFriendList = new ArrayList<>();

        FriendNode curr1 = head;

        while (curr1 != null) {

            FriendNode curr2 = user.getFriends().getHead();

            while (curr2 != null) {

                if (curr1.getUser().getId()
                        == curr2.getUser().getId()) {

                    mutualFriendList.add(curr1.getUser());
                    break;
                }

                curr2 = curr2.getNext();
            }

            curr1 = curr1.getNext();
        }

        if (mutualFriendList.isEmpty()) {
            System.out.println("No mutual friends exist!");
            return;
        }

        System.out.println("Mutual Friends:");

        for (UserNode mutualFriend : mutualFriendList) {
            System.out.println(mutualFriend.getName());
        }
    }
}


// Main class
public class SocialMedia {

    // Create two-way friendship
    public static void addFriendConnection(
            UserNode user1,
            UserNode user2) {

        user1.addFriend(user2);
        user2.addFriend(user1);
    }

    // Remove two-way friendship
    public static void removeFriendConnection(
            UserNode user1,
            UserNode user2) {

        user1.removeFriend(user2);
        user2.removeFriend(user1);
    }

    // Display mutual friends
    public static void displayMutualFriends(
            UserNode user1,
            UserNode user2) {

        user1.mutualFriends(user2);
    }

    public static void main(String[] args) {

        UserNode user1 = new UserNode(1, "Krishna", 23);
        UserNode user2 = new UserNode(4, "Balram", 24);
        UserNode user3 = new UserNode(6, "Raman", 25);
        UserNode user4 = new UserNode(5, "Raju", 26);

        UserLinkedList userList = new UserLinkedList();

        userList.addUser(user1);
        userList.addUser(user2);
        userList.addUser(user3);
        userList.addUser(user4);

        // Add friendships
        addFriendConnection(user1, user3);
        addFriendConnection(user1, user2);
        addFriendConnection(user3, user2);

        // Remove friendship
        removeFriendConnection(user3, user2);

        // Search
        userList.searchUser(5);
        userList.searchUser(4);
        userList.searchUser("Krishna");

        // Display friends
        user1.displayFriends();
        user2.displayFriends();

        // Mutual friends
        displayMutualFriends(user1, user2);
        displayMutualFriends(user3, user4);

        // Number of friends
        userList.displayNoOfFriends(user1);
    }
}
