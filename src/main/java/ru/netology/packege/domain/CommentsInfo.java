package ru.netology.packege.domain;

public class CommentsInfo {

    private int count; // +

    private boolean canPost; // неверный тип, оставила мой вариант +

    private int groupCanPost; // комментарии от сообществ -

    private boolean canClose; // закрытие комментариев текущим пользователем -

    private boolean canOpen; // открытие комментариев текущим пользователем -

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getCanPost() { return canPost; }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

}
