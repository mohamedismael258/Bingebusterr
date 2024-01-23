package com.example.filmalert;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.example.filmalert.databinding.ActivityMain2Binding;
import com.example.filmalert.databinding.ActivityMain3Binding;
import com.google.android.material.timepicker.MaterialTimePicker;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity3 extends AppCompatActivity {

    ActivityMain3Binding binding;
    MaterialTimePicker materialTimePicker ;
    Calendar calendar;
    AlarmManager alarmManager;
    PendingIntent pendingIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
      long time;
        setContentView(binding.getRoot());
        creatNotificationChannel();
        binding.btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        binding.start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(binding.seriesname.getText().toString().trim(),binding.numberofeposid.getText().toString().trim(),binding.eposidtime.getText().toString().trim());
            }
        });
    }


private void validate(String seriesName,String eposidNumber ,String eposidTimesString)
{
    if(seriesName.isEmpty())
    {
        binding.seriesname.setError("required");
    } else if (eposidTimesString.isEmpty()) {
        binding.eposidtime.setError(("required"));
    }
    else if(eposidNumber.isEmpty())
        {
            binding.numberofeposid.setError("required");
        }
    else {
        String[] eposidTimes = eposidTimesString.split("-");
       handelTime(eposidTimes);

    }
    }
    public void handelTime(String[]eposidTimes) {
        ArrayList<Integer> eposidTimeIntger = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < eposidTimes.length; i++) {
            eposidTimeIntger.add(Integer.parseInt(eposidTimes[i]));
            sum += eposidTimeIntger.get(i);

        }
        setAlarm(sum*40);

    }
    private void creatNotificationChannel()
    {
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O)
        {
            CharSequence name="aKchannel";
            String desc="Channel for Alarm Manger";
            int imp= NotificationManager.IMPORTANCE_HIGH;
            NotificationChannel notificationChannel =new NotificationChannel("androidknolwedge",name,imp);
            notificationChannel.setDescription(desc);
            NotificationManager notificationManager=getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
    private void setAlarm(long time)
    {
        Intent intent =new Intent(MainActivity3.this ,AlarmReceiver.class);
                pendingIntent=PendingIntent.getBroadcast(MainActivity3.this,0,intent, PendingIntent.FLAG_IMMUTABLE);
                alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);
                long timeButtonClick=System.currentTimeMillis();
                long tecsecond=time*1000;
                alarmManager.set(AlarmManager.RTC_WAKEUP,timeButtonClick+tecsecond,pendingIntent);
                clear();
    }
    public void clear()
    {
        binding.seriesname.setText("");
        binding.eposidtime.setText("");
        binding.numberofeposid.setText("");
    }
}
