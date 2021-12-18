package ru.netology.packege.domain;

import java.util.LinkedList;

public class Post {
    private Integer postId; // номер записи +
    private Integer fromId; // автор поста -
    private Integer createdBy; // админ, опубликовавший запись -
    private Integer replyOwnerId; // владелец записи на которую сделан реплай -
    private Integer replyPostId; // запись на которую сделан реплай -
    private Integer friendsOnly; // признак "только для друзей" -
    private Boolean isItFixed;  // свойство закрепления в начале. у ВК это is_pinned (Integer) +
//    private PostInfo postInfo; // общая часть заголовков
    private Copyright copyright; // по смыслу очень похоже на то, что я озаглавила как postInfo -
    private String postText;  // текст записи +
    private Integer postData;  // дата записи +- неверный тип
    private String postlink; // ссылка на вложение, картинку, видео
    private CommentsInfo commentsInfo; // ссылка на комментарий +
    private LinkedList<Comment> commentsList; // список комментариев
    private LikesInfo likesInfo; // ссылка на лайки. добавлено из-за нового класса -
    private RepostsInfo repostsInfo; // репосты -
    private ViewsInfo viewsInfo; // число просмотров -
    private String postType; // значения - post, copy, reply, postpone, suggest. Затрудняюсь сказать что это -
    private PostSource postSource; // -
    private Integer signerId; // идентификатор автора -
    private Integer canDelete; // может ли пользователь удалить запись -
    private Integer canEdit; // может ли пользователь изменить запись -
    private Integer canPin; // может ли пользователь закрепить запись -
    private Integer markedAsAds; // является ли рекламой -
    private Boolean isFavorite; // находится ли в закладках у пользователя -
    private Donut donut; // для платных подписчиков -
    private Integer PostponedId; // отложенная запись -

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

    public Integer getPostData() {
        return postData;
    }

    public void setPostData(Integer postData) {
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
