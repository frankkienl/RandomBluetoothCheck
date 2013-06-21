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
