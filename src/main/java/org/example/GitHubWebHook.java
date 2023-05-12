package org.example;

import java.util.ArrayList;
import java.util.List;

public class GitHubWebHook {
    private String ref;
    private String before;
    private String after;
    Repository RepositoryObject;
    Pusher PusherObject;
    Sender SenderObject;
    private boolean created;
    private boolean deleted;
    private boolean forced;
    private String base_ref = null;
    private String compare;
    List< Object > commits = new ArrayList< Object >();
    Head_commit Head_commitObject;

    public GitHubWebHook() {
        super();
    }

    @Override
    public String toString() {
        return "GitHubWebHook{" +
                "ref='" + ref + '\'' +
                ", before='" + before + '\'' +
                ", after='" + after + '\'' +
                ", RepositoryObject=" + RepositoryObject +
                ", PusherObject=" + PusherObject +
                ", SenderObject=" + SenderObject +
                ", created=" + created +
                ", deleted=" + deleted +
                ", forced=" + forced +
                ", base_ref='" + base_ref + '\'' +
                ", compare='" + compare + '\'' +
                ", commits=" + commits +
                ", Head_commitObject=" + Head_commitObject +
                '}';
    }

    // Getter Methods

    public String getRef() {
        return ref;
    }

    public String getBefore() {
        return before;
    }

    public String getAfter() {
        return after;
    }

    public Repository getRepository() {
        return RepositoryObject;
    }

    public Pusher getPusher() {
        return PusherObject;
    }

    public Sender getSender() {
        return SenderObject;
    }

    public boolean getCreated() {
        return created;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public boolean getForced() {
        return forced;
    }

    public String getBase_ref() {
        return base_ref;
    }

    public String getCompare() {
        return compare;
    }

    public Head_commit getHead_commit() {
        return Head_commitObject;
    }

    // Setter Methods

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public void setRepository(Repository repositoryObject) {
        this.RepositoryObject = repositoryObject;
    }

    public void setPusher(Pusher pusherObject) {
        this.PusherObject = pusherObject;
    }

    public void setSender(Sender senderObject) {
        this.SenderObject = senderObject;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setForced(boolean forced) {
        this.forced = forced;
    }

    public void setBase_ref(String base_ref) {
        this.base_ref = base_ref;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }

    public void setHead_commit(Head_commit head_commitObject) {
        this.Head_commitObject = head_commitObject;
    }
}

