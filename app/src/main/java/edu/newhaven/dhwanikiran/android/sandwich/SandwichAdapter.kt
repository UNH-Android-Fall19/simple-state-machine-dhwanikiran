package edu.newhaven.dhwanikiran.android.sandwich


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import dhwanikiran.android.sandwich.MyViewHolder
import dhwanikiran.android.sandwich.Sandwich

open class SandwichAdapter(private val list: MutableList<Sandwich>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder)
            holder.bind(list.get(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(parent.run { var inflate = inflate(layoutRes = R.LAyout.item_sandwich)
            inflate
        })
    }

    class R {
        object LAyout {

            val item_sandwich: Int
                get() {
                    TODO()
                }
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }


    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }
}
