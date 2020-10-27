package com.dicoding.picodiploma.TugasRecycleView

object AndroidData {
    private val androidNames = arrayOf("Cupcake",
        "Donut",
        "Eclair",
        "Froyo",
        "Gingerbread",
        "HoneyComb",
        "Ice Cream Sandwich",
        "Jelly Bean",
        "KitKat",
        "Lollipop",
        "Marshmallow",
        "Nougat",
        "Oreo",
        "Pie",
        "10")

    private val androidDetails = arrayOf(
        "Rilis pada April 27, 2009. Api level dari Cupcake yaitu 3 dan versi 1.5",
        "Rilis pada September 15, 2009. Api level dari Donut yaitu 4 dan versi 1.6",
        "Rilis pada October 26, 2009. Api level dari Eclair yaitu 5 dan versi 2.0 - 2.1",
        "Rilis pada May 20, 2010. Api level dari Froyo yaitu 8 dan versi 2.2 - 2.23",
        "Rilis pada February 9, 2011. Api level dari Gingerbread yaitu 9 - 10 dan versi 2.3 - 2.37",
        "Rilis pada February 22, 2011. Api level dari HoneyComb yaitu 11 - 13 dan versi 3.0 - 3.2.6",
        "Rilis pada October 19, 2011. Api level dari Ice Cream Sandwich yaitu 15 dan versi 4.0 - 4.6",
        "Rilis pada July 9, 2012. Api level dari Jelly Bean yaitu 18 dan versi 4.1 - 4.3.1",
        "Rilis pada October 31, 2013. Api level dari KitKat yaitu 19 - 20 dan versi 4.4 - 4.4.4",
        "Rilis pada November 12, 2014. Api level dari Lollipop yaitu 21 - 22 dan versi 5.1 - 5.1.1",
        "Rilis pada October 5, 2015. Api level dari Marshmallow yaitu 23 dan versi 6.0 - 6.0.1",
        "Rilis pada August 22, 2016. Api level dari Nougat yaitu 24 - 25 dan versi 7.1 - 7.1.2",
        "Rilis pada October 25, 2017. Api level dari Oreo yaitu 26 - 27 dan versi 8.0-8.1",
        "Rilis pada August 6, 2018. Api level dari Pie yaitu 28 dan versi 9",
        "Rilis pada September 3, 2019. Api level dari 10 yaitu 29 dan versi 10")

    private val androidImages = intArrayOf(R.drawable.cupcake,
        R.drawable.donut,
        R.drawable.eclair,
        R.drawable.froyo,
        R.drawable.gingerbread,
        R.drawable.honeycomb,
        R.drawable.ice_cream_sandwich,
        R.drawable.jellybean,
        R.drawable.kitkat,
        R.drawable.lollipop,
        R.drawable.marshmallow,
        R.drawable.nougat,
        R.drawable.oreo,
        R.drawable.pie,
        R.drawable.android10)

    val listData: ArrayList<Android>
        get() {
            val list = arrayListOf<Android>()
            for (position in androidNames.indices) {
                val android = Android()
                android.name = androidNames[position]
                android.detail = androidDetails[position]
                android.photo = androidImages[position]
                list.add(android)
            }
            return list
        }
}


