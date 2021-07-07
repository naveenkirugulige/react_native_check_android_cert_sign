package com.check_sign_cert;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import android.util.Log;
import com.facebook.react.bridge.Callback;



public class CheckCert extends ReactContextBaseJavaModule  {

            private ReactApplicationContext mContext;
            CheckCert(ReactApplicationContext context) {
            super(context);
             mContext = context;
             }

           @Override
            public String getName() {
            return "CheckCert";
            }

            @ReactMethod
            public void checkCertEvent( String signature, Callback callBack) {
             
                 String signedSignature= Cert.checkAppSignature(mContext);
                
                 //Return the signature if you need to get the current signature
                 //remove it once the signature is obtained
                 callBack.invoke(signedSignature);

                 //To check the signature sent from the react native 
                //  if (signedSignature.trim().equals(signature.trim())){
                 
                //   callBack.invoke(true);

                //  }
                //  else{
                //         callBack.invoke(false);
                //  }
                 
                 
                 
            }   
    
}