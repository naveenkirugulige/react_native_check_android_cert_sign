package com.check_sign_cert;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import android.util.Base64;
import android.util.Log;

public class Cert {
    public static String checkAppSignature(Context context) {
          
        try {

            PackageInfo packageInfo = context.getPackageManager()

                    .getPackageInfo(context.getPackageName(),

                            PackageManager.GET_SIGNATURES);

            for (Signature signature : packageInfo.signatures) {

                byte[] signatureBytes = signature.toByteArray();

                MessageDigest md = MessageDigest.getInstance("SHA");

                md.update(signature.toByteArray());

                final String currentSignature = Base64.encodeToString(md.digest(), Base64.DEFAULT);

                return currentSignature;
               

            }

        } catch (Exception e) {
            return "false";
        }

        return "false";

    }
}
