package mx.tecnm.cdhidalgo.primerejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private var listaPersonas:Array<String>? = null;
    private var rvList: RecyclerView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        rvList = findViewById(R.id.rvList);

        rvList!!.setHasFixedSize(true)
        rvList!!.itemAnimator = DefaultItemAnimator()
        rvList!!.layoutManager = LinearLayoutManager(this)

        listaPersonas = arrayOf("Juan", "Pedro", "Luis")
        rvList!!.adapter = RecyclerPersonAdapter(listaPersonas)
    }

}