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

public class AbstractActivity extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract);

        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(AbstractActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AbstractActivity.this,Favorite_Activity.class);
                startActivity(i);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, AbstractActivity.this,"Abstract");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();



    }


    private void loadimages( ) {

        ImageItem image=new ImageItem("146","https://images.pexels.com/photos/988872/pexels-photo-988872.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("147","https://images.pexels.com/photos/1020315/pexels-photo-1020315.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
                ImageList.add(image);

        image= new ImageItem("148","https://images.pexels.com/photos/34090/pexels-photo.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image =new ImageItem("149","https://images.pexels.com/photos/268563/pexels-photo-268563.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("150","https://images.pexels.com/photos/144241/raindrop-drip-rain-water-144241.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("151","https://images.pexels.com/photos/55818/drop-of-water-drip-blade-of-grass-blossom-55818.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("152","https://images.pexels.com/photos/333513/pexels-photo-333513.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("153","https://images.pexels.com/photos/356243/pexels-photo-356243.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("154","https://images.unsplash.com/photo-1490071600105-29a2252e1426?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=400&q=80");
        ImageList.add(image);

        image= new ImageItem("155","https://cdn.pixabay.com/photo/2013/04/11/19/46/louvre-102840_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("156","https://images.pexels.com/photos/355853/pexels-photo-355853.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("157","https://cdn.pixabay.com/photo/2013/07/27/05/13/lighthouse-168132_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("158","https://cdn.pixabay.com/photo/2016/10/21/14/50/plouzane-1758197_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("159","https://cdn.pixabay.com/photo/2012/02/24/16/59/beautiful-16736_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("160","https://images.unsplash.com/photo-1496138647074-da2e34c62e50?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("161","https://images.unsplash.com/photo-1446858173142-82ce60cd3d28?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("162","https://images.pexels.com/photos/355853/pexels-photo-355853.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("163","https://cdn.pixabay.com/photo/2017/03/12/16/00/blue-2137334_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("164","https://cdn.pixabay.com/photo/2016/09/23/21/08/motorcycle-1690452_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("165","https://cdn.pixabay.com/photo/2015/06/24/16/36/office-820390_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("166","https://cdn.pixabay.com/photo/2016/02/19/10/46/curve-1209392_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("167","https://cdn.pixabay.com/photo/2015/03/17/14/05/sparkler-677774_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("168","https://cdn.pixabay.com/photo/2018/01/28/13/24/portrait-3113651_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("169","https://cdn.pixabay.com/photo/2016/09/18/14/21/swimmer-1678307_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("170","https://images.unsplash.com/photo-1486255481014-3a4aad4f6c8d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("171","https://images.unsplash.com/photo-1486546910464-ec8e45c4a137?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=351&q=80");
        ImageList.add(image);

        image= new ImageItem("172","https://images.unsplash.com/photo-1541526855570-9154d61f6a8b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("173","https://images.unsplash.com/photo-1529179307417-ca83d48bd790?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("174","https://images.unsplash.com/photo-1543877087-ebf71fde2be1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("175","https://images.unsplash.com/photo-1416949929422-a1d9c8fe84af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=751&q=80");
        ImageList.add(image);

        image= new ImageItem("176","https://images.unsplash.com/photo-1521458521620-f24b9faf32b5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);


        image= new ImageItem("177","https://images.pexels.com/photos/1193743/pexels-photo-1193743.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("178","https://images.pexels.com/photos/207130/pexels-photo-207130.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("179","https://cdn.pixabay.com/photo/2014/08/03/19/13/leaf-409258_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("180","https://cdn.pixabay.com/photo/2014/02/27/16/08/splashing-275950_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("181","https://cdn.pixabay.com/photo/2016/05/27/08/51/mobile-phone-1419275_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("182","https://cdn.pixabay.com/photo/2016/06/05/22/47/oil-in-water-1438382_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("183","https://cdn.pixabay.com/photo/2017/03/25/17/55/color-2174045_960_720.png");
        ImageList.add(image);

        image= new ImageItem("184","https://cdn.pixabay.com/photo/2015/03/16/08/18/hex-675576_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("185","https://cdn.pixabay.com/photo/2016/01/13/21/24/architecture-1138967_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("186","https://cdn.pixabay.com/photo/2016/03/31/08/46/abstract-1292258_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("187","https://cdn.pixabay.com/photo/2015/09/18/15/38/woman-945815_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("188","https://cdn.pixabay.com/photo/2016/08/29/21/01/walt-disney-center-1629173_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("189","https://cdn.pixabay.com/photo/2010/12/13/10/00/abstract-2100_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("190","https://cdn.pixabay.com/photo/2016/10/04/08/58/theater-1713816_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("191","https://cdn.pixabay.com/photo/2016/10/18/08/35/background-1749550_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("192","https://cdn.pixabay.com/photo/2016/03/27/19/08/abstract-1283722__340.jpg");
        ImageList.add(image);

        image= new ImageItem("193","https://cdn.pixabay.com/photo/2017/05/29/01/27/abstract-2352687_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("194","https://cdn.pixabay.com/photo/2016/04/25/13/25/universe-1351865_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("195","https://cdn.pixabay.com/photo/2017/07/01/19/48/background-2462431_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("196","https://cdn.pixabay.com/photo/2016/07/07/01/16/abstract-1501710_960_720.jpg");
        ImageList.add(image);

    }
}
