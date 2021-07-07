# react_native_check_android_cert_sign

Purpose: Android Security: Adding Tampering Detection to Your App
expl: https://www.airpair.com/android/posts/adding-tampering-detection-to-your-android-app

Check that the signature at runtime matches our embedded developer signature.

Find the java program to get/check the certification in /android/app/src/main/java/com/check_sign_cert/CheckCert.java


You can make the changes to either get the signed signature or to compare in CheckCert.java

To use this module in react native, use the example from /check_sign_cert/App.js
