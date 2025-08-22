/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;


public class Room {
    protected int roomID;
    protected int floor;
    protected int capacity;
    protected boolean availability;
    static ArrayList<Room> rooms = new ArrayList<>();

    public Room(int roomID, int floor, int capacity, boolean availability) {
        this.roomID = roomID;
        this.floor = floor;
        this.capacity = capacity;
        this.availability = availability;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public static ArrayList<Room> getRooms() {
        return rooms;
    }

    public static void setRooms(ArrayList<Room> rooms) {
        Room.rooms = rooms;
    }
    
    
    
    
    
}
