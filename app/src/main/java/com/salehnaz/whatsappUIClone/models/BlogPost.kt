package com.salehnaz.whatsappUIClone.models

data class BlogPost(

    var title: String,

    var body: String,

    var image: String




) {

    override fun toString(): String {
        return "BlogPost(title='$title', image='$image')"
    }


}
























