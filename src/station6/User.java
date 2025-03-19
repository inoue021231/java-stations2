import java.util.Objects;

public class User {
    int id;
    String name;
    String email;

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof User)) {
            return false;
        }
        User otherUser = (User) other;
        return Objects.equals(this.id, otherUser.id) && Objects.equals(this.name, otherUser.name) && Objects.equals(this.email, otherUser.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.email);
    }
}