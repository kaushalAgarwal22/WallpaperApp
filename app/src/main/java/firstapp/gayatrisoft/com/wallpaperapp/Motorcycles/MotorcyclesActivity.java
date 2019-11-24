package firstapp.gayatrisoft.com.wallpaperapp.Motorcycles;

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

public class MotorcyclesActivity extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorcycles);


        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MotorcyclesActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MotorcyclesActivity.this,Favorite_Activity.class);
                startActivity(i);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, MotorcyclesActivity.this,"MotorcyclesActivity");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();
    }

    private  void loadimages(){

    ImageItem image = new ImageItem("601","https://images.unsplash.com/photo-1525160354320-d8e92641c563?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
    ImageList.add(image);

    image = new ImageItem("602","https://images.unsplash.com/photo-1517846693594-1567da72af75?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60");
    ImageList.add(image);

      image = new ImageItem("603","https://images.unsplash.com/photo-1515777315835-281b94c9589f?ixlib=rb-1.2.1&auto=format&fit=crop&w=787&q=80");
        ImageList.add(image);

      image = new ImageItem("604","https://images.unsplash.com/photo-1510228093693-69337646d4c5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=757&q=80");
        ImageList.add(image);

        image = new ImageItem("605","https://images.unsplash.com/photo-1449426468159-d96dbf08f19f?ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("606","https://images.unsplash.com/photo-1473147437169-91ac8cebc017?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image = new ImageItem("607","https://images.unsplash.com/photo-1510176263513-f31c60b0528b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image = new ImageItem("608","https://images.unsplash.com/photo-1547729966-d80039abb615?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image = new ImageItem("609","https://images.unsplash.com/photo-1453951115017-aa1460aa6973?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=889&q=80");
        ImageList.add(image);

        image = new ImageItem("610","https://images.pexels.com/photos/595807/pexels-photo-595807.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("611","https://cdn.pixabay.com/photo/2014/07/31/23/10/biker-407123__340.jpg");
        ImageList.add(image);

        image = new ImageItem("612","https://cdn.pixabay.com/photo/2016/12/20/22/47/harley-1921700_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("613","https://cdn.pixabay.com/photo/2017/12/28/17/10/motorcycles-3045706_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("614","https://cdn.pixabay.com/photo/2014/01/28/06/52/wooden-motorcycle-253555_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("615","https://cdn.pixabay.com/photo/2014/11/05/01/56/off-road-buggy-517311__340.jpg");
        ImageList.add(image);

        image = new ImageItem("616","https://images.pexels.com/photos/1103995/pexels-photo-1103995.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("617","https://images.pexels.com/photos/163789/sky-road-travel-trip-163789.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("618","https://images.pexels.com/photos/1796046/pexels-photo-1796046.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("619","https://images.unsplash.com/photo-1505052533681-2be9d65eade5?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("620","https://images.unsplash.com/photo-1514826863517-464eed44915d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=667&q=80");
        ImageList.add(image);

        image = new ImageItem("621","https://images.unsplash.com/photo-1545623703-583dd2364bbd?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("622","https://cdn.pixabay.com/photo/2013/03/11/12/44/bmw-92442_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("623","https://cdn.pixabay.com/photo/2018/06/24/10/03/motorcycle-3494230_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("624","https://cdn.pixabay.com/photo/2017/06/28/15/08/motocross-2450956_960_720.jpg");
        ImageList.add(image);


        image = new ImageItem("625","https://cdn.pixabay.com/photo/2016/12/16/01/56/motorcycle-1910429_960_720.jpg");
        ImageList.add(image);




    }
}
