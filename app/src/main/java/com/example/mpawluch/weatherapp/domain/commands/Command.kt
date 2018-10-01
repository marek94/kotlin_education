package com.example.mpawluch.weatherapp.domain.commands

interface Command<out T> {
    fun execute(): T
}