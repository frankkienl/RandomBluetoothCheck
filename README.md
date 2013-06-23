Random Bluetooth Check

Download APK: https://raw.github.com/frankkienl/RandomBluetoothCheck/master/BluetoothCheck.apk

Google Play: https://play.google.com/store/apps/details?id=nl.frankkie.bluetoothcheck

![Screenshot](https://raw.github.com/frankkienl/RandomBluetoothCheck/master/device-2013-06-21-211350.png "pic1")
![Screenshot](https://raw.github.com/frankkienl/RandomBluetoothCheck/master/device-2013-06-21-211422.png "pic2")

The code you want to know:
```Java
if (getPackageManager().hasSystemFeature("android.hardware.bluetooth")){
    //Toast.makeText(MainActivity.this, "Has Bluetooth hardware support", Toast.LENGTH_LONG).show();
    BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if (bluetoothAdapter != null){
        tv2.setText("There is support for Bluetooth!");
        Toast.makeText(MainActivity.this, "There is support for Bluetooth!", Toast.LENGTH_LONG).show();
    } else {
        tv2.setText("There is support for Bluetooth, but there is not Bluetooth Adapter.");
        Toast.makeText(MainActivity.this, "There is support for Bluetooth, but there is not Bluetooth Adapter.", Toast.LENGTH_LONG).show();
    }
} else {
    tv2.setText("There is NO support for Bluetooth.");
    Toast.makeText(MainActivity.this, "There is NO support for Bluetooth.", Toast.LENGTH_LONG).show();
}
```

This file was created by Android Studio (I/O Preview) AI-130.709792 for binding GitHub repository

Licence
-------

tl;dr: MIT-Licence, you can use this, also for commerical use, as long as you keep the Copyright notice.

    Copyright (c) 2013 FrankkieNL

    Permission is hereby granted, free of charge, to any person
    obtaining a copy of this software and associated documentation
    files (the "Software"), to deal in the Software without
    restriction, including without limitation the rights to use,
    copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the
    Software is furnished to do so, subject to the following
    conditions:

    The above copyright notice and this permission notice shall be
    included in all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
    EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
    OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
    NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
    HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
    WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
    FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
    OTHER DEALINGS IN THE SOFTWARE.
