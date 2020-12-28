package com.emptycoder.assignmenttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.emptycoder.assignmenttwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var list = ArrayList<Item>()
        list.add(Item(R.drawable.bag,"HYDE PARK","D41015","LUOIS VITTON",99999999))
        list.add(Item(R.drawable.shirt,"HORN BLUE LONG","SMART T SHIRT","Man Gago",23000))
        list.add(Item(R.drawable.iphone,"i phone 11","","Apple ",1300000))
        list.add(Item(R.drawable.guitar,"Accoustic Guitar","KAPS ST-10AC","ROSE WOOD",150000))


        var plist = ArrayList<Item>()
        plist.add(Item(R.drawable.plus,"IPhone 8 plus"," ","Apple",980000))
        plist.add(Item(R.drawable.ghostbed,"GhostBed 11 Inch Cooling Gel Memory Foam the jiodhf foaj odf aofahf hao haodhdfa fa"," ","ghostbed",3400000))
        plist.add(Item(R.drawable.nintendo,"NITENDO Switch- Neon Blue and Red Joy-Con"," ","Nintendo",359000))
        plist.add(Item(R.drawable.belaroi,"BELAROI | Womens Confy Swing Tunic Short Loose fit style from size S-3X, slim shaping for all body types."," ","Belaroi",980000))
        binding.arrivalRc.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = ItemAdapter(list)
        }

        binding.popularRc.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PopularAdapter(plist)
        }
    }
}