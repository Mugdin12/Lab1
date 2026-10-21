package com.example.lab1studenskiklub.data;
import com.example.lab1studenskiklub.model.event;
import com.example.lab1studenskiklub.model.member;
import java.util.ArrayList;
import java.util.List;
public class DemoData {
    public static List<event> events = new ArrayList<>();
    public static List<member> members = new ArrayList<>();

    static {
        events.add(new event(1,"Java Workshop","Radionica iz Jave","25.10.2026.","Zenica"));
        events.add(new event(2,"Student Party","Druzzene studenata","30.10.2026.","Studenski centar"));
        members.add(new member(1,"Ramo","Kuduzovic","mk@gmail.com","Software engeering",1));
        members.add(new member(2,"Suljo","Suljic","sk@gmail.com","Computer Science",2));
    }
}
