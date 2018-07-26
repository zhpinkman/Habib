package utcloud.habib

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
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

    @PutMapping("")
    fun insert(@RequestBody task: Task){
        tasksService.insert (task);
    }

    @GetMapping("/all/{id}")
    fun tasksById(@PathVariable("id") id: String): List<Task>{
        return tasksService.tasksById(id)
    }
}