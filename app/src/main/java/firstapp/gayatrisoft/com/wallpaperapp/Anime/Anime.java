package firstapp.gayatrisoft.com.wallpaperapp.Anime;

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

public class Anime extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Anime.this,MainActivity.class);
                startActivity(i);
            }
        });

        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Anime.this,Favorite_Activity.class);
                startActivity(i);
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());



        loadimages();

    }

    private void loadimages( ) {


        ImageItem image = new ImageItem("44","https://images.pexels.com/photos/988872/pexels-photo-988872.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("45","https://cdn.pixabay.com/photo/2019/01/05/17/05/man-3915438_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("46","https://cdn.pixabay.com/photo/2017/10/17/16/10/fantasy-2861107_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("47","https://cdn.pixabay.com/photo/2018/10/19/12/14/wintry-3758523_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("48","https://cdn.pixabay.com/photo/2018/03/10/17/16/woman-3214594_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("49","https://cdn.pixabay.com/photo/2013/11/08/21/13/tree-207584_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("50","https://cdn.pixabay.com/photo/2017/10/26/12/34/fantasy-2890925_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("51","https://images.unsplash.com/photo-1542841791-c3cc44abdbbb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("52","https://images.unsplash.com/photo-1519783841896-ca022fb97cc2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("53","https://images.unsplash.com/photo-1440589473619-3cde28941638?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("54","https://images.unsplash.com/photo-1451342695181-17c97b85aab4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("55","https://images.unsplash.com/photo-1455642305367-68834a1da7ab?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("56","https://images.unsplash.com/photo-1467348331559-d2587ae4d95c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=755&q=80");
        ImageList.add(image);

        image= new ImageItem("57","https://images.unsplash.com/photo-1504208434309-cb69f4fe52b0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("58","https://images.unsplash.com/photo-1518552049385-b49853f00af4?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=364&q=80");
        ImageList.add(image);

        image= new ImageItem("59","https://cdn.pixabay.com/photo/2019/01/05/17/05/man-3915438_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("60","https://cdn.pixabay.com/photo/2017/10/17/16/10/fantasy-2861107_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("61","https://cdn.pixabay.com/photo/2018/08/14/13/23/ocean-3605547_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("62","https://cdn.pixabay.com/photo/2016/06/28/00/13/castle-1483681_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("63","https://cdn.pixabay.com/photo/2018/10/19/12/14/wintry-3758523_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("64","https://cdn.pixabay.com/photo/2017/07/15/15/50/fantasy-2506830__340.jpg");
        ImageList.add(image);

        image= new ImageItem("65","https://cdn.pixabay.com/photo/2018/03/10/17/16/woman-3214594_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("66","https://cdn.pixabay.com/photo/2017/01/09/00/49/winter-1964361_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("67","https://images.pexels.com/photos/164839/pexels-photo-164839.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("68","https://images.pexels.com/photos/69378/pexels-photo-69378.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);


        image= new ImageItem("69","https://images.pexels.com/photos/1049622/pexels-photo-1049622.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("70","https://images.pexels.com/photos/1106452/pexels-photo-1106452.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("71","https://images.pexels.com/photos/932261/pexels-photo-932261.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("72","https://images.pexels.com/photos/67826/jellyfish-luminous-jellyfish-light-light-phenomenon-67826.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("73","https://images.pexels.com/photos/45911/peacock-plumage-bird-peafowl-45911.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image= new ImageItem("74","https://images.pexels.com/photos/39317/chihuahua-dog-puppy-cute-39317.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("75","https://images.pexels.com/photos/847393/pexels-photo-847393.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("76","https://images.pexels.com/photos/837500/pexels-photo-837500.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("77","https://images.pexels.com/photos/208803/pexels-photo-208803.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("78","https://cdn.pixabay.com/photo/2016/12/05/21/55/super-woman-1885016_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("79","https://cdn.pixabay.com/photo/2016/01/02/16/06/girl-1118396_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("80","https://images.pexels.com/photos/1842182/pexels-photo-1842182.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("81","https://images.unsplash.com/photo-1485394735640-56c0356b62cf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image= new ImageItem("82","https://images.pexels.com/photos/66898/elephant-cub-tsavo-kenya-66898.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("83","https://images.pexels.com/photos/1367067/pexels-photo-1367067.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("84","https://images.pexels.com/photos/68767/divers-underwater-ocean-swim-68767.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("85","https://images.pexels.com/photos/70069/pexels-photo-70069.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("86","https://cdn.pixabay.com/photo/2014/10/31/17/41/dancing-dave-minion-510835_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("87","https://cdn.pixabay.com/photo/2015/03/27/13/16/cat-694730_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("88","https://cdn.pixabay.com/photo/2016/05/25/13/55/horses-1414889_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("89","https://cdn.pixabay.com/photo/2017/05/28/10/23/swan-2350668_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("90","https://cdn.pixabay.com/photo/2017/01/28/11/00/white-tailed-eagle-2015098_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("91","https://images.pexels.com/photos/672142/pexels-photo-672142.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("92","https://images.pexels.com/photos/45863/frog-butterfly-pond-mirroring-45863.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("93","https://images.pexels.com/photos/1181181/pexels-photo-1181181.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);
        
        image= new ImageItem("94","https://images.pexels.com/photos/37857/gulls-birds-fly-water-bird-37857.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);
//
//        image= new ImageItem("61","");
//        ImageList.add(image);
//
//        image= new ImageItem("61","");
//        ImageList.add(image);
//
//        image= new ImageItem("61","");
//        ImageList.add(image);
//
//        image= new ImageItem("61","");
//        ImageList.add(image);
//
//        image= new ImageItem("61","");
//        ImageList.add(image);
//
//        image= new ImageItem("61","");
//        ImageList.add(image);
//
//        image= new ImageItem("61","");
//        ImageList.add(image);
      gridAdapter = new ImageAdapter(ImageList, Anime.this,"Anime");

        recyclerView.setAdapter(gridAdapter);



    }

}
