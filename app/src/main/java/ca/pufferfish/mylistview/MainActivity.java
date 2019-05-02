package ca.pufferfish.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.nio.file.attribute.PosixFileAttributes;

public class MainActivity extends AppCompatActivity {

    protected ListView listView;
    private String strArray[]= {"Nazia", "Sibtain", "Mujtaba", "Anwar", "Hassan",
                                "Bazif", "Hatim", "Huma", "Agha", "Nana"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        ArrayAdapter<String> aa = new ArrayAdapter<>(this, R.layout.list_name,strArray);
        listView.setAdapter(aa);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String value = (String) listView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "( "+position+" ) : "+value, Toast.LENGTH_LONG).show();
            }
        });


    }

}
