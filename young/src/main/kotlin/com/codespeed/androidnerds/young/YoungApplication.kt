package com.codespeed.androidnerds.young

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YoungApplication

fun main(args: Array<String>) {
	runApplication<YoungApplication>(*args)
}
