package sg.edu.np.mad.madpractical;

public class User {
    String name;
    String description;
    int id;
    static boolean followed;

    public User() {

    }

    public User(String user,String description, int id,boolean followed){
        this.name=user;
        this.description=description;
        this.id=id;
        this.followed=followed;

    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getId() {
        return id;
    }
    public static boolean isFollowed() {
        return followed;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

}
