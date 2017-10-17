package mariam.hashash.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        ListView ls;
    String [] arr = new String[]{"V1","V2","V3","V4"};
    ArrayAdapter<String> adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls=(ListView)findViewById(R.id.list);
        adapter =new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arr);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),arr[i]+" ",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
