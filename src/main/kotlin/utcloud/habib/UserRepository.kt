package utcloud.habib

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User , String> {
    fun existsByuserName(name: String): Boolean
    fun findByuserName(username: String): User
}