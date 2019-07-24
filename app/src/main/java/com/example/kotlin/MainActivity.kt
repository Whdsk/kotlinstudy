package com.example.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.flyco.tablayout.listener.CustomTabEntity
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private val myTitles = arrayOf("每日精选","发现","热门","我的")
    private val mIconUnSelectIds= intArrayOf(R.mipmap.ic_home_normal, R.mipmap.ic_discovery_normal, R.mipmap.ic_hot_normal, R.mipmap.ic_mine_normal)
    // 被选中的图标
    private val mIconSelectIds= intArrayOf(R.mipmap.ic_home_selected, R.mipmap.ic_discovery_selected, R.mipmap.ic_hot_selected, R.mipmap.ic_mine_selected)

    private val mTabEntities = ArrayList<CustomTabEntity>()

    private val mHomeFragment:HomeFragment?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
