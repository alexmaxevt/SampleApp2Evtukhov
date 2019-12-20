package ru.evtukhov.android.sampleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private List<Drawable> iconList = new ArrayList<>();
    private Random rand = new Random();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listImages();
        listView = findViewById(R.id.list);
        listView.setAdapter(new Adapter(this, socialNetworkList()));
    }

    private void listImages() {
        iconList.add(ContextCompat.getDrawable(this, R.drawable.ic_skype));
        iconList.add(ContextCompat.getDrawable(this, R.drawable.ic_telegram));
        iconList.add(ContextCompat.getDrawable(this, R.drawable.ic_vk));
        iconList.add(ContextCompat.getDrawable(this, R.drawable.ic_google_plus));
    }

    private List<SocialNetworkItem> socialNetworkList() {
        List<SocialNetworkItem> social = new ArrayList<>();
        social.add(new SocialNetworkItem(iconList.get(0), "Skype", "https://web.skype.com", rand.nextBoolean()));
        social.add(new SocialNetworkItem(iconList.get(1), "Telegram", "https://web-telegram.ru/", rand.nextBoolean()));
        social.add(new SocialNetworkItem(iconList.get(2), "VK", "https://vk.com", rand.nextBoolean()));
        social.add(new SocialNetworkItem(iconList.get(3), "Google+", "https://plus.google.com/", rand.nextBoolean()));
        return social;
    }
}
