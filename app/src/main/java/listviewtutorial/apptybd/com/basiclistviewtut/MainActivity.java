package listviewtutorial.apptybd.com.basiclistviewtut;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener{
    ListView l;
    String[] names={"Rakib","kakib","Vakib","Eakib","Aakib","Zakib","Takib","Hakib","Gakib","Bakib",
                   "Cakib","Xakib","Jakib","Uakib","Makib","Nakib","Vakib","Oakib","Pakib","Lakib"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l= (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        l.setAdapter(adapter);

        l.setOnItemClickListener(this);




    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
        TextView temp= (TextView) view;
        Toast.makeText(this,temp.getText()+ "" +i, Toast.LENGTH_SHORT).show();

    }
}
