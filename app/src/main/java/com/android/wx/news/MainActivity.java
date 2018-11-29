package com.android.wx.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.wx.aar.MainAarActivity;
import com.google.gson.Gson;
import com.wxzhang.tools.utils.SpUtils;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private String string = "{\"result\":\"\",\"code\":\"90000000\",\"message\":\"操作失败\",\"class\":\"tofocus.market.core.Result\",\"success\":false}";

    private String string1 = "{\"result\":{ \"code\":\"90000000\",\n" +
            "    \"message\":\"操作失败\"},\"code\":\"90000000\",\"message\":\"操作失败\",\"class\":\"tofocus.market.core.Result\",\"success\":false}";

    private String personInfo = "{\"success\":true,\"code\":\"00000000\",\"message\":\"success\",\"result\":{\"mkData\":{\"merchantCode\":\"1001\",\"QRC\":\"feac95588ef44f86a470f6a0b418beca.jpg\",\"num\":1000,\"honorName\":\"最优商户\",\"shopHours\":\"20:00\",\"merchantName\":\"致一自营商户\",\"managerType\":\"综合性市场\",\"license\":null,\"score\":5,\"marketName\":\"致一自营市场\",\"managerArea\":\"20000\",\"SupervisionTel\":\"12135\",\"tel\":\"4007111365\",\"onescreen\":6,\"Supervision\":\"市场监督局\",\"twoscreen\":3},\"mksData\":{\"test\":\"28次\",\"testMonth\":\"1次\",\"ori\":\"11件\",\"check\":\"46%\"}}}";

    private String login = "{\"success\":true,\"code\":\"00000000\",\"message\":\"success\",\"result\":{\"info\":{\"code\":\"343\",\"mobile\":\"13188888888\",\"enCodePkey\":\"BBC070187D9986DA\"}}}";

    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView mTextView = findViewById(R.id.mTextView);
        TestBean bean = jsonToBean(string, TestBean.class);
        TestBean bean1 = jsonToBean(string1, TestBean.class);
        mTextView.setText(bean.getResult() + "--->result为String\n\n" + bean1.getResult() + "--->result为object");
        TestBean.Result bean2 = jsonToBean(bean1.getResult().toString(), TestBean.Result.class);
        Log.i("bean2.getCode():", bean2.getCode());
        Log.i("bean2.getMessage():", bean2.getMessage());

        PersonInfoBean bean3 = jsonToBean(personInfo, PersonInfoBean.class);
        try {
            String s = bean3.getResult().toString();
            Log.i("resultBean1:----->", s);
            PersonInfoBean.ResultBean resultBean = jsonToBean(bean3.getResult().toString(), PersonInfoBean.ResultBean.class);
            String ss = resultBean.toString();
            Log.i("resultBean:", ss);
        } catch (Exception e) {

        }

        SpUtils.put("name","wxZhang");
        Log.i("name",SpUtils.get("name","").toString());

        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        LoginBean loginBean = jsonToBean(login, LoginBean.class);
        Log.i("resultBean1:", loginBean.toString());


//        JSONObject jsonObject = new JSONObject();
//        try {
//           JSONObject resultBean = jsonObject.getJSONObject(loginBean.getResult().toString());
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        LoginBean.ResultBean resultBean1 = jsonToBean(loginBean.getResult().toString(),LoginBean.ResultBean.class);
//        Log.i("resultBean1:",resultBean1.toString());

    }

    public void mTextView(View view) {
        startActivity(new Intent(this, MainAarActivity.class));
    }

    public <T> T jsonToBean(String jsonResult, Class<T> clazz) {
        return gson.fromJson(jsonResult, clazz);
    }

}
