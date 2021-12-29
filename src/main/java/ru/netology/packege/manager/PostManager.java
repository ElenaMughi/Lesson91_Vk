package ru.netology.packege.manager;

import ru.netology.packege.domain.Post;

public class PostManager {

    private Post[] postList;

    public Post[] search(int ownerId, String domain, String query, boolean ownersOnly, int count, int offset) {
// TODO       чего-то делает
        return null;
    }

    public void delete(int postId, int ownerId) {
// TODO       чего-то делает
    }

    public Post[] getPostList() {
        return postList;
    }

    public void setPostList(Post[] postList) {
        this.postList = postList;
    }

}
