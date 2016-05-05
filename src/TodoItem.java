/**
 * Created by MikhailKovalenko on 05.05.16.
 */
public class TodoItem {

    private int id;
    private String text;

    public TodoItem(int id, String text){
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}
