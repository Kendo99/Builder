package Implementation;

import java.util.Date;

public class Task {
    //private int id = 0;
    private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date dueDate;

    /*
    public Task(int id) {
        this.id = id;
    }
*/


    public Task(String summary, String description, boolean done,
                Date dueDate) {
        //this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;

    }

    /*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

*/
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDueDate() {
        return new Date(dueDate.getTime());
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = new Date(dueDate.getTime());
    }
}