package utcloud.habib

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import utcloud.habib.Services.TasksService.TasksService

@RestController
@RequestMapping("/tasks")
class TasksController {
    @Autowired
    lateinit var tasksService: TasksService

    @DeleteMapping("/delete/{id}")
    fun deleteById(@PathVariable("id") id: String){
        tasksService.deleteById(id)
    }
}