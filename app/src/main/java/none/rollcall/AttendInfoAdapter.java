package none.rollcall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

/**
 * Created by Eileen on 1/17/2015.
 */
public class AttendInfoAdapter extends BaseAdapter{
    private Context m_context;
    private List<AttendInfo> m_attendList;


    public AttendInfoAdapter(Context context, List<AttendInfo> list) {
        m_context = context;
        m_attendList = list;
    }

    @Override
    public int getCount() {
        return m_attendList.size();
    }

    @Override
    public Object getItem(int pos) {
        return m_attendList.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        // get selected entry
        AttendInfo entry = m_attendList.get(pos);

        // inflating list view layout if null
        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(m_context);
            convertView = inflater.inflate(R.layout.list_item, null);
        }

        // set name
        Button staffName = (Button)convertView.findViewById(R.id.staffName);
        staffName.setText(entry.getName());
        String temp = entry.getName();
        staffName.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
            Button temp = (Button)view;
            String name = temp.getText().toString();
            int k = 0;
            for(; k < m_attendList.size(); k++){
                if(m_attendList.get(k).getName() == name)
                    break;
            }
            if(m_attendList.get(k).getCame()== null)
                m_attendList.get(k).setCame("6pm");
            else if(m_attendList.get(k).getLeft() == null)
                m_attendList.get(k).setLeft("9pm");
        }});

        // set time came
        EditText timeCame = (EditText)convertView.findViewById(R.id.timeCame);
        timeCame.setText(entry.getCame());

        // set time left
        EditText timeLeft = (EditText)convertView.findViewById(R.id.timeLeft);
        timeLeft.setText(entry.getLeft());


        return convertView;
    }

}
