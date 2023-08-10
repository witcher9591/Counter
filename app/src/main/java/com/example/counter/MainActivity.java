package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	int count;
	Button reset,increment,Decrement;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView textcount=findViewById(R.id.counter);
		reset=findViewById(R.id.reset);
		increment=findViewById(R.id.inc);
		Decrement=findViewById(R.id.dec);



		increment.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				count++;
				textcount.setText(""+count);
				Log.d("decclick", "onClick: dec");


			}
		});
		Decrement.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				count--;
				textcount.setText(""+count);
				Log.d("decclick", "onClick: dec");


			}
		});

		reset.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				count=0;
				textcount.setText(""+count);
				Log.d("resclick", "onClick: reset");

			}
		});


	}


}