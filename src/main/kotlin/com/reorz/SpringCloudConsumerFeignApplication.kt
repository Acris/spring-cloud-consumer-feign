package com.reorz

import org.springframework.boot.SpringApplication
import org.springframework.cloud.client.SpringCloudApplication
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringCloudApplication
@EnableFeignClients
class SpringCloudConsumerFeignApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudConsumerFeignApplication::class.java, *args)
}
