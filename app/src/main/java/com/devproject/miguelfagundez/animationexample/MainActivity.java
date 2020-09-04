package com.devproject.miguelfagundez.animationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Members
    private AnimationFragment fragment;

    // Views
    private Button btnCenter;
    private Button btnDown;
    private Button btnUp;
    private Button btnRight;
    private Button btnLeft;
    private Button btnAlpha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        setupFragments();
        setupListeners();
    }

    private void setupViews() {
        btnCenter = findViewById(R.id.btnCenter);
        btnUp = findViewById(R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        btnLeft = findViewById(R.id.btnLeft);
        btnRight = findViewById(R.id.btnRight);
        btnAlpha = findViewById(R.id.btnAlpha);
    }

    private void setupFragments() {
        fragment = new AnimationFragment();
    }

    private void setupListeners() {
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.right_in,
                                R.anim.right_out,
                                R.anim.right_in,
                                R.anim.right_out
                        )
                        .replace(R.id.container, fragment)
                        .addToBackStack(fragment.getTag())
                        .commit();
            }
        });

        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.left_in,
                                R.anim.left_out,
                                R.anim.left_in,
                                R.anim.left_out
                        )
                        .replace(R.id.container, fragment)
                        .addToBackStack(fragment.getTag())
                        .commit();
            }
        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.up_in,
                                R.anim.up_out,
                                R.anim.up_in,
                                R.anim.up_out
                        )
                        .replace(R.id.container, fragment)
                        .addToBackStack(fragment.getTag())
                        .commit();
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.down_in,
                                R.anim.down_out,
                                R.anim.down_in,
                                R.anim.down_out
                        )
                        .replace(R.id.container, fragment)
                        .addToBackStack(fragment.getTag())
                        .commit();
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.alpha_in,
                                R.anim.alpha_out,
                                R.anim.alpha_in,
                                R.anim.alpha_out
                        )
                        .replace(R.id.container, fragment)
                        .addToBackStack(fragment.getTag())
                        .commit();
            }
        });

        btnCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.center_in,
                                R.anim.center_out,
                                R.anim.center_in,
                                R.anim.center_out
                        )
                        .replace(R.id.container, fragment)
                        .addToBackStack(fragment.getTag())
                        .commit();
            }
        });
    }
}