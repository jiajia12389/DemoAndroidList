package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragAndDropPermissions;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView arrayListView;
    ArrayList<AndroidVersion> androidAList;

    //ArrayAdapter<AndroidVersion> aaList;
    CustomerAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayListView = findViewById(R.id.arrayList);
        androidAList = new ArrayList<>();
        AndroidVersion item1 = new AndroidVersion("Pie","9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo","8.0-8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat","7.0-7.1.2");
        

        androidAList.add(item1);
        androidAList.add(item2);
        androidAList.add(item3);

        adapter = new CustomerAdapter(this,R.layout.row,androidAList);
        arrayListView.setAdapter(adapter);
    }
}
