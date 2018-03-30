package reddiapps.co.uk.cambodiaschooltrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button aboutBtn = (Button) findViewById(R.id.about_btn);
        Button donateBtn = (Button) findViewById(R.id.donate_btn);
        Button progressBtn = (Button) findViewById(R.id.progress_btn);
        Button contactBtn = (Button) findViewById(R.id.contact_btn);

    }
    public void startAbout(View view){
        Intent intent_about = new Intent(this, about.class);
        startActivity(intent_about);

    }
    public void startDonate(View view){
        Intent intent_donate = new Intent(this, donate.class);
        startActivity(intent_donate);

    }
    public void startProgress(View view){
        Intent intent_progress = new Intent(this, progress.class);
        startActivity(intent_progress);

    }
    public void startContact(View view){
        Intent intent_contact = new Intent(this, contact.class);
        startActivity(intent_contact);

    }
}
