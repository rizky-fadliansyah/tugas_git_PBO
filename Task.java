public class Task {
    private final int id;
    private String title;

    public Task(int id, String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }

        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            System.out.println("Title cannot be empty!");
            return;
        }
        this.title = title;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + " | Title: " + title;
    }
}