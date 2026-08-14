import java.util.*;

public class DialingCodes {
Map<Integer,String> m=new HashMap<>();
    public Map<Integer, String> getCodes() {
        return m;
    }

    public void setDialingCode(Integer code, String country) {
        m.put(code,country);
    }

    public String getCountry(Integer code) {
        return m.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!m.containsKey(code)){
            for(String s:m.values()){
                if(s.equals(country))return;
            }
            m.put(code,country);
        }
    }

    public Integer findDialingCode(String country) {
        Integer nf=null;
        for(Integer num: m.keySet()){
            if(country.equalsIgnoreCase(m.get(num))){
                nf=num;
            }
        }
        return nf;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for(Integer num: m.keySet()){
            if(country.equalsIgnoreCase(m.get(num))){
                m.remove(num);
                m.put(code,country);
            }
        }
    }
}
