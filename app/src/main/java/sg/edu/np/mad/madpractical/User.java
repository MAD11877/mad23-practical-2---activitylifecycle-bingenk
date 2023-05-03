package sg.edu.np.mad.madpractical;

public class User {
    private String user;
    private String description;
    private int id;
    private boolean followed;
    public User(String user,String description, int id,boolean followed){
        this.user=user;
        this.description=description;
        this.id=id;
        this.followed=followed;

    }

}
