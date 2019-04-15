package hu.ait.todorecyclerviewdemo.data;

import android.widget.Button;

public class TodoData {

    private String title;
    private String createDate;
    private Boolean done;
    private Button toDelete;

    public TodoData(String title, String createDate, Boolean done) {
        this.title = title;
        this.createDate = createDate;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
