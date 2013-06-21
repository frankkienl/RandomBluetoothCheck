package nl.frankkie.bluetoothcheck;

import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            }
        });
        tv2 = (TextView) findViewById(R.id.tv2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("About");
        b.setMessage("Bluetooth Check by FrankkieNL");
        b.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //
            }
        });
        b.create().show();
        return true;
    }
}
