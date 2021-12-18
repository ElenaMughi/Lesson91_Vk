package ru.netology.packege.domain;

public class CommentsInfo {

    private Integer count; // +

    private Boolean canPost; // неверный тип, оставила мой вариант +

    private Integer groupCanPost; // комментарии от сообществ -

    private Boolean canClose; // закрытие комментариев текущим пользователем -

    private Boolean canOpen; // открытие комментариев текущим пользователем -

    public Integer getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Boolean getCanPost() { return canPost; }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

}
