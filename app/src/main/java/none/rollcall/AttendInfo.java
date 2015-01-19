package none.rollcall;

import java.sql.Time;

/**
 * Created by Eileen on 1/17/2015.
 * Object holding name and times arrived/left
 */
public class AttendInfo {
    private String m_name;
    private String m_came;
    private String m_left;

    public AttendInfo(String name, String came, String left){
        m_name = name;
        m_came = came;
        m_left = left;
    }

    public String getName(){
        return m_name;
    }

    public String getCame(){
        return m_came;
    }

    public String getLeft(){
        return m_left;
    }

    public void setName(String name){
        m_name = name;
    }

    public void setCame(String time) {
        m_came = time;
    }

    public void setLeft(String time){
        m_left = time;
    }
}
