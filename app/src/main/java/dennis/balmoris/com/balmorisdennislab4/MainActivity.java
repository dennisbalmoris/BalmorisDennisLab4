package dennis.balmoris.com.balmorisdennislab4;

import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ith", "Created!" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ith", "onStart() has started!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ith", "önRestart() has started!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ith", "onDestroy() has destroyed your app!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ith", "onResume() has started!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ith", "onPause() has paused!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ith", "onStop() has now stopped!");
    }

    public void displayToast(View v){
        Toast.makeText(this, "This is a Toast", Toast.LENGTH_SHORT).show();
    }

    public void displaySnack(View v){
        Snackbar.make(v, "This is a Snackbar", Snackbar.LENGTH_LONG).show();
    }
}
