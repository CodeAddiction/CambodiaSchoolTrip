package reddiapps.co.uk.cambodiaschooltrip;

import android.os.AsyncTask;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MyTask extends AsyncTask {

    @Override
    protected Object doInBackground(Object[] objects) {
        String amount="";
        Document doc;
        try {
            doc = Jsoup.connect("http://www.gofundme.com/CampCambodiaTrek").get();
            Elements className = doc.getElementsByClass("goal");
            Element tagName = className.select("strong").first();
          amount = tagName.text();
            Log.v("Title: ",amount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return amount;
    }
}
