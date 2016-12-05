package com.example.nadya_pc.lab006;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText first,second,res;
    Button t,f,m,d,md,xr,dx,dy;
    int x,y,resultate;
    String sx;
    String sy,S;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = (EditText) findViewById( R.id.editText );
        second = (EditText) findViewById( R.id.editText2 );
        res = (EditText) findViewById( R.id.editText3 );
        t = (Button) findViewById( R.id.button );
        t.setOnClickListener( this );
        f = (Button) findViewById( R.id.button2 );
        f.setOnClickListener( this );
        m = (Button) findViewById( R.id.button3 );
        m.setOnClickListener( this );
        d = (Button) findViewById( R.id.button4 );
        d.setOnClickListener( this );
        md = (Button) findViewById( R.id.button5 );
        md.setOnClickListener( this );
        xr = (Button) findViewById( R.id.button6 );
        xr.setOnClickListener( this );
        dx = (Button) findViewById( R.id.button7 );
        dx.setOnClickListener( this );
        dy = (Button) findViewById( R.id.button8 );
        dy.setOnClickListener( this );
        }
    @Override
    public void onClick(View v) {
        sx = first.getText().toString();
        sy = second.getText().toString();
        if(sx.toString().length() == 0 || sy.toString().length() == 0){
            Toast.makeText(this, "Поля пустые!", Toast.LENGTH_SHORT).show();
            return;
        }
        y = Integer.parseInt( sy );
        x = Integer.parseInt( sx );
        switch (v.getId()) {
            case R.id.button:
                resultate = x + y;
                S = Integer.toString( resultate );
                res.setText( S );
                break;
            case R.id.button2:
                resultate = x - y;
                S = Integer.toString( resultate );
                res.setText( S );
                break;
            case R.id.button3:
                resultate = x * y;
                S = Integer.toString( resultate );
                res.setText( S );
                break;
            case R.id.button4:
                resultate = x / y;
                S = Integer.toString( resultate );
                res.setText( S );
                break;
            case R.id.button5:
                resultate = x % y;
                S = Integer.toString( resultate );
                res.setText( S );
                break;
            case R.id.button6:
                resultate = x ^ y;
                S = Integer.toString( resultate );
                res.setText( S );
                break;
            case R.id.button7:
                S = Integer.toBinaryString(x);
                res.setText( S );
                break;
            case R.id.button8:
                S = Integer.toBinaryString(y);
                res.setText( S );
                break;
            default:
                break;

        }
    }
}
