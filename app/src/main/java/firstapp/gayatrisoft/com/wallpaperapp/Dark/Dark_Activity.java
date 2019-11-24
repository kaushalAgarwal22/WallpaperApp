package firstapp.gayatrisoft.com.wallpaperapp.Dark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import firstapp.gayatrisoft.com.wallpaperapp.Favorite_Activity;
import firstapp.gayatrisoft.com.wallpaperapp.ImageAdapter;
import firstapp.gayatrisoft.com.wallpaperapp.ImageItem;
import firstapp.gayatrisoft.com.wallpaperapp.MainActivity;
import firstapp.gayatrisoft.com.wallpaperapp.R;

public class Dark_Activity extends AppCompatActivity {

    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    String dark_id="299";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark);

        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);
        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Dark_Activity.this,Favorite_Activity.class);
                startActivity(i);
            }
        });

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Dark_Activity.this,MainActivity.class);
                startActivity(i);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Dark_Activity.this,"Dark_Activity");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();



    }


    private void loadimages() {

        ImageItem image=new ImageItem(dark_id+"1","https://images.unsplash.com/photo-1492112007959-c35ae067c37b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=331&q=80");
        ImageList.add(image);

        image= new ImageItem(dark_id+"2","https://images.unsplash.com/photo-1516410529446-2c777cb7366d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem(dark_id+"3","https://images.unsplash.com/photo-1507491910083-29fad9a7778e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=749&q=80");
        ImageList.add(image);

        image= new ImageItem(dark_id+"4","https://images.unsplash.com/photo-1512078718055-8ffaad296044?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=281&q=80");
        ImageList.add(image);

        image= new ImageItem("303","https://images.unsplash.com/photo-1535236098944-84dd323fa980?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=375&q=80");
        ImageList.add(image);

        image= new ImageItem("304","https://images.unsplash.com/photo-1525083004522-188db34cf1ea?ixlib=rb-1.2.1&auto=format&fit=crop&w=369&q=80");
        ImageList.add(image);

        image= new ImageItem("305","https://cdn.pixabay.com/photo/2018/01/31/07/36/secret-3120483__340.jpg");
        ImageList.add(image);

        image= new ImageItem("306","https://cdn.pixabay.com/photo/2016/12/22/22/07/hands-1926414_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("307","https://cdn.pixabay.com/photo/2018/01/09/20/24/wood-3072434__340.jpg");
        ImageList.add(image);

        image= new ImageItem("308","https://cdn.pixabay.com/photo/2015/10/18/16/55/woman-994737__340.jpg");
        ImageList.add(image);

        image= new ImageItem("309","https://cdn.pixabay.com/photo/2016/11/10/08/15/aircraft-1813731__340.jpg");
        ImageList.add(image);

        image= new ImageItem("310","https://images.pexels.com/photos/104707/pexels-photo-104707.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("311","https://images.pexels.com/photos/1274260/pexels-photo-1274260.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

    }
}
