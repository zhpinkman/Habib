package utcloud.habib

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import utcloud.habib.Services.LoginService.loginService


@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    lateinit var loginService: loginService

    @PostMapping("/login")
    fun login(@RequestBody user: User){
        loginService.loginByuserName(user)
    }
}