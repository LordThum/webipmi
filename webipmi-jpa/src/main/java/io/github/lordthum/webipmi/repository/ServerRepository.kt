package io.github.lordthum.webipmi.repository

import io.github.lordthum.webipmi.entity.Server
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
open interface ServerRepository : JpaRepository<Server, Int> {

}