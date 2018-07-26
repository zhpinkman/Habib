package utcloud.habib

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository : MongoRepository<Task , String> {
    fun findByUserId(id: String): List<Task>
}