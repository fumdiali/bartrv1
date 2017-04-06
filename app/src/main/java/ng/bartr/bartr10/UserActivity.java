package ng.bartr.bartr10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.user_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.user_settings:
                Intent uSet = new Intent(this,UserSettings.class);
                return true;
            case R.id.user_deals:
                Intent uDeals = new Intent(this,UserDeals.class);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
