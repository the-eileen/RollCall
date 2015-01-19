package none.rollcall;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import none.rollcall.AttendInfo;


public class Home extends Activity {

       private ListView rollList;
    List<AttendInfo> listInfo = new ArrayList<AttendInfo>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rollList = (ListView)findViewById(R.id.listView);


        listInfo.add(new AttendInfo("Alana", null, null));
        listInfo.add(new AttendInfo("Allen", null, null));
        listInfo.add(new AttendInfo("Amy", null, null));
        listInfo.add(new AttendInfo("Annie", null, null));
        listInfo.add(new AttendInfo("Avery", null, null));
        listInfo.add(new AttendInfo("Belinda", null, null));
        listInfo.add(new AttendInfo("Brandon J", null, null));
        listInfo.add(new AttendInfo("Brandon S", null, null));
        listInfo.add(new AttendInfo("Claire", null, null));
        listInfo.add(new AttendInfo("Dermot", null, null));
        listInfo.add(new AttendInfo("Eileen", null, null));
        listInfo.add(new AttendInfo("Eric", null, null));
        listInfo.add(new AttendInfo("Jessica", null, null));
        listInfo.add(new AttendInfo("Karen", null, null));
        listInfo.add(new AttendInfo("Kei", null, null));
        listInfo.add(new AttendInfo("Lilian", null, null));
        listInfo.add(new AttendInfo("Michael", null, null));
        listInfo.add(new AttendInfo("Michelle", null, null));
        listInfo.add(new AttendInfo("Peter", null, null));
        listInfo.add(new AttendInfo("Sienna", null, null));
        listInfo.add(new AttendInfo("Tiffanie", null, null));
        listInfo.add(new AttendInfo("William", null, null));


        AttendInfoAdapter adapter = new AttendInfoAdapter(this,listInfo);
        rollList.setAdapter(adapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void setTime(View view){
        Button button = (Button) findViewById(R.id.staffName);
        String name = button.getText().toString();
        int k = 0;
        for(; k < listInfo.size(); k++){
            if(listInfo.get(k).getName() == name)
                break;
        }
        if(listInfo.get(k).getCame()== null)
            listInfo.get(k).setCame("changed");

        rollList.setAdapter(new AttendInfoAdapter(this,listInfo));
    }
}
