package co.martinbrown.example.activityanimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityAnimationExampleActivity extends Activity {

    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(myIntent);
                overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
            }
        });
    }
}