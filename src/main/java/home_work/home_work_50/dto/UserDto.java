package home_work.home_work_50.dto;

import home_work.home_work_50.entity.User;

public class UserDto {
    private User user;
    private Integer publicationsСount;
    private Integer subscriberСounter;
    private Integer subscriptionCounter;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getPublicationsСount() {
        return publicationsСount;
    }

    public void setPublicationsСount(Integer publicationsСount) {
        this.publicationsСount = publicationsСount;
    }

    public Integer getSubscriberСounter() {
        return subscriberСounter;
    }

    public void setSubscriberСounter(Integer subscriberСounter) {
        this.subscriberСounter = subscriberСounter;
    }

    public Integer getSubscriptionCounter() {
        return subscriptionCounter;
    }

    public void setSubscriptionCounter(Integer subscriptionCounter) {
        this.subscriptionCounter = subscriptionCounter;
    }
}
