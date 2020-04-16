package com.example.zowu.layoutfun;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;

import java.io.InputStream;
import java.lang.ref.WeakReference;

public class ImageUtil {

    @BindingAdapter({ "imageUrl"})
    public static void loadImage(ImageView view, String url) {
        if (url != null) {
            new DownloadImageTask(view).execute(url);
        }
    }

    private static class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        private WeakReference<ImageView> imageViewRef;

        DownloadImageTask(ImageView imageView) {
            this.imageViewRef = new WeakReference<>(imageView);
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap bmp = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                bmp = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.toString(), e);
            }
            return bmp;
        }

        protected void onPostExecute(Bitmap result) {
            if (imageViewRef.get() != null) {
                imageViewRef.get().setImageBitmap(result);
            }
        }
    }
}
