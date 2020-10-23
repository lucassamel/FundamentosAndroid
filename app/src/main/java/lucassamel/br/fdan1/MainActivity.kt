package lucassamel.br.fdan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("CicloDeVida", "MainActivity OnCreate")

        
    }

    override fun onStart() {
        super.onStart()
        Log.i("CicloDeVida", "MainActivity OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CicloDeVida", "MainActivity OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CicloDeVida", "MainActivity OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CicloDeVida", "MainActivity OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CicloDeVida", "MainActivity OnDestroy")
    }
}
