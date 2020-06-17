package com.puc.quiz

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class QuizApplication

fun main(args: Array<String>) {
	runApplication<QuizApplication>(*args)
}