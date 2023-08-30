package org.example.pojo;

/**
 * @author zhanglei
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2023-08-30 10:55:00
 */
public class User {
    private String id;
    private String username;
    private int age;
    private String sex;
    private String email;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":\"")
                .append(id).append('\"');
        sb.append(",\"username\":\"")
                .append(username).append('\"');
        sb.append(",\"age\":")
                .append(age);
        sb.append(",\"sex\":\"")
                .append(sex).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
