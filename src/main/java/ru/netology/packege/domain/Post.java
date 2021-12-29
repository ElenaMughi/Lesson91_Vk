package ru.netology.packege.domain;

import java.util.LinkedList;

public class Post {
    private int postId; // номер записи +
    private int fromId; // автор поста -
    private int createdBy; // админ, опубликовавший запись -
    private int replyOwnerId; // владелец записи на которую сделан реплай -
    private int replyPostId; // запись на которую сделан реплай -
    private int friendsOnly; // признак "только для друзей" -
    private boolean isItFixed;  // свойство закрепления в начале. у ВК это is_pinned (int) +
//    private PostInfo postInfo; // общая часть заголовков
    private Copyright copyright; // по смыслу очень похоже на то, что я озаглавила как postInfo -
    private String postText;  // текст записи +
    private int postData;  // дата записи +- неверный тип
    private String postlink; // ссылка на вложение, картинку, видео
    private CommentsInfo commentsInfo; // ссылка на комментарий +
    private LinkedList<Comment> commentsList; // список комментариев
    private LikesInfo likesInfo; // ссылка на лайки. добавлено из-за нового класса -
    private RepostsInfo repostsInfo; // репосты -
    private ViewsInfo viewsInfo; // число просмотров -
    private String postType; // значения - post, copy, reply, postpone, suggest. Затрудняюсь сказать что это -
    private PostSource postSource; // -
    private int signerId; // идентификатор автора -
    private int canDelete; // может ли пользователь удалить запись -
    private int canEdit; // может ли пользователь изменить запись -
    private int canPin; // может ли пользователь закрепить запись -
    private int markedAsAds; // является ли рекламой -
    private boolean isFavorite; // находится ли в закладках у пользователя -
    private Donut donut; // для платных подписчиков -
    private int PostponedId; // отложенная запись -

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public boolean getItFixed() {
        return isItFixed;
    }

    public void setItFixed(boolean itFixed) {
        isItFixed = itFixed;
    }

    public int getPostData() {
        return postData;
    }

    public void setPostData(int postData) {
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

}
