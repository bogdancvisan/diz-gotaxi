package diz.vcb.gotaxi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import diz.vcb.gotaxi.Client.ClientLoginActivity;
import diz.vcb.gotaxi.Driver.DriverLoginActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonDriver, buttonClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClient = (Button) findViewById(R.id.client);
        buttonDriver = (Button) findViewById(R.id.driver);

        buttonDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DriverLoginActivity.class);
                startActivity(intent);
            }
        });

        buttonClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ClientLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
