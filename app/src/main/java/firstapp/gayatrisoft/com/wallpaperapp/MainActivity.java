package firstapp.gayatrisoft.com.wallpaperapp;

        import android.content.Intent;
        import android.net.Uri;
        import android.support.annotation.NonNull;
        import android.support.design.widget.NavigationView;
        import android.support.v4.view.GravityCompat;
        import android.support.v4.widget.DrawerLayout;
        import android.support.v7.app.ActionBarDrawerToggle;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.DefaultItemAnimator;
        import android.support.v7.widget.GridLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.support.v7.widget.Toolbar;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.ImageView;

        import java.util.ArrayList;
        import java.util.List;

        import firstapp.gayatrisoft.com.wallpaperapp.Art_Images.Art_Images;
        import firstapp.gayatrisoft.com.wallpaperapp.Anime.Anime;
        import firstapp.gayatrisoft.com.wallpaperapp.Cars_Images.Cars_Activity;
        import firstapp.gayatrisoft.com.wallpaperapp.Cityscape.Cityscape;
        import firstapp.gayatrisoft.com.wallpaperapp.Dark.Dark_Activity;
        import firstapp.gayatrisoft.com.wallpaperapp.Fantasy.FantasyActivity;
        import firstapp.gayatrisoft.com.wallpaperapp.Flowers.Flowers;
        import firstapp.gayatrisoft.com.wallpaperapp.Girls.Girls;
        import firstapp.gayatrisoft.com.wallpaperapp.Love.LoveActivity;
        import firstapp.gayatrisoft.com.wallpaperapp.Motivation.MotivationActivity;
        import firstapp.gayatrisoft.com.wallpaperapp.Motorcycles.MotorcyclesActivity;
        import firstapp.gayatrisoft.com.wallpaperapp.Music.Music;
        import firstapp.gayatrisoft.com.wallpaperapp.Nature.NatureActivity;
        import firstapp.gayatrisoft.com.wallpaperapp.Quote.Quote_Activity;
        import firstapp.gayatrisoft.com.wallpaperapp.Sports.Sports;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private NavigationView nav_view;
    private final int PICK_IMAGE_REQUEST = 1;
    private DrawerLayout drawer_layout;
  //  private StorageReference mStorageRef;
    //ArrayList<String> ImgUrl = new ArrayList<>();
 //   DatabaseReference myRef;
    private Uri mImageuri;
    ImageView ivMenu,ivHeart;
    private List<ImageItem> ImageList = new ArrayList<>();
    ImageAdapter gridAdapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivHeart=findViewById(R.id.ivHeart);

        ivHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this, Favorite_Activity.class);
                startActivity(in);

            }
        });

//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        myRef = database.getReference("message");
//
//        mStorageRef = FirebaseStorage.getInstance().getReference("uploads");

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        loadimages();

        gridAdapter = new ImageAdapter(ImageList, MainActivity.this,"main");
        recyclerView.setAdapter(gridAdapter);


//        myRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
////                    Upload upload = postSnapshot.getValue(Upload.class);
////                    mUploads.add(upload);
//
//
//                }
//
//            }
//
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });


        ivMenu = (ImageView) findViewById(R.id.ivMenu);
        toolbar = (Toolbar) findViewById(R.id.toolbar);


        ivMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawer_layout.openDrawer(GravityCompat.START);
            }
        });


        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer_layout.addDrawerListener(toggle);
        toggle.syncState();

        toggle.setDrawerIndicatorEnabled(false);

        nav_view = (NavigationView) findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(this);


        // Uri file = Uri.fromFile(new File("path/to/images/rivers.jpg"));
//        StorageReference riversRef = mStorageRef.child("images/rivers.jpg");
//
//      //  riversRef.putFile(file)
//                .addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//                    @Override
//                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                        // Get a URL to the uploaded content
//                        Uri downloadUrl = taskSnapshot.getDownloadUrl();
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception exception) {
//                        // Handle unsuccessful uploads
//                        // ...
//                    }
//                });

    }

    private void loadimages() {

        ImageItem image = new ImageItem("1","https://images.pexels.com/photos/853199/pexels-photo-853199.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("2","https://images.pexels.com/photos/155246/pexels-photo-155246.jpeg?auto=compress&cs=tinysrgb&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("3","https://images.pexels.com/photos/277785/pexels-photo-277785.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("4","https://images.pexels.com/photos/325114/pexels-photo-325114.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("5","https://images.pexels.com/photos/164229/pexels-photo-164229.jpeg?auto=compress&cs=tinysrgb&dpr=1&fit=crop&h=500&w=500");
        ImageList.add(image);

        image = new ImageItem("6","https://images.pexels.com/photos/691668/pexels-photo-691668.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("7","https://images.pexels.com/photos/36717/amazing-animal-beautiful-beautifull.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("8","https://images.pexels.com/photos/1485894/pexels-photo-1485894.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("9","https://images.pexels.com/photos/1149240/pexels-photo-1149240.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("10","https://images.pexels.com/photos/1146708/pexels-photo-1146708.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("11","https://images.pexels.com/photos/1139438/pexels-photo-1139438.jpeg?auto=compress&cs=tinysrgb&dpr=1&fit=crop&h=500&w=500");
        ImageList.add(image);

        image = new ImageItem("12","https://images.pexels.com/photos/1136457/pexels-photo-1136457.jpeg?auto=compress&cs=tinysrgb&dpr=1&fit=crop&h=500&w=500");
        ImageList.add(image);

        image = new ImageItem("13","https://images.pexels.com/photos/1136888/pexels-photo-1136888.jpeg?auto=compress&cs=tinysrgb&dpr=1&fit=crop&h=500&w=500");
        ImageList.add(image);

        image = new ImageItem("14","https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("15","https://images.pexels.com/photos/1645668/pexels-photo-1645668.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("16","https://images.pexels.com/photos/257840/pexels-photo-257840.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("17","https://images.pexels.com/photos/1497232/pexels-photo-1497232.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("18","https://images.pexels.com/photos/2156/sky-earth-space-working.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("19","https://images.pexels.com/photos/168938/pexels-photo-168938.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("20","https://images.pexels.com/photos/1719344/pexels-photo-1719344.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("21","https://images.pexels.com/photos/1645668/pexels-photo-1645668.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        ImageList.add(image);

        image = new ImageItem("22","https://images.pexels.com/photos/207153/pexels-photo-207153.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("23","https://images.pexels.com/photos/1572386/pexels-photo-1572386.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("24","https://images.pexels.com/photos/115553/pexels-photo-115553.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("25","https://images.pexels.com/photos/316093/pexels-photo-316093.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("26","https://images.pexels.com/photos/302220/pexels-photo-302220.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("27","https://images.pexels.com/photos/1119973/pexels-photo-1119973.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("28","https://images.pexels.com/photos/1114898/pexels-photo-1114898.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("29","https://images.pexels.com/photos/1102918/pexels-photo-1102918.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("30","https://images.pexels.com/photos/1114887/pexels-photo-1114887.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("31","https://images.pexels.com/photos/334030/pexels-photo-334030.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("32","https://images.pexels.com/photos/1165991/pexels-photo-1165991.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("33","https://images.pexels.com/photos/1083618/pexels-photo-1083618.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("34","https://images.pexels.com/photos/1165991/pexels-photo-1165991.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("35","https://cdn.pixabay.com/photo/2019/01/05/17/05/man-3915438_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("36","https://cdn.pixabay.com/photo/2017/10/17/16/10/fantasy-2861107_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("37","https://cdn.pixabay.com/photo/2018/10/19/12/14/wintry-3758523_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("38","https://cdn.pixabay.com/photo/2018/03/10/17/16/woman-3214594_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("39","https://cdn.pixabay.com/photo/2013/11/08/21/13/tree-207584_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("40","https://cdn.pixabay.com/photo/2017/10/26/12/34/fantasy-2890925_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("41","https://cdn.pixabay.com/photo/2016/09/01/10/33/witchs-house-1635770_960_720.jpg");
        ImageList.add(image);

        image = new ImageItem("42","https://images.pexels.com/photos/1165991/pexels-photo-1165991.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940");
        ImageList.add(image);

        image = new ImageItem("43"," https://cdn.pixabay.com/photo/2019/01/05/17/05/man-3915438_960_720.jpg");
        ImageList.add(image);

    }

    private void openfilechooser( ) {

        Intent intent = new Intent();
        intent.setType("Image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id) {

            case R.id.Abstract:
                Intent i = new Intent(this, AbstractActivity.class);
                startActivity(i);
                break;


            case R.id.Anime:
                Intent in = new Intent(this, Anime.class);
                startActivity(in);
                break;


            case R.id.Art:
                Intent intnt = new Intent(this,Art_Images.class);
                startActivity(intnt);
                break;

            case R.id.Cars:
                Intent intent = new Intent(this,Cars_Activity.class);
                startActivity(intent);
                break;

            case R.id.Cityscape:
                Intent ic = new Intent(this, Cityscape.class);
                startActivity(ic);
                break;

            case R.id.Dark:
                Intent d = new Intent(this, Dark_Activity.class);
                startActivity(d);
                break;

            case R.id.Fantasy:
                Intent f = new Intent(this, FantasyActivity.class);
                startActivity(f);
                break;

            case R.id.Flowers:
                Intent fl = new Intent(this, Flowers.class);
                startActivity(fl);
                break;

            case R.id.Girls:
                Intent gl = new Intent(this, Girls.class);
                startActivity(gl);
                break;

            case R.id.Love:
                Intent l = new Intent(this, LoveActivity.class);
                startActivity(l);
                break;

            case R.id.Motivational:
                Intent m = new Intent(this, MotivationActivity.class);
                startActivity(m);
                break;

            case R.id.Motorcycles:
                Intent mo = new Intent(this, MotorcyclesActivity.class);
                startActivity(mo);
                break;

            case R.id.Music:
                Intent mu = new Intent(this, Music.class);
                startActivity(mu);
                break;

            case R.id.Nature:
                Intent n = new Intent(this, NatureActivity.class);
                startActivity(n);
                break;

            case R.id.Quote:
                Intent q = new Intent(this, Quote_Activity.class);
                startActivity(q);
                break;

            case R.id.Sports:
                Intent s = new Intent(this, Sports.class);
                startActivity(s);
                break;

            case R.id.Space:
                Intent sp = new Intent(this, Space.class);
                startActivity(sp);
                break;

            case R.id.Technology:
                Intent t = new Intent(this, Technology.class);
                startActivity(t);
                break;
            case R.id.Share:

                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    String shareMessage = "\nLet me recommend you this application\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "share app"));
                } catch (Exception e) {

                }
        }
        return false;
    }
}
