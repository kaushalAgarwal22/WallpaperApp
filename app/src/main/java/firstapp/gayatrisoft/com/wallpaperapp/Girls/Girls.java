package firstapp.gayatrisoft.com.wallpaperapp.Girls;

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

public class Girls extends AppCompatActivity {

    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_girls);

        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);
        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Girls.this,MainActivity.class);
                startActivity(i);
            }
        });
        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Girls.this,Favorite_Activity.class);
                startActivity(i);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Girls.this,"Girls");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();


    }

    private  void loadimages() {


        ImageItem image = new ImageItem("451","https://images.unsplash.com/photo-1513207565459-d7f36bfa1222?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new ImageItem("452","https://images.unsplash.com/photo-1526288417508-9811d4a31686?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new ImageItem("453","https://images.unsplash.com/photo-1531563154281-041ebe947157?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("454","https://images.unsplash.com/photo-1503185912284-5271ff81b9a8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("455","https://images.unsplash.com/photo-1503104834685-7205e8607eb9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("456","https://images.unsplash.com/photo-1510258791301-4d7ac469cc46?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new ImageItem("457","https://images.unsplash.com/photo-1511654433543-916c15d46ad6?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new ImageItem("458","https://images.unsplash.com/photo-1494447122076-9e353e4dfd0f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new ImageItem("459","https://images.unsplash.com/photo-1477414876610-1ec826f2e689?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new ImageItem("460","https://images.unsplash.com/photo-1507527690292-7888f1022d36?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new ImageItem("461","https://cdn.pixabay.com/photo/2016/04/10/21/34/woman-1320810_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("462","https://cdn.pixabay.com/photo/2016/11/08/05/26/woman-1807533_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("463","https://cdn.pixabay.com/photo/2018/01/25/14/12/nature-3106213_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("464","https://cdn.pixabay.com/photo/2016/01/19/17/48/woman-1149911_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("465","https://cdn.pixabay.com/photo/2015/09/17/14/24/guitar-944261_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("466","https://cdn.pixabay.com/photo/2015/09/03/08/04/photographer-920128_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("467","https://cdn.pixabay.com/photo/2017/06/02/14/11/girl-2366438_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("468","https://cdn.pixabay.com/photo/2016/01/08/06/13/winter-1127201_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("469","https://cdn.pixabay.com/photo/2016/11/08/05/37/rice-1807554_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("470","https://cdn.pixabay.com/photo/2016/06/17/09/41/portrait-1462944_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("471","https://images.pexels.com/photos/638700/pexels-photo-638700.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("472","https://images.pexels.com/photos/1382731/pexels-photo-1382731.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image= new ImageItem("473","https://images.pexels.com/photos/157606/girl-black-dress-portrait-hair-157606.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("474","https://images.pexels.com/photos/458691/pexels-photo-458691.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("475","https://images.pexels.com/photos/864938/pexels-photo-864938.png?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("476","https://images.pexels.com/photos/160433/kid-girl-child-cute-160433.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("477","https://images.pexels.com/photos/902030/pexels-photo-902030.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("478","https://images.pexels.com/photos/821417/pexels-photo-821417.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("479","https://images.pexels.com/photos/157728/straw-field-hair-nature-157728.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("480","https://images.pexels.com/photos/1200229/pexels-photo-1200229.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("481","https://cdn.pixabay.com/photo/2016/11/29/04/50/blur-1867402_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("482","https://cdn.pixabay.com/photo/2016/06/05/20/41/girl-1438138_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("483","https://images.unsplash.com/photo-1443180683100-fbb2c471775e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=752&q=80");
        ImageList.add(image);



    }
}
