package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        user1.sendMessage(user2, "message_1-2_1");
        user1.sendMessage(user2, "message_1-2_2");
        user2.sendMessage(user1, "message_2-1_1");
        user2.sendMessage(user1, "message_2-1_2");
        user2.sendMessage(user1, "message_2-1_3");
        user3.sendMessage(user1, "message_3-1_1");
        user3.sendMessage(user1, "message_3-1_2");
        user3.sendMessage(user1, "message_3-1_3");
        user1.sendMessage(user3, "message_1-3_1");
        user1.sendMessage(user3, "message_1-3_2");
        user1.sendMessage(user3, "message_1-3_3");
        user3.sendMessage(user1, "message_3-1_4");

        MessageDatabase.showDialog(user1,user3);
    }
}
