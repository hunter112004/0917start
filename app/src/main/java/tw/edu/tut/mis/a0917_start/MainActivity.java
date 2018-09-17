package tw.edu.tut.mis.a0917_start;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
        private  final  String TAG = "0917start";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"this is a book");
        super.onCreate(savedInstanceState);
        Log.d(TAG,"This is a book");
        setContentView(R.layout.activity_main);
        Log.e(TAG,"my book");
        Log.w(TAG,"sdksdsd");
    }
}
