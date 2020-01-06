package com.shopoholicbuddy.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.shopoholicbuddy.R;
import com.shopoholicbuddy.customviews.CustomButton;
import com.shopoholicbuddy.customviews.CustomEditText;
import com.shopoholicbuddy.customviews.CustomTextView;

public class KYCHomeActivity2 extends AppCompatActivity {

    ImageView ivBack;
    RelativeLayout btnAction;
    CustomButton btn_next;
    CustomTextView txt_copy_of_adhaar,txt_copy_of_gstCertificate,txt_copy_of_cancelledCheck,txt_copy_of_pan,txt_particular,txt_4,txt_3,txt_2,txt_1,txt_SlNo;
    CustomEditText et_incorporation_date,et_registered_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kychome2);


          /*  txt_copy_of_adhaar=(CustomTextView)findViewById(R.id.txt_copy_of_adhaar);
        txt_copy_of_gstCertificate=(CustomTextView)findViewById(R.id.txt_copy_of_gstCertificate);
        txt_copy_of_cancelledCheck=(CustomTextView)findViewById(R.id.txt_copy_of_cancelledCheck);
        txt_copy_of_pan=(CustomTextView)findViewById(R.id.txt_copy_of_pan);
        txt_particular=(CustomTextView)findViewById(R.id.txt_particular);
        txt_copy_of_adhaar=(CustomTextView)findViewById(R.id.txt_copy_of_adhaar);
        txt_4=(CustomTextView)findViewById(R.id.txt_4);
        txt_3=(CustomTextView)findViewById(R.id.txt_3);
        txt_2=(CustomTextView)findViewById(R.id.txt_2);
        txt_1=(CustomTextView)findViewById(R.id.txt_1);
        txt_SlNo=(CustomTextView)findViewById(R.id.txt_SlNo);*/
        et_registered_name = (CustomEditText) findViewById(R.id.et_registered_name);
        et_incorporation_date = (CustomEditText) findViewById(R.id.et_incorporation_date);

        ivBack = findViewById(R.id.iv_back);
//        AppUtils.getInstance().hideKeyboard(this);

        btnAction = findViewById(R.id.btn_action);
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KYCHomeActivity2.this, KYCHomeActivityFinal.class));

            }
        });

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });
        btn_next = (CustomButton) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KYCHomeActivity2.this, KYCHomeActivityFinal.class));
            }
        });

    }


    @Override
    public void onBackPressed() {

        super.onBackPressed();

    }
}


