package ng.bartr.bartr10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText emailLogin = (EditText) findViewById(R.id.emailLogin);
        final EditText passLogin = (EditText) findViewById(R.id.passLogin);

        final Button btnLogin = (Button) findViewById(R.id.btnLogin);

    }

    public void userReg(View view){
        Intent register = new Intent(this,RegisterActivity.class);
        startActivity(register);
    }

    public void userScreen(View view){
        Intent loggedIn = new Intent(this,UserActivity.class);
        startActivity(loggedIn);
    }





}
