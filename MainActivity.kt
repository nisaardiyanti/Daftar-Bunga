package com.nisaardiyanti.daftarbunga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.nisaardiyanti.daftarbunga.adapter.BungaAdapter
import com.nisaardiyanti.daftarbunga.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //Memuat data yang ada di loadBunga ke dalam myDataset
        val myDataset = Datasource().loadBunga()
        //Menacri dan mengisi data di recyle view
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = BungaAdapter(this, myDataset)

       //Ukuran size tetap di berubah
        recyclerView.setHasFixedSize(true)
    }
}