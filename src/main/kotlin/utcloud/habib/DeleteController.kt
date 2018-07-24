package utcloud.habib

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class DeleteController {
    @Autowired
    lateinit var taskRepository: TaskRepository

    @DeleteMapping("/delete/{id}")
    fun deleteById(@PathVariable("id") id: String){
        if (this.taskRepository.existsById(id))
        {
            this.taskRepository.deleteById(id)
            throw EntityOk()
        }
        else
            throw EntityNotFound()
    }
}