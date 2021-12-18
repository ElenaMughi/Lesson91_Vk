package ru.netology.packege.domain;

import java.util.LinkedList;
import java.util.List;

public class Post {
    private Integer postId; // номер записи
    private Boolean isItFixed;  // свойство закрепления в начале
    private PostInfo postInfo; // общая часть заголовков
    private String postText;  // текст записи
    private String postData;  // дата записи
    private String postlink; // ссылка на вложение, картинку, видео
    private CommentsInfo commentsInfo; // ссылка на комментарий
    private LinkedList<Comment> commentsList; // список комментариев
    private Integer countLikes; // подсчет лайков

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Boolean getItFixed() {
        return isItFixed;
    }

    public void setItFixed(Boolean itFixed) {
        isItFixed = itFixed;
    }

    public PostInfo getPostInfo() {
        return postInfo;
    }

    public void setPostInfo(PostInfo postInfo) {
        this.postInfo = postInfo;
    }

    public String getPostData() {
        return postData;
    }

    public void setPostData(String postData) {
        this.postData = postData;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostlink() {
        return postlink;
    }

    public void setPostlink(String postlink) {
        this.postlink = postlink;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LinkedList<Comment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(LinkedList<Comment> commentsList) {
        this.commentsList = commentsList;
    }

    public Integer getCountLikes() {
        return countLikes;
    }

    public void setCountLikes(Integer countLikes) {
        this.countLikes = countLikes;
    }

}
