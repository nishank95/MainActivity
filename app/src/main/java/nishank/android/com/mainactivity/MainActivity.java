package nishank.android.com.mainactivity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText email;
    EditText description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name =(EditText)findViewById(R.id.editText);
        email=(EditText)findViewById(R.id.editText2);
        description=(EditText)findViewById(R.id.editText3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        switch(id){
            case R.id.profile:
                Intent i = new Intent(MainActivity.this,DetailsActivity.class);
                i.putExtra("name",name.getText().toString());
                i.putExtra("email",email.getText().toString());
                i.putExtra("desc",description.getText().toString());
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void onButtonClick(View v){
        Intent i = new Intent(MainActivity.this,DetailsActivity.class);
        i.putExtra("name",name.getText().toString());
        i.putExtra("email",email.getText().toString());
        i.putExtra("desc",description.getText().toString());
        startActivity(i);

    }
}
