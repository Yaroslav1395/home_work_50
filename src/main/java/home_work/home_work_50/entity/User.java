package home_work.home_work_50.entity;

public class User {
    private String accountName;
    private String mail;
    private String password;
    private Integer publicationsСount;
    private Integer subscriberСounter;
    private Integer subscriptionCounter;

    public User(){};

    public User(String accountName, String mail, String password, Integer publicationsСount, Integer subscriberСounter, Integer subscriptionCounter) {
        this.accountName = accountName;
        this.mail = mail;
        this.password = password;
        this.publicationsСount = publicationsСount;
        this.subscriberСounter = subscriberСounter;
        this.subscriptionCounter = subscriptionCounter;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
