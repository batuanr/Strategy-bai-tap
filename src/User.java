public class User {
    public static void main(String[] args) {
        UserStorage xml = new XMLStorage();
        UserStorage sql = new MySQLStorage();
        UserController user = new UserController(xml);
        user.store();
    }
}
