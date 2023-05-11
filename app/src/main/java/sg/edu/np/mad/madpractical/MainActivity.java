package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button followButton;
    private boolean isFollowing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        followButton = findViewById(R.id.btnFollow);
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFollowing) {
                    followButton.setText("FOLLOW");
                    isFollowing = false;
                } else {
                    followButton.setText("UNFOLLOW");
                    isFollowing = true;
                }
            }
        });
    }
}