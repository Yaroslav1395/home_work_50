package home_work.home_work_50.entity;

import java.time.LocalDateTime;

public class Comment {
    private String commentText;
    private LocalDateTime commentTime;

    private Comment(){};

    public Comment(String commentText, LocalDateTime commentTime) {
        this.commentText = commentText;
        this.commentTime = commentTime;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }
}
