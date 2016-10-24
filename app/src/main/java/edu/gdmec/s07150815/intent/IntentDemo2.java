package edu.gdmec.s07150815.intent;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by D on 2016/10/24.
 */
public class IntentDemo2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo2);
    }
    public void upper(View v){
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        final String value = bundle.getString("value").toUpperCase();

        Intent intentresult = new Intent();
        intentresult.putExtra("result",value);
        setResult(RESULT_OK,intentresult);
        finish();
    }
}
