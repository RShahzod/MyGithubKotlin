package uz.shox.mygithubkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextPageBtn = findViewById<Button>(R.id.nextPageBtn)

        nextPageBtn.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }

    }
}