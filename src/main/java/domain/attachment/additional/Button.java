package domain.attachment.additional;

import domain.attachment.additional.Action;

public class Button {
    private String title;
    private Action action;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
