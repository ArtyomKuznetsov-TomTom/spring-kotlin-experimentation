package com.krosent.springkotlinexperiment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinExperimentApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinExperimentApplication>(*args)
}
