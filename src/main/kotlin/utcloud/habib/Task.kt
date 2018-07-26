package utcloud.habib

import org.springframework.data.annotation.Id

class Task(var taskName : String , var taskDescription: String , var userId: String) {
    @Id
    var id: String? = null

}