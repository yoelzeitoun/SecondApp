package il.co.expertize.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextview = (TextView)findViewById(R.id.textView);
        mTextview.setText("Hello:   " + getIntent().getStringExtra("myEmail"));
    }
}