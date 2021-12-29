package ru.netology.packege.domain;

public class Comment {

    private int commentId; // номер/порядок следования комментов
    private String commentsText;  // текст коммента
    private String commentsLink; //ссылка на картинку, если есть.

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getCommentsText() {
        return commentsText;
    }

    public void setCommentsText(String commentsText) {
        this.commentsText = commentsText;
    }

    public String getCommentsLink() {
        return commentsLink;
    }

    public void setCommentsLink(String commentsLink) {
        this.commentsLink = commentsLink;
    }

}
