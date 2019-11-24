package firstapp.gayatrisoft.com.wallpaperapp.Flowers;

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

public class Flowers extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);

        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);
        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Flowers.this,MainActivity.class);
                startActivity(i);
            }
        });
        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Flowers.this,Favorite_Activity.class);
                startActivity(i);
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Flowers.this,"Flowers");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();
    }

    private  void loadimages(){




        ImageItem image= new ImageItem("401","https://images.unsplash.com/photo-1468327768560-75b778cbb551?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image=new ImageItem("402","https://images.unsplash.com/photo-1526047932273-341f2a7631f9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=80");
        ImageList.add(image);

        image= new ImageItem("403","https://images.unsplash.com/photo-1526228446530-49914082ff8a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image= new ImageItem("404","https://images.unsplash.com/photo-1445090909078-0217954421ec?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=375&q=80");
        ImageList.add(image);

        image= new ImageItem("405","https://images.unsplash.com/photo-1468679950062-7f9630082231?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("406","https://images.unsplash.com/photo-1501660034796-9860da6cb741?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=80");
        ImageList.add(image);

        image= new ImageItem("407","https://images.unsplash.com/photo-1469371670807-013ccf25f16a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("408","https://images.unsplash.com/photo-1515934751635-c81c6bc9a2d8?ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("409","https://images.unsplash.com/reserve/xd45Y326SvKzSR3Nanc8_MRJ_8125-1.jpg?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image= new ImageItem("410","https://images.unsplash.com/photo-1518540140738-791b6a9d430b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=655&q=80");
        ImageList.add(image);

        image= new ImageItem("411","https://cdn.pixabay.com/photo/2016/02/17/19/08/lotus-1205631_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("412","https://cdn.pixabay.com/photo/2014/12/17/21/35/drop-of-water-571956_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("413","https://cdn.pixabay.com/photo/2018/04/21/20/23/tulips-3339416_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("414","https://cdn.pixabay.com/photo/2018/05/15/09/23/raindrop-3402550_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("415","https://cdn.pixabay.com/photo/2015/07/09/22/44/tree-838666_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("416","https://cdn.pixabay.com/photo/2012/11/01/08/05/poppy-63755_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("417","https://cdn.pixabay.com/photo/2017/07/25/01/22/cat-2536662_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("418","https://cdn.pixabay.com/photo/2014/09/27/17/35/dandelion-463928_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("419","https://cdn.pixabay.com/photo/2016/08/07/11/30/round-leaved-bellflower-1576086_960_720.jpg");
        ImageList.add(image);

        image= new ImageItem("420","https://images.pexels.com/photos/207962/pexels-photo-207962.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image= new ImageItem("421","https://images.pexels.com/photos/1558732/pexels-photo-1558732.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

    }
}
