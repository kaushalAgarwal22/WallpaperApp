package firstapp.gayatrisoft.com.wallpaperapp;

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

public class Technology extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);



        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Technology.this,MainActivity.class);
                startActivity(i);
            }
        });


        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Technology.this,Favorite_Activity.class);
                startActivity(i);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Technology.this,"tech");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();
    }

    private  void loadimages(){

        ImageItem image =new ImageItem("901","https://images.unsplash.com/photo-1478358161113-b0e11994a36b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1534&q=80");
        ImageList.add(image);

        image =new ImageItem("902","https://images.unsplash.com/photo-1517799094725-e3453440724e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image =new ImageItem("903","https://images.unsplash.com/photo-1531297484001-80022131f5a1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image =new ImageItem("904","https://cdn.pixabay.com/photo/2016/12/01/18/17/mobile-phone-1875813__340.jpg");
        ImageList.add(image);

        image =new ImageItem("905","https://cdn.pixabay.com/photo/2015/07/15/09/00/man-845847_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("906","https://cdn.pixabay.com/photo/2017/07/15/19/42/manipulation-smartphone-2507499__340.jpg");
        ImageList.add(image);

        image =new ImageItem("907","https://cdn.pixabay.com/photo/2011/12/14/12/11/astronaut-11080__340.jpg");
        ImageList.add(image);

        image =new ImageItem("908","https://cdn.pixabay.com/photo/2017/12/28/22/03/lens-3046269_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("909","https://cdn.pixabay.com/photo/2014/10/23/20/51/iphone-500291_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("910","https://cdn.pixabay.com/photo/2014/06/18/16/31/jet-engine-371412__340.jpg");
        ImageList.add(image);

        image =new ImageItem("911","https://cdn.pixabay.com/photo/2016/11/19/14/00/code-1839406__340.jpg");
        ImageList.add(image);

        image =new ImageItem("912","https://cdn.pixabay.com/photo/2012/06/22/23/08/pinwheel-50512__340.jpg");
        ImageList.add(image);

        image =new ImageItem("913","https://images.unsplash.com/photo-1535223289827-42f1e9919769?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);
























}}
