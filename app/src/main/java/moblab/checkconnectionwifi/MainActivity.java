package moblab.checkconnectionwifi;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void botao(View view){
        WifiManager wifiMgr = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);

        if(wifiMgr.isWifiEnabled()){
            WifiInfo wifiInfo = wifiMgr.getConnectionInfo();
            String connected_net = (wifiInfo.getSSID()).toString();
            Toast.makeText(this, connected_net, Toast.LENGTH_LONG).show();
        }

    }
}
