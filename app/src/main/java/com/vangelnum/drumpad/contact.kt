package com.vangelnum.drumpad

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        setContentView(R.layout.activity_contact)

        val text: TextView = findViewById(R.id.textView27)
        text.setOnClickListener {
            val Uri: Uri = Uri.parse("https://vk.com/vangelnum");
            val browser: Intent = Intent(Intent.ACTION_VIEW, Uri);
            startActivity(browser)
        }

        val text2: TextView = findViewById(R.id.textView28)
        text2.setOnClickListener{
            val mailto = "mailto:vangelnum@gmail.com" +
                    "?cc=" +
                    "&subject=" + Uri.encode("Zxcursed Drum Pad")
            val emailIntent = Intent(Intent.ACTION_SENDTO)
            emailIntent.data = Uri.parse(mailto)
            startActivity(emailIntent)
        }
        val text3: TextView = findViewById(R.id.textView4)
        text3.setOnClickListener{
            val Uri: Uri = Uri.parse("https://www.youtube.com/zxcursed");
            val browser: Intent = Intent(Intent.ACTION_VIEW, Uri);
            startActivity(browser)
        }
        val text4: TextView = findViewById(R.id.textView2)
        text4.setOnClickListener{
            val Uri: Uri = Uri.parse("https://www.tiktok.com/@convulsive_seizures");
            val browser: Intent = Intent(Intent.ACTION_VIEW, Uri);
            startActivity(browser)
        }


        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true)
        };
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        };
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}