package com.example.testbuttons;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	  ImageButton btntrailPass1;
	  ImageButton btntrailPass2;
	  ImageButton btntrailPass3;
	  ImageButton btntrailStop1;
	  ImageButton btntrailStop2;
	  ImageButton btntrailStop3;
	  ImageButton btnleave;
	  ImageButton btnBack;
	  ImageButton btnSave;
	  EditText edText;
	  

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btntrailPass1 = (ImageButton) findViewById(R.id.ibTrial1pass);
        btntrailPass2 = (ImageButton) findViewById(R.id.ibTrial2pass);
        btntrailPass3 = (ImageButton) findViewById(R.id.ibTrial3pass);
        btntrailStop1 = (ImageButton) findViewById(R.id.ibTrial1stop);
        btntrailStop2 = (ImageButton) findViewById(R.id.ibTrial2stop);
        btntrailStop3 = (ImageButton) findViewById(R.id.ibTrial3stop);
        btnleave = (ImageButton) findViewById(R.id.ibLeave);
        btnBack = (ImageButton) findViewById(R.id.ibBack);
        btnSave = (ImageButton) findViewById(R.id.ibSave);
        edText = (EditText) findViewById(R.id.editText1);

        btntrailPass1.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
        	  String editTextStr = edText.getText().toString() + " P1";
        	  edText.setText(editTextStr);
          }
        });
        
        btntrailPass2.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
        	  String editTextStr = edText.getText().toString() + " P5";
        	  edText.setText(editTextStr);
          }
        });
        
        btntrailPass3.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
        	  String editTextStr = edText.getText().toString() + " P9";
        	  edText.setText(editTextStr);
          }
        });
        
        btntrailStop1.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
        	  String editTextStr = edText.getText().toString() + " S1";
        	  edText.setText(editTextStr);
          }
        });
        
        btntrailStop2.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
        	  String editTextStr = edText.getText().toString() + " S5";
        	  edText.setText(editTextStr);
          }
        });
        
        btntrailStop3.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
        	  String editTextStr = edText.getText().toString() + " S9";
        	  edText.setText(editTextStr);
          }
        });
        
        btnleave.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
        	  String editTextStr = edText.getText().toString() + "  L";
        	  edText.setText(editTextStr);
          }
        });
        
        btnBack.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
        	  if (edText.getText().toString().length()>=3)
        	  {
        		  String editTextStr = edText.getText().toString().substring(0, edText.getText().toString().length()-3);
        		  edText.setText(editTextStr);
        	  }
          }
        });
        
        btnSave.setOnClickListener(new OnClickListener()
        {
          public void onClick(View v)
          {
        	  Toast.makeText(getApplicationContext(), "Trial Saved =)",
        			   Toast.LENGTH_LONG).show();
          }
        });
        
        edText.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				return false;
			}
  
          });




       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
