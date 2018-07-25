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

    override fun loginByuserName(user: User) {
        if (!this.userRepository.existsByuserName(user.userName)) {
            this.userRepository.save(User(user.userName))
            throw userCreated()
        }
    }
}