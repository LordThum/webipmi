package io.github.lordthum.webipmi.server

import io.github.lordthum.webipmi.entity.Fan
import io.github.lordthum.webipmi.entity.Server
import io.github.lordthum.webipmi.repository.ServerRepository
import jakarta.annotation.PostConstruct
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import java.util.*

@Service
@Transactional
class ServerService(
    open val serverRepository: ServerRepository
) {

    @PostConstruct
    fun init() {
        val server = Server()
        server.name = "Dell R630"
        server.ip = "192.168.1.54"
        server.username = "root"
        server.password = "Kennwort48"

        val fan = Fan()
        fan.name = "Front 1"
        fan.code = "jvknsjvn"

        server.fans = mutableListOf(fan)

        serverRepository.save(server)

//        val server2 = Server()
//        server2.name = "Dell R420"
//        server2.ip = "192.168.1.53"
//        server2.username = "root"
//        server2.password = "Kennwort48"

//        serverRepository.save(server2)

    }

    fun getAllServers() : List<Server> {
        return serverRepository.findAll()
    }

    fun getById(id: Int) : Optional<Server> {
        return serverRepository.findById(id)
    }
}