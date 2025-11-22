package com.deeromptech.chat.data.mappers

import com.deeromptech.chat.data.dto.response.ProfilePictureUploadUrlsResponse
import com.deeromptech.chat.domain.models.ProfilePictureUploadUrls

fun ProfilePictureUploadUrlsResponse.toDomain(): ProfilePictureUploadUrls {
    return ProfilePictureUploadUrls(
        uploadUrl = uploadUrl,
        publicUrl = publicUrl,
        headers = headers
    )
}