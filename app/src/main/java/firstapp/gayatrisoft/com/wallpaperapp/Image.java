package firstapp.gayatrisoft.com.wallpaperapp;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.IOException;

public class Image extends AppCompatActivity {

    ImageView imageView, favourite;
    ImageView iv_Save, iv_Share,favourite_heart;
    ImageView iv_Setwallpaper, iv_back;
    private File file;
    private Bitmap finalBitmap;
    private ScaleGestureDetector mScaleGestureDetector;
    private float mScaleFactor = 2.0f;
    String yourTitle;
    String yourDescription;
    WallDB wallDB;
    String iid = "";
    String pos = "";
    //Intent intent;
    String actName="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        wallDB = new WallDB(this);
        imageView = findViewById(R.id.iv_Outside);
        favourite_heart=findViewById(R.id.favourite_heart);

        mScaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());

        iv_Share = findViewById(R.id.iv_Share);
        iv_Save = findViewById(R.id.iv_Save);
        iv_back = findViewById(R.id.iv_back);
        iv_Setwallpaper = findViewById(R.id.iv_SetWallpaper);
        favourite = findViewById(R.id.favourite);

        final Intent intent = getIntent();
        Picasso.with(this).load(intent.getStringExtra("image_position")).into(imageView);

            actName= intent.getStringExtra("act");

        if (actName.equals("fav"))
        {
            favourite.setVisibility(View.VISIBLE);
            favourite_heart.setVisibility(View.GONE);
        }
        else
        {

        }


        iid = intent.getStringExtra("id");
      pos = intent.getStringExtra("image position");

        iv_back.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (actName.equals("fav"))
                {
                    Intent i = new Intent(Image.this, Favorite_Activity.class);
                    startActivity(i);
                    finish();

                }
                else
                {
                    Intent i = new Intent(Image.this, MainActivity.class);
                    startActivity(i);
                    finish();


                }



            }
        });

        favourite_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wallDB.addItem(new ImageItem(iid,intent.getStringExtra("image_position")));

                Toast.makeText(Image.this, "Wallpaper added to favourites ", Toast.LENGTH_SHORT).show();


                favourite.setVisibility(View.VISIBLE);
                favourite_heart.setVisibility(View.GONE);




//                String data = wallDB.deleteitem( String iid);
//                Toast.makeText(Image.this, data, Toast.LENGTH_SHORT).show();

            }
        });

        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               favourite_heart.setVisibility(View.VISIBLE);
               favourite.setVisibility(View.GONE);
                deleteitem();
                Toast.makeText(Image.this,"Wallpaper removed from favourite",Toast.LENGTH_SHORT).show();
            }
        });



        iv_Setwallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    WallpaperManager wallManager = WallpaperManager.getInstance(getApplicationContext());
                    final Bitmap bmpImg = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
                    wallManager.setBitmap(bmpImg);
                    Toast.makeText(Image.this, "Wallpaper Set Successfully!!", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    Toast.makeText(Image.this, "Setting WallPaper Failed!!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        iv_Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    String shareMessage = "\nLet me recommend you this application\n\n";
                    shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n";
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "share image"));
                } catch (Exception e) {

                }
            }
        });

        iv_Save.setOnClickListener(new View.OnClickListener() {
            public Context context;

            @Override
            public void onClick(View view) {

                imageView.buildDrawingCache();

                Bitmap bmp = imageView.getDrawingCache();

                MediaStore.Images.Media.insertImage(getContentResolver(), bmp, yourTitle, yourDescription);

                Toast.makeText(Image.this, "Image Saved Successfully", Toast.LENGTH_SHORT).show();

            }

        });


    }

    private void deleteitem(){

        wallDB.deleteitem(iid);


    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        mScaleGestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            mScaleFactor *= scaleGestureDetector.getScaleFactor();
            mScaleFactor = Math.max(0.1f,
                    Math.min(mScaleFactor, 5.0f));
            imageView.setScaleX(mScaleFactor);
            imageView.setScaleY(mScaleFactor);
            return true;
        }
    }


    @Override
    public void onBackPressed( ) {
        if (actName.equals("fav"))
        {
            Intent i = new Intent(Image.this, Favorite_Activity.class);
            startActivity(i);
            finish();

        }
        else
        {
            Intent i = new Intent(Image.this, MainActivity.class);
            startActivity(i);
            finish();


        }

    }
}
