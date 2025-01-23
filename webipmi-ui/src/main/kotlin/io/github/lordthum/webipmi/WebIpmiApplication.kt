package io.github.lordthum.webipmi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication(scanBasePackages = ["io.github.lordthum.webipmi"])
@EnableJpaRepositories(basePackages = ["io.github.lordthum.webipmi"])
class WebIpmiApplication

fun main(args: Array<String>) {
	runApplication<WebIpmiApplication>(*args)
}
