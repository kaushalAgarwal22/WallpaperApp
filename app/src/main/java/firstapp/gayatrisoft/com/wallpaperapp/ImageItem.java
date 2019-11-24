package firstapp.gayatrisoft.com.wallpaperapp;

public class ImageItem {
   public  String id;
    public  String image_view;

    public ImageItem( ) {
    }

    public ImageItem(String id, String image_view)
    {

        this.id= id;
        this.image_view = image_view;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage_view( )

    {
        return image_view;
    }

    public void setImage_view(String image_view)
    {
        this.image_view = image_view;
    }
}
