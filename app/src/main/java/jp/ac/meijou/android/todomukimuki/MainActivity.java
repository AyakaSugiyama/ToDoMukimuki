package jp.ac.meijou.android.todomukimuki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import jp.ac.meijou.android.todomukimuki.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int imageRes = R.drawable.mukimuki_level1;

    int p = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int p = 0;

        binding.switch1.setOnClickListener(v -> {
            imageChange(p);
            binding.point.setText("2");
        });



    }


    private void imageChange(int p){
        //ポイントpが増えると絵が変わる

        if(p < 3){
            imageRes = R.drawable.mukimuki_level1;
            binding.level.setText("level1");
        }
        else if(p < 5){
            imageRes = R.drawable.mukimuki_level2;
            binding.level.setText("level2");
        }
        else if(p <7){
            imageRes = R.drawable.mukimuki_level3;
            binding.level.setText("level3");
        }
        else if(p <9){
            imageRes = R.drawable.mukimuki_level4;
            binding.level.setText("level4");
        }
        else{
            imageRes = R.drawable.mukimuki_level5;
            binding.level.setText("level5");
        }
        binding.imageView.setImageResource(imageRes);
    }
}