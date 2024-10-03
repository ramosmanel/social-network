package entities;

import java.util.Date;

public class Post{
    private String content;
    private Date data;

    private User user;

    public Post() {
    }

    public Post(String content, Date data, User user) {
        this.content = content;
        this.data = data;
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{content='" + content + "', data=" + data + ", user=" + user.getName() + "}";
    }

}
