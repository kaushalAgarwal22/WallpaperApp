package firstapp.gayatrisoft.com.wallpaperapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;


public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.MyViewHolder> {

    private List<ImageItem> ImageList;
    Context context;
    String actName;

    public ImageAdapter(List<ImageItem> ImageList, Context context, String actName) {
        this.ImageList = ImageList;
        this.context = context;
        this.actName = actName;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.images_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivWallpaper;
        public LinearLayout ll_Grid;

        public MyViewHolder(View view) {
            super(view);


            ivWallpaper = (ImageView) view.findViewById(R.id.image_view);
            ll_Grid = (LinearLayout) view.findViewById(R.id.ll_Grid);


            ivWallpaper.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


//                    @Override
//                    public void onClick(View v) {
//                        if(zoomOut) {
//                            Toast.makeText(getApplicationContext(), "NORMAL SIZE!", Toast.LENGTH_LONG).show();
//                            ivWallpaper.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//                            ivWallpaper.setAdjustViewBounds(true);
//                            zoomOut =false;
//                        }else{
//                            Toast.makeText(getApplicationContext(), "FULLSCREEN!", Toast.LENGTH_LONG).show();
//                            ivWallpaper.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                            ivWallpaper.setScaleType(ImageView.ScaleType.FIT_XY);
//                            zoomOut = true;
//                        }
//                    }
                }
            });

        }


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        final ImageItem image = ImageList.get(position);


        Picasso.with(context).load(image.getImage_view()).into(holder.ivWallpaper);
        //holder.ivWallpaper.setImageResource(image.getImage_view());

        holder.ll_Grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//
//                ImageItem image = ImageList.get(position);
//                Intent intent = new Intent(context, Image.class);
//                intent.putExtra("image_position",image.getImage_view());
//
//                context.startActivity(intent);
                Toast.makeText(context, image.getImage_view(), Toast.LENGTH_SHORT).show();

            }
        });


        holder.ivWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//
                ImageItem image = ImageList.get(position);
                Intent intent = new Intent(context, Image.class);
                intent.putExtra("image_position", image.getImage_view());
                intent.putExtra("id", image.getId());
                if (actName.equals("fav")) {
                    intent.putExtra("act", "fav");
                } else {
                    intent.putExtra("act", "main");

                }


                // MediaStore.Images.Media.insertImage(getContentResolver(), yourBitmap, yourTitle , yourDescription);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount( ) {
        return ImageList.size();
    }

}
