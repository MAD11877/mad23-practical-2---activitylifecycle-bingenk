package sg.edu.np.mad.madpractical;

public class User {
    public String user;
    public String description;
    public int id;
    public boolean followed;

    public User() {

    }
    public void setName() {
        User user = new User("John", "A new user", 1, false);
        user.user = "test";
    }

    public User(String user,String description, int id,boolean followed){
        this.user=user;
        this.description=description;
        this.id=id;
        this.followed=followed;

    }


}
