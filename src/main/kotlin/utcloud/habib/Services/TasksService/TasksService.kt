package utcloud.habib.Services.TasksService

import utcloud.habib.Task

interface TasksService {
    fun deleteById(id: String)
    fun insert(task: Task)

}