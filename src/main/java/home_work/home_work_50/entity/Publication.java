package home_work.home_work_50.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Publication {
    private String photo;
    private String description;
    private LocalDateTime publicationTime;

    public Publication(){};

    public Publication(String photo, String description, LocalDateTime publicationTime) {
        this.photo = photo;
        this.description = description;
        this.publicationTime = publicationTime;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(LocalDateTime publicationTime) {
        this.publicationTime = publicationTime;
    }
}
