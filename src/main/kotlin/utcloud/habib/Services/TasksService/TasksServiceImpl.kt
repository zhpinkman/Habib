package utcloud.habib.Services.TasksService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import utcloud.habib.EntityNotFound
import utcloud.habib.Task
import utcloud.habib.TaskRepository
import utcloud.habib.UserRepository

@Service("tasksService")
class TasksServiceImpl : TasksService {
    @Autowired
    lateinit var taskRepository: TaskRepository

    @Autowired
    lateinit var userRepository: UserRepository

    override fun deleteById(id: String) {
        if (this.taskRepository.existsById(id))
            this.taskRepository.deleteById(id)
        else
            throw EntityNotFound()
    }
    override fun insert(task: Task) {
//        logger.info("ASDASDASDASD")
        if ( !this.userRepository.existsById(task.UserId))
            throw EntityNotFound()
        else
            this.taskRepository.insert(task)

    }
}