package com.shopoholicbuddy.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.shopoholicbuddy.Pop;
import com.shopoholicbuddy.R;
import com.shopoholicbuddy.customviews.CustomButton;
import com.shopoholicbuddy.customviews.CustomTextView;
import com.shopoholicbuddy.fragments.AdhaarFragment;
import com.shopoholicbuddy.fragments.CancelledChequeFragment;
import com.shopoholicbuddy.fragments.GstCertificateFragment;
import com.shopoholicbuddy.fragments.PanFragment;

public class KYCHomeActivityFinal extends AppCompatActivity {

    ImageView ivBack;
    RelativeLayout btnAction;
    CustomButton btn_submit,btn_clickHere;
    FloatingActionButton float1_pan,float2_cancelled_check,float3_gstCertificate,float4_adhaar,floatbtn_add,floatbtn_minus;
    CustomTextView txt_adhaar,txt_gst_certificate,txt_cancelled_cheque,txt_pan;
    RelativeLayout rel_pan,rel_cancelledCheque,rel_gstCertificate,rel_Adhaar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kychome_final);

        rel_pan=(RelativeLayout)findViewById(R.id.rel_pan);
        rel_cancelledCheque=(RelativeLayout)findViewById(R.id.rel_cancelledCheque);
        rel_gstCertificate=(RelativeLayout)findViewById(R.id.rel_gstCertificate);
        rel_Adhaar=(RelativeLayout)findViewById(R.id.rel_Adhaar);

        float1_pan=(FloatingActionButton)findViewById(R.id.float1);
        float2_cancelled_check=(FloatingActionButton)findViewById(R.id.float2);
        float3_gstCertificate=(FloatingActionButton)findViewById(R.id.float3);
        float4_adhaar=(FloatingActionButton)findViewById(R.id.float4);
//        floatbtn_add=(FloatingActionButton)findViewById(R.id.floatbtn_add);
//        floatbtn_minus=(FloatingActionButton)findViewById(R.id.floatbtn_minus);

        txt_adhaar=(CustomTextView)findViewById(R.id.txt_adhaar);
        txt_gst_certificate=(CustomTextView)findViewById(R.id.txt_gst_certificate);
        txt_cancelled_cheque=(CustomTextView)findViewById(R.id.txt_cancelled_cheque);
        txt_pan=(CustomTextView)findViewById(R.id.txt_pan);

        //Pan fragment
        rel_pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new PanFragment());
                f.addToBackStack(null);
                f.commit();            }
        });
        float1_pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new PanFragment());
                f.addToBackStack(null);
                f.commit();            }
        });
        txt_pan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new PanFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });

        //cancelled check fragment
        rel_cancelledCheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new CancelledChequeFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });
        float2_cancelled_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new CancelledChequeFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });
        txt_cancelled_cheque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new CancelledChequeFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });

        //gst certificate Fragment
        rel_gstCertificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new GstCertificateFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });
        float3_gstCertificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new GstCertificateFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });
        txt_gst_certificate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new GstCertificateFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });

        //Adhaar Fragment

        rel_Adhaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new AdhaarFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });
        float4_adhaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new AdhaarFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });
        txt_adhaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction f = getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new AdhaarFragment());
                f.addToBackStack(null);
                f.commit();

            }
        });

      /* floatbtn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction f= getSupportFragmentManager().beginTransaction();
                f.replace(R.id.container,new BlankFragment());
                f.addToBackStack(null);
                f.commit();
            }
        });*/

      /*  floatbtn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.app.FragmentManager fragmentManager = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container,no);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


                        FragmentManager fm = getActivity().getSupportFragmentManager();
                if(fm.getBackStackEntryCount()>0) {
                    fm.popBackStack();
            }
        });*/





        ivBack = findViewById(R.id.iv_back);
        //  AppUtils.getInstance().hideKeyboard(this);


        btnAction = findViewById(R.id.btn_action);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }

        });

        btn_clickHere=(CustomButton)findViewById(R.id.btn_clickHere);

        btn_clickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(KYCHomeActivityFinal.this, Pop.class));
            }
        });
        btn_submit =(CustomButton)findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(KYCHomeActivityFinal.this,HomeActivity.class));
            }
        });

    }


    @Override
    public void onBackPressed() {

        super.onBackPressed();

    }
}

