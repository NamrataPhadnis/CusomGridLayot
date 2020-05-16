package com.example.gridlayoutcake2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SingleViewActivity extends Activity {

Button btn_cart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_view);


       Intent i = getIntent();


        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.SingleView);
        imageView.setImageResource(imageAdapter.imgid[position]);


        ImageView cart = (ImageView) findViewById(R.id.cart);
      cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Cart", Toast.LENGTH_SHORT).show();
            }
        });

       /*  btn_cart=findViewById(R.id.buy);
         btn_cart.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i =new Intent(SingleViewActivity.this,Next.class);
                 startActivity(i);
             }
         });*/


    }

}


/* <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <com.google.android.material.appbar.AppBarLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/app_bar"
            android:theme="@style/AppTheme">

        </com.google.android.material.appbar.AppBarLayout>

        <androidx.recyclerview.widget.RecyclerView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_margin="8dp"
            android:id="@+id/recycler_cart"
            android:layout_below="@+id/app_bar"
            android:layout_above="@+id/layout_price"
            android:layout_marginLeft="4dp"
            android:layout_marginRight="4dp">

        </androidx.recyclerview.widget.RecyclerView>
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/layout_price"
            android:layout_margin="8dp"
            android:orientation="vertical"
            android:layout_alignParentBottom="true">

            <androidx.cardview.widget.CardView
                android:layout_width="match_parent"
                android:layout_height="wrap_content">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="horizontal"
                    android:weightSum="8"
                    android:padding="8dp">

                    <TextView
                        android:layout_width="0dp"
                        android:layout_height="wrap_content"
                        android:layout_weight="4"
                        android:textSize="30sp"
                        android:text="Total Cart"
                        android:fontFamily="@font/magnifica"
                        android:textColor="@color/colorPrimary">

                    </TextView>
                </LinearLayout>



            </androidx.cardview.widget.CardView>
            <Button
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="ORDER"
                android:id="@+id/btn_order"
                android:textColor="@android:color/white"
                android:fontFamily="@font/magnifica"

                android:layout_marginTop="8dp"
                android:layout_marginBottom="8dp"
                >

            </Button>

        </LinearLayout>

    </RelativeLayout>*/




