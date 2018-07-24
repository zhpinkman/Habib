package utcloud.habib

import org.springframework.data.annotation.Id

class User(var Name: String) {
    @Id
    var id: String? = null
}