package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .firstName("Vik")
                .age(19)
                .job("Ahahahhhsfhdfdssdf...........")
                .build();
        System.out.println(user);
    }
}
