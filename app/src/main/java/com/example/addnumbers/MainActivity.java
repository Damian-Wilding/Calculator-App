package com.example.addnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button multiply;
    private ImageButton camera;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.etNum1);
        num2 = (EditText) findViewById(R.id.etNum2);
        add = (Button) findViewById(R.id.btnAdd);
        multiply = (Button) findViewById(R.id.btnMultiply);
        camera = (ImageButton) findViewById(R.id.btnCamera);
        result = (TextView) findViewById(R.id.tvAnswer);


        //code for when the multiply button is pressed
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1;
                int number2;

                if (num1.getText().toString().equals("") || num2.getText().toString().equals("")) {
                    result.setText("Not valid nerd!");
                }
                else {
                    number1 = Integer.parseInt(num1.getText().toString());
                    number2 = Integer.parseInt(num2.getText().toString());
                    int quotient = number1 * number2;
                    result.setText(String.valueOf(quotient));
                }
            }
        });



        //code for when the add button is pressed
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1;
                int number2;

                if (num1.getText().toString().equals("") || num2.getText().toString().equals("")) {
                    result.setText("Not valid nerd!");
                }
                else {
                    number1 = Integer.parseInt(num1.getText().toString());
                    number2 = Integer.parseInt(num2.getText().toString());
                    int sum = number1 + number2;
                    result.setText(String.valueOf(sum));
                }
            }
        });



        //code for if the camera button is pressed
        camera.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent Intent3=new   Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(Intent3);
            }
        });



        /*
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_PIC_REQUEST);
            }
        });



        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            if (requestCode == CAMERA_PIC_REQUEST) {
                Bitmap image = (Bitmap) data.getExtras().get("data");
                ImageView imageview = (ImageView) findViewById(R.id.ImageView01); //sets imageview as the bitmap
                imageview.setImageBitmap(image);
            }
        }
         */
    }
}