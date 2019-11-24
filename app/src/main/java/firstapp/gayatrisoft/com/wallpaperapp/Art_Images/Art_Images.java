package firstapp.gayatrisoft.com.wallpaperapp.Art_Images;

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

import firstapp.gayatrisoft.com.wallpaperapp.AbstractActivity;
import firstapp.gayatrisoft.com.wallpaperapp.Favorite_Activity;
import firstapp.gayatrisoft.com.wallpaperapp.Image;
import firstapp.gayatrisoft.com.wallpaperapp.ImageAdapter;
import firstapp.gayatrisoft.com.wallpaperapp.ImageItem;
import firstapp.gayatrisoft.com.wallpaperapp.MainActivity;
import firstapp.gayatrisoft.com.wallpaperapp.R;

public class Art_Images extends AppCompatActivity {
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;
    ImageView ivback,ivHeart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        ivback=findViewById(R.id.ivback);
        ivHeart=findViewById(R.id.ivHeart);

        ivback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Art_Images.this,MainActivity.class);
                startActivity(i);
            }
        });

        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Art_Images.this,Favorite_Activity.class);
                startActivity(i);
            }
        });


        ivHeart=findViewById(R.id.ivHeart);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        gridAdapter = new ImageAdapter(ImageList, Art_Images.this,"Art_Images");
        int noofcolumns = 3;
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, noofcolumns);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(gridAdapter);

        loadimages();

    }

    private  void  loadimages(){
        ImageItem image = new ImageItem("95","https://images.pexels.com/photos/988872/pexels-photo-988872.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

         image = new ImageItem("96","https://images.unsplash.com/photo-1484589065579-248aad0d8b13?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=396&q=80");
        ImageList.add(image);

        image = new ImageItem("97","https://images.unsplash.com/photo-1520258429519-b62b38466266?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image = new ImageItem("98","https://images.unsplash.com/photo-1487452066049-a710f7296400?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=751&q=80");
        ImageList.add(image);

        image = new ImageItem("99","https://images.unsplash.com/photo-1526121548504-55f319b740ce?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("100","https://images.unsplash.com/photo-1514410432920-a6ed15a94c7c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image = new ImageItem("101","https://images.unsplash.com/photo-1470137237906-d8a4f71e1966?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image = new ImageItem("102","https://cdn.pixabay.com/photo/2016/10/07/08/56/beauty-1721060_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("103","https://cdn.pixabay.com/photo/2014/09/24/09/27/steelwool-458840_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("104","https://cdn.pixabay.com/photo/2017/12/11/15/34/lion-3012515_960_720.jpg");
        ImageList.add(image);


        image = new ImageItem("105","https://cdn.pixabay.com/photo/2014/10/29/21/46/railway-508568_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("106","https://cdn.pixabay.com/photo/2016/02/24/08/31/girl-1219339_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("107","https://cdn.pixabay.com/photo/2014/05/13/22/40/man-343674_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("108","https://cdn.pixabay.com/photo/2015/11/07/11/26/hands-1031131_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("109","https://cdn.pixabay.com/photo/2016/11/29/05/16/adult-1867485_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("110","https://images.pexels.com/photos/325045/pexels-photo-325045.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("111","https://images.pexels.com/photos/219000/pexels-photo-219000.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("112","https://cdn.pixabay.com/photo/2014/02/14/08/27/sparks-265850_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("113","https://images.pexels.com/photos/460736/pexels-photo-460736.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("114","https://images.pexels.com/photos/700413/pexels-photo-700413.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("115","https://images.pexels.com/photos/157949/woman-man-pair-man-and-woman-157949.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("116","https://images.pexels.com/photos/163077/mario-yoschi-figures-funny-163077.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("117","https://images.pexels.com/photos/1151261/pexels-photo-1151261.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("118","https://images.pexels.com/photos/206064/pexels-photo-206064.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("119","https://images.pexels.com/photos/573294/pexels-photo-573294.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("120","https://images.pexels.com/photos/345156/pexels-photo-345156.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);


        image = new ImageItem("121","https://images.pexels.com/photos/917597/pexels-photo-917597.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("122","https://images.pexels.com/photos/988872/pexels-photo-988872.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("123","https://cdn.pixabay.com/photo/2017/08/30/12/45/girl-2696947_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("124","https://cdn.pixabay.com/photo/2018/10/08/14/46/bird-3732867_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("125","https://cdn.pixabay.com/photo/2017/03/12/13/41/beaded-2137080_960_720.jpg");
        ImageList.add(image);


        image = new ImageItem("126","https://cdn.pixabay.com/photo/2017/06/10/22/58/composing-2391033_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("127","https://cdn.pixabay.com/photo/2018/03/30/15/11/deer-3275594_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("128","https://cdn.pixabay.com/photo/2016/08/26/01/32/poseidon-1621062_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("129","https://cdn.pixabay.com/photo/2018/02/04/21/13/monastery-3130879_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("130","https://cdn.pixabay.com/photo/2016/02/19/11/31/graffiti-wall-1209761_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("131","https://cdn.pixabay.com/photo/2015/08/07/15/47/fireworks-879461_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("132","https://cdn.pixabay.com/photo/2017/04/10/08/08/church-window-2217785_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("133","https://cdn.pixabay.com/photo/2016/11/23/13/56/light-1853025_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("134","https://images.unsplash.com/photo-1503900038894-cb3a9cb28484?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=726&q=80");
        ImageList.add(image);

        image = new ImageItem("135","https://images.unsplash.com/photo-1498957607239-c54bf0abde7a?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=334&q=80");
        ImageList.add(image);

        image = new ImageItem("136","https://images.unsplash.com/photo-1461344577544-4e5dc9487184?ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("137","https://images.unsplash.com/photo-1508470612300-4ea23b797a99?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80");
        ImageList.add(image);

        image = new ImageItem("138","https://images.unsplash.com/photo-1460398495418-62c9b5d79fbf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=749&q=80");
        ImageList.add(image);

        image = new ImageItem("139","https://images.unsplash.com/photo-1493259606967-571afaef3d81?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image = new ImageItem("140","https://images.unsplash.com/photo-1506703479330-1bc6e2038b53?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
        ImageList.add(image);

        image = new ImageItem("141","https://images.unsplash.com/photo-1542387278-a96ec637c1f1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=889&q=80");
        ImageList.add(image);

        image = new ImageItem("142","https://cdn.pixabay.com/photo/2013/07/07/01/21/blue-143734_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("143","https://cdn.pixabay.com/photo/2018/02/06/22/43/painting-3135875_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("144","https://cdn.pixabay.com/photo/2018/07/15/23/22/prague-3540883_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("145","https://cdn.pixabay.com/photo/2016/11/08/05/15/dancer-1807516_960_720.jpg");
        ImageList.add(image);

    }


}
