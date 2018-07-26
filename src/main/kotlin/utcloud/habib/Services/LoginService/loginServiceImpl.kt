package utcloud.habib.Services.LoginService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import utcloud.habib.User
import utcloud.habib.UserRepository
import utcloud.habib.userCreated

@Service
class loginServiceImpl : loginService{

    @Autowired
    lateinit var userRepository: UserRepository

    override fun loginByuserName(username: String): User {
        if (!this.userRepository.existsByuserName(username)) {
            this.userRepository.save(User(username))
            throw userCreated()
        }
        else{
            return this.userRepository.findByuserName(username)
        }
    }
}