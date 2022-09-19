package home_work.home_work_50.entity;

import java.time.LocalDateTime;

public class Subscription {
    private User signingWho;
    private User subscridedWho;
    private LocalDateTime eventDate;

    public Subscription(){};

    public Subscription(User signingWho, User subscridedWho, LocalDateTime eventDate) {
        this.signingWho = signingWho;
        this.subscridedWho = subscridedWho;
        this.eventDate = eventDate;
    }

    public User getSigningWho() {
        return signingWho;
    }

    public void setSigningWho(User signingWho) {
        this.signingWho = signingWho;
    }

    public User getSubscridedWho() {
        return subscridedWho;
    }

    public void setSubscridedWho(User subscridedWho) {
        this.subscridedWho = subscridedWho;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
}
