package firstapp.gayatrisoft.com.wallpaperapp.Music;

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

public class Music extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);


        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Music.this,MainActivity.class);
                startActivity(i);
            }
        });


        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Music.this,Favorite_Activity.class);
                startActivity(i);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Music.this,"Music");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();
    }

    private  void loadimages(){

        ImageItem image =new ImageItem("651","https://images.unsplash.com/photo-1508700115892-45ecd05ae2ad?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("652","https://images.unsplash.com/photo-1511671782779-c97d3d27a1d4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("653","https://images.unsplash.com/photo-1524567248408-cbfd37e65e2d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("654","https://images.unsplash.com/photo-1525362081669-2b476bb628c3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("655","https://images.unsplash.com/photo-1507676385008-e7fb562d11f8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=749&q=80");
        ImageList.add(image);

        image =new ImageItem("656","https://images.unsplash.com/photo-1420161900862-9a86fa1f5c79?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("657","https://images.unsplash.com/photo-1493247035880-efdf55d1cc99?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("658","https://images.unsplash.com/photo-1473646590311-c48e1bc77b44?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("659","https://images.unsplash.com/photo-1484876065684-b683cf17d276?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("660","https://images.unsplash.com/photo-1464676015774-81a71be95929?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("661","https://images.unsplash.com/photo-1499676763409-c0211693a66b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=80");
        ImageList.add(image);

        image =new ImageItem("662","https://images.unsplash.com/photo-1499364615650-ec38552f4f34?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=666&q=80");
        ImageList.add(image);

        image =new ImageItem("663","https://cdn.pixabay.com/photo/2016/02/19/11/36/microphone-1209816_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("664","https://cdn.pixabay.com/photo/2017/01/18/17/14/girl-1990347_960_720.jpg");
        ImageList.add(image);;

        image =new ImageItem("665","https://cdn.pixabay.com/photo/2015/05/07/11/02/guitar-756326_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("666","https://cdn.pixabay.com/photo/2018/06/30/09/29/music-3507317_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("667","https://cdn.pixabay.com/photo/2015/04/07/15/10/girl-711087_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("668","https://cdn.pixabay.com/photo/2016/11/19/09/57/classical-music-1838390_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("669","https://images.unsplash.com/photo-1488376739361-ed24c9beb6d0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=755&q=80");
        ImageList.add(image);

        image =new ImageItem("670","https://cdn.pixabay.com/photo/2016/11/19/09/57/classical-music-1838390_960_720.jpg");
        ImageList.add(image);






}}
