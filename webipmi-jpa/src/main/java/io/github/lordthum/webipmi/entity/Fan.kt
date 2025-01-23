package io.github.lordthum.webipmi.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.hibernate.envers.Audited
import kotlin.jvm.Transient

@Entity
@Audited
@Table(name = "fan")
class Fan {

    @Id
    @SequenceGenerator(name = "Server", sequenceName = "SEQ_SERVER_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Server")
    @Column(name = "id")
    var id: Long? = null

//    @Column(name = "server_id")
//    @NotNull
//    @NotBlank
//    var serverId: Long? = null

    @Column(name = "name")
    @NotNull
    @NotBlank
    var name: String? = null

    @Column(name = "code")
    @NotNull
    @NotBlank
    var code: String? = null

    @Transient
    var status : String? = null

    @Transient
    var pwm : String? = null

    @Transient
    var rpm : String? = null

    fun getStatus() {

    }
}