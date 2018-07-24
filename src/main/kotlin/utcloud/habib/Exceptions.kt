package utcloud.habib

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class EntityNotFound : Exception()

@ResponseStatus(HttpStatus.OK)
class EntityOk : Exception()