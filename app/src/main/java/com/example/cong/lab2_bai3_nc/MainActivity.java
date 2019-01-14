package com.example.cong.lab2_bai3_nc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt1;
    private Button btn1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.edt1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nd = edt1.getText().toString();
                if(nd.length()==9){
                    if(nd.substring(0,3).equalsIgnoreCase("MEM")||nd.substring(0,3).equalsIgnoreCase("VIP")){
                        switch (nd){
                            case "MEM537128":
                                Toast.makeText(MainActivity.this,"Khuyến mãi 10%",Toast.LENGTH_SHORT).show();
                                break;
                            case "MEM537129":
                                Toast.makeText(MainActivity.this,"Khuyến mãi 20%",Toast.LENGTH_SHORT).show();
                                break;
                            case "VIP537128":
                                Toast.makeText(MainActivity.this,"Khuyến mãi 30%",Toast.LENGTH_SHORT).show();
                                break;
                            case "VIP537129":
                                Toast.makeText(MainActivity.this,"Khuyến mãi 50%",Toast.LENGTH_SHORT).show();
                                break;
                                default:
                                    Toast.makeText(MainActivity.this,"Không được khuyến mãi",Toast.LENGTH_SHORT).show();

                        }

                    }else {

                        Toast.makeText(MainActivity.this,"Ký tự bắt phải là MEM hoặc VIP",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    edt1.setText("");
                    Toast.makeText(MainActivity.this,"Vui lòng nhập đủ 9 ký tự",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
