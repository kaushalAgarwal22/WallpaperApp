package firstapp.gayatrisoft.com.wallpaperapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Favorite_Activity extends AppCompatActivity {
    WallDB wallDB;

    List<ImageItem> imageItemsArr;
    ImageAdapter gridAdapter;
    RecyclerView rv_fav;
    ImageView ivback,iv_heart;
    TextView tvFavourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_);

        wallDB = new WallDB(this);

        ivback=findViewById(R.id.ivback);
        iv_heart=findViewById(R.id.iv_heart);

        tvFavourite=findViewById(R.id.tvFavourite);

        tvFavourite.setVisibility(View.GONE);
        iv_heart.setVisibility(View.GONE);
        rv_fav = (RecyclerView) findViewById(R.id.rv_fav);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 3);
        rv_fav.setLayoutManager(mLayoutManager);
        rv_fav.setItemAnimator(new DefaultItemAnimator());

        loadimages();

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Favorite_Activity.this,MainActivity.class);
                startActivity(i);
            }
        });

    }

    private void loadimages() {
        imageItemsArr = new ArrayList<>();

        List<ImageItem> templist= new ArrayList<>(wallDB.getAllData());

        for(ImageItem item: templist)
        {
            imageItemsArr.add(new ImageItem(item.getId(),item.getImage_view()));
        }

        if (imageItemsArr.size()!=0)
        {
            gridAdapter = new ImageAdapter(imageItemsArr, Favorite_Activity.this,"fav");
            rv_fav.setAdapter(gridAdapter);

        }
        else
        {
            tvFavourite.setVisibility(View.VISIBLE);
            iv_heart.setVisibility(View.VISIBLE);
        }


    }
}
