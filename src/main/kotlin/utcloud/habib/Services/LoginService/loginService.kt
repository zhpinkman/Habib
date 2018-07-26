package utcloud.habib.Services.LoginService

import utcloud.habib.User

interface loginService {
    fun loginByuserName(username: String): User
}