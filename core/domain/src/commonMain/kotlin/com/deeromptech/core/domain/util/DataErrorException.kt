package com.deeromptech.core.domain.util

class DataErrorException(
    val error: DataError
): Exception()