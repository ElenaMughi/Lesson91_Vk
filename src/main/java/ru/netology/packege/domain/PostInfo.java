package ru.netology.packege.domain;

import java.sql.Time;

public class PostInfo {  // все то что статично и общее для всех постов

    private Integer ownerID; // идентификатор хозяина стены -
    private String titleName; // Наименование странички
    private String logoLink;  // Логотип
    private Boolean retweet; // наличие кнопок ретвита | пожаловаться | в закладки и т.д.

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getLogoLink() {
        return logoLink;
    }

    public void setLogoLink(String logoLink) {
        this.logoLink = logoLink;
    }

    public Boolean getRetweet() {
        return retweet;
    }

    public void setRetweet(Boolean retweet) {
        this.retweet = retweet;
    }

}
