package sg.edu.rp.c346.id22017979.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;

    ArrayList alAndroid;
    //ArrayAdapter aaAndroid;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        alAndroid = new ArrayList<String>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        alAndroid.add(item1);
        alAndroid.add(item2);
        alAndroid.add(item3);

        //aaAndroid = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, alAndroid);
        //lv.setAdapter(aaAndroid);

        adapter = new CustomAdapter(this, R.layout.row, alAndroid);
        lv.setAdapter(adapter);
    }
}