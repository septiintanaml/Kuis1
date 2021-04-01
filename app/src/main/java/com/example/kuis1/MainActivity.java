package com.example.kuis1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void biodata(View view) {
            startActivity(new Intent(MainActivity.this,Biodata.class));
        }

        public void home(View view) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-5.1738322, 119.4237032")).setPackage("com.google.android.apps.maps"));
        }

        public void call(View view) {
            Uri uri2 = Uri.parse("tel:" + "085298201812");
            Intent b = new Intent(Intent.ACTION_VIEW,uri2);
            startActivity(b);
        }

        public void power(View view) {
            logout(this);
        }

        public static void logout (Activity activity){
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle("keluar");
            builder.setMessage("Apakah anda Yakin?");

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