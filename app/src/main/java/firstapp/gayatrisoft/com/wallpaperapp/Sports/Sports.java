package firstapp.gayatrisoft.com.wallpaperapp.Sports;

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
import firstapp.gayatrisoft.com.wallpaperapp.Image;
import firstapp.gayatrisoft.com.wallpaperapp.ImageAdapter;
import firstapp.gayatrisoft.com.wallpaperapp.ImageItem;
import firstapp.gayatrisoft.com.wallpaperapp.MainActivity;
import firstapp.gayatrisoft.com.wallpaperapp.R;

public class Sports extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Sports.this,MainActivity.class);
                startActivity(i);
            }
        });


        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Sports.this,Favorite_Activity.class);
                startActivity(i);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Sports.this,"sports");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();

    }

    private  void loadimages(){

        ImageItem image =new ImageItem("801","https://cdn.pixabay.com/photo/2017/05/25/15/08/jogging-2343558_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("802","https://cdn.pixabay.com/photo/2016/08/14/18/27/sailing-boat-1593613_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("803","https://cdn.pixabay.com/photo/2018/02/06/14/07/dance-3134828_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("804","https://cdn.pixabay.com/photo/2013/03/19/18/23/utah-95032_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("805","https://cdn.pixabay.com/photo/2016/08/01/20/13/girl-1561989_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("806","https://cdn.pixabay.com/photo/2016/03/09/15/16/wave-1246560_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("807","https://cdn.pixabay.com/photo/2012/11/28/11/11/quarterback-67701_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("808","https://cdn.pixabay.com/photo/2017/09/28/13/38/aircraft-2795557_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("809","https://cdn.pixabay.com/photo/2013/02/20/14/50/golf-83869_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("810","https://cdn.pixabay.com/photo/2014/10/22/18/04/freerider-498473_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("811","https://cdn.pixabay.com/photo/2016/07/13/16/00/box-1514845_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("812","https://cdn.pixabay.com/photo/2013/02/09/04/23/swimmers-79592_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("813","https://cdn.pixabay.com/photo/2016/01/07/05/00/jet-ski-1125329_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("814","https://cdn.pixabay.com/photo/2016/05/27/14/33/football-1419954_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("815","https://images.unsplash.com/photo-1521412644187-c49fa049e84d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("816","https://images.unsplash.com/photo-1483721310020-03333e577078?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=80");
        ImageList.add(image);

        image =new ImageItem("817","https://images.unsplash.com/photo-1480180566821-a7d525cdfc5e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("818","https://images.unsplash.com/photo-1512588709294-cb4c15fd5719?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=889&q=80");
        ImageList.add(image);

        image =new ImageItem("819","https://images.unsplash.com/photo-1468645547353-56d325bb57ff?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("820","https://images.unsplash.com/photo-1487491506942-373c8f7a7ad5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("821","https://images.unsplash.com/photo-1489805549589-3c5ae55fe740?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("823","https://images.unsplash.com/photo-1520443240718-fce21901db79?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("824","https://images.unsplash.com/photo-1484452330304-377cdeb05340?ixlib=rb-1.2.1&auto=format&fit=crop&w=751&q=80");
        ImageList.add(image);

        image =new ImageItem("825","https://images.unsplash.com/photo-1492366254240-43affaefc3e3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=302&q=80");
        ImageList.add(image);

        image =new ImageItem("826","https://images.unsplash.com/photo-1444491741275-3747c53c99b4?ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);




}}
