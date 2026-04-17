package iuh.fit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();
        User u1 = new User("Thiện");
        User u2 = new User("Nam");
        channel.register(u1);
        channel.register(u2);

        channel.changeSchedule("Học phòng khác");
    }
}