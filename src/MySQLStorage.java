public class MySQLStorage implements UserStorage{
    @Override
    public void store() {
        System.out.println("save file = SQL");
    }
}
