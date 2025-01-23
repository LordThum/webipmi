package io.github.lordthum.webipmi.entity

import io.github.lordthum.jpa.entity.base.BaseEntity
import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.CascadeType
import org.hibernate.envers.Audited
import org.hibernate.envers.NotAudited

@Entity
@Audited
@Table(name = "server")
class Server : BaseEntity() {

    @Id
    @SequenceGenerator(name = "Server", sequenceName = "SEQ_SERVER_ID", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Server")
    @Column(name = "id")
    var id: Long? = null

    @Column(name = "name")
    @NotNull
    @NotBlank
    var name: String? = null

    @Column(name = "ip")
    @NotNull
    @NotBlank
    var ip: String? = null

    @Column(name = "username")
    @NotNull
    @NotBlank
    var username: String? = null

    @Column(name = "password")
    @NotNull
    @NotBlank
    var password: String? = null

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "server_id")
    @NotAudited
    var fans: MutableList<Fan>? = null

}