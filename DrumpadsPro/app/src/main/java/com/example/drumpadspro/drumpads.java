package com.example.drumpadspro;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class drumpads extends AppCompatActivity {
    private SoundPool soundPool;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10,sound11,sound12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drumpads);
        soundPool = new SoundPool(2, AudioManager.STREAM_ALARM,100);
        sound1 = soundPool.load(getApplicationContext(),R.raw.sound1,2);
        sound2 = soundPool.load(getApplicationContext(),R.raw.sound2,2);
        sound3 = soundPool.load(getApplicationContext(),R.raw.sound3,1);
        sound4 = soundPool.load(getApplicationContext(),R.raw.sound4,1);
        sound5 = soundPool.load(getApplicationContext(),R.raw.sound5,1);
        sound6 = soundPool.load(getApplicationContext(),R.raw.sound6,1);
        sound7 = soundPool.load(getApplicationContext(),R.raw.sound7,1);
        sound8 = soundPool.load(getApplicationContext(),R.raw.sound8,1);
        sound9 = soundPool.load(getApplicationContext(),R.raw.sound9,1);
        sound10 = soundPool.load(getApplicationContext(),R.raw.sound10,1);
        sound11 = soundPool.load(getApplicationContext(),R.raw.sound11,1);
        sound12 = soundPool.load(getApplicationContext(),R.raw.sound12,1);
    }
    public void playsound1(View view){
        soundPool.play(sound1,1,1,0,0,2.0f);
    }
    public void playsound2(View view){
        soundPool.play(sound2,1,1,0,0,2.0f);
    }
    public void playsound3(View view){
        soundPool.play(sound3,1,1,0,0,2.0f);
    }
    public void playsound4(View view){
        soundPool.play(sound4,1,1,0,0,2.0f);
    }
    public void playsound5(View view){
        soundPool.play(sound5,1,1,0,0,2.0f);
    }
    public void playsound6(View view){
        soundPool.play(sound6,1,1,0,0,2.0f);
    }
    public void playsound7(View view){
        soundPool.play(sound7,1,1,0,0,1);
    }
    public void playsound8(View view){
        soundPool.play(sound8,1,1,0,0,1);
    }
    public void playsound9(View view){
        soundPool.play(sound9,1,1,0,0,1);
    }
    public void playsound10(View view){
        soundPool.play(sound10,1,1,0,0,1);
    }
    public void playsound11(View view){
        soundPool.play(sound11,1,1,0,0,1);
    }
    public void playsound12(View view){
        soundPool.play(sound12,1,1,0,0,1);
    }
}
