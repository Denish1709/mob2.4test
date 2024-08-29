package com.denish.mob24test.core.util

object ValidationUtil {

    fun validateEmail(email: String): Boolean {

        val reg = Regex("^[a-zA-z0-9_.+-]*@[a-zA-Z0-9]*\\.[a-zA-Z0-9]*$")
        return reg.matches(email)
    }

}