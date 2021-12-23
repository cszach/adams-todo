import java.time.ZonedDateTime;

public class ToDo {

  protected String type;
  protected String content;
  protected ZonedDateTime dateTime;
  protected boolean done;

  protected ToDo(String type, String content, ZonedDateTime dateTime, boolean done) {

    this.type = type;
    this.content = content;
    this.dateTime = dateTime;
    this.done = done;
  }

  protected boolean equals(ToDo toDo) {

    return (this.type.equals(toDo.type) && this.content.equals(toDo.content) && this.dateTime.isEqual(toDo.dateTime) && this.done == toDo.done);
  }
}
