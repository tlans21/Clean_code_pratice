package users;

public class User {
    private String name;
    private int age;
    private String email;

    /* 생성자 중복을 하게 되면 클라이언트 코드에서 실인수 값에서의 의미를 유추하기 어려움
    public User(){
        this.name = "Unknown";
        this.age = 0;
        this.email = "Unknown";
    }
    // 이름과 나이를 받는 생성자
    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "Unknown";
    }

    // 이름과 나이, 이메일을 받는 생성자
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }*/

    private User(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // 정적 팩토리 메서드 사용,
    public static User createDefaultUser() {
          return new User("Unknown", 0, "Unknown");
    }

    // 나이, 이름만 매개변수
    public static User createUserWithNameAge(String name, int age){
        return new User(name, age, "UnKnown");
    }

    //이름, 나이, 이메일을 매개변수로 하는 메서드가 생성자 호출함
    public static User createUserWithNameAgeAndEmail(String name, int age, String email){
        return new User(name, age, email);
    }

    public String toString() {
        return "User{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}
