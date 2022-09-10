package mx.tecnm.cdhidalgo.primerejemplo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerPersonAdapter(var persons: Array<String>?): RecyclerView.Adapter<RecyclerPersonAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView
        var bItem: Button
        init {
            tvName = itemView.findViewById(R.id.tvName)
            bItem = itemView.findViewById(R.id.bItem)

            bItem.setOnClickListener { }
            itemView.setOnClickListener {  }
            //itemView.setOnLongClickListener {  }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_person, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = persons!![position]
    }

    override fun getItemCount(): Int {
        return persons!!.size
    }

}