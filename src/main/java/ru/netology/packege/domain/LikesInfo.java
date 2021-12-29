package ru.netology.packege.domain;

public class LikesInfo {
    private int countLikes; // подсчет лайков / перенесено в отдельный класс +
    private boolean userLikes; // наличие лайка от текущего пользователя. Изменен тип -
    private boolean canLike; // может ли пользователь оставить лайк -
    private boolean canPublish; // может ли сделать ретвит. Изменен тип -
}
