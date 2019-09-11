package duke;

/**
 * The Task class contains methods for query of the tasks
 * as well as to set tasks as done.
 */
public class Task {

    private String description;
    private boolean isDone;
    private boolean isPriority;

    /**
     * Constructor for Task class.
     *
     * @param description The task.
     */
    public Task(String description, boolean isPriority) {
        this.description = description;
        this.isPriority = isPriority;
        this.isDone = false;
    }

    /**
     * Returns "+" symbol if a task is done.
     *
     * @return symbol A tick or cross symbol.
     */
    public String getStatusIcon() {
        return (isDone ? "+" : " ");
    }

    public String getDescription() {
        return description;
    }

    /**
     * Returns the priority level of the task,
     * H represents high priority and L represents low priority.
     *
     * @return priorityLevel The priority level of the task.
     */
    public String getPriority() {
        String priorityLevel = isPriority ? "H" : "L";
        return priorityLevel;
    }

    /**
     * Sets the task to high priority.
     */
    public void setAsPriority() {
        isPriority = true;
    }

    /**
     * Returns an int to indicate if the task is done.
     *
     * @return int 1 is used to indicate a task as done, 0 otherwise.
     */
    public int isDone() {
        return isDone ? 1 : 0;
    }

    /**
     * Sets the task as done.
     */
    public void setDone() {
        isDone = true;
    }

    /**
     * Overrides the toString method to print the task.
     *
     * @return String Task formatted to string including status icon.
     */
    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "][" + this.getPriority() + "] " + this.getDescription();
    }
}