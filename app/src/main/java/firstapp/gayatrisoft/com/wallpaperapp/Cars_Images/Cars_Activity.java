package firstapp.gayatrisoft.com.wallpaperapp.Cars_Images;

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

public class Cars_Activity extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars_);


        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);
        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Cars_Activity.this,Favorite_Activity.class);
                startActivity(i);
            }
        });


        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Cars_Activity.this,MainActivity.class);
                startActivity(i);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Cars_Activity.this,"cars");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();
    }

    private  void  loadimages(){

        ImageItem image = new ImageItem("197","https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629_960_720.png");
        ImageList.add(image);

         image = new ImageItem("198","https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("199","https://cdn.pixabay.com/photo/2017/03/05/15/29/aston-2118857_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("200","https://cdn.pixabay.com/photo/2016/11/22/23/44/buildings-1851246_960_720.jpg");
        ImageList.add(image);


        image = new ImageItem("201","https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("202","https://images.unsplash.com/photo-1517524008697-84bbe3c3fd98?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=80");
        ImageList.add(image);

        image = new ImageItem("203","https://images.unsplash.com/photo-1514316703755-dca7d7d9d882?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("204","https://images.unsplash.com/photo-1494905998402-395d579af36f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("205","https://images.unsplash.com/photo-1441148345475-03a2e82f9719?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("206","https://images.unsplash.com/photo-1506671753197-8d137cc5d53c?ixlib=rb-1.2.1&auto=format&fit=crop&w=370&q=80");
        ImageList.add(image);

        image = new ImageItem("207","https://images.unsplash.com/photo-1502877338535-766e1452684a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=751&q=80");
        ImageList.add(image);

        image = new ImageItem("210","https://images.unsplash.com/photo-1469285994282-454ceb49e63c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjF9&auto=format&fit=crop&w=751&q=80");
        ImageList.add(image);

        image = new ImageItem("211","https://images.unsplash.com/photo-1453856908826-6bbeda0f8490?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=333&q=80");
        ImageList.add(image);

        image = new ImageItem("212","https://images.unsplash.com/photo-1511919884226-fd3cad34687c?ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("213","https://images.unsplash.com/photo-1520050206274-a1ae44613e6d?ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);


        image = new ImageItem("214","https://images.unsplash.com/photo-1469285994282-454ceb49e63c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjF9&auto=format&fit=crop&w=751&q=80");
        ImageList.add(image);

        image = new ImageItem("215","https://images.unsplash.com/photo-1498946168008-9b2e06e76ea0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("216","https://images.unsplash.com/photo-1502161254066-6c74afbf07aa?ixlib=rb-1.2.1&auto=format&fit=crop&w=751&q=80");
        ImageList.add(image);

        image = new ImageItem("217","https://images.unsplash.com/photo-1523676060187-f55189a71f5e?ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);


        image = new ImageItem("218","https://cdn.pixabay.com/photo/2017/03/05/15/29/aston-2118857_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("219","https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629_960_720.png");
        ImageList.add(image);


        image = new ImageItem("220","https://cdn.pixabay.com/photo/2016/05/06/16/32/car-1376190_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("221","https://cdn.pixabay.com/photo/2015/01/20/11/09/lamborghini-605334_960_720.jpg");
        ImageList.add(image);


        image = new ImageItem("222","https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("223","https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg");
        ImageList.add(image);

        image = new ImageItem("224","https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg");
        ImageList.add(image);


        image = new ImageItem("225","https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930__340.jpg");
        ImageList.add(image);


        image = new ImageItem("226","https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg");
        ImageList.add(image);


        image = new ImageItem("227","https://cdn.pixabay.com/photo/2014/10/22/17/22/ford-498244__340.jpg");
        ImageList.add(image);

        image = new ImageItem("228","https://cdn.pixabay.com/photo/2013/08/11/03/40/corvette-171422__340.jpg");
        ImageList.add(image);

        image = new ImageItem("229","https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg");
        ImageList.add(image);

        image = new ImageItem("230","https://cdn.pixabay.com/photo/2017/04/06/22/11/auto-2209439__340.png");
        ImageList.add(image);

        image = new ImageItem("231","https://cdn.pixabay.com/photo/2013/07/12/12/56/ford-mustang-146580__340.png");
        ImageList.add(image);

        image = new ImageItem("232","https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381_960_720.jpg");
        ImageList.add(image);


        image = new ImageItem("233","https://cdn.pixabay.com/photo/2016/05/18/10/52/buick-1400243__340.jpg");
        ImageList.add(image);

        image = new ImageItem("234","https://cdn.pixabay.com/photo/2013/07/13/01/07/ford-mustang-155132__340.png");
        ImageList.add(image);

        image = new ImageItem("235","https://cdn.pixabay.com/photo/2013/07/13/11/50/auto-158795__340.png");
        ImageList.add(image);

        image = new ImageItem("236","https://cdn.pixabay.com/photo/2016/12/07/21/50/audi-1890494__340.jpg");
        ImageList.add(image);

        image = new ImageItem("237","https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918407__340.jpg");
        ImageList.add(image);

        image = new ImageItem("238","https://cdn.pixabay.com/photo/2012/04/12/23/48/car-30990__340.png");
        ImageList.add(image);

        image = new ImageItem("239","https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg");
        ImageList.add(image);

        image = new ImageItem("240","https://cdn.pixabay.com/photo/2014/05/03/00/57/vintage-car-336676__340.jpg");
        ImageList.add(image);

        image = new ImageItem("241","https://cdn.pixabay.com/photo/2015/05/15/14/46/bmw-768688__340.jpg");
        ImageList.add(image);

        image = new ImageItem("242","https://cdn.pixabay.com/photo/2016/09/06/13/37/maserati-1649119__340.jpg");
        ImageList.add(image);

        image = new ImageItem("243","https://images.pexels.com/photos/831475/pexels-photo-831475.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("244","https://images.pexels.com/photos/244206/pexels-photo-244206.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("245","https://images.pexels.com/photos/163706/corvette-vette-viper-black-163706.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("246","https://images.pexels.com/photos/909907/pexels-photo-909907.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("247","https://images.pexels.com/photos/358070/pexels-photo-358070.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);









































    }
}
