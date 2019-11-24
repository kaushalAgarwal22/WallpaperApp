package firstapp.gayatrisoft.com.wallpaperapp.Cityscape;

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

public class Cityscape extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cityscape);

        ivback=findViewById(R.id.ivback);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Cityscape.this,MainActivity.class);
                startActivity(i);
            }
        });

        ivHeart=findViewById(R.id.ivHeart);
        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Cityscape.this,Favorite_Activity.class);
                startActivity(i);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Cityscape.this,"Cityscape");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();
    }

    private  void  loadimages(){


        ImageItem image = new  ImageItem("248","https://images.unsplash.com/photo-1514565131-fce0801e5785?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=824&q=80");
        ImageList.add(image);

         image = new  ImageItem("249","https://images.unsplash.com/photo-1518599807935-37015b9cefcb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
         ImageList.add(image);

         image= new  ImageItem("250","https://images.unsplash.com/photo-1508325732378-00eafff6c504?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=305&q=80");;
         ImageList.add(image);

         image= new  ImageItem("251","https://images.unsplash.com/photo-1495316331924-236b755286eb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=752&q=80");
         ImageList.add(image);

         image= new  ImageItem("252","https://images.unsplash.com/photo-1449280429541-0214e229317b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=889&q=80");
         ImageList.add(image);

        image= new  ImageItem("253","https://images.unsplash.com/photo-1448317846460-907988886b33?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new  ImageItem("254","https://images.unsplash.com/photo-1470217957101-da7150b9b681?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=667&q=80");
        ImageList.add(image);

        image= new  ImageItem("256","https://images.unsplash.com/photo-1508062878650-88b52897f298?ixlib=rb-1.2.1&auto=format&fit=crop&w=282&q=80");
        ImageList.add(image);

        image =new  ImageItem("257","https://images.unsplash.com/photo-1495680590936-bccf1b026aef?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image=new  ImageItem("258","https://images.unsplash.com/photo-1500078974918-738828bc0422?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=889&q=80");
        ImageList.add(image);

        image=new  ImageItem("259","https://images.pexels.com/photos/830891/pexels-photo-830891.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image=new  ImageItem("260","https://images.pexels.com/photos/162031/dubai-tower-arab-khalifa-162031.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image=new  ImageItem("261","https://images.pexels.com/photos/417344/pexels-photo-417344.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("262","https://images.pexels.com/photos/1519088/pexels-photo-1519088.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("263","https://images.pexels.com/photos/416998/pexels-photo-416998.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("264","https://images.pexels.com/photos/683419/pexels-photo-683419.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("265","https://images.pexels.com/photos/450597/pexels-photo-450597.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("266","https://images.pexels.com/photos/236451/pexels-photo-236451.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("266","https://images.pexels.com/photos/861609/pexels-photo-861609.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("267","https://images.pexels.com/photos/220769/pexels-photo-220769.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("268","https://cdn.pixabay.com/photo/2017/03/05/00/34/panorama-2117310__340.jpg");
        ImageList.add(image);

        image= new  ImageItem("269","https://cdn.pixabay.com/photo/2017/04/24/13/37/architecture-2256489__340.jpg");
        ImageList.add(image);

        image= new  ImageItem("270","https://cdn.pixabay.com/photo/2017/07/27/00/46/fantasy-2543658_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("271","https://cdn.pixabay.com/photo/2013/09/14/19/53/city-182223_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("272","https://cdn.pixabay.com/photo/2016/08/31/11/30/san-francisco-1633204_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("273","https://cdn.pixabay.com/photo/2018/06/04/16/00/alley-3453557_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("274","https://cdn.pixabay.com/photo/2018/04/12/16/35/fantasy-3313964_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("275","https://cdn.pixabay.com/photo/2018/08/03/11/48/skyline-3581739_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("276","https://cdn.pixabay.com/photo/2016/11/29/13/54/chicago-1870010_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("277","https://images.pexels.com/photos/338515/pexels-photo-338515.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("278","https://images.pexels.com/photos/379419/pexels-photo-379419.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("279","https://images.pexels.com/photos/208701/pexels-photo-208701.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("280","https://images.pexels.com/photos/356286/pexels-photo-356286.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new  ImageItem("281","https://images.unsplash.com/photo-1517374784336-ca542b1df69a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new  ImageItem("282","https://images.unsplash.com/photo-1493928841026-e1ab0a590a61?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new  ImageItem("283","https://images.unsplash.com/photo-1445272727255-681d14e89af1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new  ImageItem("284","https://images.unsplash.com/photo-1417918277186-663dd3f35218?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new  ImageItem("285","https://images.unsplash.com/photo-1445264918150-66a2371142a2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new  ImageItem("286","https://images.unsplash.com/photo-1465138456624-660a77cb151f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new  ImageItem("287","https://cdn.pixabay.com/photo/2017/11/11/21/55/girl-2940655__340.jpg");
        ImageList.add(image);

        image= new  ImageItem("288","https://cdn.pixabay.com/photo/2015/05/15/14/21/architecture-768432_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("289","https://cdn.pixabay.com/photo/2017/12/10/17/40/prague-3010407_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("290","https://cdn.pixabay.com/photo/2015/05/15/14/21/architecture-768432_960_720.jpg");
        ImageList.add(image);

        image= new  ImageItem("291","https://cdn.pixabay.com/photo/2016/11/23/13/46/paris-1852928__340.jpg");
        ImageList.add(image);

        image= new  ImageItem("292","https://cdn.pixabay.com/photo/2017/01/28/02/24/japan-2014618__340.jpg");
        ImageList.add(image);

        image= new  ImageItem("293","https://cdn.pixabay.com/photo/2015/03/26/09/49/river-690374__340.jpg");
        ImageList.add(image);

        image= new  ImageItem("294","https://cdn.pixabay.com/photo/2016/01/19/19/26/amsterdam-1150319__340.jpg");
        ImageList.add(image);

        image= new  ImageItem("295","https://cdn.pixabay.com/photo/2014/11/22/08/37/river-541456__340.jpg");
        ImageList.add(image);

        image= new  ImageItem("296","https://cdn.pixabay.com/photo/2015/12/08/00/32/london-1081820__340.jpg");
        ImageList.add(image);

        image= new  ImageItem("297","");
        ImageList.add(image);

        image= new  ImageItem("298","");
        ImageList.add(image);




















    }
}
