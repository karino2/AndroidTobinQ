package com.livejournal.karino2.tobinq.app;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.provider.MediaStore;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by karino on 4/13/14.
 */
public class OneTimeFileSaver {
    ContentResolver resolver;
    String dbTitle;
    String folderName;
    public OneTimeFileSaver(String contentDBTitle, String folderName, ContentResolver resol) {
        dbTitle = contentDBTitle;
        this.folderName = folderName;
        resolver = resol;
    }


    private File saveBitmap(Bitmap screen) throws IOException {
        File dir = getFileStoreDirectory();
        File result = new File(dir, newFileName());

        OutputStream stream = new FileOutputStream(result);
        screen.compress(Bitmap.CompressFormat.PNG, 80, stream);
        stream.close();
        return result;
    }
    public Uri putFileToContentDB(File file) {

        ContentValues content = new ContentValues(4);

        content.put(MediaStore.Images.ImageColumns.TITLE, dbTitle);
        content.put(MediaStore.Images.ImageColumns.DATE_ADDED,
                System.currentTimeMillis() / 1000);
        content.put(MediaStore.Images.Media.MIME_TYPE, "image/png");
        content.put(MediaStore.Images.Media.DATA, file.getAbsolutePath());
        return resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, content);
    }
    public static String newFileName() {
        SimpleDateFormat timeStampFormat = new SimpleDateFormat("yyyyMMddHHmmssSS");
        String filename = timeStampFormat.format(new Date()) + ".png";
        return filename;
    }

    public static void ensureDirExist(File dir) throws IOException {
        if(!dir.exists()) {
            if(!dir.mkdir()){
                throw new IOException();
            }
        }
    }

    public Intent saveAndCreateSendIntent(Bitmap bitmap) throws IOException {
        // fill transparent to black.
        Bitmap filledBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        filledBitmap.eraseColor(Color.BLACK);
        Canvas canvas = new Canvas(filledBitmap);
        canvas.drawBitmap(bitmap, 0, 0, null);


        deleteAllFiles(getFileStoreDirectory());
        File file = saveBitmap(filledBitmap);
        Uri uri = putFileToContentDB(file);


        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("image/png");
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        return intent;

    }


    public File getFileStoreDirectory() throws IOException {
        File dir = new File(android.os.Environment.getExternalStorageDirectory(), folderName);
        ensureDirExist(dir);
        return dir;
    }


    private void deleteAllFiles(File folder) {
        for(File file : folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory())
                    return false;
                return true;
            }
        })) {
            resolver.delete(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                    "? = ?",
                    new String[]{MediaStore.Images.ImageColumns.DATA,
                            file.getAbsolutePath()}
            );

            file.delete();
        }

    }
}
