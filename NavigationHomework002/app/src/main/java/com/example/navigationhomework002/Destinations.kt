package com.example.navigationhomework002

interface Destinations {
    val Route:String;
}

object Home : Destinations{
    override val Route="Home"
}

object Second : Destinations{
    override val Route="Second/{username,birthday}"
}
