package com.example.foodapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.databinding.ProductItemBinding
import com.example.foodapp.model.Product

class ProductAdapter (private val context: Context, private val productList: MutableList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val listItem = ProductItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ProductViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.imgProduct.setBackgroundResource(productList[position].imgProduct)
        holder.name.text = productList[position].name
        holder.price.text = productList[position].price
    }

    override fun getItemCount() = productList.size

    inner class ProductViewHolder(binding: ProductItemBinding): RecyclerView.ViewHolder(binding.root){

        val imgProduct = binding.imgProduct
        val name = binding.txtName
        val price = binding.txtPrice

    }

}