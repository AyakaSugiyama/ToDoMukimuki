package jp.ac.meijou.android.todomukimuki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import jp.ac.meijou.android.todomukimuki.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int imageRes = R.drawable.mukimuki_level1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int p = 0;

        binding.switch1.setOnClickListener(v -> {
            binding.point.setText("1");
        });

        //ポイントpが増えると絵が変わる
        binding.imageView.setImageResource(imageRes);
        if(p < 2){
            imageRes = R.drawable.mukimuki_level1;
        }
        else if(p < 3){
            imageRes = R.drawable.mukimuki_level2;
        }
        else if(p <4){
            imageRes = R.drawable.mukimuki_level3;
        }
        else if(p <5){
            imageRes = R.drawable.mukimuki_level4;
        }
        else{
            imageRes = R.drawable.mukimuki_level5;
        }

    }
}