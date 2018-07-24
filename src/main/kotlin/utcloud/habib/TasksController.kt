package utcloud.habib

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks")
class TasksController {
    @Autowired
    lateinit var taskRepository: TaskRepository

    @DeleteMapping("/delete/{id}")
    fun deleteById(@PathVariable("id") id: String){
        if (this.taskRepository.existsById(id))
            this.taskRepository.deleteById(id)
        else
            throw EntityNotFound()
    }
}