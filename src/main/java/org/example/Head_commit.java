package org.example;

import java.util.ArrayList;
import java.util.List;

public class Head_commit {
    private String id;
    private String tree_id;
    private boolean distinct;
    private String message;
    private String timestamp;
    private String url;
    Author AuthorObject;
    Committer CommitterObject;
    List<Object> added = new ArrayList<Object>();
    List<Object> removed = new ArrayList<Object>();
    List<Object> modified = new ArrayList<Object>();

    public Head_commit() {
        super();
    }

    @Override
    public String toString() {
        return "Head_commit{" +
                "id='" + id + '\'' +
                ", tree_id='" + tree_id + '\'' +
                ", distinct=" + distinct +
                ", message='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", url='" + url + '\'' +
                ", AuthorObject=" + AuthorObject +
                ", CommitterObject=" + CommitterObject +
                ", added=" + added +
                ", removed=" + removed +
                ", modified=" + modified +
                '}';
    }

    // Getter Methods

    public String getId() {
        return id;
    }

    public String getTree_id() {
        return tree_id;
    }

    public boolean getDistinct() {
        return distinct;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getUrl() {
        return url;
    }

    public Author getAuthor() {
        return AuthorObject;
    }

    public Committer getCommitter() {
        return CommitterObject;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setTree_id(String tree_id) {
        this.tree_id = tree_id;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAuthor(Author authorObject) {
        this.AuthorObject = authorObject;
    }

    public void setCommitter(Committer committerObject) {
        this.CommitterObject = committerObject;
    }
}
