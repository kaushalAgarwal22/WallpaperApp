package firstapp.gayatrisoft.com.wallpaperapp.Love;

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

public class LoveActivity extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);
        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(LoveActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoveActivity.this,Favorite_Activity.class);
                startActivity(i);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, LoveActivity.this,"LoveActivity");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();


    }

    private  void loadimages(){


        ImageItem image =new ImageItem("501","https://cdn.pixabay.com/photo/2016/02/10/21/57/heart-1192662__340.jpg");
        ImageList.add(image);

        image =new ImageItem("502","https://cdn.pixabay.com/photo/2015/11/16/22/39/balloon-1046658_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("503","https://cdn.pixabay.com/photo/2015/03/30/20/33/heart-700141__340.jpg");
        ImageList.add(image);


        image =new ImageItem("504","https://cdn.pixabay.com/photo/2018/01/04/19/43/love-3061483__340.jpg");
        ImageList.add(image);

        image =new ImageItem("505","https://cdn.pixabay.com/photo/2015/02/05/01/33/valentines-day-624440_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("506","https://cdn.pixabay.com/photo/2017/04/25/06/15/father-and-son-2258681_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("507","https://cdn.pixabay.com/photo/2015/06/22/08/38/siblings-817369_960_720.jpg");
        ImageList.add(image);


        image =new ImageItem("508","https://cdn.pixabay.com/photo/2014/12/08/11/49/love-560783_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("509","https://cdn.pixabay.com/photo/2014/09/23/06/02/brothers-457234_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("510","https://cdn.pixabay.com/photo/2018/01/05/22/48/couple-3064048_960_720.jpg");
        ImageList.add(image);


        image =new ImageItem("511","https://cdn.pixabay.com/photo/2017/08/06/23/22/people-2597454_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("512","https://cdn.pixabay.com/photo/2014/11/21/15/39/grey-crowned-crane-540657_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("513","https://cdn.pixabay.com/photo/2016/12/27/15/54/romance-1934204_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("514","https://cdn.pixabay.com/photo/2017/08/07/12/49/people-2603521_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("515","https://cdn.pixabay.com/photo/2016/02/19/11/34/couple-1209790_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("516","https://images.unsplash.com/photo-1508257082719-44cae0c0044d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("517","https://images.unsplash.com/photo-1518568814500-bf0f8d125f46?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("518","https://images.unsplash.com/photo-1501834694136-5c1e87f85fa7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=344&q=80");
        ImageList.add(image);

        image =new ImageItem("519","https://images.unsplash.com/photo-1511898290398-cee3038fa7a7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("520","https://cdn.pixabay.com/photo/2018/05/10/20/00/love-3388622_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("521","https://cdn.pixabay.com/photo/2017/09/05/11/37/baby-2717347_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("522","https://cdn.pixabay.com/photo/2017/01/05/04/51/valentine-1953964_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("523","https://images.unsplash.com/photo-1516401266446-6432a8a07d41?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("524","https://images.unsplash.com/photo-1518406479616-cd3f1cde0a50?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("525","https://images.unsplash.com/photo-1496156555893-ce6408188e2c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("526","https://images.unsplash.com/photo-1496744879417-5669c65f974c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("527","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("528","https://cdn.pixabay.com/photo/2014/07/21/03/53/digital-art-398342_960_720.png");
        ImageList.add(image);

        image =new ImageItem("529","https://cdn.pixabay.com/photo/2015/08/01/16/15/soldier-870399_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("530","https://cdn.pixabay.com/photo/2014/08/16/18/17/book-419589_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("531","https://cdn.pixabay.com/photo/2018/01/04/09/39/literature-3060241_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("532","https://cdn.pixabay.com/photo/2018/02/23/12/38/flower-3175428_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("533","https://cdn.pixabay.com/photo/2014/08/02/17/30/whisper-408482_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("534","https://cdn.pixabay.com/photo/2017/11/26/22/38/rose-2980163_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("535","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("536","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("537","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("538","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("539","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("540","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);


        image =new ImageItem("541","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("542","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("543","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("544","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("545","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("546","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("547","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("548","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("549","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);

        image =new ImageItem("550","https://images.unsplash.com/photo-1494859632785-32abaf5241f4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=778&q=80");
        ImageList.add(image);








































    }
}
