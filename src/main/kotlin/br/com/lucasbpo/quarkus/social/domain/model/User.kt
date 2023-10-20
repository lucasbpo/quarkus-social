package br.com.lucasbpo.quarkus.social.domain.model

import jakarta.persistence.*
import kotlinx.serialization.Serializable

@Entity
@Table(name = "tb_users")
@Cacheable
@Serializable
class User (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var name: String?  = null,
    var age: Int?  = null,
)