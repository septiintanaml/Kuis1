package com.example.kuis1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Biodata extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_biodata);
        }

        public void back(View view) {
            startActivity(new Intent(Biodata.this,MainActivity.class));
        }

        public void power(View view) {
            logout(this);
        }

        public void logout(Activity activity){
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("exit");
            builder.setMessage("Apakah anda yakin?");

            builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    activity.finishAffinity();
                    System.exit(0);
                }
            });

            builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            builder.show();
    }

}