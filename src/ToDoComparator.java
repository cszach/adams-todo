import java.util.Comparator;

/**
 * A comparator for to-do's, which helps in listing them.
 */
class ToDoComparator implements Comparator<ToDo> {

  /**
   * Compare two to-do's.
   *
   * <p>
   * Compare two to-do's according to the following rules:
   *   <ol>
   *     <li>To-do's not marked as done are greater than to-do's marked as done.
   *     </li>
   *     <li>A reminder is always greater than a normal to-do.</li>
   *     <li>A normal to-do is always greater than an optional to-do.</li>
   *     <li>If two to-do's are of the same type, the one with the earlier date
   *     and time is greater.</li>
   *   </ol>
   * </p>
   */
  public int compare(ToDo td1, ToDo td2) {

    if (!td1.done && td2.done) return 1;
    if (td1.type.equals("reminder") && !td2.type.equals("reminder")) return 1;
    if (td1.type.equals("normal") && td2.type.equals("optional")) return 1;
    if (td1.type.equals(td2.type))
      if (td1.dateTime.isAfter(td2.dateTime)) return -1;
      else if (td1.dateTime.isBefore(td2.dateTime)) return 1;
      else return 0;

    if (td1.equals(td2)) return 0;
    return -1;
  }
}
