package org.utarid.edittextcolor;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import org.utarid.edittextcolor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = activityMainBinding.getRoot();
        setContentView(view);

        activityMainBinding.editText.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_ATOP);
        activityMainBinding.editText3.getBackground().setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
    }
}