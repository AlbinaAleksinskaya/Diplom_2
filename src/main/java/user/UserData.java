package user;

import org.apache.commons.lang3.RandomStringUtils;

public class UserData {

    private String password;
    private String name;
    private String email;

    public UserData(String userName, String userPassword, String userMail) {
        this.name = userName;
        this.password = userPassword;
        this.email = userMail;
    }

    public UserData() {
        this.name = RandomStringUtils.randomAlphabetic(8);
        this.password = RandomStringUtils.randomAlphabetic(8);
        this.email = RandomStringUtils.randomAlphabetic(10) + "@yandex.ru";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
