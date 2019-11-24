package firstapp.gayatrisoft.com.wallpaperapp.Fantasy;

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

public class FantasyActivity extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fantasy);

        ivback=findViewById(R.id.ivback);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(FantasyActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        ivHeart=findViewById(R.id.ivHeart);

        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(FantasyActivity.this,Favorite_Activity.class);
                startActivity(i);
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, FantasyActivity.this,"FantasyActivity");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();
    }
    private void loadimages( ) {

        ImageItem image = new ImageItem("350","https://cdn.pixabay.com/photo/2018/01/12/10/19/fantasy-3077928_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("351","https://cdn.pixabay.com/photo/2017/12/03/17/23/fantasy-2995326_960_720.jpg");
        ImageList.add(image);


        image= new ImageItem("352","https://cdn.pixabay.com/photo/2018/03/12/12/32/woman-3219507_960_720.jpg");
        ImageList.add(image);


        image= new ImageItem("353","https://cdn.pixabay.com/photo/2017/01/06/22/24/giraffe-1959110_960_720.jpg");
        ImageList.add(image);


        image= new ImageItem("354","https://cdn.pixabay.com/photo/2017/07/15/15/50/fantasy-2506830_960_720.jpg");
        ImageList.add(image);


        image= new ImageItem("355","https://cdn.pixabay.com/photo/2017/11/06/23/19/composing-2925179_960_720.jpg");
        ImageList.add(image);


        image= new ImageItem("356","https://cdn.pixabay.com/photo/2018/04/12/16/35/fantasy-3313964_960_720.jpg");
        ImageList.add(image);


        image= new ImageItem("357","https://cdn.pixabay.com/photo/2017/09/01/03/47/fantasy-2702997_960_720.jpg");
        ImageList.add(image);


        image= new ImageItem("358","https://cdn.pixabay.com/photo/2017/09/08/13/18/woman-2728727_960_720.jpg");
        ImageList.add(image);


        image= new ImageItem("359","https://cdn.pixabay.com/photo/2018/05/10/20/51/nymph-3388708_960_720.jpg");
        ImageList.add(image);


        image= new ImageItem("360","https://images.pexels.com/photos/1079013/pexels-photo-1079013.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);


        image= new ImageItem("361","https://images.pexels.com/photos/1660924/pexels-photo-1660924.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);


        image= new ImageItem("362","https://images.pexels.com/photos/388623/pexels-photo-388623.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("363","https://images.pexels.com/photos/1483585/pexels-photo-1483585.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("364","https://images.pexels.com/photos/1694348/pexels-photo-1694348.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("365","https://images.pexels.com/photos/36487/above-adventure-aerial-air.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("366","https://images.pexels.com/photos/256546/pexels-photo-256546.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("367","https://images.pexels.com/photos/354963/pexels-photo-354963.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("368","https://images.pexels.com/photos/458429/pexels-photo-458429.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("369","https://images.pexels.com/photos/1461013/pexels-photo-1461013.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("370","https://images.unsplash.com/photo-1523293836414-f04e712e1f3b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=347&q=80");
        ImageList.add(image);

        image= new ImageItem("371","https://images.unsplash.com/photo-1505159940484-eb2b9f2588e2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("372","https://images.unsplash.com/photo-1541230923692-f8653ab25827?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("373","https://images.unsplash.com/photo-1522143236612-e0227fa7b5a1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=375&q=80");
        ImageList.add(image);

        image= new ImageItem("374","https://images.unsplash.com/photo-1517683005126-77eae06eff34?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=889&q=80");
        ImageList.add(image);


        image= new ImageItem("375","https://images.unsplash.com/photo-1539151332289-1693b0b77f89?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("376","https://images.unsplash.com/photo-1461805491071-c9592143d69c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=889&q=80");
        ImageList.add(image);

        image= new ImageItem("377","https://images.unsplash.com/photo-1532182657011-d3d31357b5d8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=696&q=80");
        ImageList.add(image);

        image= new ImageItem("378","https://images.unsplash.com/photo-1548136480-1e36bc8cbdf9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("379","https://images.unsplash.com/photo-1534375331066-855d6c9096af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

    }
}
