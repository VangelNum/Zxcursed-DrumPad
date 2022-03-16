package com.vangelnum.drumpad

import android.media.SoundPool
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import java.util.*
import android.view.Menu
import android.view.MenuItem
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.widget.SwitchCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import android.content.*
import android.widget.Toast





class MainActivity : AppCompatActivity() {
    private var videoonstart = 1
    private var hasclicked = 0
    lateinit var mAdView : AdView
    private var nevernys = 1
    private var deadinside = 1
    private var soundId1 = 1
    private var soundId2 = 1
    private var soundId3 = 1
    private var soundId4 = 1
    private var soundId5 = 1
    private var soundId6 = 1
    private var soundId7 = 1
    private var soundId8 = 1
    private var soundId9 = 1
    private var soundId10 = 1
    private var soundId11 = 1
    private var soundId12 = 1
    private var soundId13 = 1
    private var soundId14 = 1
    private var soundId15 = 1
    private var soundId16 = 1
    private var soundId17 = 1
    private var soundId18 = 1
    private var soundId19 = 1
    private var soundId20 = 1
    private var soundId21 = 1
    private var soundId22 = 1
    private var soundId23 = 1
    private var soundId24 = 1
    private var soundId25 = 1


    lateinit var toggle:ActionBarDrawerToggle



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        setContentView(R.layout.activity_main)


        val navView: NavigationView = findViewById(R.id.nav_view)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_message -> {
                    intent = Intent(this@MainActivity,contact::class.java)
                    startActivity(intent)
                }
                R.id.nav_share ->
                {
                    val sendIntent: Intent = Intent().apply {
                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TITLE, "Спасибо за то, что делишься приложением! ❤")
                        putExtra(Intent.EXTRA_TEXT, "Zxcursed DrumPad https://play.google.com/store/apps/details?id=com.vangelnum.drumpad")
                        type = "text/plain"
                    }
                    startActivity(Intent.createChooser(sendIntent, "Share..."))
                }
                R.id.nav_star ->
                {
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=com.vangelnum.drumpad")
                        )
                    )
                }

            }
            true
        }


        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val simpleVideoView: VideoView = findViewById(R.id.videoView)
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.akumaqqereborn))
        simpleVideoView.requestFocus()
        simpleVideoView.start()
        
        simpleVideoView.setOnCompletionListener {
            simpleVideoView.start()
        }
        simpleVideoView.setOnErrorListener { mp, what, extra ->
            videoonstart = 0
            Toast.makeText(applicationContext, "Акума не загрузился :С",
                Toast.LENGTH_LONG
            ).show()
            simpleVideoView.stopPlayback()
            false
        }

        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val button10 : Button = findViewById(R.id.button10)
        val button11 : Button = findViewById(R.id.button11)
        val button12 : Button = findViewById(R.id.button12)
        val button13 : Button = findViewById(R.id.button13)
        val button14 : Button = findViewById(R.id.button14)
        val button15 : Button = findViewById(R.id.button15)
        val button16 : Button = findViewById(R.id.button16)
        val button17 : Button = findViewById(R.id.button17)
        val button18 : Button = findViewById(R.id.button18)
        val button19 : Button = findViewById(R.id.button19)
        val button20 : Button = findViewById(R.id.button20)
        val button21 : Button = findViewById(R.id.button21)
        val button22 : Button = findViewById(R.id.button22)
        val button23 : Button = findViewById(R.id.button23)
        val button24 : Button = findViewById(R.id.button24)
        val button25 : Button = findViewById(R.id.button25)

        animationonStart()

        nevernys = mSoundPool.load(this, R.raw.psyxokids, 1)
        deadinside = mSoundPool.load(this, R.raw.deadinside, 1)
        soundId1 = mSoundPool.load(this, R.raw.sound1, 1)
        soundId2 = mSoundPool.load(this, R.raw.sound2, 1)
        soundId3 = mSoundPool.load(this, R.raw.sound3, 1)
        soundId4 = mSoundPool.load(this, R.raw.sound4, 1)
        soundId5 = mSoundPool.load(this, R.raw.sound5, 1)
        soundId6 = mSoundPool.load(this, R.raw.sound6, 1)
        soundId7 = mSoundPool.load(this, R.raw.sound7, 1)
        soundId8 = mSoundPool.load(this, R.raw.sound8, 1)
        soundId9 = mSoundPool.load(this, R.raw.sound9, 1)
        soundId10 = mSoundPool.load(this, R.raw.sound10, 1)
        soundId11 = mSoundPool.load(this, R.raw.sound11, 1)
        soundId12 = mSoundPool.load(this, R.raw.sound12, 1)
        soundId13 = mSoundPool.load(this, R.raw.sound13, 1)
        soundId14 = mSoundPool.load(this, R.raw.sound14, 1)
        soundId15 = mSoundPool.load(this, R.raw.sound15, 1)
        soundId16 = mSoundPool.load(this, R.raw.sound16, 1)
        soundId17= mSoundPool.load(this, R.raw.sound17, 1)
        soundId18 = mSoundPool.load(this, R.raw.sound18, 1)
        soundId19 = mSoundPool.load(this, R.raw.sound19, 1)
        soundId20 = mSoundPool.load(this, R.raw.sound20, 1)
        soundId21 = mSoundPool.load(this, R.raw.sound21, 1)
        soundId22 = mSoundPool.load(this, R.raw.sound22, 1)
        soundId23 = mSoundPool.load(this, R.raw.sound23, 1)
        soundId24 = mSoundPool.load(this, R.raw.sound24, 1)
        soundId25 = mSoundPool.load(this, R.raw.sound25, 1)



        button1.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId1, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId1, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button2.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId2, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId2, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button3.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId3, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId3, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button4.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId4, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId4, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button5.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId5, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId5, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button6.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId6, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId6, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button7.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId7, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId7, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button8.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId8, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId8, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button9.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId9, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId9, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button10.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId10, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId10, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button11.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId11, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId11, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button12.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId12, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId12, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button13.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId13, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId13, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button14.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId14, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId14, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button15.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId15, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId15, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button16.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId16, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId16, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }

        button17.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId17, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId17, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }

        button18.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId18, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId18, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button19.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId19, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId19, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button20.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId20, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId20, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button21.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId21, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId21, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button22.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId22, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId22, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button23.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId23, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId23, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }
        button24.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId24, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId24, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }

        button25.setOnClickListener {
            if (hasclicked == 0) {
                mSoundPool.play(soundId25, 1F, 1F, 1, 0, 1F)
            }
            else {
                mSoundPool.play(soundId25, 1F, 1F, 1, 0, 1.5F)
                psyxokids()
            }
        }








    }


    private fun animationonStart()
    {
        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val button10 : Button = findViewById(R.id.button10)
        val button11 : Button = findViewById(R.id.button11)
        val button12 : Button = findViewById(R.id.button12)
        val button13 : Button = findViewById(R.id.button13)
        val button14 : Button = findViewById(R.id.button14)
        val button15 : Button = findViewById(R.id.button15)
        val button16 : Button = findViewById(R.id.button16)
        val button17 : Button = findViewById(R.id.button17)
        val button18 : Button = findViewById(R.id.button18)
        val button19 : Button = findViewById(R.id.button19)
        val button20 : Button = findViewById(R.id.button20)
        val button21 : Button = findViewById(R.id.button21)
        val button22 : Button = findViewById(R.id.button22)
        val button23 : Button = findViewById(R.id.button23)
        val button24 : Button = findViewById(R.id.button24)
        val button25 : Button = findViewById(R.id.button25)

        val buttonAnim : Animation = AnimationUtils.loadAnimation(this, R.anim.fadeout)
        buttonAnim.duration= 100
        button1.startAnimation(buttonAnim)
        button2.startAnimation(buttonAnim)
        button3.startAnimation(buttonAnim)
        button4.startAnimation(buttonAnim)
        button5.startAnimation(buttonAnim)

        val buttonAnim2 : Animation = AnimationUtils.loadAnimation(this, R.anim.fadeout)
        buttonAnim2.duration= 300
        button6.startAnimation(buttonAnim2)
        button7.startAnimation(buttonAnim2)
        button8.startAnimation(buttonAnim2)
        button9.startAnimation(buttonAnim2)
        button10.startAnimation(buttonAnim2)

        val buttonAnim3 : Animation = AnimationUtils.loadAnimation(this, R.anim.fadeout)
        buttonAnim3.duration= 500
        button11.startAnimation(buttonAnim3)
        button12.startAnimation(buttonAnim3)
        button13.startAnimation(buttonAnim3)
        button14.startAnimation(buttonAnim3)
        button15.startAnimation(buttonAnim3)

        val buttonAnim4 : Animation = AnimationUtils.loadAnimation(this, R.anim.fadeout)
        buttonAnim4.duration= 700
        button16.startAnimation(buttonAnim4)
        button17.startAnimation(buttonAnim4)
        button18.startAnimation(buttonAnim4)
        button19.startAnimation(buttonAnim4)
        button20.startAnimation(buttonAnim4)

        val buttonAnim5 : Animation = AnimationUtils.loadAnimation(this, R.anim.fadeout)
        buttonAnim5.duration= 900
        button21.startAnimation(buttonAnim5)
        button22.startAnimation(buttonAnim5)
        button23.startAnimation(buttonAnim5)
        button24.startAnimation(buttonAnim5)
        button25.startAnimation(buttonAnim5)
    }

    override fun onResume() {
        if (videoonstart == 1) {
            val simpleVideoView: VideoView = findViewById(R.id.videoView)
            simpleVideoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.akumaqqereborn))
            simpleVideoView.requestFocus()
            simpleVideoView.start()
        }
        super.onResume()
    }

    override fun onPause() {
        val simpleVideoView: VideoView = findViewById(R.id.videoView)
        simpleVideoView.stopPlayback()
        mSoundPool.autoPause()
        super.onPause()
    }
    override fun onStop() {
        val simpleVideoView: VideoView = findViewById(R.id.videoView)
        simpleVideoView.stopPlayback()
        mSoundPool.autoPause()
        super.onStop()
    }
    private val mSoundPool = SoundPool.Builder()
        .setMaxStreams(15)
        .build()

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        MobileAds.initialize(this) {}
        menuInflater.inflate(R.menu.menu_item, menu)

        val switchAB = menu!!.findItem(R.id.myswitch)
            .actionView.findViewById(R.id.switchForActionBar) as SwitchCompat

       switchAB.setOnCheckedChangeListener { _, isChecked ->
           if (isChecked) {
               hasclicked = 1
               mSoundPool.play(deadinside, 1F, 1F, 1, 0, 1F)
               animpsyxo()
           } else {
               hasclicked = 0
               stopanim()
               mSoundPool.play(nevernys, 1F, 1F, 1, 0, 1F)
           }
       }

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun animpsyxo()
    {

        val simpleVideoView2: VideoView = findViewById(R.id.videoView)
        simpleVideoView2.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.akumaqqerebornfast))
        simpleVideoView2.requestFocus()
        simpleVideoView2.start()
        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val button10 : Button = findViewById(R.id.button10)
        val button11 : Button = findViewById(R.id.button11)
        val button12 : Button = findViewById(R.id.button12)
        val button13 : Button = findViewById(R.id.button13)
        val button14 : Button = findViewById(R.id.button14)
        val button15 : Button = findViewById(R.id.button15)
        val button16 : Button = findViewById(R.id.button16)
        val button17 : Button = findViewById(R.id.button17)
        val button18 : Button = findViewById(R.id.button18)
        val button19 : Button = findViewById(R.id.button19)
        val button20 : Button = findViewById(R.id.button20)
        val button21 : Button = findViewById(R.id.button21)
        val button22 : Button = findViewById(R.id.button22)
        val button23 : Button = findViewById(R.id.button23)
        val button24 : Button = findViewById(R.id.button24)
        val button25 : Button = findViewById(R.id.button25)

        val buttonAnim : Animation = AnimationUtils.loadAnimation(this, R.anim.alpha)

        button1.startAnimation(buttonAnim)
        button2.startAnimation(buttonAnim)
        button3.startAnimation(buttonAnim)
        button4.startAnimation(buttonAnim)
        button5.startAnimation(buttonAnim)
        button6.startAnimation(buttonAnim)
        button7.startAnimation(buttonAnim)
        button8.startAnimation(buttonAnim)
        button9.startAnimation(buttonAnim)
        button10.startAnimation(buttonAnim)
        button11.startAnimation(buttonAnim)
        button12.startAnimation(buttonAnim)
        button13.startAnimation(buttonAnim)
        button14.startAnimation(buttonAnim)
        button15.startAnimation(buttonAnim)
        button16.startAnimation(buttonAnim)
        button17.startAnimation(buttonAnim)
        button18.startAnimation(buttonAnim)
        button19.startAnimation(buttonAnim)
        button20.startAnimation(buttonAnim)
        button21.startAnimation(buttonAnim)
        button22.startAnimation(buttonAnim)
        button23.startAnimation(buttonAnim)
        button24.startAnimation(buttonAnim)
        button25.startAnimation(buttonAnim)

    }
    private fun stopanim()
    {
        val simpleVideoView: VideoView = findViewById(R.id.videoView)
        simpleVideoView.stopPlayback()
        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.akumaqqereborn))
        simpleVideoView.requestFocus()
        simpleVideoView.start()

        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val button10 : Button = findViewById(R.id.button10)
        val button11 : Button = findViewById(R.id.button11)
        val button12 : Button = findViewById(R.id.button12)
        val button13 : Button = findViewById(R.id.button13)
        val button14 : Button = findViewById(R.id.button14)
        val button15 : Button = findViewById(R.id.button15)
        val button16 : Button = findViewById(R.id.button16)
        val button17 : Button = findViewById(R.id.button17)
        val button18 : Button = findViewById(R.id.button18)
        val button19 : Button = findViewById(R.id.button19)
        val button20 : Button = findViewById(R.id.button20)
        val button21 : Button = findViewById(R.id.button21)
        val button22 : Button = findViewById(R.id.button22)
        val button23 : Button = findViewById(R.id.button23)
        val button24 : Button = findViewById(R.id.button24)
        val button25 : Button = findViewById(R.id.button25)

        button1.clearAnimation()
        button2.clearAnimation()
        button3.clearAnimation()
        button4.clearAnimation()
        button5.clearAnimation()
        button6.clearAnimation()
        button7.clearAnimation()
        button8.clearAnimation()
        button9.clearAnimation()
        button10.clearAnimation()
        button11.clearAnimation()
        button12.clearAnimation()
        button13.clearAnimation()
        button14.clearAnimation()
        button15.clearAnimation()
        button16.clearAnimation()
        button17.clearAnimation()
        button18.clearAnimation()
        button19.clearAnimation()
        button20.clearAnimation()
        button21.clearAnimation()
        button22.clearAnimation()
        button23.clearAnimation()
        button24.clearAnimation()
        button25.clearAnimation()

    }

    private fun psyxokids()  {

        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val button10 : Button = findViewById(R.id.button10)
        val button11 : Button = findViewById(R.id.button11)
        val button12 : Button = findViewById(R.id.button12)
        val button13 : Button = findViewById(R.id.button13)
        val button14 : Button = findViewById(R.id.button14)
        val button15 : Button = findViewById(R.id.button15)
        val button16 : Button = findViewById(R.id.button16)
        val button17 : Button = findViewById(R.id.button17)
        val button18 : Button = findViewById(R.id.button18)
        val button19 : Button = findViewById(R.id.button19)
        val button20 : Button = findViewById(R.id.button20)
        val button21 : Button = findViewById(R.id.button21)
        val button22 : Button = findViewById(R.id.button22)
        val button23 : Button = findViewById(R.id.button23)
        val button24 : Button = findViewById(R.id.button24)
        val button25 : Button = findViewById(R.id.button25)

        val myImages = resources.obtainTypedArray(R.array.image)

        val drawableID: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button1.setBackgroundResource(drawableID)

        val drawableID2: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button2.setBackgroundResource(drawableID2)

        val drawableID3: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button3.setBackgroundResource(drawableID3)

        val drawableID4: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button4.setBackgroundResource(drawableID4)

        val drawableID5: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button5.setBackgroundResource(drawableID5)

        val drawableID6: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button6.setBackgroundResource(drawableID6)

        val drawableID7: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button7.setBackgroundResource(drawableID7)

        val drawableID8: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button8.setBackgroundResource(drawableID8)

        val drawableID9: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button9.setBackgroundResource(drawableID9)

        val drawableID10: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button10.setBackgroundResource(drawableID10)

        val drawableID11: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button11.setBackgroundResource(drawableID11)

        val drawableID12: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button12.setBackgroundResource(drawableID12)

        val drawableID13: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button13.setBackgroundResource(drawableID13)

        val drawableID14: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button14.setBackgroundResource(drawableID14)

        val drawableID15: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button15.setBackgroundResource(drawableID15)

        val drawableID16: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button16.setBackgroundResource(drawableID16)

        val drawableID17: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button17.setBackgroundResource(drawableID17)

        val drawableID18: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button18.setBackgroundResource(drawableID18)

        val drawableID19: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button19.setBackgroundResource(drawableID19)

        val drawableID20: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button20.setBackgroundResource(drawableID20)

        val drawableID21: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button21.setBackgroundResource(drawableID21)

        val drawableID22: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button22.setBackgroundResource(drawableID22)

        val drawableID23: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button23.setBackgroundResource(drawableID23)

        val drawableID24: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button24.setBackgroundResource(drawableID24)

        val drawableID25: Int = myImages.getResourceId(Random().nextInt(myImages.length()), -1)
        button25.setBackgroundResource(drawableID25)

        myImages.recycle()

    }


}