package com.example.thread_uithread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv1 = findViewById<TextView>(R.id.tv1)
        val tv2 = findViewById<TextView>(R.id.tv2)
        val tv3 = findViewById<TextView>(R.id.tv3)

        val btn1 = findViewById<TextView>(R.id.btn1)
        val btn2 = findViewById<TextView>(R.id.btn2)
        val btn3 = findViewById<TextView>(R.id.btn3)

        var button1 = false
        var button2 = false
        var button3 = false

        btn1.setOnClickListener {
            button1 = !button1

            if(button1)
                Toast.makeText(applicationContext,"Started 1",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(applicationContext,"Stopped 1",Toast.LENGTH_SHORT).show()

            Thread(Runnable {
                while(button1)
                {
                    runOnUiThread{
                        tv1.setBackgroundResource(R.color.colorPrimaryDark)
                    }
                    Thread.sleep(1000)
                    if(!button1)
                        break
                    runOnUiThread{
                        tv1.setBackgroundResource(R.color.colorPrimary)
                    }
                    Thread.sleep(1000)
                }
            }).start()
        }

        btn2.setOnClickListener {
            button2 = !button2

            if(button1)
                Toast.makeText(applicationContext,"Started 2",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(applicationContext,"Stopped 2",Toast.LENGTH_SHORT).show()

            Thread(Runnable {
                while(button2)
                {
                    runOnUiThread{
                        tv2.setBackgroundResource(R.color.colorPrimary)
                    }
                    Thread.sleep(1000)
                    if(!button2)
                        break
                    runOnUiThread{
                        tv2.setBackgroundResource(R.color.colorPrimaryDark)
                    }
                    Thread.sleep(1000)
                }
            }).start()
        }

        btn3.setOnClickListener {
            button3 = !button3

            if(button3)
                Toast.makeText(applicationContext,"Started 3",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(applicationContext,"Stopped 3",Toast.LENGTH_SHORT).show()

            Thread(Runnable {
                while(button3)
                {
                    runOnUiThread{
                        tv3.setBackgroundResource(R.color.colorPrimaryDark)
                    }
                    Thread.sleep(1000)
                    if(!button3)
                        break
                    runOnUiThread{
                        tv3.setBackgroundResource(R.color.colorPrimary)
                    }
                    Thread.sleep(1000)
                }
            }).start()
        }

    }
}