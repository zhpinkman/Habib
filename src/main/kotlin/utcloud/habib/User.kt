package utcloud.habib

import org.springframework.data.annotation.Id

class User(var userName: String) {
    @Id
    var id: String? = null
}