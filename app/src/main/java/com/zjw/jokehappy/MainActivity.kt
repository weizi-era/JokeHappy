package com.zjw.jokehappy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.zjw.jokehappy.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override fun initView(savedInstanceState: Bundle?) {
        mDatabind.ssss.text = "呵呵呵呵"
    }

    override fun createObserver() {
        TODO("Not yet implemented")
    }

    override fun layoutId(): Int {
        return R.layout.activity_main
    }
}