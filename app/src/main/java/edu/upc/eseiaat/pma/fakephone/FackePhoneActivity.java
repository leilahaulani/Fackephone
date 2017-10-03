package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FackePhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facke_phone);
        num_text = (TextView) findViewById(R.id.num_text);
        num_telefon="";
    }

    private TextView num_text;
    private String num_telefon;

    //Això ho posem per no tenir que posar un listenner.//
    public void click (View on) {
        Button boto = (Button) on;
        String btn_text = boto.getText().toString();
        num_telefon = num_telefon + btn_text;
        num_text.setText(num_telefon);

    }

    public void clean (View cl) {
        Button cleaning = (Button) cl;
        num_telefon="";
        num_text.setText(num_telefon);
    }

    public void call (View ca) {
        Button boto = (Button) ca;
        num_telefon="Calling: " + num_telefon;
        Toast.makeText(FackePhoneActivity.this, num_telefon, Toast.LENGTH_LONG).show();
        num_telefon="";
    }
}
