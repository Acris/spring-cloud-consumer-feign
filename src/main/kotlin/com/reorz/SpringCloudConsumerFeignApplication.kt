package com.reorz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringCloudConsumerFeignApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudConsumerFeignApplication::class.java, *args)
}
