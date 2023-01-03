package com.luismakeapp.wellness.model

import androidx.annotation.DrawableRes

data class Day(
    var title: String,
    @DrawableRes var image: Int,
    var description: String
)
