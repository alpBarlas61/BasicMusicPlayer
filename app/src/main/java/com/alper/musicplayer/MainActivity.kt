package com.alper.musicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaPlayer : MediaPlayer = MediaPlayer.create(this ,R.raw.antonindvorakserenadeforstrigns)



        val  ply_button : ImageButton = findViewById(R.id.ply_button)

        //accomplish the seekbar
        val seekBar : SeekBar = findViewById(R.id.seekBar)
        seekBar.progress = 0
        seekBar.max =mediaPlayer.duration

        ply_button.setOnClickListener{
            if(!mediaPlayer.isPlaying)
            {
                mediaPlayer.start()

                //change the button image
                ply_button.setImageResource(R.drawable.ic_baseline_pause_24)


            }else{

                mediaPlayer.pause()
                //change the buttob image
                ply_button.setImageResource(R.drawable.ic_baseline_play_arrow_24)
            }

        }

    }
}