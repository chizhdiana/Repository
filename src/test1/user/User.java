package test1.user;

/**
 * Created by diana on 10.11.16.
 */

public class User {
    private String name;
    private String surname;
    private Integer old;
    private String password;

    public User(String name, String surname, Integer old, String password) {

        this.name = name;
        this.surname = surname;
        this.old = old;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int hashCode() {
        return (name.hashCode() + surname.hashCode() + password.hashCode());
    }

    @Override
    public boolean equals(Object object) { // сравнение ссылок с самим собой
        User usr = null;
        if (this == object) { // сравнивает сам себя с тем что передано в метод
            return true;

        }
        if (object instanceof User) {
            User user = (User) object;
            if (name.equals(user.name) && old == user.old && password == user.password) {
                return true;

            }
        }
        return false;
    }
}

