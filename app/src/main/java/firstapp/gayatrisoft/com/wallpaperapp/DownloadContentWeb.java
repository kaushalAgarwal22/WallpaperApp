package firstapp.gayatrisoft.com.wallpaperapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.concurrent.ExecutionException;

public class DownloadContentWeb extends AppCompatActivity {

    public class DownloadTask extends AsyncTask<String,Void,String>{


        @Override
        protected String doInBackground(String... strings) {



            Log.i("URL","");
            return "Done";
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_content_web);

        DownloadTask task=new DownloadTask();
        String result=null;
        try {
             result=task.execute("https//www.pexels.com/search/3d%20abstract/").get();

                    } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Log.i("Result",result);

    }
}
