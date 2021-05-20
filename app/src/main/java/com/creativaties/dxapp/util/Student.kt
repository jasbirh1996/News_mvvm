package com.creativaties.dxapp.util

class Student( val schoolcourse: Schoolcourse,val friends: Friends) {


    fun beSmart() {
        schoolcourse.study()
        friends.hangout()

    }

}

class Friends {
    fun hangout() {
        println("im hanging out")
    }
}

class Schoolcourse {

    fun study() {
        println("im studying")
    }

}