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

public class Space extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);


        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Space.this,MainActivity.class);
                startActivity(i);
            }
        });


        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Space.this,Favorite_Activity.class);
                startActivity(i);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Space.this,"space");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();

    }
    private  void loadimages(){

        ImageItem image =new ImageItem("851","https://cdn.pixabay.com/photo/2016/10/20/18/35/sunrise-1756274__340.jpg");
        ImageList.add(image);

        image =new ImageItem("852","https://cdn.pixabay.com/photo/2017/08/30/01/05/milky-way-2695569_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("853","https://cdn.pixabay.com/photo/2017/09/12/11/56/universe-2742113_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("854","https://cdn.pixabay.com/photo/2015/05/06/16/31/andromeda-galaxy-755442_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("855","https://cdn.pixabay.com/photo/2015/11/04/20/59/milky-way-1023340_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("856","https://cdn.pixabay.com/photo/2017/07/19/08/05/copy-space-2518265_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("857","https://cdn.pixabay.com/photo/2016/06/29/22/02/city-1487891_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("858","https://cdn.pixabay.com/photo/2014/09/11/12/45/science-fiction-441708_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("859","https://cdn.pixabay.com/photo/2011/12/14/12/21/orion-nebula-11107_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("860","https://cdn.pixabay.com/photo/2010/12/01/space-shuttle-774_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("861","https://cdn.pixabay.com/photo/2015/06/08/15/26/hallway-802068_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("862","https://cdn.pixabay.com/photo/2014/11/27/00/58/aircraft-547105_960_720.jpg");
        ImageList.add(image);

        image =new ImageItem("863","https://images.unsplash.com/photo-1454789548928-9efd52dc4031?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=80");
        ImageList.add(image);

        image =new ImageItem("864","https://images.unsplash.com/photo-1516571748831-5d81767b788d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("865","https://images.unsplash.com/photo-1519810755548-39cd217da494?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image =new ImageItem("866","https://images.unsplash.com/photo-1516339901601-2e1b62dc0c45?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=320&q=80");
        ImageList.add(image);

        image =new ImageItem("867","https://images.unsplash.com/photo-1517461982853-d9e4fa425852?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image =new ImageItem("868","https://images.unsplash.com/photo-1443926818681-717d074a57af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=80");
        ImageList.add(image);

        image =new ImageItem("869","https://images.unsplash.com/photo-1447433589675-4aaa569f3e05?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=80");
        ImageList.add(image);

        image =new ImageItem("870","https://images.unsplash.com/photo-1419242902214-272b3f66ee7a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=787&q=80");
        ImageList.add(image);

}}
