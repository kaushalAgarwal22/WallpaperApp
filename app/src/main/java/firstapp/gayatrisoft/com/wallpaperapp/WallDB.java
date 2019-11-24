package firstapp.gayatrisoft.com.wallpaperapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class WallDB extends SQLiteOpenHelper {
   // String imagePath;

    WallDB wallDB;

    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "image.db";

    // Contacts Table Columns names
    private static final String ID = "id";

    private static final String TABLE_NAME = "myTable";   // Table Name
    private static final String NAME = "NAME";
    private static final String CREATE_TABLE = "CREATE TABLE "+TABLE_NAME+
            " ("+ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+NAME+ " VARCHAR(225)) ";

    private static final String DROP_TABLE ="DROP TABLE IF EXISTS "+TABLE_NAME;
    private Context context;


    public WallDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //this.context=context;
    }

//    public String getData()
//    {
//        SQLiteDatabase db = wallDB.getWritableDatabase();
//        String[] columns = {wallDB.NAME};
//        Cursor cursor =db.query(wallDB.TABLE_NAME,columns,null,null,null,null,null);
//        StringBuffer buffer= new StringBuffer();
//        while (cursor.moveToNext())
//        {
//            String  cid =cursor.getString(cursor.getColumnIndex(wallDB.NAME));
//       //     String name =cursor.getString(cursor.getColumnIndex(myDbHelper.NAME));
//            //  String  no =cursor.getString(cursor.getColumnIndex(myDbHelper.MyNumber));
//            buffer.append(cid+ "   " +  "   " +  " \n");
//        }
//        return buffer.toString();
//    }

    public void addItem(ImageItem commonList)
    {
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values=new ContentValues();

// values.put(KEY_ID, commonList.getId());
        values.put(ID, commonList.getId());

        values.put(NAME, commonList.getImage_view());

        db.insert(WallDB.TABLE_NAME, null , values);
        db.close();
    }

//    public ImageItem deleteItem(ImageItem commonlist){
//
//        SQLiteDatabase db = this.getReadableDatabase();
//       // db.delete(WallDB.TABLE_NAME , WallDB.NAME+ WallDB.ID+" = ?"+w);
//        db.delete(WallDB.TABLE_NAME, WallDB.NAME + "=\"" + ID+"\"", null) ;
//
//        return commonlist;
//    }

    public void deleteitem(String Id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, ID + " = ?", new String[] { String.valueOf(Id) });
        db.close();
    }

    public List<ImageItem> getAllData()
    {
        List<ImageItem> cArrayList = new ArrayList<ImageItem>();

        String selectQuery = "SELECT * FROM " + TABLE_NAME ;

        Log.e("Query",selectQuery);
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

// looping through all rows and adding to list
        if (cursor.moveToFirst())
        {
            do {

                ImageItem commonList = new ImageItem();

                commonList.setId(cursor.getString(cursor.getColumnIndex(ID)));

                commonList.setImage_view(cursor.getString(cursor.getColumnIndex(NAME)));

                cArrayList.add(commonList);

            } while (cursor.moveToNext());
        }

        return cArrayList;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE);
        } catch (Exception e) {
            Toast.makeText(context, "Error"+e, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try
        {
            Toast.makeText(context, "On upgrade", Toast.LENGTH_SHORT).show();
            db.execSQL(DROP_TABLE);
            onCreate(db);
        }
        catch (Exception e)
        {
            Toast.makeText(context, "Error"+e, Toast.LENGTH_SHORT).show();
        }

    }
}
