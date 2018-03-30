package reddiapps.co.uk.cambodiaschooltrip;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;


public class progress extends AppCompatActivity {

    public SeekBar sb;
    public TextView progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        sb = (SeekBar) findViewById(R.id.sb);
        progress = (TextView) findViewById(R.id.amount_tv);
        try {
            String amount = (String) new MyTask().execute().get();
            progress.setText(amount);
            String trimmedAmount = amount.substring(1);
            Log.v("trimmedAmount = ",trimmedAmount);
            int total = Integer.parseInt(trimmedAmount);
            sb.setProgress(total);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
