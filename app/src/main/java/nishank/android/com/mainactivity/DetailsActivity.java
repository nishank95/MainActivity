package nishank.android.com.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvEmail;
    TextView tvDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent i = getIntent();
        tvName = findViewById(R.id.textView);
        tvEmail = findViewById(R.id.textView2);
        tvDesc = findViewById(R.id.textView3);


        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        String desc = i.getStringExtra("desc");

        tvName.setText(name);
        tvEmail.setText(email);
        tvDesc.setText(desc);

    }
}
