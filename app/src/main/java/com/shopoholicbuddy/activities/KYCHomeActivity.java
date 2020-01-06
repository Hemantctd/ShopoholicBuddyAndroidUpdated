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

public class KYCHomeActivity extends AppCompatActivity {

    CustomButton btn_next;
    CustomEditText et_email,et_fax,et_contactNo,et_pincode,et_city,et_state,et_Address,et_reg_Under,et_reg_business_name,et_merchantName;
    CustomTextView txtHeading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kychome);

        ImageView ivBack;
        RelativeLayout btnAction;
//        @BindView(R.id.tv_select_country)
//        CustomTextView tvSelectCountry;
//        private List<String> allCountriesList;
//        private List<String> selectedCountriesList;
//        CountryBean countryBean;


        txtHeading=(CustomTextView)findViewById(R.id.txtHeading);
        et_email=(CustomEditText) findViewById(R.id.et_email);
        et_fax=(CustomEditText) findViewById(R.id.et_fax);
        et_contactNo=(CustomEditText) findViewById(R.id.et_contactNo);
        et_pincode=(CustomEditText) findViewById(R.id.et_pincode);
        et_city=(CustomEditText) findViewById(R.id.et_city);
        et_state=(CustomEditText) findViewById(R.id.et_state);
        et_Address=(CustomEditText) findViewById(R.id.et_Address);
        et_reg_Under=(CustomEditText) findViewById(R.id.et_reg_Under);
        et_reg_business_name=(CustomEditText) findViewById(R.id.et_reg_business_name);
        et_merchantName=(CustomEditText) findViewById(R.id.et_merchantName);

        ivBack =  findViewById(R.id.iv_back);
//            AppUtils.getInstance().hideKeyboard(this);
//        tvSelectCountry.addTextChangedListener(this);

        btnAction =  findViewById(R.id.btn_action);
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KYCHomeActivity.this,KYCHomeActivity1.class));

            }
        });

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });

        btn_next=(CustomButton)findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KYCHomeActivity.this,KYCHomeActivity1.class));
            }
        });

    }



    @Override
    public void onBackPressed() {

        super.onBackPressed();

    }



}


