package lll.domain;

public class Account {
    private Integer id;
    private Integer uid;
    private Double money;



    //从表实体中注入一个实体对象
    private User user;

    public User getUser() {

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
