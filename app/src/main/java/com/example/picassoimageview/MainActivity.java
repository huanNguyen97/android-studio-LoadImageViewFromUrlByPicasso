package com.example.picassoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        // Add image from url to 'img'
        String url = "https://cdn.tgdd.vn//GameApp/1393172//pokemon-la-gi-top-5-game-pokemon-hay-nhat-moi-thoi-dai-800x450.jpg";
        // End image url

        // Show image using picasso
        Picasso.get().load(url).into(imageView);
        // End using
    }
}