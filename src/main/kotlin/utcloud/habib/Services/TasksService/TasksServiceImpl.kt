package utcloud.habib.Services.TasksService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import utcloud.habib.EntityNotFound
import utcloud.habib.TaskRepository

@Service("tasksService")
class TasksServiceImpl : TasksService {
    @Autowired
    lateinit var taskRepository: TaskRepository

    override fun deleteById(id: String) {
        if (this.taskRepository.existsById(id))
            this.taskRepository.deleteById(id)
        else
            throw EntityNotFound()
    }
}