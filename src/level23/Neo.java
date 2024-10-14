package level23;

public class Neo {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public class StringObject implements SimpleObject<String> {
        @Override
        public StringObject getInstance() {
            return new StringObject();
        }
    }
}
