package jp.ac.meijou.android.todomukimuki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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


        binding.switch1.setOnClickListener(v -> {
            imageChange(p);
            p = p + 1;
        });
        binding.switch2.setOnClickListener(v -> {
            imageChange(p);
            p = p + 1;
        });
        binding.switch3.setOnClickListener(v -> {
            imageChange(p);
            p = p + 1;
        });
        binding.switch4.setOnClickListener(v -> {
            imageChange(p);
            p = p + 1;
        });
        binding.switch5.setOnClickListener(v -> {
            imageChange(p);
            p = p + 1;
        });
        binding.switch6.setOnClickListener(v -> {
            imageChange(p);
            p = p + 1;
        });
        binding.switch7.setOnClickListener(v -> {
            imageChange(p);
            p = p + 1;
        });
        binding.switch8.setOnClickListener(v -> {
            imageChange(p);
            p = p + 1;
        });
        binding.switch9.setOnClickListener(v -> {
            imageChange(p);
            p = p + 1;
        });
    }

    private void imageChange(int p){
        //ポイントpが増えると絵が変わる

        if(p < 2){
            imageRes = R.drawable.mukimuki_level1;
            binding.level.setText("level1");
        }
        else if(p < 4){
            imageRes = R.drawable.mukimuki_level2;
            binding.level.setText("level2");
        }
        else if(p <6){
            imageRes = R.drawable.mukimuki_level3;
            binding.level.setText("level3");
        }
        else if(p <8){
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