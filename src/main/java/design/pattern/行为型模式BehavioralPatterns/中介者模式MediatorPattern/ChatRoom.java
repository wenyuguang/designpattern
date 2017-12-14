package design.pattern.行为型模式BehavioralPatterns.中介者模式MediatorPattern;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}