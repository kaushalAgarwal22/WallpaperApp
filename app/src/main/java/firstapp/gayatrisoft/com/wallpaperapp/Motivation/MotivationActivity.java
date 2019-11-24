package firstapp.gayatrisoft.com.wallpaperapp.Motivation;

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

public class MotivationActivity extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);

        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MotivationActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MotivationActivity.this,Favorite_Activity.class);
                startActivity(i);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, MotivationActivity.this,"main");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();

    }

    private void loadimages(){


        ImageItem image =new ImageItem("551","https://images.unsplash.com/photo-1504257365157-1496a50d48f2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("552","https://images.unsplash.com/photo-1534196511436-921a4e99f297?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("553","https://images.unsplash.com/photo-1468971050039-be99497410af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=890&q=80");
        ImageList.add(image);

        image =new ImageItem("554","https://images.unsplash.com/photo-1535981767287-35259dbf7d0e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=375&q=80");
        ImageList.add(image);

        image =new ImageItem("555","https://images.unsplash.com/photo-1522978413910-e3889a1343db?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=80");
        ImageList.add(image);

        image =new ImageItem("556","https://images.unsplash.com/photo-1535365860506-d8b700079e59?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=559&q=80");
        ImageList.add(image);

        image =new ImageItem("557","https://images.unsplash.com/photo-1488381397757-59d6261610f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=332&q=80");
        ImageList.add(image);

        image =new ImageItem("558","https://images.unsplash.com/photo-1513477967668-2aaf11838bd6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("559","https://images.unsplash.com/photo-1527174744973-fc9ce02c141d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=753&q=80");
        ImageList.add(image);

        image =new ImageItem("560","https://images.unsplash.com/photo-1531323386183-43890b5c766d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("561","https://images.unsplash.com/photo-1517446915321-65e972f1b494?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("562","https://images.unsplash.com/photo-1511212269845-02902bfd3ca7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("563","https://cdn.pixabay.com/photo/2015/07/28/21/02/woman-865021_960_720.jpg");
        ImageList.add(image);




    }








}
