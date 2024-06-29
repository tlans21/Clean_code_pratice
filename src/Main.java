import users.User;

public class Main {
    public static void main(String[] args) {
        User defaultUser = User.createDefaultUser(); //User user = new User();
        User userWithNameAge = User.createUserWithNameAge("시문", 27); // User user = new User("시문", "27")
        User userWithNameAgeAndEmail = User.createUserWithNameAgeAndEmail(
                "아무개", 50, "아무개@naver.com"); // User user = new User("아무개", "50", "아무개@naver.com");
        System.out.println(defaultUser);
        System.out.println(userWithNameAge);
        System.out.println(userWithNameAgeAndEmail);
    }
}