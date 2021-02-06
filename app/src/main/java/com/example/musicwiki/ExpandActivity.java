package com.example.musicwiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExpandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand);

        Button b1 = findViewById(R.id.rock2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b2 = findViewById(R.id.rock6);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b3 = findViewById(R.id.rock10);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b4 = findViewById(R.id.rock15);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b5 = findViewById(R.id.rock20);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b6 = findViewById(R.id.rock16);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b7 = findViewById(R.id.rock21);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b8 = findViewById(R.id.rock17);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b9 = findViewById(R.id.rock22);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b10 = findViewById(R.id.rock18);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b11 = findViewById(R.id.rock23);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b12 = findViewById(R.id.rock19);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b13 = findViewById(R.id.rock24);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b14 = findViewById(R.id.rock11);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b15 = findViewById(R.id.rock12);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b16 = findViewById(R.id.rock13);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b17 = findViewById(R.id.rock14);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b18 = findViewById(R.id.rock7);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b19 = findViewById(R.id.rock8);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b20 = findViewById(R.id.rock4);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });

        Button b21 = findViewById(R.id.rock5);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExpandActivity.this, RockActivity.class));
                finish();
            }
        });




    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }



}