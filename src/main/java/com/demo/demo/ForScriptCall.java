package com.demo.demo;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForScriptCall {
    public static void main(String ars[]) throws InterruptedException, IOException, IOException, ParseException {
        String cmd = "./Abc.sh";

        Runtime run = Runtime.getRuntime();

        Process pr = run.exec(cmd);

        pr.waitFor();
        JSONParser parser = new JSONParser();

        String obj = String.valueOf(parser.parse(new FileReader("/home/sachi/JAVA_Work/demo/src/main/java/com/demo/demo/out.json")));
        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = (JsonArray) jsonParser.parse(obj);

        List<User> userList=new ArrayList(Collections.singleton(jsonArray));
        List<User> userList2=new ArrayList<>();



        for(int i=0;i<jsonArray.size();i++)

        {
            /*User u=new User();
            JsonElement js=  jsonArray.get(i);
            String id=js.i
            u.setId(jsonArray.get(i).getId());
            u.setDegistaion(userList.get(i).getDegistaion());
            u.setName(userList.get(i).getName());
            userList2.add(u);*/

        }
     System.out.println(userList);
     System.out.println(userList2);




       // JSONArray user=jsonObject.get();





    }
}
