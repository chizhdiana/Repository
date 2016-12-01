package test1.Recursive;

/**
 * Created by diana on 10.11.16.
 */

public class User implements Comparable {

    private String login;
    private String password;

    @Override
    public int compareTo(Object o) {
        if (o instanceof User) {
            User usr = (User) o;
            if (usr.getLogin().compareTo(login) < 0) {
                return -1;
            } else if (usr.getLogin().compareTo(login) == 0) {
                return 0;
            }
        }
        return 1;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
