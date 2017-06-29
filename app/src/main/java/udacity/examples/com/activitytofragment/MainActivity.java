package udacity.examples.com.activitytofragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText edtMetin;
    Button btnGonder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMetin=(EditText) findViewById(R.id.edtMetin);
        btnGonder= (Button) findViewById(R.id.btnGonder);

        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentLayout fragmentLayout= (FragmentLayout) getSupportFragmentManager().findFragmentById(R.id.FragmentLayout);
                fragmentLayout.showText( edtMetin.getText().toString());

            }
        });
    }
}
