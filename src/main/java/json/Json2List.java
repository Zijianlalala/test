package json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Json2List {
    public static List<Long> getUserIDList(String json){
        List<Long> list = new ArrayList<Long>();
        JSONArray array = JSONArray.parseArray(json);
        for (int i=0;i<array.size();i++){
            JSONObject object = array.getJSONObject(i);
            list.add(((Integer) object.get("id")).longValue());
        }
        return list;
    }
}
