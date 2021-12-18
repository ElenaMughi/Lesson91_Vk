package ru.netology.packege.domain;

public class LikesInfo {
    private Integer countLikes; // подсчет лайков / перенесено в отдельный класс +
    private Boolean userLikes; // наличие лайка от текущего пользователя. Изменен тип -
    private Boolean canLike; // может ли пользователь оставить лайк -
    private Boolean canPublish; // может ли сделать ретвит. Изменен тип -
}
