package com.example.calculaterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvOne.setOnClickListener { appendOnExpresstion("1",true)}
        tvTwo.setOnClickListener { appendOnExpresstion("2",true)}
        tvThree.setOnClickListener { appendOnExpresstion("3",true)}
        tvFour.setOnClickListener { appendOnExpresstion("4",true)}
        tvFive.setOnClickListener { appendOnExpresstion("5",true)}
        tvSix.setOnClickListener { appendOnExpresstion("6",true)}
        tvSeven.setOnClickListener { appendOnExpresstion("7",true)}
        tvEight.setOnClickListener { appendOnExpresstion("8",true)}
        tvNine.setOnClickListener { appendOnExpresstion("9",true)}

    }

    fun appendOnExpresstion(string:String, canClear:Boolean){
        if(canClear){
            tvResult.text=""
            tvExpression.append(string)
        }else{
            tvExpression.append(tvResult.text)
            tvExpression.append(string)
            tvResult.text=""
        }
    }



}